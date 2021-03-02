<template>
    <div id="editor">
        <el-input v-model="title"></el-input>
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
        title: '',
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
        var url = 'http://localhost:9091/vast/blog/directory/content/save';
        this.$http.get(
          url
          ,{
            params: {
              title: this.title
              ,markContent: this.value
              ,saideCode: markCommon.saideCode
            }
          }).then(function (res) {

          let newStr = JSON.parse(JSON.stringify(res.data));
        });
      }
      ,clearMark: function () {
        if('dc' === markCommon.saideType) {
          console.log(">>>>>>index is clear>>>>>>" + markCommon.saideCode + "   "+ markCommon.saideType)
          var url = 'http://localhost:9091/vast/blog/directory/content/getByCode';
          this.$http.get(
            url
            ,{
              params: {
                contentCode: markCommon.saideCode
              }
            }).then(function (res) {

            let newStr = JSON.parse(JSON.stringify(res.data));
            console.log(newStr)
            this.value = res.data.data.markContent;
            this.title = res.data.data.blogTitle;
          });
        }else {
          this.value = '';
        }
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
