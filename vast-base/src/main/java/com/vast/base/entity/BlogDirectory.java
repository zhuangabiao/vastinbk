package com.vast.base.entity;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @ProjectName: vastinbk
 * @Package: com.vast.base.entity
 * @ClassName: BlogDirectory
 * @Author: Mr.Z
 * @Description: 目录表
 * @Date: 2021/3/1 20:55
 * <p>
 * =================================================
 * @Version: 1.0
 * =================================================
 */
@Table(name = "blog_directory")
public class BlogDirectory {

    @Id
    private String directoryCode;  // '目录编号',
    private String directoryName;  //目录名称',
    private String parentCode ;  //上级目录，如果是第一级目录则为0',
    private String directoryType;  //目录类型',
    private String userCode;  //用户ID',
    private String state;  //状态'

    public String getDirectoryCode() {
        return directoryCode;
    }

    public void setDirectoryCode(String directoryCode) {
        this.directoryCode = directoryCode;
    }

    public String getDirectoryName() {
        return directoryName;
    }

    public void setDirectoryName(String directoryName) {
        this.directoryName = directoryName;
    }

    public String getParentCode() {
        return parentCode;
    }

    public void setParentCode(String parentCode) {
        this.parentCode = parentCode;
    }

    public String getDirectoryType() {
        return directoryType;
    }

    public void setDirectoryType(String directoryType) {
        this.directoryType = directoryType;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
