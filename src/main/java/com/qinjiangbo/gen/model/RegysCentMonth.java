package com.qinjiangbo.gen.model;

import java.io.Serializable;
import java.util.Date;

public class RegysCentMonth extends RegysCentMonthKey implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column regys_cent_month.status
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private Integer status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column regys_cent_month.num
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private Integer num;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column regys_cent_month.time_start
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private Date timeStart;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column regys_cent_month.time_success
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private Date timeSuccess;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table regys_cent_month
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column regys_cent_month.status
     *
     * @return the value of regys_cent_month.status
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column regys_cent_month.status
     *
     * @param status the value for regys_cent_month.status
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column regys_cent_month.num
     *
     * @return the value of regys_cent_month.num
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public Integer getNum() {
        return num;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column regys_cent_month.num
     *
     * @param num the value for regys_cent_month.num
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setNum(Integer num) {
        this.num = num;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column regys_cent_month.time_start
     *
     * @return the value of regys_cent_month.time_start
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public Date getTimeStart() {
        return timeStart;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column regys_cent_month.time_start
     *
     * @param timeStart the value for regys_cent_month.time_start
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setTimeStart(Date timeStart) {
        this.timeStart = timeStart;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column regys_cent_month.time_success
     *
     * @return the value of regys_cent_month.time_success
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public Date getTimeSuccess() {
        return timeSuccess;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column regys_cent_month.time_success
     *
     * @param timeSuccess the value for regys_cent_month.time_success
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setTimeSuccess(Date timeSuccess) {
        this.timeSuccess = timeSuccess;
    }
}