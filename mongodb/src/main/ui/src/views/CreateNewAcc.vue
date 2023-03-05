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

                <div class="text-center"><button type="submit" class="btn btn-primary" @click="addToAPI">Submit</button></div>
              <!-- </form> -->
        </div>

    </div>
</template>

<script>
// import { axios } from '@/plugins/axios'

export default {
  
name:'CreateNewAcc',
methods:{
  data() {
        return {
            companyName: "",
            companyEmail: "",
            password: "",
            access: ""
        }
    },
  addToAPI() {

            let newVendor = { 
                username: this.companyName,
                password: this.password,
                email: this.companyEmail,
                accessRights: this.access
             }
             console.log(newVendor)
             const axios = require('axios');

             axios.post('http://localhost:8080/vendors', newVendor)
             .then((response) => {
                console.log(response);
             })
             .catch ((error) => {
                console.log(error);
             })
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
</script>

<style>

</style>