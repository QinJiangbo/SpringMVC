package com.qinjiangbo.gen.model;

import java.io.Serializable;
import java.util.Date;

public class SysMsgUser extends SysMsgUserKey implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_msg_user.b_read
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private Integer bRead;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_msg_user.b_deal
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private Integer bDeal;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_msg_user.time_read
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private Date timeRead;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_msg_user.time_send
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private Date timeSend;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sys_msg_user
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_msg_user.b_read
     *
     * @return the value of sys_msg_user.b_read
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public Integer getbRead() {
        return bRead;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_msg_user.b_read
     *
     * @param bRead the value for sys_msg_user.b_read
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setbRead(Integer bRead) {
        this.bRead = bRead;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_msg_user.b_deal
     *
     * @return the value of sys_msg_user.b_deal
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public Integer getbDeal() {
        return bDeal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_msg_user.b_deal
     *
     * @param bDeal the value for sys_msg_user.b_deal
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setbDeal(Integer bDeal) {
        this.bDeal = bDeal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_msg_user.time_read
     *
     * @return the value of sys_msg_user.time_read
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public Date getTimeRead() {
        return timeRead;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_msg_user.time_read
     *
     * @param timeRead the value for sys_msg_user.time_read
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setTimeRead(Date timeRead) {
        this.timeRead = timeRead;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_msg_user.time_send
     *
     * @return the value of sys_msg_user.time_send
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public Date getTimeSend() {
        return timeSend;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_msg_user.time_send
     *
     * @param timeSend the value for sys_msg_user.time_send
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setTimeSend(Date timeSend) {
        this.timeSend = timeSend;
    }
}