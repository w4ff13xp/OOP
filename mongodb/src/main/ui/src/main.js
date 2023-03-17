import { createApp } from 'vue'
import App from './App.vue'
import router from './router'
import store from './store'
import vuetify from './plugins/vuetify'
import { loadFonts } from './plugins/webfontloader'
import VueSignaturePad from 'vue-signature-pad';


// import VueAxios from './plugins/axios'

loadFonts()

createApp(App)
  .use(router)
  .use(store)
  .use(vuetify)
  .use(VueSignaturePad)
  // .use(VueAxios)
  
  .mount('#app')
