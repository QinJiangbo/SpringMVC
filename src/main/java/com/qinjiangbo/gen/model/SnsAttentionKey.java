package com.qinjiangbo.gen.model;

import java.io.Serializable;

public class SnsAttentionKey implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sns_attention.topic_id
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private Long topicId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sns_attention.user_id
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private Long userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sns_attention
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sns_attention.topic_id
     *
     * @return the value of sns_attention.topic_id
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public Long getTopicId() {
        return topicId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sns_attention.topic_id
     *
     * @param topicId the value for sns_attention.topic_id
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setTopicId(Long topicId) {
        this.topicId = topicId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sns_attention.user_id
     *
     * @return the value of sns_attention.user_id
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sns_attention.user_id
     *
     * @param userId the value for sns_attention.user_id
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }
}