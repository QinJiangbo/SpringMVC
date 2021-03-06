package com.qinjiangbo.gen.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class CwGoods implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cw_goods.goods_id
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private Long goodsId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cw_goods.goods_type
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private Integer goodsType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cw_goods.goods_title
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private String goodsTitle;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cw_goods.goods_desc
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private String goodsDesc;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cw_goods.price
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private BigDecimal price;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cw_goods.price_type
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private Integer priceType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cw_goods.discount
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private BigDecimal discount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cw_goods.status
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private Integer status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cw_goods.goods_owner
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private Long goodsOwner;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cw_goods.owner_type
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private Integer ownerType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cw_goods.res_id
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private String resId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cw_goods.img_id
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private String imgId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cw_goods.num_buy
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private Long numBuy;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cw_goods.num_support
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private Long numSupport;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cw_goods.num_oppose
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private Long numOppose;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cw_goods.update_time
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table cw_goods
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cw_goods.goods_id
     *
     * @return the value of cw_goods.goods_id
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public Long getGoodsId() {
        return goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cw_goods.goods_id
     *
     * @param goodsId the value for cw_goods.goods_id
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cw_goods.goods_type
     *
     * @return the value of cw_goods.goods_type
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public Integer getGoodsType() {
        return goodsType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cw_goods.goods_type
     *
     * @param goodsType the value for cw_goods.goods_type
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setGoodsType(Integer goodsType) {
        this.goodsType = goodsType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cw_goods.goods_title
     *
     * @return the value of cw_goods.goods_title
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public String getGoodsTitle() {
        return goodsTitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cw_goods.goods_title
     *
     * @param goodsTitle the value for cw_goods.goods_title
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setGoodsTitle(String goodsTitle) {
        this.goodsTitle = goodsTitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cw_goods.goods_desc
     *
     * @return the value of cw_goods.goods_desc
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public String getGoodsDesc() {
        return goodsDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cw_goods.goods_desc
     *
     * @param goodsDesc the value for cw_goods.goods_desc
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setGoodsDesc(String goodsDesc) {
        this.goodsDesc = goodsDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cw_goods.price
     *
     * @return the value of cw_goods.price
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cw_goods.price
     *
     * @param price the value for cw_goods.price
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cw_goods.price_type
     *
     * @return the value of cw_goods.price_type
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public Integer getPriceType() {
        return priceType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cw_goods.price_type
     *
     * @param priceType the value for cw_goods.price_type
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setPriceType(Integer priceType) {
        this.priceType = priceType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cw_goods.discount
     *
     * @return the value of cw_goods.discount
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public BigDecimal getDiscount() {
        return discount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cw_goods.discount
     *
     * @param discount the value for cw_goods.discount
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cw_goods.status
     *
     * @return the value of cw_goods.status
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cw_goods.status
     *
     * @param status the value for cw_goods.status
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cw_goods.goods_owner
     *
     * @return the value of cw_goods.goods_owner
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public Long getGoodsOwner() {
        return goodsOwner;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cw_goods.goods_owner
     *
     * @param goodsOwner the value for cw_goods.goods_owner
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setGoodsOwner(Long goodsOwner) {
        this.goodsOwner = goodsOwner;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cw_goods.owner_type
     *
     * @return the value of cw_goods.owner_type
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public Integer getOwnerType() {
        return ownerType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cw_goods.owner_type
     *
     * @param ownerType the value for cw_goods.owner_type
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setOwnerType(Integer ownerType) {
        this.ownerType = ownerType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cw_goods.res_id
     *
     * @return the value of cw_goods.res_id
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public String getResId() {
        return resId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cw_goods.res_id
     *
     * @param resId the value for cw_goods.res_id
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setResId(String resId) {
        this.resId = resId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cw_goods.img_id
     *
     * @return the value of cw_goods.img_id
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public String getImgId() {
        return imgId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cw_goods.img_id
     *
     * @param imgId the value for cw_goods.img_id
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setImgId(String imgId) {
        this.imgId = imgId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cw_goods.num_buy
     *
     * @return the value of cw_goods.num_buy
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public Long getNumBuy() {
        return numBuy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cw_goods.num_buy
     *
     * @param numBuy the value for cw_goods.num_buy
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setNumBuy(Long numBuy) {
        this.numBuy = numBuy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cw_goods.num_support
     *
     * @return the value of cw_goods.num_support
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public Long getNumSupport() {
        return numSupport;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cw_goods.num_support
     *
     * @param numSupport the value for cw_goods.num_support
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setNumSupport(Long numSupport) {
        this.numSupport = numSupport;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cw_goods.num_oppose
     *
     * @return the value of cw_goods.num_oppose
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public Long getNumOppose() {
        return numOppose;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cw_goods.num_oppose
     *
     * @param numOppose the value for cw_goods.num_oppose
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setNumOppose(Long numOppose) {
        this.numOppose = numOppose;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cw_goods.update_time
     *
     * @return the value of cw_goods.update_time
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cw_goods.update_time
     *
     * @param updateTime the value for cw_goods.update_time
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}