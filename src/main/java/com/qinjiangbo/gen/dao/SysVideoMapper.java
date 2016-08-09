package com.qinjiangbo.gen.dao;

import com.qinjiangbo.gen.model.SysVideo;
import com.qinjiangbo.gen.model.SysVideoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysVideoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_video
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int countByExample(SysVideoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_video
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int deleteByExample(SysVideoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_video
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int deleteByPrimaryKey(String videoId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_video
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int insert(SysVideo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_video
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int insertSelective(SysVideo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_video
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    List<SysVideo> selectByExample(SysVideoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_video
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    SysVideo selectByPrimaryKey(String videoId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_video
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByExampleSelective(@Param("record") SysVideo record, @Param("example") SysVideoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_video
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByExample(@Param("record") SysVideo record, @Param("example") SysVideoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_video
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByPrimaryKeySelective(SysVideo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_video
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByPrimaryKey(SysVideo record);
}