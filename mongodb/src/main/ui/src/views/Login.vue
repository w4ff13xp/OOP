<template>
            
            <header class="masthead text-white text-center" style="background-image: url('frontend/assets/techback-overlay.jpg'); background-size: cover; height: 600px">
            <div class="container d-flex align-items-center flex-column">

                <!-- Masthead Heading-->
                <h4 class="masthead-heading text-uppercase mb-0">Welcome to Form Management System</h4>
                <!-- Icon Divider-->
                <div class="divider-custom divider-light">
                    <div class="divider-custom-line"></div>
                    <div class="divider-custom-icon"><i class="fas fa-star"></i></div>
                    <div class="divider-custom-line"></div>
                </div>
                <!-- Masthead Subheading-->
                <!-- <p class="masthead-subheading font-weight-light mb-0">Graphic Artist - Web Designer - Illustrator</p> -->
                <!-- <img src="frontend/assets/Quantum.png" height="70px" width="250px"> -->
            </div>
            
        </header>
        <div class="pa-3 bg-dark" style="text-align: center;">
                    <div class="btn btn-primary" @click="auth0Login()">LOG IN HERE</div>
                </div>
    <!-- <div class="bg-dark">
    <v-container>
      <v-slide-y-transition mode="out-in">
        
          <v-layout row wrap align-center>
            <v-flex xs12 sm8 offset-sm2 md6 offset-md3 lg4 offset-lg4>
                <div class="bg-dark">
              <v-card style="margin-bottom:200px;">
                <div class="pa-3">
                    <div class="btn btn-primary">LOG IN HERE</div>
                </div>
                <hr>
                <v-card-title primary-title>
                  <div>
                    <h3 class="headline mb-0">Welcome</h3>
                    <div>Welcome to My Application.                          
                      <br><br>
                      Login to connect. 
                      <br><br>

                      Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. 

                    </div>
                  </div>
                </v-card-title>
                <v-card-actions>
                  <v-btn @click="auth0Login()" >Login</v-btn>
                </v-card-actions>
              </v-card>
              </div>
            </v-flex>
          </v-layout>
        </v-slide-y-transition>
      </v-container>
      </div> -->

</template>
<script>
export default {
    name: 'Login',
    methods: {
        auth0Login(){
            this.$store.dispatch('auth0Login');
            console.log('we are in auth0Login');
        },
    },
    }
</script>