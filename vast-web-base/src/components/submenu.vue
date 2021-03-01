<template functional>
   <el-submenu :index="props.data.directoryCode" >
     <template slot="title" >
       <el-menu-item :index="props.data.directoryCode" :icode="props.data.directoryCode" @click="listeners.submenuClick(props.data)" style="padding-left: 0px">
         <i :class="props.data.icon"></i>
         <span>{{props.data.directoryName}}</span>
       </el-menu-item>
     </template>
     <template v-for="item in props.data.children">
       <router-link :to="item.url" :key="item.directoryCode" v-if="item.children ==undefined || item.children.length===0">
         <el-menu-item class="subitem" :index="item.directoryCode" :code="item.directoryCode"  @click="listeners.submenuClick(item.data)">
           <i :class="item.icon"></i>
           <span slot="title">{{item.directoryName}}</span>
         </el-menu-item>
       </router-link>
       <sub-menu v-else :data="item" :key="item.directoryCode"></sub-menu>
     </template>
   </el-submenu>
 </template>

 <script>
   export default {
       name: "submenu",
       props: {
        // data: [Array, Object],
         data:{           //这个就是父组件中子标签自定义名字
           type:Object,
           required:true
         }
       }
   };
   </script>
 <style>

  .el-menu-item {
    padding: 0;
  }
  </style>
