package com.vast.base.entity;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @ProjectName: vastinbk
 * @Package: com.vast.base.entity
 * @ClassName: BlogDirectoryContent
 * @Author: Mr.Z
 * @Description: Blog内容
 * @Date: 2021/3/1 21:02
 * <p>
 * =================================================
 * @Version: 1.0
 * =================================================
 */

@Table(name = "blog_directory_content")
public class BlogDirectoryContent {

    @Id
    private String id;
    private String contentCode;    //内容编号',
    private String directoryCode;    //目录编码',
    private String blogTitle;    //标题',
    private String markContent;    //mark格式文本内容',
    private String htmlContent;    //html格式的内容',
    private String createDate;    //创建时间',
    private String updateDate;    //修改时间',
    private String createUser;    //创建人'


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContentCode() {
        return contentCode;
    }

    public void setContentCode(String contentCode) {
        this.contentCode = contentCode;
    }

    public String getDirectoryCode() {
        return directoryCode;
    }

    public void setDirectoryCode(String directoryCode) {
        this.directoryCode = directoryCode;
    }

    public String getBlogTitle() {
        return blogTitle;
    }

    public void setBlogTitle(String blogTitle) {
        this.blogTitle = blogTitle;
    }

    public String getMarkContent() {
        return markContent;
    }

    public void setMarkContent(String markContent) {
        this.markContent = markContent;
    }

    public String getHtmlContent() {
        return htmlContent;
    }

    public void setHtmlContent(String htmlContent) {
        this.htmlContent = htmlContent;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }
}
