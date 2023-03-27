<template>
  <nav class="navbar navbar-expand-lg" style="border-bottom: 1px solid #eeeee4;">
            <div class="container-fluid">

                <img  class="logo rounded border-radius: 50%" :src="url" height="50px" width="50px">
                <!-- <img  class="logo" src="../frontend/assets/Quantum.png" height="60px" width="200px"> -->
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                    <li class="nav-item">
                    <a class="nav-link active" aria-current="page"><v-btn to="/home"  class="mr-2" v-if="this.$store.state.userIsAuthorized">Home</v-btn></a>
                    </li>

                    <li class="nav-item">
                        <a class="nav-link"><v-btn to="/profile" class="mr-2" v-if="this.$store.state.userIsAuthorized">Profile</v-btn></a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link"><v-btn to="/admin" class="mr-2" v-if="this.user_access == 'Admin'">Admin</v-btn></a>

                    </li>
                    
                </ul>
                <a class="nav-link"><v-btn @click="auth0Login" v-if="!this.$store.state.userIsAuthorized" >Login</v-btn></a>
                <a class="nav-link"><v-btn @click="logout" v-if="this.$store.state.userIsAuthorized">Logout</v-btn></a>

                </div>
            </div>
        </nav>
</template>

<script>
export default {
    name: 'Navigation',
    data() {
    return{
        url: require('@/../public/frontend/assets/quantum2.png'),
        clientId: process.env.VUE_APP_AUTH0_CONFIG_DOMAIN,
        user_access: "",
        }
    },
    methods:{

    async checkStatus(){
        console.log('USERRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR')
        console.log(JSON.parse(localStorage.getItem('specificuser')))

        this.user_access = JSON.parse(localStorage.getItem('specificuser'))['accessRights']
        console.log(this.user_access)
    },

    beforeCreate(){

    },

    logout(){
      this.$store.dispatch('auth0Logout')
      console.log("loggingout")
    //   window.location.href = "http://localhost:3000"
    },

    auth0Login(){
            this.$store.dispatch('auth0Login');
            console.log('we are in auth0Login');
        },


    },



}
</script>

<style>

</style>