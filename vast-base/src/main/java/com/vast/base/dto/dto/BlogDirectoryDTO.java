package com.vast.base.dto.dto;

import java.util.List;

/**
 * @ProjectName: vastinbk
 * @Package: com.vast.base.dto.dto
 * @ClassName: MarkNodeMenuDTO
 * @Author: Mr.Z
 * @Description: 笔记文档前端视图
 * @Date: 2021/2/21 0:07
 * <p>
 * =================================================
 * @Version: 1.0
 * =================================================
 */
public class BlogDirectoryDTO {

    public BlogDirectoryDTO(){}

    public BlogDirectoryDTO(String directoryCode, String directoryName, String icon, String url, String type, List<BlogDirectoryDTO> children) {
        this.directoryCode = directoryCode;
        this.directoryName = directoryName;
        this.icon = icon;
        this.url = url;
        this.type = type;
        this.children = children;
    }

    private String directoryCode;
    private String directoryName;
    private String icon;
    private String url;
    private String type;
    private List<BlogDirectoryDTO> children;

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

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<BlogDirectoryDTO> getChildren() {
        return children;
    }

    public void setChildren(List<BlogDirectoryDTO> children) {
        this.children = children;
    }
}
