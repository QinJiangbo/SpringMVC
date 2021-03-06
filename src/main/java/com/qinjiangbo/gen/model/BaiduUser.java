package com.qinjiangbo.gen.model;

import java.io.Serializable;
import java.util.Date;

public class BaiduUser implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column baidu_user.user_id
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private Long userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column baidu_user.bd_app_id
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private String bdAppId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column baidu_user.bd_channel_id
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private Long bdChannelId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column baidu_user.bd_status
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private Integer bdStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column baidu_user.bd_user_id
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private String bdUserId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column baidu_user.term_type
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private Integer termType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column baidu_user.time_update
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private Date timeUpdate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table baidu_user
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column baidu_user.user_id
     *
     * @return the value of baidu_user.user_id
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column baidu_user.user_id
     *
     * @param userId the value for baidu_user.user_id
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column baidu_user.bd_app_id
     *
     * @return the value of baidu_user.bd_app_id
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public String getBdAppId() {
        return bdAppId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column baidu_user.bd_app_id
     *
     * @param bdAppId the value for baidu_user.bd_app_id
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setBdAppId(String bdAppId) {
        this.bdAppId = bdAppId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column baidu_user.bd_channel_id
     *
     * @return the value of baidu_user.bd_channel_id
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public Long getBdChannelId() {
        return bdChannelId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column baidu_user.bd_channel_id
     *
     * @param bdChannelId the value for baidu_user.bd_channel_id
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setBdChannelId(Long bdChannelId) {
        this.bdChannelId = bdChannelId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column baidu_user.bd_status
     *
     * @return the value of baidu_user.bd_status
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public Integer getBdStatus() {
        return bdStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column baidu_user.bd_status
     *
     * @param bdStatus the value for baidu_user.bd_status
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setBdStatus(Integer bdStatus) {
        this.bdStatus = bdStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column baidu_user.bd_user_id
     *
     * @return the value of baidu_user.bd_user_id
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public String getBdUserId() {
        return bdUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column baidu_user.bd_user_id
     *
     * @param bdUserId the value for baidu_user.bd_user_id
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setBdUserId(String bdUserId) {
        this.bdUserId = bdUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column baidu_user.term_type
     *
     * @return the value of baidu_user.term_type
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public Integer getTermType() {
        return termType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column baidu_user.term_type
     *
     * @param termType the value for baidu_user.term_type
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setTermType(Integer termType) {
        this.termType = termType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column baidu_user.time_update
     *
     * @return the value of baidu_user.time_update
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public Date getTimeUpdate() {
        return timeUpdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column baidu_user.time_update
     *
     * @param timeUpdate the value for baidu_user.time_update
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setTimeUpdate(Date timeUpdate) {
        this.timeUpdate = timeUpdate;
    }
}