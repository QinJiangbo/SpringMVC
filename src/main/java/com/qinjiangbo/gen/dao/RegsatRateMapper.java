package com.qinjiangbo.gen.dao;

import com.qinjiangbo.gen.model.RegsatRate;
import com.qinjiangbo.gen.model.RegsatRateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RegsatRateMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regsat_rate
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int countByExample(RegsatRateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regsat_rate
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int deleteByExample(RegsatRateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regsat_rate
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int deleteByPrimaryKey(String rateCode);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regsat_rate
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int insert(RegsatRate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regsat_rate
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int insertSelective(RegsatRate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regsat_rate
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    List<RegsatRate> selectByExample(RegsatRateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regsat_rate
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    RegsatRate selectByPrimaryKey(String rateCode);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regsat_rate
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByExampleSelective(@Param("record") RegsatRate record, @Param("example") RegsatRateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regsat_rate
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByExample(@Param("record") RegsatRate record, @Param("example") RegsatRateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regsat_rate
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByPrimaryKeySelective(RegsatRate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regsat_rate
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByPrimaryKey(RegsatRate record);
}