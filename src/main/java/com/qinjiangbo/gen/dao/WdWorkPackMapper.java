package com.qinjiangbo.gen.dao;

import com.qinjiangbo.gen.model.WdWorkPack;
import com.qinjiangbo.gen.model.WdWorkPackExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WdWorkPackMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_work_pack
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int countByExample(WdWorkPackExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_work_pack
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int deleteByExample(WdWorkPackExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_work_pack
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int deleteByPrimaryKey(Long wwpId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_work_pack
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int insert(WdWorkPack record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_work_pack
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int insertSelective(WdWorkPack record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_work_pack
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    List<WdWorkPack> selectByExample(WdWorkPackExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_work_pack
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    WdWorkPack selectByPrimaryKey(Long wwpId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_work_pack
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByExampleSelective(@Param("record") WdWorkPack record, @Param("example") WdWorkPackExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_work_pack
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByExample(@Param("record") WdWorkPack record, @Param("example") WdWorkPackExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_work_pack
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByPrimaryKeySelective(WdWorkPack record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_work_pack
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByPrimaryKey(WdWorkPack record);
}