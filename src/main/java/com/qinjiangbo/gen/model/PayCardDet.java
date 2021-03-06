package com.qinjiangbo.gen.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class PayCardDet implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_card_det.fc_id
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private Long fcId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_card_det.card_id
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private Long cardId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_card_det.currency
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private Long currency;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_card_det.fund_id
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private Long fundId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_card_det.money
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private BigDecimal money;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_card_det.money_initial
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private BigDecimal moneyInitial;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_card_det.time_initial
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private Date timeInitial;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_card_det.time_update
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private Date timeUpdate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table pay_card_det
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_card_det.fc_id
     *
     * @return the value of pay_card_det.fc_id
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public Long getFcId() {
        return fcId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_card_det.fc_id
     *
     * @param fcId the value for pay_card_det.fc_id
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setFcId(Long fcId) {
        this.fcId = fcId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_card_det.card_id
     *
     * @return the value of pay_card_det.card_id
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public Long getCardId() {
        return cardId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_card_det.card_id
     *
     * @param cardId the value for pay_card_det.card_id
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setCardId(Long cardId) {
        this.cardId = cardId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_card_det.currency
     *
     * @return the value of pay_card_det.currency
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public Long getCurrency() {
        return currency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_card_det.currency
     *
     * @param currency the value for pay_card_det.currency
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setCurrency(Long currency) {
        this.currency = currency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_card_det.fund_id
     *
     * @return the value of pay_card_det.fund_id
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public Long getFundId() {
        return fundId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_card_det.fund_id
     *
     * @param fundId the value for pay_card_det.fund_id
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setFundId(Long fundId) {
        this.fundId = fundId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_card_det.money
     *
     * @return the value of pay_card_det.money
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public BigDecimal getMoney() {
        return money;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_card_det.money
     *
     * @param money the value for pay_card_det.money
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_card_det.money_initial
     *
     * @return the value of pay_card_det.money_initial
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public BigDecimal getMoneyInitial() {
        return moneyInitial;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_card_det.money_initial
     *
     * @param moneyInitial the value for pay_card_det.money_initial
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setMoneyInitial(BigDecimal moneyInitial) {
        this.moneyInitial = moneyInitial;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_card_det.time_initial
     *
     * @return the value of pay_card_det.time_initial
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public Date getTimeInitial() {
        return timeInitial;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_card_det.time_initial
     *
     * @param timeInitial the value for pay_card_det.time_initial
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setTimeInitial(Date timeInitial) {
        this.timeInitial = timeInitial;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_card_det.time_update
     *
     * @return the value of pay_card_det.time_update
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public Date getTimeUpdate() {
        return timeUpdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_card_det.time_update
     *
     * @param timeUpdate the value for pay_card_det.time_update
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setTimeUpdate(Date timeUpdate) {
        this.timeUpdate = timeUpdate;
    }
}