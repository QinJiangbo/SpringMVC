package com.qinjiangbo.gen.dao;

import com.qinjiangbo.gen.model.SnsDiscussion;
import com.qinjiangbo.gen.model.SnsDiscussionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SnsDiscussionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sns_discussion
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int countByExample(SnsDiscussionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sns_discussion
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int deleteByExample(SnsDiscussionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sns_discussion
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int deleteByPrimaryKey(Long discussionId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sns_discussion
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int insert(SnsDiscussion record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sns_discussion
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int insertSelective(SnsDiscussion record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sns_discussion
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    List<SnsDiscussion> selectByExample(SnsDiscussionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sns_discussion
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    SnsDiscussion selectByPrimaryKey(Long discussionId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sns_discussion
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByExampleSelective(@Param("record") SnsDiscussion record, @Param("example") SnsDiscussionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sns_discussion
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByExample(@Param("record") SnsDiscussion record, @Param("example") SnsDiscussionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sns_discussion
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByPrimaryKeySelective(SnsDiscussion record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sns_discussion
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByPrimaryKey(SnsDiscussion record);
}