package com.qinjiangbo.gen.model;

import java.io.Serializable;

public class QueGradeKey implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column que_grade.pap_id
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private Long papId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column que_grade.sort_id
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private Long sortId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table que_grade
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column que_grade.pap_id
     *
     * @return the value of que_grade.pap_id
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public Long getPapId() {
        return papId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column que_grade.pap_id
     *
     * @param papId the value for que_grade.pap_id
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setPapId(Long papId) {
        this.papId = papId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column que_grade.sort_id
     *
     * @return the value of que_grade.sort_id
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public Long getSortId() {
        return sortId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column que_grade.sort_id
     *
     * @param sortId the value for que_grade.sort_id
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setSortId(Long sortId) {
        this.sortId = sortId;
    }
}