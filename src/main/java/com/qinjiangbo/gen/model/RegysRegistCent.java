package com.qinjiangbo.gen.model;

import java.io.Serializable;
import java.util.Date;

public class RegysRegistCent extends RegysRegistCentKey implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column regys_regist_cent.reg_provin
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private Long regProvin;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column regys_regist_cent.status
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private Integer status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column regys_regist_cent.sort
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private Integer sort;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column regys_regist_cent.time_update
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private Date timeUpdate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table regys_regist_cent
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column regys_regist_cent.reg_provin
     *
     * @return the value of regys_regist_cent.reg_provin
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public Long getRegProvin() {
        return regProvin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column regys_regist_cent.reg_provin
     *
     * @param regProvin the value for regys_regist_cent.reg_provin
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setRegProvin(Long regProvin) {
        this.regProvin = regProvin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column regys_regist_cent.status
     *
     * @return the value of regys_regist_cent.status
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column regys_regist_cent.status
     *
     * @param status the value for regys_regist_cent.status
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column regys_regist_cent.sort
     *
     * @return the value of regys_regist_cent.sort
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column regys_regist_cent.sort
     *
     * @param sort the value for regys_regist_cent.sort
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column regys_regist_cent.time_update
     *
     * @return the value of regys_regist_cent.time_update
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public Date getTimeUpdate() {
        return timeUpdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column regys_regist_cent.time_update
     *
     * @param timeUpdate the value for regys_regist_cent.time_update
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setTimeUpdate(Date timeUpdate) {
        this.timeUpdate = timeUpdate;
    }
}