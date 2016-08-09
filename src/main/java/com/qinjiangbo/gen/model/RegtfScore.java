package com.qinjiangbo.gen.model;

import java.io.Serializable;
import java.util.Date;

public class RegtfScore implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column regtf_score.id
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column regtf_score.user_id
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private Long userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column regtf_score.test_id
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private Long testId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column regtf_score.source
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private Integer source;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column regtf_score.cent_code
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private String centCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column regtf_score.cent_name
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private String centName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column regtf_score.ets_id
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private String etsId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column regtf_score.address
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private String address;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column regtf_score.score
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private Integer score;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column regtf_score.scorer
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private Integer scorer;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column regtf_score.scorel
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private Integer scorel;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column regtf_score.scores
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private Integer scores;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column regtf_score.scorew
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private Integer scorew;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column regtf_score.remark
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private String remark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column regtf_score.time_update
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private Date timeUpdate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column regtf_score.time_create
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private Date timeCreate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column regtf_score.app_id
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private String appId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column regtf_score.attend
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private Integer attend;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table regtf_score
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column regtf_score.id
     *
     * @return the value of regtf_score.id
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column regtf_score.id
     *
     * @param id the value for regtf_score.id
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column regtf_score.user_id
     *
     * @return the value of regtf_score.user_id
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column regtf_score.user_id
     *
     * @param userId the value for regtf_score.user_id
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column regtf_score.test_id
     *
     * @return the value of regtf_score.test_id
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public Long getTestId() {
        return testId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column regtf_score.test_id
     *
     * @param testId the value for regtf_score.test_id
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setTestId(Long testId) {
        this.testId = testId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column regtf_score.source
     *
     * @return the value of regtf_score.source
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public Integer getSource() {
        return source;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column regtf_score.source
     *
     * @param source the value for regtf_score.source
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setSource(Integer source) {
        this.source = source;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column regtf_score.cent_code
     *
     * @return the value of regtf_score.cent_code
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public String getCentCode() {
        return centCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column regtf_score.cent_code
     *
     * @param centCode the value for regtf_score.cent_code
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setCentCode(String centCode) {
        this.centCode = centCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column regtf_score.cent_name
     *
     * @return the value of regtf_score.cent_name
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public String getCentName() {
        return centName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column regtf_score.cent_name
     *
     * @param centName the value for regtf_score.cent_name
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setCentName(String centName) {
        this.centName = centName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column regtf_score.ets_id
     *
     * @return the value of regtf_score.ets_id
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public String getEtsId() {
        return etsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column regtf_score.ets_id
     *
     * @param etsId the value for regtf_score.ets_id
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setEtsId(String etsId) {
        this.etsId = etsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column regtf_score.address
     *
     * @return the value of regtf_score.address
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column regtf_score.address
     *
     * @param address the value for regtf_score.address
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column regtf_score.score
     *
     * @return the value of regtf_score.score
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public Integer getScore() {
        return score;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column regtf_score.score
     *
     * @param score the value for regtf_score.score
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setScore(Integer score) {
        this.score = score;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column regtf_score.scorer
     *
     * @return the value of regtf_score.scorer
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public Integer getScorer() {
        return scorer;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column regtf_score.scorer
     *
     * @param scorer the value for regtf_score.scorer
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setScorer(Integer scorer) {
        this.scorer = scorer;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column regtf_score.scorel
     *
     * @return the value of regtf_score.scorel
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public Integer getScorel() {
        return scorel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column regtf_score.scorel
     *
     * @param scorel the value for regtf_score.scorel
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setScorel(Integer scorel) {
        this.scorel = scorel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column regtf_score.scores
     *
     * @return the value of regtf_score.scores
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public Integer getScores() {
        return scores;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column regtf_score.scores
     *
     * @param scores the value for regtf_score.scores
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setScores(Integer scores) {
        this.scores = scores;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column regtf_score.scorew
     *
     * @return the value of regtf_score.scorew
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public Integer getScorew() {
        return scorew;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column regtf_score.scorew
     *
     * @param scorew the value for regtf_score.scorew
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setScorew(Integer scorew) {
        this.scorew = scorew;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column regtf_score.remark
     *
     * @return the value of regtf_score.remark
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column regtf_score.remark
     *
     * @param remark the value for regtf_score.remark
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column regtf_score.time_update
     *
     * @return the value of regtf_score.time_update
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public Date getTimeUpdate() {
        return timeUpdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column regtf_score.time_update
     *
     * @param timeUpdate the value for regtf_score.time_update
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setTimeUpdate(Date timeUpdate) {
        this.timeUpdate = timeUpdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column regtf_score.time_create
     *
     * @return the value of regtf_score.time_create
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public Date getTimeCreate() {
        return timeCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column regtf_score.time_create
     *
     * @param timeCreate the value for regtf_score.time_create
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setTimeCreate(Date timeCreate) {
        this.timeCreate = timeCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column regtf_score.app_id
     *
     * @return the value of regtf_score.app_id
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public String getAppId() {
        return appId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column regtf_score.app_id
     *
     * @param appId the value for regtf_score.app_id
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setAppId(String appId) {
        this.appId = appId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column regtf_score.attend
     *
     * @return the value of regtf_score.attend
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public Integer getAttend() {
        return attend;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column regtf_score.attend
     *
     * @param attend the value for regtf_score.attend
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setAttend(Integer attend) {
        this.attend = attend;
    }
}