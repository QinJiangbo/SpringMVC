package com.qinjiangbo.gen.model;

import java.io.Serializable;

public class WkFavKey implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wk_fav.user_id
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private Long userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wk_fav.que_id
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private Long queId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table wk_fav
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wk_fav.user_id
     *
     * @return the value of wk_fav.user_id
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wk_fav.user_id
     *
     * @param userId the value for wk_fav.user_id
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wk_fav.que_id
     *
     * @return the value of wk_fav.que_id
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public Long getQueId() {
        return queId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wk_fav.que_id
     *
     * @param queId the value for wk_fav.que_id
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setQueId(Long queId) {
        this.queId = queId;
    }
}