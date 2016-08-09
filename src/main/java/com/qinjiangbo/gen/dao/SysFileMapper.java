package com.qinjiangbo.gen.dao;

import com.qinjiangbo.gen.model.SysFile;
import com.qinjiangbo.gen.model.SysFileExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysFileMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_file
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int countByExample(SysFileExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_file
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int deleteByExample(SysFileExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_file
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int deleteByPrimaryKey(String fileId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_file
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int insert(SysFile record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_file
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int insertSelective(SysFile record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_file
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    List<SysFile> selectByExample(SysFileExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_file
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    SysFile selectByPrimaryKey(String fileId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_file
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByExampleSelective(@Param("record") SysFile record, @Param("example") SysFileExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_file
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByExample(@Param("record") SysFile record, @Param("example") SysFileExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_file
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByPrimaryKeySelective(SysFile record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_file
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByPrimaryKey(SysFile record);
}