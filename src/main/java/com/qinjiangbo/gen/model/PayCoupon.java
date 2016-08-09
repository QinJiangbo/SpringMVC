package com.qinjiangbo.gen.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class PayCoupon implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_coupon.coup_id
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private Long coupId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_coupon.rule_id
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private Long ruleId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_coupon.pay_id
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private Long payId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_coupon.money
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private BigDecimal money;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_coupon.status
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private Long status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_coupon.busi_type
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private Long busiType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_coupon.busi_id
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private Long busiId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_coupon.money_actual
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private BigDecimal moneyActual;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_coupon.time_create
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private Date timeCreate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_coupon.time_use
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private Date timeUse;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_coupon.time_update
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private Date timeUpdate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table pay_coupon
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_coupon.coup_id
     *
     * @return the value of pay_coupon.coup_id
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public Long getCoupId() {
        return coupId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_coupon.coup_id
     *
     * @param coupId the value for pay_coupon.coup_id
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setCoupId(Long coupId) {
        this.coupId = coupId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_coupon.rule_id
     *
     * @return the value of pay_coupon.rule_id
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public Long getRuleId() {
        return ruleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_coupon.rule_id
     *
     * @param ruleId the value for pay_coupon.rule_id
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setRuleId(Long ruleId) {
        this.ruleId = ruleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_coupon.pay_id
     *
     * @return the value of pay_coupon.pay_id
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public Long getPayId() {
        return payId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_coupon.pay_id
     *
     * @param payId the value for pay_coupon.pay_id
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setPayId(Long payId) {
        this.payId = payId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_coupon.money
     *
     * @return the value of pay_coupon.money
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public BigDecimal getMoney() {
        return money;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_coupon.money
     *
     * @param money the value for pay_coupon.money
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_coupon.status
     *
     * @return the value of pay_coupon.status
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public Long getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_coupon.status
     *
     * @param status the value for pay_coupon.status
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setStatus(Long status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_coupon.busi_type
     *
     * @return the value of pay_coupon.busi_type
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public Long getBusiType() {
        return busiType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_coupon.busi_type
     *
     * @param busiType the value for pay_coupon.busi_type
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setBusiType(Long busiType) {
        this.busiType = busiType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_coupon.busi_id
     *
     * @return the value of pay_coupon.busi_id
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public Long getBusiId() {
        return busiId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_coupon.busi_id
     *
     * @param busiId the value for pay_coupon.busi_id
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setBusiId(Long busiId) {
        this.busiId = busiId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_coupon.money_actual
     *
     * @return the value of pay_coupon.money_actual
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public BigDecimal getMoneyActual() {
        return moneyActual;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_coupon.money_actual
     *
     * @param moneyActual the value for pay_coupon.money_actual
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setMoneyActual(BigDecimal moneyActual) {
        this.moneyActual = moneyActual;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_coupon.time_create
     *
     * @return the value of pay_coupon.time_create
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public Date getTimeCreate() {
        return timeCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_coupon.time_create
     *
     * @param timeCreate the value for pay_coupon.time_create
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setTimeCreate(Date timeCreate) {
        this.timeCreate = timeCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_coupon.time_use
     *
     * @return the value of pay_coupon.time_use
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public Date getTimeUse() {
        return timeUse;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_coupon.time_use
     *
     * @param timeUse the value for pay_coupon.time_use
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setTimeUse(Date timeUse) {
        this.timeUse = timeUse;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_coupon.time_update
     *
     * @return the value of pay_coupon.time_update
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public Date getTimeUpdate() {
        return timeUpdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_coupon.time_update
     *
     * @param timeUpdate the value for pay_coupon.time_update
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setTimeUpdate(Date timeUpdate) {
        this.timeUpdate = timeUpdate;
    }
}