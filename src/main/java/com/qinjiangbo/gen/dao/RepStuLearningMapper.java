package com.qinjiangbo.gen.dao;

import com.qinjiangbo.gen.model.RepStuLearning;
import com.qinjiangbo.gen.model.RepStuLearningExample;
import com.qinjiangbo.gen.model.RepStuLearningKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RepStuLearningMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rep_stu_learning
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int countByExample(RepStuLearningExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rep_stu_learning
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int deleteByExample(RepStuLearningExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rep_stu_learning
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int deleteByPrimaryKey(RepStuLearningKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rep_stu_learning
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int insert(RepStuLearning record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rep_stu_learning
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int insertSelective(RepStuLearning record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rep_stu_learning
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    List<RepStuLearning> selectByExample(RepStuLearningExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rep_stu_learning
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    RepStuLearning selectByPrimaryKey(RepStuLearningKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rep_stu_learning
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByExampleSelective(@Param("record") RepStuLearning record, @Param("example") RepStuLearningExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rep_stu_learning
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByExample(@Param("record") RepStuLearning record, @Param("example") RepStuLearningExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rep_stu_learning
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByPrimaryKeySelective(RepStuLearning record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rep_stu_learning
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByPrimaryKey(RepStuLearning record);
}