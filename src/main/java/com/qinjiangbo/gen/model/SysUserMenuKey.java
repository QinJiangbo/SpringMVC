package com.qinjiangbo.gen.model;

import java.io.Serializable;

public class SysUserMenuKey implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user_menu.user_id
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private Long userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user_menu.menu_id
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private Long menuId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sys_user_menu
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user_menu.user_id
     *
     * @return the value of sys_user_menu.user_id
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user_menu.user_id
     *
     * @param userId the value for sys_user_menu.user_id
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user_menu.menu_id
     *
     * @return the value of sys_user_menu.menu_id
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public Long getMenuId() {
        return menuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user_menu.menu_id
     *
     * @param menuId the value for sys_user_menu.menu_id
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setMenuId(Long menuId) {
        this.menuId = menuId;
    }
}