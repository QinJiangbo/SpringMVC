package com.qinjiangbo.gen.model;

import java.io.Serializable;
import java.util.Date;

public class BasRole extends BasRoleKey implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bas_role.remark
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private String remark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bas_role.sort_id
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private Integer sortId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bas_role.time_update
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private Date timeUpdate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table bas_role
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bas_role.remark
     *
     * @return the value of bas_role.remark
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bas_role.remark
     *
     * @param remark the value for bas_role.remark
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bas_role.sort_id
     *
     * @return the value of bas_role.sort_id
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public Integer getSortId() {
        return sortId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bas_role.sort_id
     *
     * @param sortId the value for bas_role.sort_id
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setSortId(Integer sortId) {
        this.sortId = sortId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bas_role.time_update
     *
     * @return the value of bas_role.time_update
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public Date getTimeUpdate() {
        return timeUpdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bas_role.time_update
     *
     * @param timeUpdate the value for bas_role.time_update
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setTimeUpdate(Date timeUpdate) {
        this.timeUpdate = timeUpdate;
    }
}