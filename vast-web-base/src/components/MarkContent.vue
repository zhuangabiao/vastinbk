<template>
  <div id="BlogContent" class="el-container">
    <el-aside width="300px" class="saide-right-border">
      <NodeSaide @clearMark="clearBlog"></NodeSaide>
    </el-aside>
    <el-container>
      <el-main class="my-border">
        <Index ref="childlContainer"></Index>
      </el-main>
    </el-container>
  </div>
</template>

<script>
  import MySaide from '@/components/MySaide.vue';
  import Index from '@/components/Index.vue';
  import NodeSaide from '@/components/NodeSaide.vue';
  // import Saide from '@/commonFuntion/saide.js'

  export default {
    name: "BlogContent",
    data() {
      return{

      }
    }
    ,components: {
      MySaide,
      Index,
      NodeSaide
    }
    ,methods: {
      clearBlog: function () {
        this.$refs.childlContainer.clearMark();
      }
    }
  }
</script>

<style>

</style>
