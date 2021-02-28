// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue'
import App from './App'
import router from './router'
import ElementUi from 'element-ui';
import  mavonEditor  from 'mavon-editor';
import VueResource from 'vue-resource';
import Saide from '@/commonFuntion/saide.js'
import MarkCommon from '@/commonFuntion/markCommon.js'

import 'element-ui/lib/theme-chalk/index.css';
import 'mavon-editor/dist/css/index.css';

Vue.config.productionTip = false

Vue.use(ElementUi)
Vue.use(mavonEditor)
Vue.use(VueResource)
Vue.prototype.saide = Saide;
Vue.prototype.markCommon = MarkCommon;

/* eslint-disable no-new */
new Vue({
  el: '#app',
  router,
  components: { App },
  template: '<App/>'
})
