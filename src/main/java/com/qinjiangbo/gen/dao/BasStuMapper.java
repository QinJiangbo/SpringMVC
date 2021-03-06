package com.qinjiangbo.gen.dao;

import com.qinjiangbo.gen.model.BasStu;
import com.qinjiangbo.gen.model.BasStuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BasStuMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bas_stu
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int countByExample(BasStuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bas_stu
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int deleteByExample(BasStuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bas_stu
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int deleteByPrimaryKey(Long stuId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bas_stu
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int insert(BasStu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bas_stu
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int insertSelective(BasStu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bas_stu
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    List<BasStu> selectByExample(BasStuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bas_stu
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    BasStu selectByPrimaryKey(Long stuId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bas_stu
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int updateByExampleSelective(@Param("record") BasStu record, @Param("example") BasStuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bas_stu
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int updateByExample(@Param("record") BasStu record, @Param("example") BasStuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bas_stu
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int updateByPrimaryKeySelective(BasStu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bas_stu
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int updateByPrimaryKey(BasStu record);
}