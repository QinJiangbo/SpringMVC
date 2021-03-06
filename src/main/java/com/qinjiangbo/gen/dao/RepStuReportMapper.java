package com.qinjiangbo.gen.dao;

import com.qinjiangbo.gen.model.RepStuReport;
import com.qinjiangbo.gen.model.RepStuReportExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RepStuReportMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rep_stu_report
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int countByExample(RepStuReportExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rep_stu_report
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int deleteByExample(RepStuReportExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rep_stu_report
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int insert(RepStuReport record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rep_stu_report
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int insertSelective(RepStuReport record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rep_stu_report
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    List<RepStuReport> selectByExample(RepStuReportExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rep_stu_report
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByExampleSelective(@Param("record") RepStuReport record, @Param("example") RepStuReportExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rep_stu_report
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByExample(@Param("record") RepStuReport record, @Param("example") RepStuReportExample example);
}