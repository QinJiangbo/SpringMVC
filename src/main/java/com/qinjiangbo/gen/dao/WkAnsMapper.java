package com.qinjiangbo.gen.dao;

import com.qinjiangbo.gen.model.WkAns;
import com.qinjiangbo.gen.model.WkAnsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WkAnsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wk_ans
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int countByExample(WkAnsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wk_ans
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int deleteByExample(WkAnsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wk_ans
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int deleteByPrimaryKey(Long ansId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wk_ans
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int insert(WkAns record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wk_ans
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int insertSelective(WkAns record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wk_ans
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    List<WkAns> selectByExample(WkAnsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wk_ans
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    WkAns selectByPrimaryKey(Long ansId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wk_ans
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByExampleSelective(@Param("record") WkAns record, @Param("example") WkAnsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wk_ans
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByExample(@Param("record") WkAns record, @Param("example") WkAnsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wk_ans
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByPrimaryKeySelective(WkAns record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wk_ans
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByPrimaryKey(WkAns record);
}