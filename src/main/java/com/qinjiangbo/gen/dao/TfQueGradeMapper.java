package com.qinjiangbo.gen.dao;

import com.qinjiangbo.gen.model.TfQueGrade;
import com.qinjiangbo.gen.model.TfQueGradeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TfQueGradeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tf_que_grade
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int countByExample(TfQueGradeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tf_que_grade
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int deleteByExample(TfQueGradeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tf_que_grade
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int insert(TfQueGrade record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tf_que_grade
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int insertSelective(TfQueGrade record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tf_que_grade
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    List<TfQueGrade> selectByExample(TfQueGradeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tf_que_grade
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByExampleSelective(@Param("record") TfQueGrade record, @Param("example") TfQueGradeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tf_que_grade
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByExample(@Param("record") TfQueGrade record, @Param("example") TfQueGradeExample example);
}