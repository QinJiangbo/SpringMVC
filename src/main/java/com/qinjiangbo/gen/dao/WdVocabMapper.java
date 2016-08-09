package com.qinjiangbo.gen.dao;

import com.qinjiangbo.gen.model.WdVocab;
import com.qinjiangbo.gen.model.WdVocabExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WdVocabMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_vocab
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int countByExample(WdVocabExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_vocab
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int deleteByExample(WdVocabExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_vocab
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int deleteByPrimaryKey(Long vid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_vocab
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int insert(WdVocab record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_vocab
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int insertSelective(WdVocab record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_vocab
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    List<WdVocab> selectByExample(WdVocabExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_vocab
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    WdVocab selectByPrimaryKey(Long vid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_vocab
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByExampleSelective(@Param("record") WdVocab record, @Param("example") WdVocabExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_vocab
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByExample(@Param("record") WdVocab record, @Param("example") WdVocabExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_vocab
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByPrimaryKeySelective(WdVocab record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_vocab
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByPrimaryKey(WdVocab record);
}