package com.qinjiangbo.gen.model;

import java.io.Serializable;

public class WkAnsCustomKey implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wk_ans_custom.wk_id
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private Long wkId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wk_ans_custom.que_id
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private Long queId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table wk_ans_custom
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wk_ans_custom.wk_id
     *
     * @return the value of wk_ans_custom.wk_id
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public Long getWkId() {
        return wkId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wk_ans_custom.wk_id
     *
     * @param wkId the value for wk_ans_custom.wk_id
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setWkId(Long wkId) {
        this.wkId = wkId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wk_ans_custom.que_id
     *
     * @return the value of wk_ans_custom.que_id
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public Long getQueId() {
        return queId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wk_ans_custom.que_id
     *
     * @param queId the value for wk_ans_custom.que_id
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setQueId(Long queId) {
        this.queId = queId;
    }
}