package com.qinjiangbo.gen.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class RegysScore implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column regys_score.id
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column regys_score.user_id
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private Long userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column regys_score.test_id
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private Long testId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column regys_score.test_subject
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private String testSubject;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column regys_score.source
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private Integer source;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column regys_score.cent_id
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private Long centId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column regys_score.cent_guid
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private String centGuid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column regys_score.cent_name
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private String centName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column regys_score.neea_appid
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private String neeaAppid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column regys_score.ielts_appid
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private String ieltsAppid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column regys_score.attend
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private Integer attend;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column regys_score.score
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private BigDecimal score;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column regys_score.score_listen
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private BigDecimal scoreListen;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column regys_score.score_read
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private BigDecimal scoreRead;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column regys_score.score_write
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private BigDecimal scoreWrite;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column regys_score.score_speak
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private BigDecimal scoreSpeak;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column regys_score.mail_time
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private Date mailTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column regys_score.mail_no
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private String mailNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column regys_score.mail_address
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private String mailAddress;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column regys_score.mail_zip
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private String mailZip;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column regys_score.mail_phone
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private String mailPhone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column regys_score.mail_tel
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private String mailTel;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column regys_score.write_time
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private Date writeTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column regys_score.write_site
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private String writeSite;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column regys_score.write_addr
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private String writeAddr;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column regys_score.write_room
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private String writeRoom;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column regys_score.speak_time
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private Date speakTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column regys_score.speak_site
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private String speakSite;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column regys_score.speak_addr
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private String speakAddr;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column regys_score.speak_room
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private String speakRoom;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column regys_score.money
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private BigDecimal money;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column regys_score.ticket
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private String ticket;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column regys_score.step
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private Integer step;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column regys_score.status
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private Integer status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column regys_score.status_exe
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private Integer statusExe;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column regys_score.loop_id
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private Long loopId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column regys_score.loop_num
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private Integer loopNum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column regys_score.time_create
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private Date timeCreate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column regys_score.time_update
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private Date timeUpdate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table regys_score
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column regys_score.id
     *
     * @return the value of regys_score.id
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column regys_score.id
     *
     * @param id the value for regys_score.id
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column regys_score.user_id
     *
     * @return the value of regys_score.user_id
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column regys_score.user_id
     *
     * @param userId the value for regys_score.user_id
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column regys_score.test_id
     *
     * @return the value of regys_score.test_id
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public Long getTestId() {
        return testId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column regys_score.test_id
     *
     * @param testId the value for regys_score.test_id
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setTestId(Long testId) {
        this.testId = testId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column regys_score.test_subject
     *
     * @return the value of regys_score.test_subject
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public String getTestSubject() {
        return testSubject;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column regys_score.test_subject
     *
     * @param testSubject the value for regys_score.test_subject
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setTestSubject(String testSubject) {
        this.testSubject = testSubject;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column regys_score.source
     *
     * @return the value of regys_score.source
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public Integer getSource() {
        return source;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column regys_score.source
     *
     * @param source the value for regys_score.source
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setSource(Integer source) {
        this.source = source;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column regys_score.cent_id
     *
     * @return the value of regys_score.cent_id
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public Long getCentId() {
        return centId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column regys_score.cent_id
     *
     * @param centId the value for regys_score.cent_id
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setCentId(Long centId) {
        this.centId = centId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column regys_score.cent_guid
     *
     * @return the value of regys_score.cent_guid
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public String getCentGuid() {
        return centGuid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column regys_score.cent_guid
     *
     * @param centGuid the value for regys_score.cent_guid
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setCentGuid(String centGuid) {
        this.centGuid = centGuid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column regys_score.cent_name
     *
     * @return the value of regys_score.cent_name
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public String getCentName() {
        return centName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column regys_score.cent_name
     *
     * @param centName the value for regys_score.cent_name
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setCentName(String centName) {
        this.centName = centName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column regys_score.neea_appid
     *
     * @return the value of regys_score.neea_appid
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public String getNeeaAppid() {
        return neeaAppid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column regys_score.neea_appid
     *
     * @param neeaAppid the value for regys_score.neea_appid
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setNeeaAppid(String neeaAppid) {
        this.neeaAppid = neeaAppid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column regys_score.ielts_appid
     *
     * @return the value of regys_score.ielts_appid
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public String getIeltsAppid() {
        return ieltsAppid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column regys_score.ielts_appid
     *
     * @param ieltsAppid the value for regys_score.ielts_appid
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setIeltsAppid(String ieltsAppid) {
        this.ieltsAppid = ieltsAppid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column regys_score.attend
     *
     * @return the value of regys_score.attend
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public Integer getAttend() {
        return attend;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column regys_score.attend
     *
     * @param attend the value for regys_score.attend
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setAttend(Integer attend) {
        this.attend = attend;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column regys_score.score
     *
     * @return the value of regys_score.score
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public BigDecimal getScore() {
        return score;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column regys_score.score
     *
     * @param score the value for regys_score.score
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setScore(BigDecimal score) {
        this.score = score;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column regys_score.score_listen
     *
     * @return the value of regys_score.score_listen
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public BigDecimal getScoreListen() {
        return scoreListen;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column regys_score.score_listen
     *
     * @param scoreListen the value for regys_score.score_listen
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setScoreListen(BigDecimal scoreListen) {
        this.scoreListen = scoreListen;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column regys_score.score_read
     *
     * @return the value of regys_score.score_read
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public BigDecimal getScoreRead() {
        return scoreRead;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column regys_score.score_read
     *
     * @param scoreRead the value for regys_score.score_read
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setScoreRead(BigDecimal scoreRead) {
        this.scoreRead = scoreRead;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column regys_score.score_write
     *
     * @return the value of regys_score.score_write
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public BigDecimal getScoreWrite() {
        return scoreWrite;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column regys_score.score_write
     *
     * @param scoreWrite the value for regys_score.score_write
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setScoreWrite(BigDecimal scoreWrite) {
        this.scoreWrite = scoreWrite;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column regys_score.score_speak
     *
     * @return the value of regys_score.score_speak
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public BigDecimal getScoreSpeak() {
        return scoreSpeak;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column regys_score.score_speak
     *
     * @param scoreSpeak the value for regys_score.score_speak
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setScoreSpeak(BigDecimal scoreSpeak) {
        this.scoreSpeak = scoreSpeak;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column regys_score.mail_time
     *
     * @return the value of regys_score.mail_time
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public Date getMailTime() {
        return mailTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column regys_score.mail_time
     *
     * @param mailTime the value for regys_score.mail_time
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setMailTime(Date mailTime) {
        this.mailTime = mailTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column regys_score.mail_no
     *
     * @return the value of regys_score.mail_no
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public String getMailNo() {
        return mailNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column regys_score.mail_no
     *
     * @param mailNo the value for regys_score.mail_no
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setMailNo(String mailNo) {
        this.mailNo = mailNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column regys_score.mail_address
     *
     * @return the value of regys_score.mail_address
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public String getMailAddress() {
        return mailAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column regys_score.mail_address
     *
     * @param mailAddress the value for regys_score.mail_address
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setMailAddress(String mailAddress) {
        this.mailAddress = mailAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column regys_score.mail_zip
     *
     * @return the value of regys_score.mail_zip
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public String getMailZip() {
        return mailZip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column regys_score.mail_zip
     *
     * @param mailZip the value for regys_score.mail_zip
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setMailZip(String mailZip) {
        this.mailZip = mailZip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column regys_score.mail_phone
     *
     * @return the value of regys_score.mail_phone
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public String getMailPhone() {
        return mailPhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column regys_score.mail_phone
     *
     * @param mailPhone the value for regys_score.mail_phone
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setMailPhone(String mailPhone) {
        this.mailPhone = mailPhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column regys_score.mail_tel
     *
     * @return the value of regys_score.mail_tel
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public String getMailTel() {
        return mailTel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column regys_score.mail_tel
     *
     * @param mailTel the value for regys_score.mail_tel
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setMailTel(String mailTel) {
        this.mailTel = mailTel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column regys_score.write_time
     *
     * @return the value of regys_score.write_time
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public Date getWriteTime() {
        return writeTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column regys_score.write_time
     *
     * @param writeTime the value for regys_score.write_time
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setWriteTime(Date writeTime) {
        this.writeTime = writeTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column regys_score.write_site
     *
     * @return the value of regys_score.write_site
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public String getWriteSite() {
        return writeSite;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column regys_score.write_site
     *
     * @param writeSite the value for regys_score.write_site
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setWriteSite(String writeSite) {
        this.writeSite = writeSite;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column regys_score.write_addr
     *
     * @return the value of regys_score.write_addr
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public String getWriteAddr() {
        return writeAddr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column regys_score.write_addr
     *
     * @param writeAddr the value for regys_score.write_addr
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setWriteAddr(String writeAddr) {
        this.writeAddr = writeAddr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column regys_score.write_room
     *
     * @return the value of regys_score.write_room
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public String getWriteRoom() {
        return writeRoom;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column regys_score.write_room
     *
     * @param writeRoom the value for regys_score.write_room
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setWriteRoom(String writeRoom) {
        this.writeRoom = writeRoom;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column regys_score.speak_time
     *
     * @return the value of regys_score.speak_time
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public Date getSpeakTime() {
        return speakTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column regys_score.speak_time
     *
     * @param speakTime the value for regys_score.speak_time
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setSpeakTime(Date speakTime) {
        this.speakTime = speakTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column regys_score.speak_site
     *
     * @return the value of regys_score.speak_site
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public String getSpeakSite() {
        return speakSite;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column regys_score.speak_site
     *
     * @param speakSite the value for regys_score.speak_site
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setSpeakSite(String speakSite) {
        this.speakSite = speakSite;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column regys_score.speak_addr
     *
     * @return the value of regys_score.speak_addr
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public String getSpeakAddr() {
        return speakAddr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column regys_score.speak_addr
     *
     * @param speakAddr the value for regys_score.speak_addr
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setSpeakAddr(String speakAddr) {
        this.speakAddr = speakAddr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column regys_score.speak_room
     *
     * @return the value of regys_score.speak_room
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public String getSpeakRoom() {
        return speakRoom;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column regys_score.speak_room
     *
     * @param speakRoom the value for regys_score.speak_room
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setSpeakRoom(String speakRoom) {
        this.speakRoom = speakRoom;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column regys_score.money
     *
     * @return the value of regys_score.money
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public BigDecimal getMoney() {
        return money;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column regys_score.money
     *
     * @param money the value for regys_score.money
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column regys_score.ticket
     *
     * @return the value of regys_score.ticket
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public String getTicket() {
        return ticket;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column regys_score.ticket
     *
     * @param ticket the value for regys_score.ticket
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setTicket(String ticket) {
        this.ticket = ticket;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column regys_score.step
     *
     * @return the value of regys_score.step
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public Integer getStep() {
        return step;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column regys_score.step
     *
     * @param step the value for regys_score.step
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setStep(Integer step) {
        this.step = step;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column regys_score.status
     *
     * @return the value of regys_score.status
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column regys_score.status
     *
     * @param status the value for regys_score.status
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column regys_score.status_exe
     *
     * @return the value of regys_score.status_exe
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public Integer getStatusExe() {
        return statusExe;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column regys_score.status_exe
     *
     * @param statusExe the value for regys_score.status_exe
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setStatusExe(Integer statusExe) {
        this.statusExe = statusExe;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column regys_score.loop_id
     *
     * @return the value of regys_score.loop_id
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public Long getLoopId() {
        return loopId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column regys_score.loop_id
     *
     * @param loopId the value for regys_score.loop_id
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setLoopId(Long loopId) {
        this.loopId = loopId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column regys_score.loop_num
     *
     * @return the value of regys_score.loop_num
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public Integer getLoopNum() {
        return loopNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column regys_score.loop_num
     *
     * @param loopNum the value for regys_score.loop_num
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setLoopNum(Integer loopNum) {
        this.loopNum = loopNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column regys_score.time_create
     *
     * @return the value of regys_score.time_create
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public Date getTimeCreate() {
        return timeCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column regys_score.time_create
     *
     * @param timeCreate the value for regys_score.time_create
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setTimeCreate(Date timeCreate) {
        this.timeCreate = timeCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column regys_score.time_update
     *
     * @return the value of regys_score.time_update
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public Date getTimeUpdate() {
        return timeUpdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column regys_score.time_update
     *
     * @param timeUpdate the value for regys_score.time_update
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setTimeUpdate(Date timeUpdate) {
        this.timeUpdate = timeUpdate;
    }
}