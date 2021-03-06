package com.qinjiangbo.gen.dao;

import com.qinjiangbo.gen.model.PayAudit;
import com.qinjiangbo.gen.model.PayAuditExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PayAuditMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_audit
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int countByExample(PayAuditExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_audit
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int deleteByExample(PayAuditExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_audit
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int deleteByPrimaryKey(Long auditId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_audit
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int insert(PayAudit record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_audit
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int insertSelective(PayAudit record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_audit
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    List<PayAudit> selectByExample(PayAuditExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_audit
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    PayAudit selectByPrimaryKey(Long auditId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_audit
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int updateByExampleSelective(@Param("record") PayAudit record, @Param("example") PayAuditExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_audit
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int updateByExample(@Param("record") PayAudit record, @Param("example") PayAuditExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_audit
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int updateByPrimaryKeySelective(PayAudit record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_audit
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int updateByPrimaryKey(PayAudit record);
}