package com.qinjiangbo.gen.model;

import java.io.Serializable;

public class BasOrgRoleKey implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bas_org_role.org_id
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private Long orgId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bas_org_role.user_id
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private Long userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bas_org_role.role_id
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private Long roleId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table bas_org_role
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bas_org_role.org_id
     *
     * @return the value of bas_org_role.org_id
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public Long getOrgId() {
        return orgId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bas_org_role.org_id
     *
     * @param orgId the value for bas_org_role.org_id
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bas_org_role.user_id
     *
     * @return the value of bas_org_role.user_id
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bas_org_role.user_id
     *
     * @param userId the value for bas_org_role.user_id
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bas_org_role.role_id
     *
     * @return the value of bas_org_role.role_id
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public Long getRoleId() {
        return roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bas_org_role.role_id
     *
     * @param roleId the value for bas_org_role.role_id
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }
}