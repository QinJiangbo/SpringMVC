package com.qinjiangbo.gen.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class RepStuScore extends RepStuScoreKey implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rep_stu_score.score
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private BigDecimal score;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rep_stu_score.accuate_rate
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private BigDecimal accuateRate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rep_stu_score.num_all
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private Integer numAll;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rep_stu_score.num_right
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private Integer numRight;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rep_stu_score.num_wrong
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private Integer numWrong;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rep_stu_score.time_consuming
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private Integer timeConsuming;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rep_stu_score.time_sec
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private Integer timeSec;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rep_stu_score.num_all_p
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private Integer numAllP;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rep_stu_score.num_right_p
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private Integer numRightP;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rep_stu_score.num_capacity_all
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private Integer numCapacityAll;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rep_stu_score.num_capacity_right
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private Integer numCapacityRight;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rep_stu_score.level_capacity
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private BigDecimal levelCapacity;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rep_stu_score.time_evaluation
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private Date timeEvaluation;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rep_stu_score.time_update
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private Date timeUpdate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table rep_stu_score
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rep_stu_score.score
     *
     * @return the value of rep_stu_score.score
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public BigDecimal getScore() {
        return score;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rep_stu_score.score
     *
     * @param score the value for rep_stu_score.score
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setScore(BigDecimal score) {
        this.score = score;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rep_stu_score.accuate_rate
     *
     * @return the value of rep_stu_score.accuate_rate
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public BigDecimal getAccuateRate() {
        return accuateRate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rep_stu_score.accuate_rate
     *
     * @param accuateRate the value for rep_stu_score.accuate_rate
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setAccuateRate(BigDecimal accuateRate) {
        this.accuateRate = accuateRate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rep_stu_score.num_all
     *
     * @return the value of rep_stu_score.num_all
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public Integer getNumAll() {
        return numAll;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rep_stu_score.num_all
     *
     * @param numAll the value for rep_stu_score.num_all
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setNumAll(Integer numAll) {
        this.numAll = numAll;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rep_stu_score.num_right
     *
     * @return the value of rep_stu_score.num_right
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public Integer getNumRight() {
        return numRight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rep_stu_score.num_right
     *
     * @param numRight the value for rep_stu_score.num_right
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setNumRight(Integer numRight) {
        this.numRight = numRight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rep_stu_score.num_wrong
     *
     * @return the value of rep_stu_score.num_wrong
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public Integer getNumWrong() {
        return numWrong;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rep_stu_score.num_wrong
     *
     * @param numWrong the value for rep_stu_score.num_wrong
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setNumWrong(Integer numWrong) {
        this.numWrong = numWrong;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rep_stu_score.time_consuming
     *
     * @return the value of rep_stu_score.time_consuming
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public Integer getTimeConsuming() {
        return timeConsuming;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rep_stu_score.time_consuming
     *
     * @param timeConsuming the value for rep_stu_score.time_consuming
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setTimeConsuming(Integer timeConsuming) {
        this.timeConsuming = timeConsuming;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rep_stu_score.time_sec
     *
     * @return the value of rep_stu_score.time_sec
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public Integer getTimeSec() {
        return timeSec;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rep_stu_score.time_sec
     *
     * @param timeSec the value for rep_stu_score.time_sec
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setTimeSec(Integer timeSec) {
        this.timeSec = timeSec;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rep_stu_score.num_all_p
     *
     * @return the value of rep_stu_score.num_all_p
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public Integer getNumAllP() {
        return numAllP;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rep_stu_score.num_all_p
     *
     * @param numAllP the value for rep_stu_score.num_all_p
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setNumAllP(Integer numAllP) {
        this.numAllP = numAllP;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rep_stu_score.num_right_p
     *
     * @return the value of rep_stu_score.num_right_p
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public Integer getNumRightP() {
        return numRightP;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rep_stu_score.num_right_p
     *
     * @param numRightP the value for rep_stu_score.num_right_p
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setNumRightP(Integer numRightP) {
        this.numRightP = numRightP;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rep_stu_score.num_capacity_all
     *
     * @return the value of rep_stu_score.num_capacity_all
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public Integer getNumCapacityAll() {
        return numCapacityAll;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rep_stu_score.num_capacity_all
     *
     * @param numCapacityAll the value for rep_stu_score.num_capacity_all
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setNumCapacityAll(Integer numCapacityAll) {
        this.numCapacityAll = numCapacityAll;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rep_stu_score.num_capacity_right
     *
     * @return the value of rep_stu_score.num_capacity_right
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public Integer getNumCapacityRight() {
        return numCapacityRight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rep_stu_score.num_capacity_right
     *
     * @param numCapacityRight the value for rep_stu_score.num_capacity_right
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setNumCapacityRight(Integer numCapacityRight) {
        this.numCapacityRight = numCapacityRight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rep_stu_score.level_capacity
     *
     * @return the value of rep_stu_score.level_capacity
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public BigDecimal getLevelCapacity() {
        return levelCapacity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rep_stu_score.level_capacity
     *
     * @param levelCapacity the value for rep_stu_score.level_capacity
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setLevelCapacity(BigDecimal levelCapacity) {
        this.levelCapacity = levelCapacity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rep_stu_score.time_evaluation
     *
     * @return the value of rep_stu_score.time_evaluation
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public Date getTimeEvaluation() {
        return timeEvaluation;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rep_stu_score.time_evaluation
     *
     * @param timeEvaluation the value for rep_stu_score.time_evaluation
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setTimeEvaluation(Date timeEvaluation) {
        this.timeEvaluation = timeEvaluation;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rep_stu_score.time_update
     *
     * @return the value of rep_stu_score.time_update
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public Date getTimeUpdate() {
        return timeUpdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rep_stu_score.time_update
     *
     * @param timeUpdate the value for rep_stu_score.time_update
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setTimeUpdate(Date timeUpdate) {
        this.timeUpdate = timeUpdate;
    }
}