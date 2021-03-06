package com.qinjiangbo.gen.dao;

import com.qinjiangbo.gen.model.RegktKt;
import com.qinjiangbo.gen.model.RegktKtExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RegktKtMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regkt_kt
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int countByExample(RegktKtExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regkt_kt
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int deleteByExample(RegktKtExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regkt_kt
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int insert(RegktKt record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regkt_kt
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int insertSelective(RegktKt record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regkt_kt
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    List<RegktKt> selectByExample(RegktKtExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regkt_kt
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByExampleSelective(@Param("record") RegktKt record, @Param("example") RegktKtExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regkt_kt
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByExample(@Param("record") RegktKt record, @Param("example") RegktKtExample example);
}