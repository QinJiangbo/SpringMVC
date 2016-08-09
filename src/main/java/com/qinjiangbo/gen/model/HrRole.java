package com.qinjiangbo.gen.model;

import java.io.Serializable;
import java.util.Date;

public class HrRole implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hr_role.role_id
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private Long roleId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hr_role.role_name
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private String roleName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hr_role.org_id
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private Long orgId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hr_role.status
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private Integer status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hr_role.remark
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private String remark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hr_role.user_create
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private Long userCreate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hr_role.time_create
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private Date timeCreate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table hr_role
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hr_role.role_id
     *
     * @return the value of hr_role.role_id
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public Long getRoleId() {
        return roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hr_role.role_id
     *
     * @param roleId the value for hr_role.role_id
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hr_role.role_name
     *
     * @return the value of hr_role.role_name
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hr_role.role_name
     *
     * @param roleName the value for hr_role.role_name
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hr_role.org_id
     *
     * @return the value of hr_role.org_id
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public Long getOrgId() {
        return orgId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hr_role.org_id
     *
     * @param orgId the value for hr_role.org_id
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hr_role.status
     *
     * @return the value of hr_role.status
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hr_role.status
     *
     * @param status the value for hr_role.status
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hr_role.remark
     *
     * @return the value of hr_role.remark
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hr_role.remark
     *
     * @param remark the value for hr_role.remark
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hr_role.user_create
     *
     * @return the value of hr_role.user_create
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public Long getUserCreate() {
        return userCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hr_role.user_create
     *
     * @param userCreate the value for hr_role.user_create
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setUserCreate(Long userCreate) {
        this.userCreate = userCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hr_role.time_create
     *
     * @return the value of hr_role.time_create
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public Date getTimeCreate() {
        return timeCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hr_role.time_create
     *
     * @param timeCreate the value for hr_role.time_create
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setTimeCreate(Date timeCreate) {
        this.timeCreate = timeCreate;
    }
}