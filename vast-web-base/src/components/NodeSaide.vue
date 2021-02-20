<template>
  <div class="menuList">
    <div class="logo-con">
      <div class="title" v-show="!collapse">
        <span class="title__sider-title is-active">{{logo}}</span>
      </div>
      <div class="title" v-show="collapse">
        <span class="title__sider-title el-tag--mini">LG</span>
      </div>
    </div>
    <el-menu
      :background-color="backgroundColor"
      :text-color="textColor"
      :default-active="$route.meta.pageId"
      :collapse="collapse"
    >
      <template v-for="item in list">
        <router-link :to="item.url" :key="item.id" v-if="item.children.length===0">
          <el-menu-item :index="item.id.toString()">
            <i :class="item.icon"></i>
            <span slot="title">{{item.name}}</span>
          </el-menu-item>
        </router-link>
        <subMenu v-else :data="item" :key="item.id"></subMenu>
      </template>
    </el-menu>
  </div>
</template>

<script>
  import subMenu from "@/components/submenu.vue"
  export default {
    name: "menuList",
    components: {
      subMenu
    },
    data() {
      return {
        collapse: false, //是否折叠
        list: [
          {
            name: "首页",
            id: -1,
            icon: "el-icon-picture-outline-round",
            url: "/index",
            children: []
          },
          {
            name: "按钮",
            id: 20,
            icon: "el-icon-message-solid",
            url: "/button",
            children: []
          },
          {
            name: "测试1",
            id: 1,
            icon: "el-icon-s-claim",
            url: "",
            children: [
              {
                id: 4,
                parentid: 1,
                name: "测试1-1",
                icon: "el-icon-chat-dot-round",
                url: "",
                children: [
                  {
                    id: 8,
                    parentid: 1,
                    name: "测试1-1-1",
                    icon: "el-icon-cloudy",
                    url: "/test",
                    children: []
                  },
                  {
                    id: 9,
                    parentid: 1,
                    name: "测试1-1-2",
                    icon: "el-icon-files",
                    url: "/test1",
                    children: []
                  }
                ]
              },
              {
                id: 5,
                parentid: 1,
                name: "测试1-2",
                icon: "el-icon-shopping-cart-1",
                url: "/test3",
                children: []
              }
            ]
          },
          {
            name: "测试2",
            id: 2,
            icon: "el-icon-menu",
            url: "",
            children: [
              {
                id: 6,
                parentid: 2,
                name: "测试2-1",
                icon: "el-icon-folder-checked",
                url: "",
                children: []
              },
              {
                id: 7,
                parentid: 2,
                name: "测试2-2",
                icon: "el-icon-folder-remove",
                url: "",
                children: []
              }
            ]
          },
          {
            name: "测试3",
            id: 3,
            icon: "el-icon-monitor",
            url: "",
            children: []
          }
        ], //当行菜单数据源
        backgroundColor: "#304156", //导航菜单背景颜色
        textColor: "#BFCBD9", //导航菜单文字颜色
        logo: "LOGO" //logo
      };
    }
  };
</script>

<style lang="scss" scoped>
  .el-menu {
    border-right: none;
  a {
    text-decoration: none;
  }
  }
  .logo-con {
    height: 64px;
    padding: 10px;

  .title {
    position: relative;
    text-align: center;
    font-size: 20px;
    height: 64px;
    line-height: 64px;

  span {
    padding: 0 5px 0 0;
    color: #409eff;
    font-size: 20px;
  }
  }
  }
</style>
