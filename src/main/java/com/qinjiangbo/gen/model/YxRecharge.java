package com.qinjiangbo.gen.model;

import java.io.Serializable;
import java.util.Date;

public class YxRecharge implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yx_recharge.id
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yx_recharge.user_id
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private Long userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yx_recharge.recharge_money
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private Long rechargeMoney;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yx_recharge.recharge_time
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private Date rechargeTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yx_recharge.time_update
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private Date timeUpdate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table yx_recharge
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yx_recharge.id
     *
     * @return the value of yx_recharge.id
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yx_recharge.id
     *
     * @param id the value for yx_recharge.id
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yx_recharge.user_id
     *
     * @return the value of yx_recharge.user_id
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yx_recharge.user_id
     *
     * @param userId the value for yx_recharge.user_id
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yx_recharge.recharge_money
     *
     * @return the value of yx_recharge.recharge_money
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public Long getRechargeMoney() {
        return rechargeMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yx_recharge.recharge_money
     *
     * @param rechargeMoney the value for yx_recharge.recharge_money
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setRechargeMoney(Long rechargeMoney) {
        this.rechargeMoney = rechargeMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yx_recharge.recharge_time
     *
     * @return the value of yx_recharge.recharge_time
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public Date getRechargeTime() {
        return rechargeTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yx_recharge.recharge_time
     *
     * @param rechargeTime the value for yx_recharge.recharge_time
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setRechargeTime(Date rechargeTime) {
        this.rechargeTime = rechargeTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yx_recharge.time_update
     *
     * @return the value of yx_recharge.time_update
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public Date getTimeUpdate() {
        return timeUpdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yx_recharge.time_update
     *
     * @param timeUpdate the value for yx_recharge.time_update
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setTimeUpdate(Date timeUpdate) {
        this.timeUpdate = timeUpdate;
    }
}