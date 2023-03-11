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
                    <a class="nav-link active" aria-current="page"><v-btn to="/home"  class="mr-2">Home</v-btn></a>
                    </li>
                    <li class="nav-item">
                        
                    <a class="nav-link" ><v-btn to="/about"  class="mr-2">About</v-btn></a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link"><v-btn to="/contact" class="mr-2">Contact</v-btn></a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link"><v-btn to="/admin" class="mr-2">Admin</v-btn></a>

                    </li>
                    
                    <li class="nav-item">

                    <a class="nav-link"><v-btn @click="logout" v-if="this.$store.state.userIsAuthorized">Logout</v-btn></a>
                    </li>
                    
                </ul>
                <form class="d-flex" role="search">
                    <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
                    <button class="btn btn-outline-success bg-info" type="submit">Search</button>
                </form>
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

        clientId: process.env.VUE_APP_AUTH0_CONFIG_DOMAIN
        }
    },
    methods:{
    logout(){
      this.$store.dispatch('auth0Logout')
      console.log("loggingout")
    }
    },
    beforeCreate(){

    }
}
</script>

<style>

</style>