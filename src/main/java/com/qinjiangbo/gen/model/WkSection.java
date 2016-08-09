package com.qinjiangbo.gen.model;

import java.io.Serializable;
import java.util.Date;

public class WkSection extends WkSectionKey implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wk_section.user_id
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private Long userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wk_section.pap_id
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private Long papId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wk_section.time_start
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private Date timeStart;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wk_section.time_end
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private Date timeEnd;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wk_section.len_sec
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private Integer lenSec;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wk_section.num_que
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private Integer numQue;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wk_section.num_not
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private Integer numNot;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wk_section.num_right
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private Integer numRight;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wk_section.num_wrong
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private Integer numWrong;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wk_section.time_update
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private Date timeUpdate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table wk_section
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wk_section.user_id
     *
     * @return the value of wk_section.user_id
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wk_section.user_id
     *
     * @param userId the value for wk_section.user_id
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wk_section.pap_id
     *
     * @return the value of wk_section.pap_id
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public Long getPapId() {
        return papId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wk_section.pap_id
     *
     * @param papId the value for wk_section.pap_id
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setPapId(Long papId) {
        this.papId = papId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wk_section.time_start
     *
     * @return the value of wk_section.time_start
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public Date getTimeStart() {
        return timeStart;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wk_section.time_start
     *
     * @param timeStart the value for wk_section.time_start
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setTimeStart(Date timeStart) {
        this.timeStart = timeStart;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wk_section.time_end
     *
     * @return the value of wk_section.time_end
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public Date getTimeEnd() {
        return timeEnd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wk_section.time_end
     *
     * @param timeEnd the value for wk_section.time_end
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setTimeEnd(Date timeEnd) {
        this.timeEnd = timeEnd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wk_section.len_sec
     *
     * @return the value of wk_section.len_sec
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public Integer getLenSec() {
        return lenSec;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wk_section.len_sec
     *
     * @param lenSec the value for wk_section.len_sec
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setLenSec(Integer lenSec) {
        this.lenSec = lenSec;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wk_section.num_que
     *
     * @return the value of wk_section.num_que
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public Integer getNumQue() {
        return numQue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wk_section.num_que
     *
     * @param numQue the value for wk_section.num_que
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setNumQue(Integer numQue) {
        this.numQue = numQue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wk_section.num_not
     *
     * @return the value of wk_section.num_not
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public Integer getNumNot() {
        return numNot;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wk_section.num_not
     *
     * @param numNot the value for wk_section.num_not
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setNumNot(Integer numNot) {
        this.numNot = numNot;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wk_section.num_right
     *
     * @return the value of wk_section.num_right
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public Integer getNumRight() {
        return numRight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wk_section.num_right
     *
     * @param numRight the value for wk_section.num_right
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setNumRight(Integer numRight) {
        this.numRight = numRight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wk_section.num_wrong
     *
     * @return the value of wk_section.num_wrong
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public Integer getNumWrong() {
        return numWrong;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wk_section.num_wrong
     *
     * @param numWrong the value for wk_section.num_wrong
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setNumWrong(Integer numWrong) {
        this.numWrong = numWrong;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wk_section.time_update
     *
     * @return the value of wk_section.time_update
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public Date getTimeUpdate() {
        return timeUpdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wk_section.time_update
     *
     * @param timeUpdate the value for wk_section.time_update
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setTimeUpdate(Date timeUpdate) {
        this.timeUpdate = timeUpdate;
    }
}