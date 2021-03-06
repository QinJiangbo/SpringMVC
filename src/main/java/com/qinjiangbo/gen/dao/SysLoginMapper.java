package com.qinjiangbo.gen.dao;

import com.qinjiangbo.gen.model.SysLogin;
import com.qinjiangbo.gen.model.SysLoginExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysLoginMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_login
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int countByExample(SysLoginExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_login
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int deleteByExample(SysLoginExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_login
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int deleteByPrimaryKey(Long dbid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_login
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int insert(SysLogin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_login
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int insertSelective(SysLogin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_login
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    List<SysLogin> selectByExample(SysLoginExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_login
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    SysLogin selectByPrimaryKey(Long dbid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_login
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByExampleSelective(@Param("record") SysLogin record, @Param("example") SysLoginExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_login
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByExample(@Param("record") SysLogin record, @Param("example") SysLoginExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_login
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByPrimaryKeySelective(SysLogin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_login
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByPrimaryKey(SysLogin record);
}