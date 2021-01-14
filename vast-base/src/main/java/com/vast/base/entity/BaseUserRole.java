package com.vast.base.entity;

import javax.persistence.Table;

/**
 * @ProjectName: vastinbk
 * @Package: com.vast.base.entity
 * @ClassName: BaseUserRole
 * @Author: Mr.Z
 * @Description:
 * @Date: 2021/1/14 22:06
 * <p>
 * =================================================
 * @Version: 1.0
 * =================================================
 */
@Table(name = "base_user_role")
public class BaseUserRole {

    private int userId;
    private String roleCode;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode;
    }
}
