package com.qinjiangbo.gen.dao;

import com.qinjiangbo.gen.model.RegLoop;
import com.qinjiangbo.gen.model.RegLoopExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RegLoopMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table reg_loop
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int countByExample(RegLoopExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table reg_loop
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int deleteByExample(RegLoopExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table reg_loop
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int deleteByPrimaryKey(Long loopId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table reg_loop
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int insert(RegLoop record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table reg_loop
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int insertSelective(RegLoop record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table reg_loop
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    List<RegLoop> selectByExample(RegLoopExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table reg_loop
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    RegLoop selectByPrimaryKey(Long loopId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table reg_loop
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByExampleSelective(@Param("record") RegLoop record, @Param("example") RegLoopExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table reg_loop
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByExample(@Param("record") RegLoop record, @Param("example") RegLoopExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table reg_loop
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByPrimaryKeySelective(RegLoop record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table reg_loop
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByPrimaryKey(RegLoop record);
}