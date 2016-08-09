package com.qinjiangbo.gen.dao;

import com.qinjiangbo.gen.model.PayAuditDet;
import com.qinjiangbo.gen.model.PayAuditDetExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PayAuditDetMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_audit_det
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int countByExample(PayAuditDetExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_audit_det
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int deleteByExample(PayAuditDetExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_audit_det
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int deleteByPrimaryKey(Long detId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_audit_det
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int insert(PayAuditDet record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_audit_det
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int insertSelective(PayAuditDet record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_audit_det
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    List<PayAuditDet> selectByExample(PayAuditDetExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_audit_det
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    PayAuditDet selectByPrimaryKey(Long detId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_audit_det
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int updateByExampleSelective(@Param("record") PayAuditDet record, @Param("example") PayAuditDetExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_audit_det
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int updateByExample(@Param("record") PayAuditDet record, @Param("example") PayAuditDetExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_audit_det
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int updateByPrimaryKeySelective(PayAuditDet record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_audit_det
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int updateByPrimaryKey(PayAuditDet record);
}