package com.qinjiangbo.gen.model;

import java.io.Serializable;

public class BasExamInfoKey implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bas_exam_info.user_id
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private Long userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bas_exam_info.subject
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private String subject;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table bas_exam_info
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bas_exam_info.user_id
     *
     * @return the value of bas_exam_info.user_id
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bas_exam_info.user_id
     *
     * @param userId the value for bas_exam_info.user_id
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bas_exam_info.subject
     *
     * @return the value of bas_exam_info.subject
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public String getSubject() {
        return subject;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bas_exam_info.subject
     *
     * @param subject the value for bas_exam_info.subject
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }
}