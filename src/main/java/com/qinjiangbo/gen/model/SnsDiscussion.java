package com.qinjiangbo.gen.model;

import java.io.Serializable;
import java.util.Date;

public class SnsDiscussion implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sns_discussion.discussion_id
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private Long discussionId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sns_discussion.topic_id
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private Long topicId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sns_discussion.topic_type
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private Integer topicType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sns_discussion.user_id
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private Long userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sns_discussion.dis_content
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private String disContent;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sns_discussion.id_reply
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private Long idReply;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sns_discussion.time_discussion
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private Date timeDiscussion;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sns_discussion.time_update
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private Date timeUpdate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sns_discussion
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sns_discussion.discussion_id
     *
     * @return the value of sns_discussion.discussion_id
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public Long getDiscussionId() {
        return discussionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sns_discussion.discussion_id
     *
     * @param discussionId the value for sns_discussion.discussion_id
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setDiscussionId(Long discussionId) {
        this.discussionId = discussionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sns_discussion.topic_id
     *
     * @return the value of sns_discussion.topic_id
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public Long getTopicId() {
        return topicId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sns_discussion.topic_id
     *
     * @param topicId the value for sns_discussion.topic_id
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setTopicId(Long topicId) {
        this.topicId = topicId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sns_discussion.topic_type
     *
     * @return the value of sns_discussion.topic_type
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public Integer getTopicType() {
        return topicType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sns_discussion.topic_type
     *
     * @param topicType the value for sns_discussion.topic_type
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setTopicType(Integer topicType) {
        this.topicType = topicType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sns_discussion.user_id
     *
     * @return the value of sns_discussion.user_id
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sns_discussion.user_id
     *
     * @param userId the value for sns_discussion.user_id
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sns_discussion.dis_content
     *
     * @return the value of sns_discussion.dis_content
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public String getDisContent() {
        return disContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sns_discussion.dis_content
     *
     * @param disContent the value for sns_discussion.dis_content
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setDisContent(String disContent) {
        this.disContent = disContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sns_discussion.id_reply
     *
     * @return the value of sns_discussion.id_reply
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public Long getIdReply() {
        return idReply;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sns_discussion.id_reply
     *
     * @param idReply the value for sns_discussion.id_reply
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setIdReply(Long idReply) {
        this.idReply = idReply;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sns_discussion.time_discussion
     *
     * @return the value of sns_discussion.time_discussion
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public Date getTimeDiscussion() {
        return timeDiscussion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sns_discussion.time_discussion
     *
     * @param timeDiscussion the value for sns_discussion.time_discussion
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setTimeDiscussion(Date timeDiscussion) {
        this.timeDiscussion = timeDiscussion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sns_discussion.time_update
     *
     * @return the value of sns_discussion.time_update
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public Date getTimeUpdate() {
        return timeUpdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sns_discussion.time_update
     *
     * @param timeUpdate the value for sns_discussion.time_update
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setTimeUpdate(Date timeUpdate) {
        this.timeUpdate = timeUpdate;
    }
}