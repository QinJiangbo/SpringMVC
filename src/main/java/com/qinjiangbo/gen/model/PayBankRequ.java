package com.qinjiangbo.gen.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class PayBankRequ implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_bank_requ.requ_id
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private Long requId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_bank_requ.trade_no
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private String tradeNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_bank_requ.trade_mode
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private Long tradeMode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_bank_requ.trade_status
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private Long tradeStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_bank_requ.direct
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private Long direct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_bank_requ.currency
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private Long currency;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_bank_requ.order_id
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private Long orderId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_bank_requ.card_id_cece
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private Long cardIdCece;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_bank_requ.card_code_cece
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private String cardCodeCece;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_bank_requ.card_id_user
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private Long cardIdUser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_bank_requ.card_code_user
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private String cardCodeUser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_bank_requ.trade_data
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private String tradeData;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_bank_requ.money
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private BigDecimal money;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_bank_requ.status
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private Long status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_bank_requ.time_trade
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private Date timeTrade;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_bank_requ.time_create
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private Date timeCreate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_bank_requ.time_update
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private Date timeUpdate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table pay_bank_requ
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_bank_requ.requ_id
     *
     * @return the value of pay_bank_requ.requ_id
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public Long getRequId() {
        return requId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_bank_requ.requ_id
     *
     * @param requId the value for pay_bank_requ.requ_id
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setRequId(Long requId) {
        this.requId = requId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_bank_requ.trade_no
     *
     * @return the value of pay_bank_requ.trade_no
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public String getTradeNo() {
        return tradeNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_bank_requ.trade_no
     *
     * @param tradeNo the value for pay_bank_requ.trade_no
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_bank_requ.trade_mode
     *
     * @return the value of pay_bank_requ.trade_mode
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public Long getTradeMode() {
        return tradeMode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_bank_requ.trade_mode
     *
     * @param tradeMode the value for pay_bank_requ.trade_mode
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setTradeMode(Long tradeMode) {
        this.tradeMode = tradeMode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_bank_requ.trade_status
     *
     * @return the value of pay_bank_requ.trade_status
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public Long getTradeStatus() {
        return tradeStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_bank_requ.trade_status
     *
     * @param tradeStatus the value for pay_bank_requ.trade_status
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setTradeStatus(Long tradeStatus) {
        this.tradeStatus = tradeStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_bank_requ.direct
     *
     * @return the value of pay_bank_requ.direct
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public Long getDirect() {
        return direct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_bank_requ.direct
     *
     * @param direct the value for pay_bank_requ.direct
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setDirect(Long direct) {
        this.direct = direct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_bank_requ.currency
     *
     * @return the value of pay_bank_requ.currency
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public Long getCurrency() {
        return currency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_bank_requ.currency
     *
     * @param currency the value for pay_bank_requ.currency
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setCurrency(Long currency) {
        this.currency = currency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_bank_requ.order_id
     *
     * @return the value of pay_bank_requ.order_id
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public Long getOrderId() {
        return orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_bank_requ.order_id
     *
     * @param orderId the value for pay_bank_requ.order_id
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_bank_requ.card_id_cece
     *
     * @return the value of pay_bank_requ.card_id_cece
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public Long getCardIdCece() {
        return cardIdCece;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_bank_requ.card_id_cece
     *
     * @param cardIdCece the value for pay_bank_requ.card_id_cece
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setCardIdCece(Long cardIdCece) {
        this.cardIdCece = cardIdCece;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_bank_requ.card_code_cece
     *
     * @return the value of pay_bank_requ.card_code_cece
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public String getCardCodeCece() {
        return cardCodeCece;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_bank_requ.card_code_cece
     *
     * @param cardCodeCece the value for pay_bank_requ.card_code_cece
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setCardCodeCece(String cardCodeCece) {
        this.cardCodeCece = cardCodeCece;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_bank_requ.card_id_user
     *
     * @return the value of pay_bank_requ.card_id_user
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public Long getCardIdUser() {
        return cardIdUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_bank_requ.card_id_user
     *
     * @param cardIdUser the value for pay_bank_requ.card_id_user
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setCardIdUser(Long cardIdUser) {
        this.cardIdUser = cardIdUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_bank_requ.card_code_user
     *
     * @return the value of pay_bank_requ.card_code_user
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public String getCardCodeUser() {
        return cardCodeUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_bank_requ.card_code_user
     *
     * @param cardCodeUser the value for pay_bank_requ.card_code_user
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setCardCodeUser(String cardCodeUser) {
        this.cardCodeUser = cardCodeUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_bank_requ.trade_data
     *
     * @return the value of pay_bank_requ.trade_data
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public String getTradeData() {
        return tradeData;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_bank_requ.trade_data
     *
     * @param tradeData the value for pay_bank_requ.trade_data
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setTradeData(String tradeData) {
        this.tradeData = tradeData;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_bank_requ.money
     *
     * @return the value of pay_bank_requ.money
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public BigDecimal getMoney() {
        return money;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_bank_requ.money
     *
     * @param money the value for pay_bank_requ.money
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_bank_requ.status
     *
     * @return the value of pay_bank_requ.status
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public Long getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_bank_requ.status
     *
     * @param status the value for pay_bank_requ.status
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setStatus(Long status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_bank_requ.time_trade
     *
     * @return the value of pay_bank_requ.time_trade
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public Date getTimeTrade() {
        return timeTrade;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_bank_requ.time_trade
     *
     * @param timeTrade the value for pay_bank_requ.time_trade
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setTimeTrade(Date timeTrade) {
        this.timeTrade = timeTrade;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_bank_requ.time_create
     *
     * @return the value of pay_bank_requ.time_create
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public Date getTimeCreate() {
        return timeCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_bank_requ.time_create
     *
     * @param timeCreate the value for pay_bank_requ.time_create
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setTimeCreate(Date timeCreate) {
        this.timeCreate = timeCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_bank_requ.time_update
     *
     * @return the value of pay_bank_requ.time_update
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public Date getTimeUpdate() {
        return timeUpdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_bank_requ.time_update
     *
     * @param timeUpdate the value for pay_bank_requ.time_update
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setTimeUpdate(Date timeUpdate) {
        this.timeUpdate = timeUpdate;
    }
}