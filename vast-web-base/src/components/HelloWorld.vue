<template>
  <div id="app">
    <h1>{{message}}</h1>

  </div>
</template>
  <script>
    import Vue from 'vue'
    new Vue({
      el: '#app',
      data: {
        message: 'hello word'
      }
    })
    /*export default {
      name: 'app',
      data(){
        return {
          message: 'hello word'
        }
      },
      method: {

      }

    }*/
/*    var app = new Vue({
      el: '#app',
      data: {
      message: 'Hello Vue!'
      }
    })*/
  </script>

