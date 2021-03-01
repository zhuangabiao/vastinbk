<template>
   <el-submenu :index="data.fileCode" >
     <template slot="title" >
       <el-menu-item :index="data.fileCode" :icode="data.fileCode" style="padding-left: 0px" @click="clickSubItem(data.fileCode)" >
         <i :class="data.icon"></i>
         <span>{{data.fileName}}</span>
       </el-menu-item>
     </template>
     <template v-for="item in data.children">
       <router-link :to="item.url" :key="item.fileCode" v-if="item.children ==undefined || item.children.length===0">
         <el-menu-item class="subitem" :index="item.fileCode" :code="item.fileCode" @click="clickSubItem(item.fileCode)" >
           <i :class="item.icon"></i>
           <span slot="title">{{item.fileName}}</span>
         </el-menu-item>
       </router-link>
      <sub-saide v-else :data="item" :key="item.fileCode"></sub-saide>
     </template>
   </el-submenu>
</template>
<script>
  import saide from "@/commonFuntion/saide";
  import markCommon from "../commonFuntion/markCommon";
   export default {
     name: "subSaide",
     data() {
       return {

       };
     },
     props: {
      // data: [Array, Object]
       data:{           //这个就是父组件中子标签自定义名字
         type:Object,
         required:true
       }
     }
     ,methods: {
       clickSubItem: function (itemCode) {
         // console.log(">>>>>>>" + itemCode);
         saide.clickItem(itemCode);
         this.$emit('clearBlog');
         // this.$parent.subNodeClick(itemCode);
       }
     }
   };
</script>
<style>
  .el-menu-item {
    padding: 0;
  }
</style>
