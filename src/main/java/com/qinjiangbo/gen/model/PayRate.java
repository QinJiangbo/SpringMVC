package com.qinjiangbo.gen.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class PayRate implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_rate.rate_id
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private Long rateId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_rate.rate_date
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private Date rateDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_rate.cn
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private BigDecimal cn;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_rate.us
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private BigDecimal us;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_rate.time_update
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private Date timeUpdate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table pay_rate
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_rate.rate_id
     *
     * @return the value of pay_rate.rate_id
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public Long getRateId() {
        return rateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_rate.rate_id
     *
     * @param rateId the value for pay_rate.rate_id
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setRateId(Long rateId) {
        this.rateId = rateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_rate.rate_date
     *
     * @return the value of pay_rate.rate_date
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public Date getRateDate() {
        return rateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_rate.rate_date
     *
     * @param rateDate the value for pay_rate.rate_date
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setRateDate(Date rateDate) {
        this.rateDate = rateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_rate.cn
     *
     * @return the value of pay_rate.cn
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public BigDecimal getCn() {
        return cn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_rate.cn
     *
     * @param cn the value for pay_rate.cn
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setCn(BigDecimal cn) {
        this.cn = cn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_rate.us
     *
     * @return the value of pay_rate.us
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public BigDecimal getUs() {
        return us;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_rate.us
     *
     * @param us the value for pay_rate.us
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setUs(BigDecimal us) {
        this.us = us;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_rate.time_update
     *
     * @return the value of pay_rate.time_update
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public Date getTimeUpdate() {
        return timeUpdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_rate.time_update
     *
     * @param timeUpdate the value for pay_rate.time_update
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setTimeUpdate(Date timeUpdate) {
        this.timeUpdate = timeUpdate;
    }
}