<template>
    <div id="home-index">
      <div>
        {{msg}}
      </div>
    </div>
</template>

<script>
  export default{
    name: "home-index",
    data() {
      return {
        msg: "Hello word,I am Ms.Z"
      }
    }
  }
</script>

<style>

  #home-index{
    /*background-image: url('/static/images/1.jpg');*/
  }
</style>
