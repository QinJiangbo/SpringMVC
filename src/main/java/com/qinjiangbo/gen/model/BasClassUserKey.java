package com.qinjiangbo.gen.model;

import java.io.Serializable;

public class BasClassUserKey implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bas_class_user.class_id
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private Long classId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bas_class_user.user_id
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private Long userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table bas_class_user
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bas_class_user.class_id
     *
     * @return the value of bas_class_user.class_id
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public Long getClassId() {
        return classId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bas_class_user.class_id
     *
     * @param classId the value for bas_class_user.class_id
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setClassId(Long classId) {
        this.classId = classId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bas_class_user.user_id
     *
     * @return the value of bas_class_user.user_id
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bas_class_user.user_id
     *
     * @param userId the value for bas_class_user.user_id
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }
}