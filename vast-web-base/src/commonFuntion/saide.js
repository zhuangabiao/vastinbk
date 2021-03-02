import markCommon from "../commonFuntion/markCommon";
export default{
  clickItem(saideCode) {
    markCommon.saideCode = saideCode;
    console.log("markValue>>>>>>>>" + markCommon.saideType);

  }
}
