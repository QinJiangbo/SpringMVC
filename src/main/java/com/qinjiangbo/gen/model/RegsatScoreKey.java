package com.qinjiangbo.gen.model;

import java.io.Serializable;

public class RegsatScoreKey implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column regsat_score.user_id
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private Long userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column regsat_score.test_code
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private String testCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table regsat_score
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column regsat_score.user_id
     *
     * @return the value of regsat_score.user_id
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column regsat_score.user_id
     *
     * @param userId the value for regsat_score.user_id
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column regsat_score.test_code
     *
     * @return the value of regsat_score.test_code
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public String getTestCode() {
        return testCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column regsat_score.test_code
     *
     * @param testCode the value for regsat_score.test_code
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setTestCode(String testCode) {
        this.testCode = testCode;
    }
}