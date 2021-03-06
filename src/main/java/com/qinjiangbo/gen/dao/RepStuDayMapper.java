package com.qinjiangbo.gen.dao;

import com.qinjiangbo.gen.model.RepStuDay;
import com.qinjiangbo.gen.model.RepStuDayExample;
import com.qinjiangbo.gen.model.RepStuDayKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RepStuDayMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rep_stu_day
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int countByExample(RepStuDayExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rep_stu_day
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int deleteByExample(RepStuDayExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rep_stu_day
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int deleteByPrimaryKey(RepStuDayKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rep_stu_day
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int insert(RepStuDay record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rep_stu_day
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int insertSelective(RepStuDay record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rep_stu_day
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    List<RepStuDay> selectByExample(RepStuDayExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rep_stu_day
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    RepStuDay selectByPrimaryKey(RepStuDayKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rep_stu_day
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByExampleSelective(@Param("record") RepStuDay record, @Param("example") RepStuDayExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rep_stu_day
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByExample(@Param("record") RepStuDay record, @Param("example") RepStuDayExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rep_stu_day
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByPrimaryKeySelective(RepStuDay record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rep_stu_day
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByPrimaryKey(RepStuDay record);
}