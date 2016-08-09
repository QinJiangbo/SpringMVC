package com.qinjiangbo.gen.dao;

import com.qinjiangbo.gen.model.PayCash;
import com.qinjiangbo.gen.model.PayCashExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PayCashMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_cash
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int countByExample(PayCashExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_cash
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int deleteByExample(PayCashExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_cash
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int deleteByPrimaryKey(Long cashId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_cash
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int insert(PayCash record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_cash
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int insertSelective(PayCash record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_cash
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    List<PayCash> selectByExample(PayCashExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_cash
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    PayCash selectByPrimaryKey(Long cashId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_cash
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int updateByExampleSelective(@Param("record") PayCash record, @Param("example") PayCashExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_cash
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int updateByExample(@Param("record") PayCash record, @Param("example") PayCashExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_cash
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int updateByPrimaryKeySelective(PayCash record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_cash
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int updateByPrimaryKey(PayCash record);
}