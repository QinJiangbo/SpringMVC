package com.qinjiangbo.gen.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class RegsatPayrefund implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column regsat_payrefund.ref_id
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private Long refId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column regsat_payrefund.batch_no
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private String batchNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column regsat_payrefund.batch_num
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private Integer batchNum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column regsat_payrefund.batch_money
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private BigDecimal batchMoney;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column regsat_payrefund.user_oper
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private Long userOper;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column regsat_payrefund.time_create
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private Date timeCreate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column regsat_payrefund.data_ali
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private String dataAli;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column regsat_payrefund.status
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private Integer status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column regsat_payrefund.ali_id
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private Long aliId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column regsat_payrefund.success_num
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private Integer successNum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column regsat_payrefund.success_money
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private BigDecimal successMoney;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column regsat_payrefund.time_back
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private Date timeBack;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table regsat_payrefund
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column regsat_payrefund.ref_id
     *
     * @return the value of regsat_payrefund.ref_id
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public Long getRefId() {
        return refId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column regsat_payrefund.ref_id
     *
     * @param refId the value for regsat_payrefund.ref_id
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setRefId(Long refId) {
        this.refId = refId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column regsat_payrefund.batch_no
     *
     * @return the value of regsat_payrefund.batch_no
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public String getBatchNo() {
        return batchNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column regsat_payrefund.batch_no
     *
     * @param batchNo the value for regsat_payrefund.batch_no
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column regsat_payrefund.batch_num
     *
     * @return the value of regsat_payrefund.batch_num
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public Integer getBatchNum() {
        return batchNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column regsat_payrefund.batch_num
     *
     * @param batchNum the value for regsat_payrefund.batch_num
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setBatchNum(Integer batchNum) {
        this.batchNum = batchNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column regsat_payrefund.batch_money
     *
     * @return the value of regsat_payrefund.batch_money
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public BigDecimal getBatchMoney() {
        return batchMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column regsat_payrefund.batch_money
     *
     * @param batchMoney the value for regsat_payrefund.batch_money
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setBatchMoney(BigDecimal batchMoney) {
        this.batchMoney = batchMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column regsat_payrefund.user_oper
     *
     * @return the value of regsat_payrefund.user_oper
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public Long getUserOper() {
        return userOper;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column regsat_payrefund.user_oper
     *
     * @param userOper the value for regsat_payrefund.user_oper
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setUserOper(Long userOper) {
        this.userOper = userOper;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column regsat_payrefund.time_create
     *
     * @return the value of regsat_payrefund.time_create
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public Date getTimeCreate() {
        return timeCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column regsat_payrefund.time_create
     *
     * @param timeCreate the value for regsat_payrefund.time_create
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setTimeCreate(Date timeCreate) {
        this.timeCreate = timeCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column regsat_payrefund.data_ali
     *
     * @return the value of regsat_payrefund.data_ali
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public String getDataAli() {
        return dataAli;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column regsat_payrefund.data_ali
     *
     * @param dataAli the value for regsat_payrefund.data_ali
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setDataAli(String dataAli) {
        this.dataAli = dataAli;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column regsat_payrefund.status
     *
     * @return the value of regsat_payrefund.status
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column regsat_payrefund.status
     *
     * @param status the value for regsat_payrefund.status
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column regsat_payrefund.ali_id
     *
     * @return the value of regsat_payrefund.ali_id
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public Long getAliId() {
        return aliId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column regsat_payrefund.ali_id
     *
     * @param aliId the value for regsat_payrefund.ali_id
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setAliId(Long aliId) {
        this.aliId = aliId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column regsat_payrefund.success_num
     *
     * @return the value of regsat_payrefund.success_num
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public Integer getSuccessNum() {
        return successNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column regsat_payrefund.success_num
     *
     * @param successNum the value for regsat_payrefund.success_num
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setSuccessNum(Integer successNum) {
        this.successNum = successNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column regsat_payrefund.success_money
     *
     * @return the value of regsat_payrefund.success_money
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public BigDecimal getSuccessMoney() {
        return successMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column regsat_payrefund.success_money
     *
     * @param successMoney the value for regsat_payrefund.success_money
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setSuccessMoney(BigDecimal successMoney) {
        this.successMoney = successMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column regsat_payrefund.time_back
     *
     * @return the value of regsat_payrefund.time_back
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public Date getTimeBack() {
        return timeBack;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column regsat_payrefund.time_back
     *
     * @param timeBack the value for regsat_payrefund.time_back
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setTimeBack(Date timeBack) {
        this.timeBack = timeBack;
    }
}