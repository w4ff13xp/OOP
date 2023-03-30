import { createStore } from 'vuex'
import auth0 from 'auth0-js'
import router from '../router'
import VueJwtDecode from 'vue-jwt-decode'
import jwt_decode from "jwt-decode";
export default createStore({
  state: {
    userIsAuthorized:false,
    auth0: new auth0.WebAuth({
      domain: process.env.VUE_APP_AUTH0_CONFIG_DOMAIN, 
      clientID: process.env.VUE_APP_AUTH0_CONFIG_CLIENTID,
      redirectUri: process.env.VUE_APP_DOMAINURL + '/auth0callback',  
      responseType: process.env.VUE_APP_AUTH0_CONFIG_RESPONSETYPE,
      scope: process.env.VUE_APP_AUTH0_CONFIG_SCOPE,
    }), 

  },
  getters: {
  },
  // methods: {
  //   setUserStorage(userid){
  //   const axios = require('axios');
  //         axios.get(`http://localhost:8080/users/${userid}`)
  //         .then((response) => {
  //             console.log(response.data);
  //             localStorage.setItem('specificuser', JSON.stringify(userid))
  //             localStorage.getItem('')
  //             return;
  //         })
  //         .catch ((error) => {
  //             console.log(error);
  //         })
  //       }
  // },
  mutations: {
    setUserIsAuthenticated(state,replacement){
      state.userIsAuthorized = replacement
    }
  },
  actions: {
    auth0Login(context){
      console.log("in a store of action named auth0login")
      context.state.auth0.authorize();
    },
    auth0HandleAuthentication (context) {
      context.state.auth0.parseHash((err, authResult) => {
        if (authResult && authResult.accessToken && authResult.idToken) {
          let expiresAt = JSON.stringify(
            authResult.expiresIn * 1000 + new Date().getTime()
          )
          // save the tokens locally
          localStorage.setItem('access_token', authResult.accessToken);
          localStorage.setItem('id_token', authResult.idToken);
          localStorage.setItem('expires_at', expiresAt);  
          console.log(authResult.idToken)
          let decoded = jwt_decode(authResult.idToken)
          console.log(decoded.email)
          const axios = require('axios');
          axios.get(`http://localhost:8080/users/${decoded.email}`)
          .then((response) => {
            localStorage.setItem('specificuser', JSON.stringify(response.data))
            router.push('/home');

          })
          .catch ((error) => {
              console.log(error);
          })
          
        } 

        else if (err) {
          alert('login failed. Error #KJN838');
          router.replace('/login');
          console.log(err);
        }
        // console.log(localStorage.getItem('specificuser'))

      })
    },
  
  auth0Logout(context){
      // No need to update the bearer in global axiosConfig to null because we are redirecting out of the application
      // Clear Access Token and ID Token from local storage
      // localStorage.removeItem('access_token');
      // localStorage.removeItem('id_token');
      // localStorage.removeItem('expires_at');
      // localStorage.removeItem('specificuser');
      localStorage.clear()
      // redirect to auth0 logout to completely log the user out
      window.location.href = process.env.VUE_APP_AUTH0_CONFIG_DOMAINURL + "/v2/logout?returnTo=" + process.env.VUE_APP_DOMAINURL + "/login&client_id=" + process.env.VUE_APP_AUTH0_CONFIG_CLIENTID; 
  
  },
},
  modules: {
  }
})
