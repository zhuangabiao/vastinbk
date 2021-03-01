<template>
  <div id="app">
    <el-container>
      <el-header  class="header-bottom-border">
        <MyHead></MyHead>
      </el-header>
      <el-container>
        <MarkContent></MarkContent>
        <!--<el-aside width="300px" class="saide-right-border">
          <NodeSaide></NodeSaide>
        </el-aside>
        <el-container>
          <el-main class="my-border">
            <Index></Index>
          </el-main>
&lt;!&ndash;          <el-footer>Footer</el-footer>&ndash;&gt;
        </el-container>-->
      </el-container>
    </el-container>
  </div>
</template>
  <script>
    import MyHead from '@/components/MyHead.vue';
    import MySaide from '@/components/MySaide.vue';
    import Index from '@/components/Index.vue';
    import NodeSaide from '@/components/NodeSaide.vue';
    import MarkContent from '@/components/MarkContent.vue';

    export default {
      name: 'app',
      components: {
        MyHead,
        MySaide,
        Index,
        NodeSaide,
        MarkContent
      },
      data(){
        return {
          message: 'hello word, I am Ms.zh'
        }
      },
      method: {

      }
    }
/*    var app = new Vue({
      el: '#app',
      data: {
      message: 'Hello Vue!'
      }
    })*/
  </script>
  <style>
    /*
      找到html标签、body标签，和挂载的标签
      都给他们统一设置样式
    */
    html,body,#app,.el-container{
      /*设置内部填充为0，几个布局元素之间没有间距*/
      padding: 0px;
      /*外部间距也是如此设置*/
      margin: 0px;
      /*统一设置高度为100%*/
      height: 100%;
    }
    .el-header, .el-footer {
      /*background-color: #B3C0D1;*/
      color: #333;
      text-align: center;
      line-height: 80px;
      height: 80px !important;
    }

    .el-aside {
      /*background-color: #D3DCE6;*/
      color: #333;
      text-align: center;
      line-height: 200px;
    }

    .el-main {
      /*background-color: #E9EEF3;*/
      color: #333;
      text-align: center;
      line-height: 160px;
      margin: 0px;
      padding: 0px;
    }
    #MyHead .el-menu li{
      padding-left: 10px;
      padding-right: 10px;
    }

    .header-bottom-border{
      /*box-shadow: 0 2px 4px rgba(0, 0, 0, .12), 0 0 6px rgba(0, 0, 0, .04)*/
      border-bottom: 1px solid #eaecef;
    }
    .saide-right-border{
      border-right: 1px solid #eaecef;
    }
    body > .el-container {
      margin-bottom: 40px;
      height: 100%;
    }

    .el-container:nth-child(5) .el-aside,
    .el-container:nth-child(6) .el-aside {
      line-height: 260px;
    }

    .el-container:nth-child(7) .el-aside {
      line-height: 320px;
    }
  </style>


