package com.qinjiangbo.gen.model;

import java.io.Serializable;
import java.util.Date;

public class GoodsYwMapping implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods_yw_mapping.map_id
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private Long mapId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods_yw_mapping.goods_id
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private Long goodsId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods_yw_mapping.yw_name
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private String ywName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods_yw_mapping.yw_id
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private String ywId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods_yw_mapping.update_time
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table goods_yw_mapping
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods_yw_mapping.map_id
     *
     * @return the value of goods_yw_mapping.map_id
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public Long getMapId() {
        return mapId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods_yw_mapping.map_id
     *
     * @param mapId the value for goods_yw_mapping.map_id
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setMapId(Long mapId) {
        this.mapId = mapId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods_yw_mapping.goods_id
     *
     * @return the value of goods_yw_mapping.goods_id
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public Long getGoodsId() {
        return goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods_yw_mapping.goods_id
     *
     * @param goodsId the value for goods_yw_mapping.goods_id
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods_yw_mapping.yw_name
     *
     * @return the value of goods_yw_mapping.yw_name
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public String getYwName() {
        return ywName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods_yw_mapping.yw_name
     *
     * @param ywName the value for goods_yw_mapping.yw_name
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setYwName(String ywName) {
        this.ywName = ywName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods_yw_mapping.yw_id
     *
     * @return the value of goods_yw_mapping.yw_id
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public String getYwId() {
        return ywId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods_yw_mapping.yw_id
     *
     * @param ywId the value for goods_yw_mapping.yw_id
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setYwId(String ywId) {
        this.ywId = ywId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods_yw_mapping.update_time
     *
     * @return the value of goods_yw_mapping.update_time
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods_yw_mapping.update_time
     *
     * @param updateTime the value for goods_yw_mapping.update_time
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}