package com.qinjiangbo.gen.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class PayOrder implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_order.order_id
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private Long orderId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_order.busi_type
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private Long busiType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_order.direct
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private Long direct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_order.trade_mode
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private Long tradeMode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_order.trade_type
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private Long tradeType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_order.currency
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private Long currency;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_order.pay_id_from
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private Long payIdFrom;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_order.card_id_from
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private Long cardIdFrom;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_order.pay_id_to
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private Long payIdTo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_order.card_id_to
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private Long cardIdTo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_order.pay_code_to
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private String payCodeTo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_order.status
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private Long status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_order.busi_id
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private Long busiId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_order.money
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private BigDecimal money;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_order.money_coup
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private BigDecimal moneyCoup;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_order.desp
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private String desp;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_order.requ_src
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private Long requSrc;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_order.remark
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private String remark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_order.time_create
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private Date timeCreate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_order.time_update
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private Date timeUpdate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_order.is_refund
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private Long isRefund;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_order.yue
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private BigDecimal yue;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table pay_order
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_order.order_id
     *
     * @return the value of pay_order.order_id
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public Long getOrderId() {
        return orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_order.order_id
     *
     * @param orderId the value for pay_order.order_id
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_order.busi_type
     *
     * @return the value of pay_order.busi_type
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public Long getBusiType() {
        return busiType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_order.busi_type
     *
     * @param busiType the value for pay_order.busi_type
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setBusiType(Long busiType) {
        this.busiType = busiType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_order.direct
     *
     * @return the value of pay_order.direct
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public Long getDirect() {
        return direct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_order.direct
     *
     * @param direct the value for pay_order.direct
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setDirect(Long direct) {
        this.direct = direct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_order.trade_mode
     *
     * @return the value of pay_order.trade_mode
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public Long getTradeMode() {
        return tradeMode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_order.trade_mode
     *
     * @param tradeMode the value for pay_order.trade_mode
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setTradeMode(Long tradeMode) {
        this.tradeMode = tradeMode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_order.trade_type
     *
     * @return the value of pay_order.trade_type
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public Long getTradeType() {
        return tradeType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_order.trade_type
     *
     * @param tradeType the value for pay_order.trade_type
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setTradeType(Long tradeType) {
        this.tradeType = tradeType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_order.currency
     *
     * @return the value of pay_order.currency
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public Long getCurrency() {
        return currency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_order.currency
     *
     * @param currency the value for pay_order.currency
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setCurrency(Long currency) {
        this.currency = currency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_order.pay_id_from
     *
     * @return the value of pay_order.pay_id_from
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public Long getPayIdFrom() {
        return payIdFrom;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_order.pay_id_from
     *
     * @param payIdFrom the value for pay_order.pay_id_from
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setPayIdFrom(Long payIdFrom) {
        this.payIdFrom = payIdFrom;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_order.card_id_from
     *
     * @return the value of pay_order.card_id_from
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public Long getCardIdFrom() {
        return cardIdFrom;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_order.card_id_from
     *
     * @param cardIdFrom the value for pay_order.card_id_from
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setCardIdFrom(Long cardIdFrom) {
        this.cardIdFrom = cardIdFrom;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_order.pay_id_to
     *
     * @return the value of pay_order.pay_id_to
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public Long getPayIdTo() {
        return payIdTo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_order.pay_id_to
     *
     * @param payIdTo the value for pay_order.pay_id_to
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setPayIdTo(Long payIdTo) {
        this.payIdTo = payIdTo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_order.card_id_to
     *
     * @return the value of pay_order.card_id_to
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public Long getCardIdTo() {
        return cardIdTo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_order.card_id_to
     *
     * @param cardIdTo the value for pay_order.card_id_to
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setCardIdTo(Long cardIdTo) {
        this.cardIdTo = cardIdTo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_order.pay_code_to
     *
     * @return the value of pay_order.pay_code_to
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public String getPayCodeTo() {
        return payCodeTo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_order.pay_code_to
     *
     * @param payCodeTo the value for pay_order.pay_code_to
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setPayCodeTo(String payCodeTo) {
        this.payCodeTo = payCodeTo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_order.status
     *
     * @return the value of pay_order.status
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public Long getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_order.status
     *
     * @param status the value for pay_order.status
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setStatus(Long status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_order.busi_id
     *
     * @return the value of pay_order.busi_id
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public Long getBusiId() {
        return busiId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_order.busi_id
     *
     * @param busiId the value for pay_order.busi_id
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setBusiId(Long busiId) {
        this.busiId = busiId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_order.money
     *
     * @return the value of pay_order.money
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public BigDecimal getMoney() {
        return money;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_order.money
     *
     * @param money the value for pay_order.money
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_order.money_coup
     *
     * @return the value of pay_order.money_coup
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public BigDecimal getMoneyCoup() {
        return moneyCoup;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_order.money_coup
     *
     * @param moneyCoup the value for pay_order.money_coup
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setMoneyCoup(BigDecimal moneyCoup) {
        this.moneyCoup = moneyCoup;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_order.desp
     *
     * @return the value of pay_order.desp
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public String getDesp() {
        return desp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_order.desp
     *
     * @param desp the value for pay_order.desp
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setDesp(String desp) {
        this.desp = desp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_order.requ_src
     *
     * @return the value of pay_order.requ_src
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public Long getRequSrc() {
        return requSrc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_order.requ_src
     *
     * @param requSrc the value for pay_order.requ_src
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setRequSrc(Long requSrc) {
        this.requSrc = requSrc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_order.remark
     *
     * @return the value of pay_order.remark
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_order.remark
     *
     * @param remark the value for pay_order.remark
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_order.time_create
     *
     * @return the value of pay_order.time_create
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public Date getTimeCreate() {
        return timeCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_order.time_create
     *
     * @param timeCreate the value for pay_order.time_create
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setTimeCreate(Date timeCreate) {
        this.timeCreate = timeCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_order.time_update
     *
     * @return the value of pay_order.time_update
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public Date getTimeUpdate() {
        return timeUpdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_order.time_update
     *
     * @param timeUpdate the value for pay_order.time_update
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setTimeUpdate(Date timeUpdate) {
        this.timeUpdate = timeUpdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_order.is_refund
     *
     * @return the value of pay_order.is_refund
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public Long getIsRefund() {
        return isRefund;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_order.is_refund
     *
     * @param isRefund the value for pay_order.is_refund
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setIsRefund(Long isRefund) {
        this.isRefund = isRefund;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_order.yue
     *
     * @return the value of pay_order.yue
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public BigDecimal getYue() {
        return yue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_order.yue
     *
     * @param yue the value for pay_order.yue
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setYue(BigDecimal yue) {
        this.yue = yue;
    }
}