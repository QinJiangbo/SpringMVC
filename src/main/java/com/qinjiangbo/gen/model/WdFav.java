package com.qinjiangbo.gen.model;

import java.io.Serializable;
import java.util.Date;

public class WdFav extends WdFavKey implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wd_fav.time_update
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private Date timeUpdate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table wd_fav
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wd_fav.time_update
     *
     * @return the value of wd_fav.time_update
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public Date getTimeUpdate() {
        return timeUpdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wd_fav.time_update
     *
     * @param timeUpdate the value for wd_fav.time_update
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setTimeUpdate(Date timeUpdate) {
        this.timeUpdate = timeUpdate;
    }
}