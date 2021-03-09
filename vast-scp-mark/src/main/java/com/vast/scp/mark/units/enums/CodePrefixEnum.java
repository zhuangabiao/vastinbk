package com.vast.scp.mark.units.enums;

/**
 * ====================================================
 *
 * @ProjectName: vastinbk
 * @Package: com.vast.base.enums
 * @ClassName: CodePrefixEnum
 * @Author: Administrator
 * @Description: 编码生成前缀
 * @Date: 2021/3/2 10:48
 * ====================================================
 * @Version: 1.0
 * ====================================================
 */
public enum  CodePrefixEnum {

    //博客内容编码前缀
    BLOG_CONTENT_CODE("BC");

    private String prefix;

    CodePrefixEnum(String prefix) {
        this.prefix = prefix;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }
}
