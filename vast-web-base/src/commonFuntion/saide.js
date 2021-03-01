import markCommon from "../commonFuntion/markCommon";
export default{
  clickItem(saideCode) {
    console.log("saide>>>>>>>>" + saideCode);
    markCommon.saideCode = saideCode;
    console.log("markValue>>>>>>>>" + markCommon.markValue);

  }
}
