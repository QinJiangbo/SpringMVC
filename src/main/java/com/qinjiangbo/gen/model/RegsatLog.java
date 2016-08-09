package com.qinjiangbo.gen.model;

import java.io.Serializable;
import java.util.Date;

public class RegsatLog implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column regsat_log.id
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column regsat_log.user_id
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private Long userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column regsat_log.step_id
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private Integer stepId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column regsat_log.term_id
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private Long termId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column regsat_log.reg_id
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private Long regId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column regsat_log.type_busi
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private Integer typeBusi;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column regsat_log.msg
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private String msg;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column regsat_log.type_msg
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private Integer typeMsg;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column regsat_log.time_update
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private Date timeUpdate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table regsat_log
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column regsat_log.id
     *
     * @return the value of regsat_log.id
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column regsat_log.id
     *
     * @param id the value for regsat_log.id
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column regsat_log.user_id
     *
     * @return the value of regsat_log.user_id
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column regsat_log.user_id
     *
     * @param userId the value for regsat_log.user_id
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column regsat_log.step_id
     *
     * @return the value of regsat_log.step_id
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public Integer getStepId() {
        return stepId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column regsat_log.step_id
     *
     * @param stepId the value for regsat_log.step_id
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setStepId(Integer stepId) {
        this.stepId = stepId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column regsat_log.term_id
     *
     * @return the value of regsat_log.term_id
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public Long getTermId() {
        return termId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column regsat_log.term_id
     *
     * @param termId the value for regsat_log.term_id
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setTermId(Long termId) {
        this.termId = termId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column regsat_log.reg_id
     *
     * @return the value of regsat_log.reg_id
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public Long getRegId() {
        return regId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column regsat_log.reg_id
     *
     * @param regId the value for regsat_log.reg_id
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setRegId(Long regId) {
        this.regId = regId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column regsat_log.type_busi
     *
     * @return the value of regsat_log.type_busi
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public Integer getTypeBusi() {
        return typeBusi;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column regsat_log.type_busi
     *
     * @param typeBusi the value for regsat_log.type_busi
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setTypeBusi(Integer typeBusi) {
        this.typeBusi = typeBusi;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column regsat_log.msg
     *
     * @return the value of regsat_log.msg
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public String getMsg() {
        return msg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column regsat_log.msg
     *
     * @param msg the value for regsat_log.msg
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setMsg(String msg) {
        this.msg = msg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column regsat_log.type_msg
     *
     * @return the value of regsat_log.type_msg
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public Integer getTypeMsg() {
        return typeMsg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column regsat_log.type_msg
     *
     * @param typeMsg the value for regsat_log.type_msg
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setTypeMsg(Integer typeMsg) {
        this.typeMsg = typeMsg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column regsat_log.time_update
     *
     * @return the value of regsat_log.time_update
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public Date getTimeUpdate() {
        return timeUpdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column regsat_log.time_update
     *
     * @param timeUpdate the value for regsat_log.time_update
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setTimeUpdate(Date timeUpdate) {
        this.timeUpdate = timeUpdate;
    }
}