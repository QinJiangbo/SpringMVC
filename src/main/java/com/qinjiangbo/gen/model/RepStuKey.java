package com.qinjiangbo.gen.model;

import java.io.Serializable;

public class RepStuKey implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rep_stu.user_id
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private Long userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rep_stu.attr_id
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private Long attrId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table rep_stu
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rep_stu.user_id
     *
     * @return the value of rep_stu.user_id
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rep_stu.user_id
     *
     * @param userId the value for rep_stu.user_id
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rep_stu.attr_id
     *
     * @return the value of rep_stu.attr_id
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public Long getAttrId() {
        return attrId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rep_stu.attr_id
     *
     * @param attrId the value for rep_stu.attr_id
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setAttrId(Long attrId) {
        this.attrId = attrId;
    }
}