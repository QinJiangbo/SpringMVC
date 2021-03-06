package com.qinjiangbo.gen.model;

import java.io.Serializable;
import java.util.Date;

public class RegsatPayaccount implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column regsat_payaccount.acc_id
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private Long accId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column regsat_payaccount.user_id
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private Long userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column regsat_payaccount.acc_code
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private String accCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column regsat_payaccount.acc_name
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private String accName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column regsat_payaccount.acc_type
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private Integer accType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column regsat_payaccount.time_update
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private Date timeUpdate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table regsat_payaccount
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column regsat_payaccount.acc_id
     *
     * @return the value of regsat_payaccount.acc_id
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public Long getAccId() {
        return accId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column regsat_payaccount.acc_id
     *
     * @param accId the value for regsat_payaccount.acc_id
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setAccId(Long accId) {
        this.accId = accId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column regsat_payaccount.user_id
     *
     * @return the value of regsat_payaccount.user_id
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column regsat_payaccount.user_id
     *
     * @param userId the value for regsat_payaccount.user_id
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column regsat_payaccount.acc_code
     *
     * @return the value of regsat_payaccount.acc_code
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public String getAccCode() {
        return accCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column regsat_payaccount.acc_code
     *
     * @param accCode the value for regsat_payaccount.acc_code
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setAccCode(String accCode) {
        this.accCode = accCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column regsat_payaccount.acc_name
     *
     * @return the value of regsat_payaccount.acc_name
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public String getAccName() {
        return accName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column regsat_payaccount.acc_name
     *
     * @param accName the value for regsat_payaccount.acc_name
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setAccName(String accName) {
        this.accName = accName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column regsat_payaccount.acc_type
     *
     * @return the value of regsat_payaccount.acc_type
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public Integer getAccType() {
        return accType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column regsat_payaccount.acc_type
     *
     * @param accType the value for regsat_payaccount.acc_type
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setAccType(Integer accType) {
        this.accType = accType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column regsat_payaccount.time_update
     *
     * @return the value of regsat_payaccount.time_update
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public Date getTimeUpdate() {
        return timeUpdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column regsat_payaccount.time_update
     *
     * @param timeUpdate the value for regsat_payaccount.time_update
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setTimeUpdate(Date timeUpdate) {
        this.timeUpdate = timeUpdate;
    }
}