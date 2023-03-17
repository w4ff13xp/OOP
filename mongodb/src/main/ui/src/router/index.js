import { createRouter, createWebHistory } from 'vue-router'
import AboutView from '../views/AboutView.vue'
import Profile from '../views/Profile.vue'
import Login from '../views/Login.vue'
import Store from '../store'
import Auth0Callback from '../views/Auth0Callback.vue'
import Home from '../views/Home.vue'
import Questionnaire from '../views/Questionnaire.vue'
import Admin from '../views/Admin.vue'
import CreateNewAcc from '../views/CreateNewAcc.vue'
import Approver from '../views/Approver.vue'
import SpecificVendor from '../views/SpecificVendor.vue'
import HealthSafetyPreEvaluation from '../views/Safety&HealthPreEvaluation.vue'


const routes = [
  {
    path: '/specificvendor',
    name: 'specificvendor',
    component: SpecificVendor
  },
  {
    path: '/',
    name: 'login',
    component: Login
  },
  {
    path: '/approver',
    name: 'approver',
    component: Approver
  },
  {
    path: '/createnewacc',
    name: 'createnewacc',
    component: CreateNewAcc
  },
  {
    path: '/admin',
    name: 'admin',
    component: Admin,
    meta: {requiresAuth:true}
  },
  {
    path: '/questionnaire',
    name: 'questionnaire',
    component: Questionnaire
  },
  {
    path: '/Safety&HealthPreEvaluation',
    name: 'healthsafetypreevaluation',
    component: HealthSafetyPreEvaluation
  },
  {
    path: '/home',
    name: 'home',
    component: Home
  },

  {
    path: '/about',
    name: 'about',
    component: AboutView
  },
  {
    path: '/profile',
    name: 'profile',
    component: Profile
  },
//   {
//     path: '/login',
//     name: 'login',
//     component: Login
//   },
  {
    path: '/auth0callback',
    name: 'auth0callback',
    component: Auth0Callback
  },
]


const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes
})

router.beforeEach((to,from) => {

  if (to.matched.some(record => record.path == "/auth0callback")){
    console.log("router.beforeeach found /auth0callback url")
    Store.dispatch('auth0HandleAuthentication')
    // next(false)
  }
  let routerAuthCheck = false; //TODO:add actual check if person is logged in 
  // false means not logged in. true means logged in
  if( localStorage.getItem('access_token') && localStorage.getItem('id_token') && localStorage.getItem('expires_at') ){
    console.log('found local storage tokens');
    // Check whether the current time is past the Access Token's expiry time
    let expiresAt = JSON.parse(localStorage.getItem('expires_at'));
    // set localAuthTokenCheck true if unexpired / false if expired
    routerAuthCheck = new Date().getTime() < expiresAt;  
  }
  //set global ui understanding of authentication
  Store.commit('setUserIsAuthenticated', routerAuthCheck); // this one good for debugging, can see under vue console instead of Store.state.userIsAuthorized = true 


  if (to.matched.some(record => record.meta.requiresAuth)){
    // check if user is authenticated
    if (routerAuthCheck){
      // user is authenticated
      // next();
    }
    else{
      // user is not authenticated
      router.push('login');
      // router.replace('/login')
    }
  }
  else{
    // next();
  }
})

export default router

