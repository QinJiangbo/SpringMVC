package com.qinjiangbo.gen.model;

import java.io.Serializable;

public class SysNewsDetailKey implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_news_detail.news_id
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private Long newsId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_news_detail.seq_id
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private Integer seqId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sys_news_detail
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_news_detail.news_id
     *
     * @return the value of sys_news_detail.news_id
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public Long getNewsId() {
        return newsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_news_detail.news_id
     *
     * @param newsId the value for sys_news_detail.news_id
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setNewsId(Long newsId) {
        this.newsId = newsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_news_detail.seq_id
     *
     * @return the value of sys_news_detail.seq_id
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public Integer getSeqId() {
        return seqId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_news_detail.seq_id
     *
     * @param seqId the value for sys_news_detail.seq_id
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setSeqId(Integer seqId) {
        this.seqId = seqId;
    }
}