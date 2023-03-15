<template>
  <div class="container-fluid">
        <h1 id="title" class="text-center py-3">Create New Account</h1>
        
        <div class="container bg-light m-3 rounded p-3 mx-auto d-block" id="app">
            <!-- <form> -->
                <div class="mb-3">
                    <label for="name" class="form-label">Name of Company</label>
                    <input type="text" class="form-control" id="name" aria-describedby="emailHelp" v-model="companyName">
                  </div>
                <div class="mb-3">
                  <label for="exampleInputEmail1" class="form-label">Email address</label>
                  <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" v-model="companyEmail">
                  <div id="emailHelp" class="form-text">We'll never share your email with anyone else.</div>
                </div>
                <div class="mb-3">
                  <label for="exampleInputPassword1" class="form-label">Password</label>
                  <input type="password" class="form-control" id="exampleInputPassword1" v-model="password">
                </div>

                <div class="mb-3">
                    <label for="access" class="form-label">Access Rights</label>
                    <form id="access">
                        <div class="form-check">
                            <input class="form-check-input" type="radio" name="flexRadioDefault" id="flexRadioDefault1" value="vendor" v-model="access">
                            <label class="form-check-label" for="flexRadioDefault1">
                              Vendor
                            </label>
                          </div>
                          <div class="form-check">
                            <input class="form-check-input" type="radio" name="flexRadioDefault" id="flexRadioDefault2" value="admin" v-model="access">
                            <label class="form-check-label" for="flexRadioDefault2">
                              Admin
                            </label>
                          </div>
                          <div class="form-check">
                            <input class="form-check-input" type="radio" name="flexRadioDefault" id="flexRadioDefault3" admin="approver" v-model="access">
                            <label class="form-check-label" for="flexRadioDefault3">
                              Approver
                            </label>
                          </div>
                    </form>
                </div>

                <div class="mb-3">
                  <label for="locs" class="form-label">Location of Operations</label>
                  <form id="locs">
                      <div class="form-check">
                          <input class="form-check-input" type="checkbox" name="flexCheckboxDefault" id="flexCheckboxDefault1" value="singapore" v-model="locations">
                          <label class="form-check-label" for="flexCheckboxDefault1">
                            Singapore
                          </label>
                        </div>
                        <div class="form-check">
                          <input class="form-check-input" type="checkbox" name="flexCheckboxDefault" id="flexCheckboxDefault2" value="malaysia" v-model="locations">
                          <label class="form-check-label" for="flexCheckboxDefault2">
                            Malaysia
                          </label>
                        </div>
                        <div class="form-check">
                          <input class="form-check-input" type="checkbox" name="flexCheckboxDefault" id="flexCheckboxDefault3" value="USA" v-model="locations">
                          <label class="form-check-label" for="flexCheckboxDefault3">
                            USA
                          </label>
                        </div>
                  </form>
              </div>

                <div class="text-center"><button type="submit" class="btn btn-primary" @click="addToAPI">Submit</button></div>
              <!-- </form> -->
        </div>

    </div>
</template>

<script>
// import { axios } from '@/plugins/axios'
import bcrypt from 'bcryptjs';
import { boolean } from 'webidl-conversions';

export default {
  
name:'CreateNewAcc',
  data() {
        return {
            companyName: "",
            companyEmail: "",
            password: "",
            access: "",
            locations: []
        }
    },
    
methods: {
  addToAPI() {
            // const bcrypt = require('bcrypt');
            // pw = this.password;
            // bcrypt.hash(pw, 10);
            function encryptPassword(password)   {       
              const salt = bcrypt.genSaltSync(10)
              return bcrypt.hashSync(password, salt)
            }
            let newUser = { 
                username: this.companyName,
                password: encryptPassword(this.password),
                email: this.companyEmail,
                accessRights: this.access,
                locations: JSON.parse(JSON.stringify(this.locations))
             }

             var lower = 'abcdefghijklmnopqrstuvwxyz'
             var uppercase = 'ABCDEFGHIJKLMNOPQRSTUVWXYZ'
             var num = '0123456789'
             var special = '!@#$%^&*'

             var threeLower = false;
             var threeUpper = false;
             var hasNumber = false;
             var hasSpecial = false;

             if (this.password.length >= 8) {
                for (var i = 0; i < this.password.length; i++) {
                    if (lower.includes(this.password[i])) {
                        threeLower = true;
                    }
                    if (uppercase.includes(this.password[i])) {
                        threeUpper = true;
                    }
                    if (num.includes(this.password[i])) {
                        hasNumber = true;
                    }
                    if (special.includes(this.password[i])) {
                        hasSpecial = true;
                    }
                //     if ( || uppercase.includes(this.password[i]) || num.includes(this.password[i]) || special.includes(this.password[i])) {
                        
                //         console.log("yAYAYAYACONSOLE");

                //         console.log(this.locations)
                //         console.log(newVendor)
                //         const axios = require('axios');

                //         axios.post('http://localhost:8080/vendors', newVendor)
                //         .then((response) => {
                //             console.log(response);
                //         })
                //         .catch ((error) => {
                //             console.log(error);
                //         })
                //     }
                //     else {
                //         console.log("VALIDATION FAILED. Your password must contain:\nAt least 8 characters,\nAt least 3 of the following:\n- Lower case letters (a-z)\n- Upper case letters (A-Z)\n- Numbers (0-9)\n- Special characters (e.g. !@#$%^&*)")
                //     }
                //     }
                // } else {
                //         console.log("VALIDATION FAILED. Your password must contain:\nAt least 8 characters,\nAt least 3 of the following:\n- Lower case letters (a-z)\n- Upper case letters (A-Z)\n- Numbers (0-9)\n- Special characters (e.g. !@#$%^&*)")
                //     }
             }
             var checker = 0;
             if (threeLower) {
                checker++;
             }
             if (threeUpper) {
                checker++;
             }
             if (hasNumber) {
                checker++
             }
             if (hasSpecial) {
                checker++;
             }
             if (checker >= 3) {
                const axios = require('axios');

                axios.post('http://localhost:8080/users', newUser)
                .then((response) => {
                    console.log(response);
                    if(response.data == ""){
                      alert("VALIDATION FAILED. User already exists. Please input another email")
                    }
                    else{
                      this.companyName = ""
                      this.password = ""
                      this.access =""
                      this.companyEmail = ""
                      this.locations = []
                    }
                })
                .catch ((error) => {
                    console.log(error);
                })
             }
             else {
                alert("VALIDATION FAILED. Your password must contain:\nAt least 8 characters,\nAt least 3 of the following:\n- Lower case letters (a-z)\n- Upper case letters (A-Z)\n- Numbers (0-9)\n- Special characters (e.g. !@#$%^&*)")
             }

             
}
else {
    alert("VALIDATION FAILED. Your password must contain:\nAt least 8 characters.");
}
  

  // create(){
  //   const bcrypt = require('bcrypt');
  //   const MongoClient = require('mongodb@3.1.4').MongoClient;
  //   const client = new MongoClient('mongodb+srv://glennaong:'+configuration.MONGO_PASSWORD+'@cluster0.wo1hrqe.mongodb.net/?retryWrites=true&w=majority');
  //   client.connect(function (err) {
  //   if (err) return callback(err);

  //   const db = client.db('db-name');
  //   const users = db.collection('users');

  //   users.findOne({ email: user.email }, function (err, withSameMail) {
  //     if (err || withSameMail) {
  //       client.close();
  //       return callback(err || new Error('the user already exists'));
  //     }

  //     bcrypt.hash(user.password, 10, function (err, hash) {
  //       if (err) {
  //         client.close();
  //         return callback(err);
  //       }

  //       user.password = hash;
  //       users.insert(user, function (err, inserted) {
  //         client.close();

  //         if (err) return callback(err);
  //         callback(null);
  //       });
  //     });
  //   });
  // });
  // }
  
}
}
}

</script>

<style>

</style>