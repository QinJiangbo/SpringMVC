package com.qinjiangbo.gen.dao;

import com.qinjiangbo.gen.model.WdVocabDet;
import com.qinjiangbo.gen.model.WdVocabDetExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WdVocabDetMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_vocab_det
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int countByExample(WdVocabDetExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_vocab_det
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int deleteByExample(WdVocabDetExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_vocab_det
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int deleteByPrimaryKey(Long vdetId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_vocab_det
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int insert(WdVocabDet record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_vocab_det
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int insertSelective(WdVocabDet record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_vocab_det
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    List<WdVocabDet> selectByExample(WdVocabDetExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_vocab_det
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    WdVocabDet selectByPrimaryKey(Long vdetId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_vocab_det
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByExampleSelective(@Param("record") WdVocabDet record, @Param("example") WdVocabDetExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_vocab_det
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByExample(@Param("record") WdVocabDet record, @Param("example") WdVocabDetExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_vocab_det
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByPrimaryKeySelective(WdVocabDet record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_vocab_det
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByPrimaryKey(WdVocabDet record);
}