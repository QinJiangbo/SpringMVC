package com.qinjiangbo.gen.dao;

import com.qinjiangbo.gen.model.RegtfCentMonth;
import com.qinjiangbo.gen.model.RegtfCentMonthExample;
import com.qinjiangbo.gen.model.RegtfCentMonthKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RegtfCentMonthMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regtf_cent_month
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int countByExample(RegtfCentMonthExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regtf_cent_month
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int deleteByExample(RegtfCentMonthExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regtf_cent_month
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int deleteByPrimaryKey(RegtfCentMonthKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regtf_cent_month
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int insert(RegtfCentMonth record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regtf_cent_month
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int insertSelective(RegtfCentMonth record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regtf_cent_month
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    List<RegtfCentMonth> selectByExample(RegtfCentMonthExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regtf_cent_month
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    RegtfCentMonth selectByPrimaryKey(RegtfCentMonthKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regtf_cent_month
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByExampleSelective(@Param("record") RegtfCentMonth record, @Param("example") RegtfCentMonthExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regtf_cent_month
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByExample(@Param("record") RegtfCentMonth record, @Param("example") RegtfCentMonthExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regtf_cent_month
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByPrimaryKeySelective(RegtfCentMonth record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regtf_cent_month
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByPrimaryKey(RegtfCentMonth record);
}