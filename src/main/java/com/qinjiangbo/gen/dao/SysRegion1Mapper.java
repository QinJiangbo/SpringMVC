package com.qinjiangbo.gen.dao;

import com.qinjiangbo.gen.model.SysRegion1;
import com.qinjiangbo.gen.model.SysRegion1Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysRegion1Mapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_region1
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int countByExample(SysRegion1Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_region1
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int deleteByExample(SysRegion1Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_region1
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int insert(SysRegion1 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_region1
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int insertSelective(SysRegion1 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_region1
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    List<SysRegion1> selectByExample(SysRegion1Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_region1
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByExampleSelective(@Param("record") SysRegion1 record, @Param("example") SysRegion1Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_region1
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByExample(@Param("record") SysRegion1 record, @Param("example") SysRegion1Example example);
}