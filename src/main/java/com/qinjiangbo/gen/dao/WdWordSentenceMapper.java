package com.qinjiangbo.gen.dao;

import com.qinjiangbo.gen.model.WdWordSentence;
import com.qinjiangbo.gen.model.WdWordSentenceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WdWordSentenceMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_word_sentence
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int countByExample(WdWordSentenceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_word_sentence
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int deleteByExample(WdWordSentenceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_word_sentence
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int deleteByPrimaryKey(Long senId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_word_sentence
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int insert(WdWordSentence record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_word_sentence
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int insertSelective(WdWordSentence record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_word_sentence
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    List<WdWordSentence> selectByExample(WdWordSentenceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_word_sentence
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    WdWordSentence selectByPrimaryKey(Long senId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_word_sentence
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByExampleSelective(@Param("record") WdWordSentence record, @Param("example") WdWordSentenceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_word_sentence
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByExample(@Param("record") WdWordSentence record, @Param("example") WdWordSentenceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_word_sentence
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByPrimaryKeySelective(WdWordSentence record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_word_sentence
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByPrimaryKey(WdWordSentence record);
}