package com.qinjiangbo.gen.model;

import java.io.Serializable;

public class QueQuestionAttrKey implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column que_question_attr.que_id
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private Long queId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column que_question_attr.attr_code
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private String attrCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table que_question_attr
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column que_question_attr.que_id
     *
     * @return the value of que_question_attr.que_id
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public Long getQueId() {
        return queId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column que_question_attr.que_id
     *
     * @param queId the value for que_question_attr.que_id
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setQueId(Long queId) {
        this.queId = queId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column que_question_attr.attr_code
     *
     * @return the value of que_question_attr.attr_code
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public String getAttrCode() {
        return attrCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column que_question_attr.attr_code
     *
     * @param attrCode the value for que_question_attr.attr_code
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setAttrCode(String attrCode) {
        this.attrCode = attrCode;
    }
}