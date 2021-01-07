package com.vast.base.core.result;

/**
 * @ProjectName: vastinbk
 * @Package: com.vast.base.core.result
 * @ClassName: ResultPage
 * @Author: Mr.Z
 * @Description: 带分页功能
 * @Date: 2021/1/7 23:31
 * <p>
 * =================================================
 * @Version: 1.0
 * =================================================
 */
public class ResultPage extends BaseResult{

    private Integer count;

    public ResultPage(int code) {
        super(code);
    }

    public ResultPage(int code, Object data) {
        super(code, data);
    }

    public ResultPage(int code, Object data, Integer count) {
        super(code, data);
        this.count = count;
    }

    public ResultPage(int code, Object data, int count, String msg) {
        super(code, data, msg);
        this.count = count;
    }
}
