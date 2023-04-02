<template>
  <v-app>

    
    <v-main>
    <Navigation/>
    
      <router-view></router-view>
    <Footer/>

    </v-main>
  </v-app>
</template>

<script>
import Navigation from "@/components/Navigation.vue";
import Footer from "@/components/Footer.vue";


export default {
  name: 'App', 
  components:{Navigation, },
  data() {
    return{
      clientId: process.env.VUE_APP_AUTH0_CONFIG_DOMAIN
    }
  },
  methods:{
    logout(){
      this.$store.dispatch('auth0Logout')
      console.log("loggingout")
    },
    auth0Login(){
            this.$store.dispatch('auth0Login');
            console.log('we are in auth0Login');
    }
  },
  beforeCreate(){

  }
      
}
</script>
