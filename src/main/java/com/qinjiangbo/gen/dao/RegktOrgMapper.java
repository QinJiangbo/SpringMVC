package com.qinjiangbo.gen.dao;

import com.qinjiangbo.gen.model.RegktOrg;
import com.qinjiangbo.gen.model.RegktOrgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RegktOrgMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regkt_org
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int countByExample(RegktOrgExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regkt_org
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int deleteByExample(RegktOrgExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regkt_org
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int insert(RegktOrg record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regkt_org
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int insertSelective(RegktOrg record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regkt_org
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    List<RegktOrg> selectByExample(RegktOrgExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regkt_org
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByExampleSelective(@Param("record") RegktOrg record, @Param("example") RegktOrgExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regkt_org
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByExample(@Param("record") RegktOrg record, @Param("example") RegktOrgExample example);
}