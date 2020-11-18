import Vue from 'vue'
import App from './App.vue'
//import BootstrapVue from "bootstrap-vue"
import 'bootstrap'
import axios from 'axios'
import router from './router'

window.$ = window.jQuery = require('jquery');

//Vue.use(BootstrapVue)

Vue.config.productionTip = false

Vue.prototype.$axios = axios

new Vue({
  router,
  render: h => h(App)
}).$mount('#app')

