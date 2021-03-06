package com.qinjiangbo.gen.dao;

import com.qinjiangbo.gen.model.RegsatPayrefund;
import com.qinjiangbo.gen.model.RegsatPayrefundExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RegsatPayrefundMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regsat_payrefund
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int countByExample(RegsatPayrefundExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regsat_payrefund
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int deleteByExample(RegsatPayrefundExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regsat_payrefund
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int deleteByPrimaryKey(Long refId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regsat_payrefund
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int insert(RegsatPayrefund record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regsat_payrefund
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int insertSelective(RegsatPayrefund record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regsat_payrefund
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    List<RegsatPayrefund> selectByExample(RegsatPayrefundExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regsat_payrefund
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    RegsatPayrefund selectByPrimaryKey(Long refId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regsat_payrefund
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByExampleSelective(@Param("record") RegsatPayrefund record, @Param("example") RegsatPayrefundExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regsat_payrefund
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByExample(@Param("record") RegsatPayrefund record, @Param("example") RegsatPayrefundExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regsat_payrefund
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByPrimaryKeySelective(RegsatPayrefund record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regsat_payrefund
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByPrimaryKey(RegsatPayrefund record);
}