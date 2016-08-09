package com.qinjiangbo.gen.dao;

import com.qinjiangbo.gen.model.QueWord;
import com.qinjiangbo.gen.model.QueWordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QueWordMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table que_word
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int countByExample(QueWordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table que_word
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int deleteByExample(QueWordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table que_word
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int deleteByPrimaryKey(Long wid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table que_word
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int insert(QueWord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table que_word
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int insertSelective(QueWord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table que_word
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    List<QueWord> selectByExample(QueWordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table que_word
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    QueWord selectByPrimaryKey(Long wid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table que_word
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByExampleSelective(@Param("record") QueWord record, @Param("example") QueWordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table que_word
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByExample(@Param("record") QueWord record, @Param("example") QueWordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table que_word
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByPrimaryKeySelective(QueWord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table que_word
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByPrimaryKey(QueWord record);
}