package com.qinjiangbo.gen.model;

import java.io.Serializable;

public class RepQueAnsKey implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rep_que_ans.que_id
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private Long queId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rep_que_ans.ans_id
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private Long ansId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table rep_que_ans
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rep_que_ans.que_id
     *
     * @return the value of rep_que_ans.que_id
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public Long getQueId() {
        return queId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rep_que_ans.que_id
     *
     * @param queId the value for rep_que_ans.que_id
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setQueId(Long queId) {
        this.queId = queId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rep_que_ans.ans_id
     *
     * @return the value of rep_que_ans.ans_id
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public Long getAnsId() {
        return ansId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rep_que_ans.ans_id
     *
     * @param ansId the value for rep_que_ans.ans_id
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setAnsId(Long ansId) {
        this.ansId = ansId;
    }
}