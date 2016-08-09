package com.qinjiangbo.gen.dao;

import com.qinjiangbo.gen.model.RegsatPay;
import com.qinjiangbo.gen.model.RegsatPayExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RegsatPayMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regsat_pay
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int countByExample(RegsatPayExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regsat_pay
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int deleteByExample(RegsatPayExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regsat_pay
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int deleteByPrimaryKey(Long payId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regsat_pay
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int insert(RegsatPay record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regsat_pay
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int insertSelective(RegsatPay record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regsat_pay
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    List<RegsatPay> selectByExample(RegsatPayExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regsat_pay
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    RegsatPay selectByPrimaryKey(Long payId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regsat_pay
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByExampleSelective(@Param("record") RegsatPay record, @Param("example") RegsatPayExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regsat_pay
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByExample(@Param("record") RegsatPay record, @Param("example") RegsatPayExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regsat_pay
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByPrimaryKeySelective(RegsatPay record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regsat_pay
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByPrimaryKey(RegsatPay record);
}