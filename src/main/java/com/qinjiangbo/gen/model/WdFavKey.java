package com.qinjiangbo.gen.model;

import java.io.Serializable;

public class WdFavKey implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wd_fav.user_id
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private Long userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wd_fav.wid
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private Long wid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table wd_fav
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wd_fav.user_id
     *
     * @return the value of wd_fav.user_id
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wd_fav.user_id
     *
     * @param userId the value for wd_fav.user_id
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wd_fav.wid
     *
     * @return the value of wd_fav.wid
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public Long getWid() {
        return wid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wd_fav.wid
     *
     * @param wid the value for wd_fav.wid
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setWid(Long wid) {
        this.wid = wid;
    }
}