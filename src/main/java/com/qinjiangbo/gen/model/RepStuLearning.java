package com.qinjiangbo.gen.model;

import java.io.Serializable;
import java.util.Date;

public class RepStuLearning extends RepStuLearningKey implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rep_stu_learning.time_learn
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private Integer timeLearn;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rep_stu_learning.time_login
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private Date timeLogin;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rep_stu_learning.time_logout
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private Date timeLogout;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rep_stu_learning.time_update
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private Date timeUpdate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table rep_stu_learning
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rep_stu_learning.time_learn
     *
     * @return the value of rep_stu_learning.time_learn
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public Integer getTimeLearn() {
        return timeLearn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rep_stu_learning.time_learn
     *
     * @param timeLearn the value for rep_stu_learning.time_learn
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setTimeLearn(Integer timeLearn) {
        this.timeLearn = timeLearn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rep_stu_learning.time_login
     *
     * @return the value of rep_stu_learning.time_login
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public Date getTimeLogin() {
        return timeLogin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rep_stu_learning.time_login
     *
     * @param timeLogin the value for rep_stu_learning.time_login
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setTimeLogin(Date timeLogin) {
        this.timeLogin = timeLogin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rep_stu_learning.time_logout
     *
     * @return the value of rep_stu_learning.time_logout
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public Date getTimeLogout() {
        return timeLogout;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rep_stu_learning.time_logout
     *
     * @param timeLogout the value for rep_stu_learning.time_logout
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setTimeLogout(Date timeLogout) {
        this.timeLogout = timeLogout;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rep_stu_learning.time_update
     *
     * @return the value of rep_stu_learning.time_update
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public Date getTimeUpdate() {
        return timeUpdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rep_stu_learning.time_update
     *
     * @param timeUpdate the value for rep_stu_learning.time_update
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setTimeUpdate(Date timeUpdate) {
        this.timeUpdate = timeUpdate;
    }
}