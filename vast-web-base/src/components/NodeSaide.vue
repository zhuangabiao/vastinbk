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
        <router-link :to="item.url" :key="item.directoryCode" v-if="item.children == undefined || item.children.length===0">
          <el-menu-item :index="item.directoryCode" :item-type="item.type" v-on:click="refEditor(item.directoryCode,item.type)">
            <i :class="item.icon"></i>
            <span slot="title">{{item.directoryName}}</span>
          </el-menu-item>
        </router-link>
       <!-- <subSaide  v-else :data="item" :key="item.fileCode" :fileCode="fileCode" @submenuClick="subNodeClick(item)"></subSaide>-->
        <subSaide  v-else :data="item" :key="item.directoryCode" :fileCode="directoryCode" @clearBlog="clearSaide"></subSaide>
      </template>
    </el-menu>
  </div>
</template>

<script>
  // import subMenu from "@/components/submenu.vue"
  import subSaide from "@/components/subSaide.vue"

  import index from "../router";
  import markCommon from "../commonFuntion/markCommon";
  export default {
    name: "menuList",
    components: {
      subSaide
    },
    data() {
      return {
        collapse: false, //是否折叠
        list: [], //当行菜单数据源
        backgroundColor: "", //导航菜单背景颜色
        textColor: "#333", //导航菜单文字颜色
        logo: "LOGO", //logo
        directoryCode: ""
      };
    },
    created () {
      this.loadData()
    }
    ,methods: {
      loadData: function () {
        var _this = this;
        var url = this.$api + '/vast/blog/directory/list';
        _this.$http.get(
          url
          ,{
            params: {

            }
          }).then(function (res) {
          let newStr = JSON.parse(JSON.stringify(res.data.data));
          console.log(res.data.data);
          _this.list = res.data.data;
        });
      }
      ,createNewMark() {
        console.log("==========>>>>>>>>>>")
      }
      ,subNodeClick(itemCode) {
        console.log("sub==========>>>>>>>>>>" + itemCode);

      }
      ,refEditor(itemCode,type) {
        //刷新markdown页面
        console.log("refEditor==========>>>>>>>>>>" + itemCode + itemCode);
        markCommon.saideCode = itemCode;
        markCommon.saideType = type;
        this.$emit('clearMark');
      }
      ,clearSaide() {
        console.log("clearSaide==========>>>>>>>>>>" + markCommon.saideType);
        this.$emit('clearMark');
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
