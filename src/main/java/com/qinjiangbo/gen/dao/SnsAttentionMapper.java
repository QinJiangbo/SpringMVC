package com.qinjiangbo.gen.dao;

import com.qinjiangbo.gen.model.SnsAttention;
import com.qinjiangbo.gen.model.SnsAttentionExample;
import com.qinjiangbo.gen.model.SnsAttentionKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SnsAttentionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sns_attention
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int countByExample(SnsAttentionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sns_attention
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int deleteByExample(SnsAttentionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sns_attention
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int deleteByPrimaryKey(SnsAttentionKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sns_attention
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int insert(SnsAttention record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sns_attention
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int insertSelective(SnsAttention record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sns_attention
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    List<SnsAttention> selectByExample(SnsAttentionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sns_attention
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    SnsAttention selectByPrimaryKey(SnsAttentionKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sns_attention
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByExampleSelective(@Param("record") SnsAttention record, @Param("example") SnsAttentionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sns_attention
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByExample(@Param("record") SnsAttention record, @Param("example") SnsAttentionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sns_attention
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByPrimaryKeySelective(SnsAttention record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sns_attention
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByPrimaryKey(SnsAttention record);
}