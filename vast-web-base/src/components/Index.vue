<template>
    <div id="editor">
        <mavon-editor
          @change="changeData"
          @save="saveData"
          v-model="value"/>
    </div>
</template>

<script>
  import markCommon from "../commonFuntion/markCommon";

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
        console.log(render);
        markCommon.markValue = value;
      }
      ,saveData: function (value, render) {
        var _this = this;

        console.log('itemCode>>>>>>>>' + markCommon.saideCode);
        console.log('>>>>>>>>' + this.value);
        var url = 'http://localhost:9091/vast/mark/menu/save';
        this.$http.get(
          url
          ,{
            params: {
              msg: this.value
              ,saideCode: markCommon.saideCode
            }
          }).then(function (res) {

          let newStr = JSON.parse(JSON.stringify(res.data));
          // console.log(res.data.data);
          // _this.list = res.data.data;
        });
      }
      ,clearMark: function () {
        console.log(">>>>>>index is clear>>>>>>")
        this.value = '';
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
