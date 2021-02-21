<template functional>
     <el-submenu :index="props.data.fileCode">
       <template slot="title">
         <i :class="props.data.icon"></i>
         <span>{{props.data.fileName}}</span>
       </template>
       <template v-for="item in props.data.children">
         <router-link :to="item.url" :key="item.fileCode" v-if="item.children ==undefined || item.children.length===0">
           <el-menu-item class="subitem" :index="item.fileCode">
             <i :class="item.icon"></i>
             <span slot="title">{{item.fileName}}</span>
           </el-menu-item>
         </router-link>
         <sub-menu v-else :data="item" :key="item.fileCode"></sub-menu>
       </template>
     </el-submenu>
   </template>

 <script>
   export default {
       name: "submenu",
       props: {
        data: [Array, Object]
       }
       ,methods: {
         createSubNewMark: function () {
           console.log("==========>>>>>>>>>>111")
         }
     }
   };
   </script>

 <style>

  .el-menu-item {
    padding: 0;
  }
  </style>
