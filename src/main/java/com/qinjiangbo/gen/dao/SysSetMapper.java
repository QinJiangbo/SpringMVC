package com.qinjiangbo.gen.dao;

import com.qinjiangbo.gen.model.SysSet;
import com.qinjiangbo.gen.model.SysSetExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysSetMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_set
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int countByExample(SysSetExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_set
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int deleteByExample(SysSetExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_set
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int deleteByPrimaryKey(String skey);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_set
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int insert(SysSet record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_set
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int insertSelective(SysSet record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_set
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    List<SysSet> selectByExample(SysSetExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_set
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    SysSet selectByPrimaryKey(String skey);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_set
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByExampleSelective(@Param("record") SysSet record, @Param("example") SysSetExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_set
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByExample(@Param("record") SysSet record, @Param("example") SysSetExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_set
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByPrimaryKeySelective(SysSet record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_set
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByPrimaryKey(SysSet record);
}