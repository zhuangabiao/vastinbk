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
        <router-link :to="item.url" :key="item.fileCode" v-if="item.children ==undefined || item.children.length===0">
          <el-menu-item :index="item.fileCode" :item-type="item.fileCode" v-on:click="createNewMark()">
            <i :class="item.icon"></i>
            <span slot="title">{{item.fileName}}</span>
          </el-menu-item>
        </router-link>

        <subMenu  v-else :data="item" :key="item.fileCode" :item-click="subNodeClick(item)"></subMenu>
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
        list: [], //当行菜单数据源
        backgroundColor: "", //导航菜单背景颜色
        textColor: "#333", //导航菜单文字颜色
        logo: "LOGO" //logo
      };
    },
    created () {
      this.loadData()
    }
    ,methods: {
      loadData: function () {
        var _this = this;
        var url = 'http://localhost:9091/vast/mark/menu/list';
        _this.$http.get(
          url
          ,{
            params: {

            }
          }).then(function (res) {

          let newStr = JSON.parse(JSON.stringify(res.data));
          console.log(res.data.data);
          _this.list = res.data.data;
        });
      }
      ,createNewMark() {
        console.log("==========>>>>>>>>>>")
        // this.$refs
        // subMenu.createSubNewMark();
      }
      ,subNodeClick(item) {
        console.log("sub==========>>>>>>>>>>" + item.fileCode);
      }
    }
  };
</script>

<style>
  .el-menu {
    border-right: none;
  }
  .el-menu a {
    text-decoration: none;
  }
  .menuList {
    text-align: left;
  }
  .logo-con {
    height: 64px;
    padding: 10px;
  }
  .logo-con  .title {
    position: relative;
    text-align: center;
    font-size: 20px;
    height: 64px;
    line-height: 64px;
  }
  .logo-con  .title  span {
    padding: 0 5px 0 0;
    color: #409eff;
    font-size: 20px;
  }

</style>
