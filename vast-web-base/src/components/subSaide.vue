<template>
   <el-submenu :index="data.directoryCode" >
     <template slot="title" >
       <el-menu-item :index="data.directoryCode" :icode="data.directoryCode" style="padding-left: 0px" v-on:click="clickSubItem(data.directoryCode,data.type)" >
         <i :class="data.icon"></i>
         <span>{{data.directoryName}}</span>
       </el-menu-item>
     </template>
     <template v-for="item in data.children">
       <router-link :to="item.url" :key="item.directoryCode" v-if="item.children ==undefined || item.children.length===0">
         <el-menu-item class="subitem" :index="item.directoryCode" :code="item.directoryCode" v-on:click="clickSubItem(item.directoryCode,item.type)" >
           <i :class="item.icon"></i>
           <span slot="title">{{item.directoryName}}</span>
         </el-menu-item>
       </router-link>
      <sub-saide v-else :data="item" :key="item.directoryCode" @clearBlog="clickSub"></sub-saide>
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
       clickSubItem: function (itemCode,type) {
         markCommon.saideCode = itemCode;
         markCommon.saideType = type;
         // saide.clickItem(itemCode);
         this.$emit('clearBlog');
         // this.$parent.subNodeClick(itemCode);
       }
       ,clickSub: function () {
         this.$emit('clearBlog');
       }
     }
   };
</script>
<style>
  .el-menu-item {
    padding: 0;
  }
</style>
