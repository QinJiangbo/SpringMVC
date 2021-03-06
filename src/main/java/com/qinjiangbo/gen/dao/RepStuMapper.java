package com.qinjiangbo.gen.dao;

import com.qinjiangbo.gen.model.RepStu;
import com.qinjiangbo.gen.model.RepStuExample;
import com.qinjiangbo.gen.model.RepStuKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RepStuMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rep_stu
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int countByExample(RepStuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rep_stu
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int deleteByExample(RepStuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rep_stu
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int deleteByPrimaryKey(RepStuKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rep_stu
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int insert(RepStu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rep_stu
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int insertSelective(RepStu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rep_stu
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    List<RepStu> selectByExample(RepStuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rep_stu
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    RepStu selectByPrimaryKey(RepStuKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rep_stu
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByExampleSelective(@Param("record") RepStu record, @Param("example") RepStuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rep_stu
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByExample(@Param("record") RepStu record, @Param("example") RepStuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rep_stu
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByPrimaryKeySelective(RepStu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rep_stu
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByPrimaryKey(RepStu record);
}