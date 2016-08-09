package com.qinjiangbo.gen.model;

import java.io.Serializable;

public class BasRoleKey implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bas_role.role_id
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private Long roleId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bas_role.role_name
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private String roleName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bas_role.role_type
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private Integer roleType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table bas_role
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bas_role.role_id
     *
     * @return the value of bas_role.role_id
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public Long getRoleId() {
        return roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bas_role.role_id
     *
     * @param roleId the value for bas_role.role_id
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bas_role.role_name
     *
     * @return the value of bas_role.role_name
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bas_role.role_name
     *
     * @param roleName the value for bas_role.role_name
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bas_role.role_type
     *
     * @return the value of bas_role.role_type
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public Integer getRoleType() {
        return roleType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bas_role.role_type
     *
     * @param roleType the value for bas_role.role_type
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setRoleType(Integer roleType) {
        this.roleType = roleType;
    }
}