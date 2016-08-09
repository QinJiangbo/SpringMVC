package com.qinjiangbo.gen.dao;

import com.qinjiangbo.gen.model.RegktKtPlan;
import com.qinjiangbo.gen.model.RegktKtPlanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RegktKtPlanMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regkt_kt_plan
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int countByExample(RegktKtPlanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regkt_kt_plan
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int deleteByExample(RegktKtPlanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regkt_kt_plan
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int insert(RegktKtPlan record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regkt_kt_plan
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int insertSelective(RegktKtPlan record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regkt_kt_plan
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    List<RegktKtPlan> selectByExample(RegktKtPlanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regkt_kt_plan
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByExampleSelective(@Param("record") RegktKtPlan record, @Param("example") RegktKtPlanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regkt_kt_plan
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByExample(@Param("record") RegktKtPlan record, @Param("example") RegktKtPlanExample example);
}