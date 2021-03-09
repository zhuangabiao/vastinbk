package com.vast.scp.mark.entity;

import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * ====================================================
 *
 * @ProjectName: vast-inbk
 * @Package: com.vast.base.entity
 * @ClassName: BaseUsers
 * @Author: Administrator
 * @Description: base_users实体类
 * @Date: 2021/1/4 15:19
 * ====================================================
 * @Version: 1.0
 * ====================================================
 */
@Table(name = "base_users")
public class BaseUsers {

    @Id
    @KeySql(useGeneratedKeys = true)    //主见回填
    private Integer id;
    private String userCode;
    private String username;
    private String pwd;
    private Integer status;
    private String city;
    private Double wealth;
    private Integer sex;
    private Integer locked;
    private Date birthday;
    private String phone;
    private String email;
    private String remark;

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Double getWealth() {
        return wealth;
    }

    public void setWealth(Double wealth) {
        this.wealth = wealth;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getLocked() {
        return locked;
    }

    public void setLocked(Integer locked) {
        this.locked = locked;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
