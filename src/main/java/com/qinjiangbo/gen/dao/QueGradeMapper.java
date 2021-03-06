package com.qinjiangbo.gen.dao;

import com.qinjiangbo.gen.model.QueGrade;
import com.qinjiangbo.gen.model.QueGradeExample;
import com.qinjiangbo.gen.model.QueGradeKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QueGradeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table que_grade
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int countByExample(QueGradeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table que_grade
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int deleteByExample(QueGradeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table que_grade
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int deleteByPrimaryKey(QueGradeKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table que_grade
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int insert(QueGrade record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table que_grade
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int insertSelective(QueGrade record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table que_grade
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    List<QueGrade> selectByExample(QueGradeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table que_grade
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    QueGrade selectByPrimaryKey(QueGradeKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table que_grade
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByExampleSelective(@Param("record") QueGrade record, @Param("example") QueGradeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table que_grade
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByExample(@Param("record") QueGrade record, @Param("example") QueGradeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table que_grade
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByPrimaryKeySelective(QueGrade record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table que_grade
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByPrimaryKey(QueGrade record);
}