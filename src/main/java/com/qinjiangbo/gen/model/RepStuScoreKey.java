package com.qinjiangbo.gen.model;

import java.io.Serializable;
import java.util.Date;

public class RepStuScoreKey implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rep_stu_score.wk_date
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private Date wkDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rep_stu_score.user_id
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private Long userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rep_stu_score.attr
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private Long attr;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rep_stu_score.test_type
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private Long testType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table rep_stu_score
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rep_stu_score.wk_date
     *
     * @return the value of rep_stu_score.wk_date
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public Date getWkDate() {
        return wkDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rep_stu_score.wk_date
     *
     * @param wkDate the value for rep_stu_score.wk_date
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setWkDate(Date wkDate) {
        this.wkDate = wkDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rep_stu_score.user_id
     *
     * @return the value of rep_stu_score.user_id
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rep_stu_score.user_id
     *
     * @param userId the value for rep_stu_score.user_id
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rep_stu_score.attr
     *
     * @return the value of rep_stu_score.attr
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public Long getAttr() {
        return attr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rep_stu_score.attr
     *
     * @param attr the value for rep_stu_score.attr
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setAttr(Long attr) {
        this.attr = attr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rep_stu_score.test_type
     *
     * @return the value of rep_stu_score.test_type
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public Long getTestType() {
        return testType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rep_stu_score.test_type
     *
     * @param testType the value for rep_stu_score.test_type
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setTestType(Long testType) {
        this.testType = testType;
    }
}