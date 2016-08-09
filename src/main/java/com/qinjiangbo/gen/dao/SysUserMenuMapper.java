package com.qinjiangbo.gen.dao;

import com.qinjiangbo.gen.model.SysUserMenu;
import com.qinjiangbo.gen.model.SysUserMenuExample;
import com.qinjiangbo.gen.model.SysUserMenuKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysUserMenuMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_menu
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int countByExample(SysUserMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_menu
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int deleteByExample(SysUserMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_menu
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int deleteByPrimaryKey(SysUserMenuKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_menu
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int insert(SysUserMenu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_menu
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int insertSelective(SysUserMenu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_menu
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    List<SysUserMenu> selectByExample(SysUserMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_menu
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    SysUserMenu selectByPrimaryKey(SysUserMenuKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_menu
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByExampleSelective(@Param("record") SysUserMenu record, @Param("example") SysUserMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_menu
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByExample(@Param("record") SysUserMenu record, @Param("example") SysUserMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_menu
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByPrimaryKeySelective(SysUserMenu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_menu
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByPrimaryKey(SysUserMenu record);
}