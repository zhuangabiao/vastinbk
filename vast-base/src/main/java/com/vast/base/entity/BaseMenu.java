package com.vast.base.entity;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @ProjectName: vastinbk
 * @Package: com.vast.base.entity
 * @ClassName: BaseMenu
 * @Author: Mr.Z
 * @Description:
 * @Date: 2021/1/14 22:00
 * <p>
 * =================================================
 * @Version: 1.0
 * =================================================
 */
@Table(name = "base_menu")
public class BaseMenu {

    @Id
    private int id;
    private String menuCode;
    private String menuName;
    private String parentCode;
    private int sortNo;
    private String remark;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMenuCode() {
        return menuCode;
    }

    public void setMenuCode(String menuCode) {
        this.menuCode = menuCode;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getParentCode() {
        return parentCode;
    }

    public void setParentCode(String parentCode) {
        this.parentCode = parentCode;
    }

    public int getSortNo() {
        return sortNo;
    }

    public void setSortNo(int sortNo) {
        this.sortNo = sortNo;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
