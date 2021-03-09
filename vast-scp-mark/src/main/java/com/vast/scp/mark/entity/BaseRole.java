package com.vast.scp.mark.entity;

import javax.persistence.Table;

/**
 * @ProjectName: vastinbk
 * @Package: com.vast.base.entity
 * @ClassName: BaseRole
 * @Author: Mr.Z
 * @Description:
 * @Date: 2021/1/14 22:03
 * <p>
 * =================================================
 * @Version: 1.0
 * =================================================
 */
@Table(name = "base_role")
public class BaseRole {

    private int id;
    private String roleCode;
    private String roleName;
    private int status;
    private int sortNo;
    private String remark;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
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
