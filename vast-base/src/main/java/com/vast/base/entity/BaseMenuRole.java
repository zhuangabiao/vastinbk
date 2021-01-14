package com.vast.base.entity;

import javax.persistence.Table;

/**
 * @ProjectName: vastinbk
 * @Package: com.vast.base.entity
 * @ClassName: BaseMenuRole
 * @Author: Mr.Z
 * @Description:
 * @Date: 2021/1/14 22:08
 * <p>
 * =================================================
 * @Version: 1.0
 * =================================================
 */
@Table(name = "base_menu_role")
public class BaseMenuRole {

    private String menuCode;
    private String roleCode;

    public String getMenuCode() {
        return menuCode;
    }

    public void setMenuCode(String menuCode) {
        this.menuCode = menuCode;
    }

    public String getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode;
    }
}
