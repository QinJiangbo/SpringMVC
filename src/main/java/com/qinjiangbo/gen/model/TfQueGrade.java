package com.qinjiangbo.gen.model;

import java.io.Serializable;
import java.util.Date;

public class TfQueGrade implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tf_que_grade.subject
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private String subject;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tf_que_grade.total
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private Integer total;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tf_que_grade.num
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private Integer num;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tf_que_grade.score
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private Integer score;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tf_que_grade.time_update
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private Date timeUpdate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tf_que_grade
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tf_que_grade.subject
     *
     * @return the value of tf_que_grade.subject
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public String getSubject() {
        return subject;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tf_que_grade.subject
     *
     * @param subject the value for tf_que_grade.subject
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tf_que_grade.total
     *
     * @return the value of tf_que_grade.total
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public Integer getTotal() {
        return total;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tf_que_grade.total
     *
     * @param total the value for tf_que_grade.total
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setTotal(Integer total) {
        this.total = total;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tf_que_grade.num
     *
     * @return the value of tf_que_grade.num
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public Integer getNum() {
        return num;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tf_que_grade.num
     *
     * @param num the value for tf_que_grade.num
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setNum(Integer num) {
        this.num = num;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tf_que_grade.score
     *
     * @return the value of tf_que_grade.score
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public Integer getScore() {
        return score;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tf_que_grade.score
     *
     * @param score the value for tf_que_grade.score
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setScore(Integer score) {
        this.score = score;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tf_que_grade.time_update
     *
     * @return the value of tf_que_grade.time_update
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public Date getTimeUpdate() {
        return timeUpdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tf_que_grade.time_update
     *
     * @param timeUpdate the value for tf_que_grade.time_update
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setTimeUpdate(Date timeUpdate) {
        this.timeUpdate = timeUpdate;
    }
}