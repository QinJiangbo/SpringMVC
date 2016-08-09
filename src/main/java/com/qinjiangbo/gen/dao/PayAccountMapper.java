package com.qinjiangbo.gen.dao;

import com.qinjiangbo.gen.model.PayAccount;
import com.qinjiangbo.gen.model.PayAccountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PayAccountMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_account
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int countByExample(PayAccountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_account
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int deleteByExample(PayAccountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_account
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int deleteByPrimaryKey(Long payId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_account
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int insert(PayAccount record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_account
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int insertSelective(PayAccount record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_account
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    List<PayAccount> selectByExample(PayAccountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_account
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    PayAccount selectByPrimaryKey(Long payId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_account
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int updateByExampleSelective(@Param("record") PayAccount record, @Param("example") PayAccountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_account
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int updateByExample(@Param("record") PayAccount record, @Param("example") PayAccountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_account
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int updateByPrimaryKeySelective(PayAccount record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_account
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int updateByPrimaryKey(PayAccount record);
}