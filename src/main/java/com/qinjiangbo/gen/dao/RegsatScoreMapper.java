package com.qinjiangbo.gen.dao;

import com.qinjiangbo.gen.model.RegsatScore;
import com.qinjiangbo.gen.model.RegsatScoreExample;
import com.qinjiangbo.gen.model.RegsatScoreKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RegsatScoreMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regsat_score
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int countByExample(RegsatScoreExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regsat_score
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int deleteByExample(RegsatScoreExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regsat_score
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int deleteByPrimaryKey(RegsatScoreKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regsat_score
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int insert(RegsatScore record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regsat_score
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int insertSelective(RegsatScore record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regsat_score
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    List<RegsatScore> selectByExample(RegsatScoreExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regsat_score
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    RegsatScore selectByPrimaryKey(RegsatScoreKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regsat_score
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByExampleSelective(@Param("record") RegsatScore record, @Param("example") RegsatScoreExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regsat_score
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByExample(@Param("record") RegsatScore record, @Param("example") RegsatScoreExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regsat_score
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByPrimaryKeySelective(RegsatScore record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regsat_score
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByPrimaryKey(RegsatScore record);
}