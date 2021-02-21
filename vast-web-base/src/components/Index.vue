<template>
    <div id="editor">
        <mavon-editor
          @change="changeData"
          @save="saveData"
          v-model="value"/>
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
    ,methods: {
      changeData: function (value, render) {
        //console.log(value);
      }
      ,saveData: function (value, render) {
        console.log('>>>>>>>>' + this.value);
        var url = 'http://localhost:9091/vast/mark/menu/list';
        _this.$http.get(
          url
          ,{
            params: {
              
            }
          }).then(function (res) {

          let newStr = JSON.parse(JSON.stringify(res.data));
          console.log(res.data.data);
          _this.list = res.data.data;
        });
      }
    }
  }
</script>

<style>
  #home-index{
    /*background-image: url('/static/images/1.jpg');*/
  }
  #editor{
    height: 100%;
  }
  #editor .markdown-body{
    margin-top: 0px;
    height: 96%;
  }
  .markdown-body{
    margin: auto;
    width: 100%;
    height: 100%;
    margin-top: 5rem;
  }
</style>
