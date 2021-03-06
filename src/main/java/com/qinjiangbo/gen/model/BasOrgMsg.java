package com.qinjiangbo.gen.model;

import java.io.Serializable;
import java.util.Date;

public class BasOrgMsg implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bas_org_msg.msg_id
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private Long msgId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bas_org_msg.is_read
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private Integer isRead;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bas_org_msg.msg_content
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private String msgContent;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bas_org_msg.msg_tp
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private Integer msgTp;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bas_org_msg.org_id
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private Long orgId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bas_org_msg.time_create
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private Date timeCreate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bas_org_msg.time_read
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private Date timeRead;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bas_org_msg.user_receive
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private Long userReceive;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bas_org_msg.user_send
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private Long userSend;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table bas_org_msg
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bas_org_msg.msg_id
     *
     * @return the value of bas_org_msg.msg_id
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public Long getMsgId() {
        return msgId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bas_org_msg.msg_id
     *
     * @param msgId the value for bas_org_msg.msg_id
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setMsgId(Long msgId) {
        this.msgId = msgId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bas_org_msg.is_read
     *
     * @return the value of bas_org_msg.is_read
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public Integer getIsRead() {
        return isRead;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bas_org_msg.is_read
     *
     * @param isRead the value for bas_org_msg.is_read
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setIsRead(Integer isRead) {
        this.isRead = isRead;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bas_org_msg.msg_content
     *
     * @return the value of bas_org_msg.msg_content
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public String getMsgContent() {
        return msgContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bas_org_msg.msg_content
     *
     * @param msgContent the value for bas_org_msg.msg_content
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setMsgContent(String msgContent) {
        this.msgContent = msgContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bas_org_msg.msg_tp
     *
     * @return the value of bas_org_msg.msg_tp
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public Integer getMsgTp() {
        return msgTp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bas_org_msg.msg_tp
     *
     * @param msgTp the value for bas_org_msg.msg_tp
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setMsgTp(Integer msgTp) {
        this.msgTp = msgTp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bas_org_msg.org_id
     *
     * @return the value of bas_org_msg.org_id
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public Long getOrgId() {
        return orgId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bas_org_msg.org_id
     *
     * @param orgId the value for bas_org_msg.org_id
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bas_org_msg.time_create
     *
     * @return the value of bas_org_msg.time_create
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public Date getTimeCreate() {
        return timeCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bas_org_msg.time_create
     *
     * @param timeCreate the value for bas_org_msg.time_create
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setTimeCreate(Date timeCreate) {
        this.timeCreate = timeCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bas_org_msg.time_read
     *
     * @return the value of bas_org_msg.time_read
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public Date getTimeRead() {
        return timeRead;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bas_org_msg.time_read
     *
     * @param timeRead the value for bas_org_msg.time_read
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setTimeRead(Date timeRead) {
        this.timeRead = timeRead;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bas_org_msg.user_receive
     *
     * @return the value of bas_org_msg.user_receive
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public Long getUserReceive() {
        return userReceive;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bas_org_msg.user_receive
     *
     * @param userReceive the value for bas_org_msg.user_receive
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setUserReceive(Long userReceive) {
        this.userReceive = userReceive;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bas_org_msg.user_send
     *
     * @return the value of bas_org_msg.user_send
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public Long getUserSend() {
        return userSend;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bas_org_msg.user_send
     *
     * @param userSend the value for bas_org_msg.user_send
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setUserSend(Long userSend) {
        this.userSend = userSend;
    }
}