package com.qinjiangbo.gen.model;

import java.io.Serializable;

public class MlDatePaper extends MlDatePaperKey implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ml_date_paper.job_id
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private Long jobId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ml_date_paper
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ml_date_paper.job_id
     *
     * @return the value of ml_date_paper.job_id
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public Long getJobId() {
        return jobId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ml_date_paper.job_id
     *
     * @param jobId the value for ml_date_paper.job_id
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setJobId(Long jobId) {
        this.jobId = jobId;
    }
}