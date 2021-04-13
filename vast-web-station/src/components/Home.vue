<template>
  <div id="Home">
    <el-container style="height: 100%; ">
      <!--<el-row :gutter="20">
        <el-col :span="6"><div class="grid-content bg-purple"></div></el-col>
        <el-col :span="6"><div class="grid-content bg-purple"></div></el-col>
        <el-col :span="6"><div class="grid-content bg-purple"></div></el-col>
        <el-col :span="6"><div class="grid-content bg-purple"></div></el-col>
      </el-row>-->
      <el-row>
        <el-col :span="8"><div class="grid-content bg-purple">123</div></el-col>
        <el-col :span="8"><div class="grid-content bg-purple-light">345</div></el-col>
        <el-col :span="8"><div class="grid-content bg-purple">567</div></el-col>
      </el-row>


    </el-container>
  </div>
</template>

<script>
  export default {
    name: "Home",
    data() {
      return {
        msg: "Hello Home"
      }
    }
  }
</script>

<style>
  #Home{
    height: 90%;
  }

</style>
