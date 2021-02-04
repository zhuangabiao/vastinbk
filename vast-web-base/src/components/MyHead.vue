<template>
  <div id="MyHead">
    <el-row>
      <el-col :span="4">
        <el-avatar :size="60" src="https://empty" @error="errorHandler" style="margin-top:10px;">
          <img src="/static/images/logo.jpg" style="width:60px;"/>
        </el-avatar>
      </el-col>
      <el-col :span="20">
        <el-row  type="flex" class="row-bg" justify="end">
            <div class="grid-content bg-purple" >
              <el-menu  :default-active="activeIndex" class="nav" mode="horizontal" @select="handleSelect">
                <el-menu-item index="1">处理中心</el-menu-item>
                <el-menu-item index="2">我的工作台</el-menu-item>
                <el-menu-item index="3">消息中心</el-menu-item>
                <el-menu-item index="4"><a href="https://www.ele.me" target="_blank">订单管理</a></el-menu-item>
                <el-submenu index="5" style="top: 10px;">
                  <template slot="title">我的工作台</template>
                  <el-menu-item index="5-1">选项1</el-menu-item>
                  <el-menu-item index="5-2">选项2</el-menu-item>
                  <el-menu-item index="5-3">选项3</el-menu-item>
                </el-submenu>
              </el-menu>
            </div>
        </el-row>

      </el-col>
    </el-row>
  </div>
</template>
<script>
  export default {
    name: 'MyHead',
    data(){
      return {
        message: 'hello word, I am MyHead',
        activeIndex: '1',
        activeIndex2: '1'
      }
    },
    methods: {
      handleSelect(key, keyPath) {
        console.log(key, keyPath);
      },
      errorHandler(){}
    }
  }
</script>
<style>
.el-menu--popup-bottom-start{
  top: 60px;
}
</style>


