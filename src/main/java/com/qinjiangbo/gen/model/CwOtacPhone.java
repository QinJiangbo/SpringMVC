package com.qinjiangbo.gen.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class CwOtacPhone implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cw_otac_phone.otac_id
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private Long otacId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cw_otac_phone.user_id
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private Long userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cw_otac_phone.phone
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private String phone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cw_otac_phone.isp
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private Integer isp;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cw_otac_phone.reg_city
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private String regCity;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cw_otac_phone.money
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private BigDecimal money;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cw_otac_phone.money_real
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private BigDecimal moneyReal;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cw_otac_phone.money_profit
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private BigDecimal moneyProfit;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cw_otac_phone.api_type
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private Integer apiType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cw_otac_phone.card_name
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private String cardName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cw_otac_phone.card_id
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private String cardId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cw_otac_phone.sporder_id
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private String sporderId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cw_otac_phone.card_num
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private Integer cardNum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cw_otac_phone.time_create
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private Date timeCreate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cw_otac_phone.busi_type
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private Long busiType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cw_otac_phone.busi_no
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private Long busiNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cw_otac_phone.time_update
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private Date timeUpdate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cw_otac_phone.status
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private Integer status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cw_otac_phone.rtn_no
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private String rtnNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cw_otac_phone.rtn_msg
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private String rtnMsg;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cw_otac_phone.rtn_res
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private String rtnRes;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cw_otac_phone.num_err
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private Integer numErr;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table cw_otac_phone
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cw_otac_phone.otac_id
     *
     * @return the value of cw_otac_phone.otac_id
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public Long getOtacId() {
        return otacId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cw_otac_phone.otac_id
     *
     * @param otacId the value for cw_otac_phone.otac_id
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setOtacId(Long otacId) {
        this.otacId = otacId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cw_otac_phone.user_id
     *
     * @return the value of cw_otac_phone.user_id
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cw_otac_phone.user_id
     *
     * @param userId the value for cw_otac_phone.user_id
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cw_otac_phone.phone
     *
     * @return the value of cw_otac_phone.phone
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cw_otac_phone.phone
     *
     * @param phone the value for cw_otac_phone.phone
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cw_otac_phone.isp
     *
     * @return the value of cw_otac_phone.isp
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public Integer getIsp() {
        return isp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cw_otac_phone.isp
     *
     * @param isp the value for cw_otac_phone.isp
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setIsp(Integer isp) {
        this.isp = isp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cw_otac_phone.reg_city
     *
     * @return the value of cw_otac_phone.reg_city
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public String getRegCity() {
        return regCity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cw_otac_phone.reg_city
     *
     * @param regCity the value for cw_otac_phone.reg_city
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setRegCity(String regCity) {
        this.regCity = regCity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cw_otac_phone.money
     *
     * @return the value of cw_otac_phone.money
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public BigDecimal getMoney() {
        return money;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cw_otac_phone.money
     *
     * @param money the value for cw_otac_phone.money
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cw_otac_phone.money_real
     *
     * @return the value of cw_otac_phone.money_real
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public BigDecimal getMoneyReal() {
        return moneyReal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cw_otac_phone.money_real
     *
     * @param moneyReal the value for cw_otac_phone.money_real
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setMoneyReal(BigDecimal moneyReal) {
        this.moneyReal = moneyReal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cw_otac_phone.money_profit
     *
     * @return the value of cw_otac_phone.money_profit
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public BigDecimal getMoneyProfit() {
        return moneyProfit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cw_otac_phone.money_profit
     *
     * @param moneyProfit the value for cw_otac_phone.money_profit
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setMoneyProfit(BigDecimal moneyProfit) {
        this.moneyProfit = moneyProfit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cw_otac_phone.api_type
     *
     * @return the value of cw_otac_phone.api_type
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public Integer getApiType() {
        return apiType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cw_otac_phone.api_type
     *
     * @param apiType the value for cw_otac_phone.api_type
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setApiType(Integer apiType) {
        this.apiType = apiType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cw_otac_phone.card_name
     *
     * @return the value of cw_otac_phone.card_name
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public String getCardName() {
        return cardName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cw_otac_phone.card_name
     *
     * @param cardName the value for cw_otac_phone.card_name
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cw_otac_phone.card_id
     *
     * @return the value of cw_otac_phone.card_id
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public String getCardId() {
        return cardId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cw_otac_phone.card_id
     *
     * @param cardId the value for cw_otac_phone.card_id
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cw_otac_phone.sporder_id
     *
     * @return the value of cw_otac_phone.sporder_id
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public String getSporderId() {
        return sporderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cw_otac_phone.sporder_id
     *
     * @param sporderId the value for cw_otac_phone.sporder_id
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setSporderId(String sporderId) {
        this.sporderId = sporderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cw_otac_phone.card_num
     *
     * @return the value of cw_otac_phone.card_num
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public Integer getCardNum() {
        return cardNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cw_otac_phone.card_num
     *
     * @param cardNum the value for cw_otac_phone.card_num
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setCardNum(Integer cardNum) {
        this.cardNum = cardNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cw_otac_phone.time_create
     *
     * @return the value of cw_otac_phone.time_create
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public Date getTimeCreate() {
        return timeCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cw_otac_phone.time_create
     *
     * @param timeCreate the value for cw_otac_phone.time_create
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setTimeCreate(Date timeCreate) {
        this.timeCreate = timeCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cw_otac_phone.busi_type
     *
     * @return the value of cw_otac_phone.busi_type
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public Long getBusiType() {
        return busiType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cw_otac_phone.busi_type
     *
     * @param busiType the value for cw_otac_phone.busi_type
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setBusiType(Long busiType) {
        this.busiType = busiType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cw_otac_phone.busi_no
     *
     * @return the value of cw_otac_phone.busi_no
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public Long getBusiNo() {
        return busiNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cw_otac_phone.busi_no
     *
     * @param busiNo the value for cw_otac_phone.busi_no
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setBusiNo(Long busiNo) {
        this.busiNo = busiNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cw_otac_phone.time_update
     *
     * @return the value of cw_otac_phone.time_update
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public Date getTimeUpdate() {
        return timeUpdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cw_otac_phone.time_update
     *
     * @param timeUpdate the value for cw_otac_phone.time_update
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setTimeUpdate(Date timeUpdate) {
        this.timeUpdate = timeUpdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cw_otac_phone.status
     *
     * @return the value of cw_otac_phone.status
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cw_otac_phone.status
     *
     * @param status the value for cw_otac_phone.status
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cw_otac_phone.rtn_no
     *
     * @return the value of cw_otac_phone.rtn_no
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public String getRtnNo() {
        return rtnNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cw_otac_phone.rtn_no
     *
     * @param rtnNo the value for cw_otac_phone.rtn_no
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setRtnNo(String rtnNo) {
        this.rtnNo = rtnNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cw_otac_phone.rtn_msg
     *
     * @return the value of cw_otac_phone.rtn_msg
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public String getRtnMsg() {
        return rtnMsg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cw_otac_phone.rtn_msg
     *
     * @param rtnMsg the value for cw_otac_phone.rtn_msg
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setRtnMsg(String rtnMsg) {
        this.rtnMsg = rtnMsg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cw_otac_phone.rtn_res
     *
     * @return the value of cw_otac_phone.rtn_res
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public String getRtnRes() {
        return rtnRes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cw_otac_phone.rtn_res
     *
     * @param rtnRes the value for cw_otac_phone.rtn_res
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setRtnRes(String rtnRes) {
        this.rtnRes = rtnRes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cw_otac_phone.num_err
     *
     * @return the value of cw_otac_phone.num_err
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public Integer getNumErr() {
        return numErr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cw_otac_phone.num_err
     *
     * @param numErr the value for cw_otac_phone.num_err
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setNumErr(Integer numErr) {
        this.numErr = numErr;
    }
}