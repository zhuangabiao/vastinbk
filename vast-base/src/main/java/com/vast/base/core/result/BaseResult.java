package com.vast.base.core.result;

/**
 * ====================================================
 *
 * @ProjectName: vast-inbk
 * @Package: com.vast.base.core.result
 * @ClassName: BaseResult
 * @Author: Administrator
 * @Description: 返回前端layui的数据结构
 *
 *      当code为0的时候，count必须有值
 *
 * @Date: 2021/1/5 11:41
 * ====================================================
 * @Version: 1.0
 * ====================================================
 */
public class BaseResult {

    private int code;
    private String msg;
    private Object data;
    public BaseResult() {
    }
    public BaseResult(int code) {
        this(code,null);
    }
    public BaseResult(int code, Object data) {
        this(code,data,null);
    }
    public BaseResult(int code, Object data, String msg) {
        this.code = code;
        this.data = data;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }


    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
