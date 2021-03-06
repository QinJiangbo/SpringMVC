package com.qinjiangbo.gen.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class PayFund implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_fund.fund_id
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private Long fundId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_fund.pay_id
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private Long payId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_fund.fund_type
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private Long fundType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_fund.currency
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private Long currency;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_fund.money
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private BigDecimal money;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_fund.time_update
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private Date timeUpdate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_fund.remark
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private String remark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_fund.money_initial
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private BigDecimal moneyInitial;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_fund.time_initial
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private Date timeInitial;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table pay_fund
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_fund.fund_id
     *
     * @return the value of pay_fund.fund_id
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public Long getFundId() {
        return fundId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_fund.fund_id
     *
     * @param fundId the value for pay_fund.fund_id
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setFundId(Long fundId) {
        this.fundId = fundId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_fund.pay_id
     *
     * @return the value of pay_fund.pay_id
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public Long getPayId() {
        return payId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_fund.pay_id
     *
     * @param payId the value for pay_fund.pay_id
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setPayId(Long payId) {
        this.payId = payId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_fund.fund_type
     *
     * @return the value of pay_fund.fund_type
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public Long getFundType() {
        return fundType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_fund.fund_type
     *
     * @param fundType the value for pay_fund.fund_type
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setFundType(Long fundType) {
        this.fundType = fundType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_fund.currency
     *
     * @return the value of pay_fund.currency
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public Long getCurrency() {
        return currency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_fund.currency
     *
     * @param currency the value for pay_fund.currency
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setCurrency(Long currency) {
        this.currency = currency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_fund.money
     *
     * @return the value of pay_fund.money
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public BigDecimal getMoney() {
        return money;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_fund.money
     *
     * @param money the value for pay_fund.money
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_fund.time_update
     *
     * @return the value of pay_fund.time_update
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public Date getTimeUpdate() {
        return timeUpdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_fund.time_update
     *
     * @param timeUpdate the value for pay_fund.time_update
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setTimeUpdate(Date timeUpdate) {
        this.timeUpdate = timeUpdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_fund.remark
     *
     * @return the value of pay_fund.remark
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_fund.remark
     *
     * @param remark the value for pay_fund.remark
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_fund.money_initial
     *
     * @return the value of pay_fund.money_initial
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public BigDecimal getMoneyInitial() {
        return moneyInitial;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_fund.money_initial
     *
     * @param moneyInitial the value for pay_fund.money_initial
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setMoneyInitial(BigDecimal moneyInitial) {
        this.moneyInitial = moneyInitial;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_fund.time_initial
     *
     * @return the value of pay_fund.time_initial
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public Date getTimeInitial() {
        return timeInitial;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_fund.time_initial
     *
     * @param timeInitial the value for pay_fund.time_initial
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setTimeInitial(Date timeInitial) {
        this.timeInitial = timeInitial;
    }
}