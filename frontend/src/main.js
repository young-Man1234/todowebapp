import Vue from 'vue'
import App from './App.vue'
import {store} from './store/store'
import axios from 'axios'

Vue.config.productionTip = false

new Vue({
  store,
  axios,
  render: h => h(App),
}).$mount('#app')
