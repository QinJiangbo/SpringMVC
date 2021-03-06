package com.qinjiangbo.gen.model;

import java.io.Serializable;
import java.util.Date;

public class HrUser implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hr_user.user_id
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private Long userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hr_user.ac_phone
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private String acPhone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hr_user.ac_email
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private String acEmail;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hr_user.ac_pwd
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private String acPwd;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hr_user.hr_code
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private String hrCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hr_user.user_name
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private String userName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hr_user.time_entry
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private Date timeEntry;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hr_user.time_leave
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private Date timeLeave;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hr_user.status
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private Integer status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hr_user.num_err
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private Integer numErr;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hr_user.time_err
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private Date timeErr;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table hr_user
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hr_user.user_id
     *
     * @return the value of hr_user.user_id
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hr_user.user_id
     *
     * @param userId the value for hr_user.user_id
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hr_user.ac_phone
     *
     * @return the value of hr_user.ac_phone
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public String getAcPhone() {
        return acPhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hr_user.ac_phone
     *
     * @param acPhone the value for hr_user.ac_phone
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setAcPhone(String acPhone) {
        this.acPhone = acPhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hr_user.ac_email
     *
     * @return the value of hr_user.ac_email
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public String getAcEmail() {
        return acEmail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hr_user.ac_email
     *
     * @param acEmail the value for hr_user.ac_email
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setAcEmail(String acEmail) {
        this.acEmail = acEmail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hr_user.ac_pwd
     *
     * @return the value of hr_user.ac_pwd
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public String getAcPwd() {
        return acPwd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hr_user.ac_pwd
     *
     * @param acPwd the value for hr_user.ac_pwd
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setAcPwd(String acPwd) {
        this.acPwd = acPwd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hr_user.hr_code
     *
     * @return the value of hr_user.hr_code
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public String getHrCode() {
        return hrCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hr_user.hr_code
     *
     * @param hrCode the value for hr_user.hr_code
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setHrCode(String hrCode) {
        this.hrCode = hrCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hr_user.user_name
     *
     * @return the value of hr_user.user_name
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hr_user.user_name
     *
     * @param userName the value for hr_user.user_name
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hr_user.time_entry
     *
     * @return the value of hr_user.time_entry
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public Date getTimeEntry() {
        return timeEntry;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hr_user.time_entry
     *
     * @param timeEntry the value for hr_user.time_entry
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setTimeEntry(Date timeEntry) {
        this.timeEntry = timeEntry;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hr_user.time_leave
     *
     * @return the value of hr_user.time_leave
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public Date getTimeLeave() {
        return timeLeave;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hr_user.time_leave
     *
     * @param timeLeave the value for hr_user.time_leave
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setTimeLeave(Date timeLeave) {
        this.timeLeave = timeLeave;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hr_user.status
     *
     * @return the value of hr_user.status
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hr_user.status
     *
     * @param status the value for hr_user.status
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hr_user.num_err
     *
     * @return the value of hr_user.num_err
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public Integer getNumErr() {
        return numErr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hr_user.num_err
     *
     * @param numErr the value for hr_user.num_err
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setNumErr(Integer numErr) {
        this.numErr = numErr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hr_user.time_err
     *
     * @return the value of hr_user.time_err
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public Date getTimeErr() {
        return timeErr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hr_user.time_err
     *
     * @param timeErr the value for hr_user.time_err
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setTimeErr(Date timeErr) {
        this.timeErr = timeErr;
    }
}