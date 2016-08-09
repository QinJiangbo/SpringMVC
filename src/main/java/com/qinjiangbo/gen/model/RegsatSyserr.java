package com.qinjiangbo.gen.model;

import java.io.Serializable;
import java.util.Date;

public class RegsatSyserr implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column regsat_syserr.id
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column regsat_syserr.err_code
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private String errCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column regsat_syserr.time_start
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private Date timeStart;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column regsat_syserr.time_end
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private Date timeEnd;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column regsat_syserr.len_sec
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private Long lenSec;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column regsat_syserr.status
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private Integer status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column regsat_syserr.remark
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private String remark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column regsat_syserr.time_update
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private Date timeUpdate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table regsat_syserr
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column regsat_syserr.id
     *
     * @return the value of regsat_syserr.id
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column regsat_syserr.id
     *
     * @param id the value for regsat_syserr.id
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column regsat_syserr.err_code
     *
     * @return the value of regsat_syserr.err_code
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public String getErrCode() {
        return errCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column regsat_syserr.err_code
     *
     * @param errCode the value for regsat_syserr.err_code
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setErrCode(String errCode) {
        this.errCode = errCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column regsat_syserr.time_start
     *
     * @return the value of regsat_syserr.time_start
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public Date getTimeStart() {
        return timeStart;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column regsat_syserr.time_start
     *
     * @param timeStart the value for regsat_syserr.time_start
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setTimeStart(Date timeStart) {
        this.timeStart = timeStart;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column regsat_syserr.time_end
     *
     * @return the value of regsat_syserr.time_end
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public Date getTimeEnd() {
        return timeEnd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column regsat_syserr.time_end
     *
     * @param timeEnd the value for regsat_syserr.time_end
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setTimeEnd(Date timeEnd) {
        this.timeEnd = timeEnd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column regsat_syserr.len_sec
     *
     * @return the value of regsat_syserr.len_sec
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public Long getLenSec() {
        return lenSec;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column regsat_syserr.len_sec
     *
     * @param lenSec the value for regsat_syserr.len_sec
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setLenSec(Long lenSec) {
        this.lenSec = lenSec;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column regsat_syserr.status
     *
     * @return the value of regsat_syserr.status
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column regsat_syserr.status
     *
     * @param status the value for regsat_syserr.status
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column regsat_syserr.remark
     *
     * @return the value of regsat_syserr.remark
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column regsat_syserr.remark
     *
     * @param remark the value for regsat_syserr.remark
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column regsat_syserr.time_update
     *
     * @return the value of regsat_syserr.time_update
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public Date getTimeUpdate() {
        return timeUpdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column regsat_syserr.time_update
     *
     * @param timeUpdate the value for regsat_syserr.time_update
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setTimeUpdate(Date timeUpdate) {
        this.timeUpdate = timeUpdate;
    }
}