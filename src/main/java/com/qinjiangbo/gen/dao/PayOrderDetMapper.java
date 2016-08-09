package com.qinjiangbo.gen.dao;

import com.qinjiangbo.gen.model.PayOrderDet;
import com.qinjiangbo.gen.model.PayOrderDetExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PayOrderDetMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_order_det
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int countByExample(PayOrderDetExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_order_det
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int deleteByExample(PayOrderDetExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_order_det
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int deleteByPrimaryKey(Long detId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_order_det
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int insert(PayOrderDet record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_order_det
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int insertSelective(PayOrderDet record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_order_det
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    List<PayOrderDet> selectByExample(PayOrderDetExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_order_det
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    PayOrderDet selectByPrimaryKey(Long detId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_order_det
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int updateByExampleSelective(@Param("record") PayOrderDet record, @Param("example") PayOrderDetExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_order_det
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int updateByExample(@Param("record") PayOrderDet record, @Param("example") PayOrderDetExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_order_det
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int updateByPrimaryKeySelective(PayOrderDet record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_order_det
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int updateByPrimaryKey(PayOrderDet record);
}