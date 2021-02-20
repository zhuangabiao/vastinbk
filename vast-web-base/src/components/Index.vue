<template>
    <div id="editor">
        <mavon-editor  v-model="value"/>
    </div>
</template>

<script>
  export default{
    name: "editor",
    data() {
      return {
        value: '',
        defaultData: "preview",
      }
    }
  }
</script>

<style>
  #home-index{
    /*background-image: url('/static/images/1.jpg');*/
  }
  #editor {

  }
  .markdown-body{
    margin: auto;
    width: 100%;
    height: 100%;
    margin-top: 5rem;
  }
</style>
