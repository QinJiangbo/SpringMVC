package com.qinjiangbo.gen.dao;

import com.qinjiangbo.gen.model.QueQuestionAttr;
import com.qinjiangbo.gen.model.QueQuestionAttrExample;
import com.qinjiangbo.gen.model.QueQuestionAttrKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QueQuestionAttrMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table que_question_attr
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int countByExample(QueQuestionAttrExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table que_question_attr
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int deleteByExample(QueQuestionAttrExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table que_question_attr
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int deleteByPrimaryKey(QueQuestionAttrKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table que_question_attr
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int insert(QueQuestionAttr record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table que_question_attr
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int insertSelective(QueQuestionAttr record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table que_question_attr
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    List<QueQuestionAttr> selectByExample(QueQuestionAttrExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table que_question_attr
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    QueQuestionAttr selectByPrimaryKey(QueQuestionAttrKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table que_question_attr
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByExampleSelective(@Param("record") QueQuestionAttr record, @Param("example") QueQuestionAttrExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table que_question_attr
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByExample(@Param("record") QueQuestionAttr record, @Param("example") QueQuestionAttrExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table que_question_attr
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByPrimaryKeySelective(QueQuestionAttr record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table que_question_attr
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByPrimaryKey(QueQuestionAttr record);
}