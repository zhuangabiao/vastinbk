<template>
  <div id="mySaide" style="height: 100%;">
    <el-row class="tac">
      <el-col :span="24">
        <el-menu default-active="2" class="nav-contain" @open="handleOpen" @close="handleClose">
          <el-submenu index="1">
            <template slot="title">
              <span>导航一</span>
            </template>
            <el-menu-item index="1-1">选项11</el-menu-item>

          </el-submenu>
          <el-menu-item index="2">
            <!--<i class="el-icon-menu"></i>-->
            <span slot="title">导航二</span>
          </el-menu-item>

        </el-menu>
      </el-col>
    </el-row>
  </div>
</template>

<script>
  export default {
    name: "mySaide",
    methods: {
      handleOpen(key, keyPath) {
        console.log(key, keyPath);
      },
      handleClose(key, keyPath) {
        console.log(key, keyPath);
      }
    }
  }
</script>

<style>
  html,body,#mySaide,.tac,div{
    /*统一设置高度为100%*/
    height: 100%;
  }
  .el-menu-vertical-demo:not(.el-menu--collapse) {
    width: 300px;
    height: 100%;
    min-height: 400px;
  }
  el-submenu el-menu-item-group{
    padding-left: 20px;
  }

  .nav-contain{
    text-align: left;
  }
  .nav-contain el-menu-item{
    padding-left: 20px;
  }
</style>
