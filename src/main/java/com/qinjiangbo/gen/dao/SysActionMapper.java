package com.qinjiangbo.gen.dao;

import com.qinjiangbo.gen.model.SysAction;
import com.qinjiangbo.gen.model.SysActionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysActionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_action
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int countByExample(SysActionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_action
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int deleteByExample(SysActionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_action
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int deleteByPrimaryKey(Long logId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_action
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int insert(SysAction record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_action
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int insertSelective(SysAction record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_action
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    List<SysAction> selectByExample(SysActionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_action
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    SysAction selectByPrimaryKey(Long logId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_action
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByExampleSelective(@Param("record") SysAction record, @Param("example") SysActionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_action
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByExample(@Param("record") SysAction record, @Param("example") SysActionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_action
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByPrimaryKeySelective(SysAction record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_action
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByPrimaryKey(SysAction record);
}