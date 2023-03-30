import { createRouter, createWebHistory } from 'vue-router'
import AboutView from '../views/AboutView.vue'
import Profile from '../views/Profile.vue'
import Login from '../views/Login.vue'
import Logout from '../views/Logout.vue'
import Store from '../store'
import Auth0Callback from '../views/Auth0Callback.vue'
import Home from '../views/Home.vue'
import PerformanceEvaluation from '../views/PerformanceEvaluation.vue'
import Admin from '../views/Admin.vue'
import CreateNewAcc from '../views/CreateNewAcc.vue'
import Approver from '../views/Approver.vue'
import SpecificVendor from '../views/SpecificVendor.vue'
import HealthSafetyPreEvaluation from '../views/Safety&HealthPreEvaluation.vue'
import NewVendorForm from '../views/NewVendorForm.vue'
import Vendor from'../views/Vendor.vue'
import AdminApprove from '../views/AdminApprove.vue'

const routes = [

  {
    path: '/adminapprove',
    name: 'AdminApprove',
    component: AdminApprove,
    meta: {requiresAuth:true}
  },
  {
    path: '/vendor',
    name: 'Vendor',
    component: Vendor,
    meta: {requiresAuth:true}
  },
  {
    path: '/newvendorform',
    name: 'newvendorform',
    component: NewVendorForm,
    meta: {requiresAuth:true}
  },
  {
    path: '/specificvendor',
    name: 'specificvendor',
    component: SpecificVendor,
    meta: {requiresAuth:true}
  },
  {
    path: '/',
    name: 'login',
    component: Login
  },
  {
    path: '/approver',
    name: 'approver',
    component: Approver,
    meta: {requiresAuth:true}
  },
  {
    path: '/createnewacc',
    name: 'createnewacc',
    component: CreateNewAcc,
    meta: {requiresAuth:true}
  },
  {
    path: '/admin',
    name: 'admin',
    component: Admin,
    meta: {requiresAuth:true}
  },
  {
    path: '/performanceevaluation',
    name: 'performanceevaluation',
    component: PerformanceEvaluation,
    meta: {requiresAuth:true}
  },
  {
    path: '/Safety&HealthPreEvaluation',
    name: 'healthsafetypreevaluation',
    component: HealthSafetyPreEvaluation,
    meta: {requiresAuth:true}
  },
  {
    path: '/home',
    name: 'home',
    component: Home,
    meta: {requiresAuth:true}
  },

  {
    path: '/about',
    name: 'about',
    component: AboutView
  },
  {
    path: '/profile',
    name: 'profile',
    component: Profile,
    meta: {requiresAuth:true}
  },
  {
    path: '/login',
    name: 'logout',
    component: Logout
  },
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
    //   router.replace('/logout')
    }
  }
  else{
    // next();
  }
})

export default router

