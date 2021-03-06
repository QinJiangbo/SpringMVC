package com.qinjiangbo.gen.dao;

import com.qinjiangbo.gen.model.PayFund;
import com.qinjiangbo.gen.model.PayFundExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PayFundMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_fund
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int countByExample(PayFundExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_fund
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int deleteByExample(PayFundExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_fund
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int deleteByPrimaryKey(Long fundId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_fund
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int insert(PayFund record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_fund
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int insertSelective(PayFund record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_fund
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    List<PayFund> selectByExample(PayFundExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_fund
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    PayFund selectByPrimaryKey(Long fundId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_fund
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int updateByExampleSelective(@Param("record") PayFund record, @Param("example") PayFundExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_fund
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int updateByExample(@Param("record") PayFund record, @Param("example") PayFundExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_fund
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int updateByPrimaryKeySelective(PayFund record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_fund
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int updateByPrimaryKey(PayFund record);
}