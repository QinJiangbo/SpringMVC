package com.qinjiangbo.gen.model;

import java.io.Serializable;

public class WkJobQue extends WkJobQueKey implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wk_job_que.sort_id
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private Integer sortId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wk_job_que.len_sec
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private Integer lenSec;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table wk_job_que
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wk_job_que.sort_id
     *
     * @return the value of wk_job_que.sort_id
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public Integer getSortId() {
        return sortId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wk_job_que.sort_id
     *
     * @param sortId the value for wk_job_que.sort_id
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setSortId(Integer sortId) {
        this.sortId = sortId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wk_job_que.len_sec
     *
     * @return the value of wk_job_que.len_sec
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public Integer getLenSec() {
        return lenSec;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wk_job_que.len_sec
     *
     * @param lenSec the value for wk_job_que.len_sec
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setLenSec(Integer lenSec) {
        this.lenSec = lenSec;
    }
}