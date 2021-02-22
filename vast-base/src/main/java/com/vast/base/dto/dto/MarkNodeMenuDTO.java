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
public class MarkNodeMenuDTO {

    MarkNodeMenuDTO(){}

    public MarkNodeMenuDTO(String fileCode, String fileName, String icon, String url, List<MarkNodeMenuDTO> children) {
        this.fileCode = fileCode;
        this.fileName = fileName;
        this.icon = icon;
        this.url = url;
        this.children = children;
    }

    private String fileCode;
    private String fileName;
    private String icon;
    private String url;
    private List<MarkNodeMenuDTO> children;

    public String getFileCode() {
        return fileCode;
    }

    public void setFileCode(String fileCode) {
        this.fileCode = fileCode;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
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

    public List<MarkNodeMenuDTO> getChildren() {
        return children;
    }

    public void setChildren(List<MarkNodeMenuDTO> children) {
        this.children = children;
    }
}
