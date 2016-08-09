package com.qinjiangbo.gen.dao;

import com.qinjiangbo.gen.model.SysFault;
import com.qinjiangbo.gen.model.SysFaultExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysFaultMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_fault
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int countByExample(SysFaultExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_fault
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int deleteByExample(SysFaultExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_fault
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int deleteByPrimaryKey(Long fatId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_fault
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int insert(SysFault record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_fault
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int insertSelective(SysFault record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_fault
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    List<SysFault> selectByExample(SysFaultExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_fault
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    SysFault selectByPrimaryKey(Long fatId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_fault
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByExampleSelective(@Param("record") SysFault record, @Param("example") SysFaultExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_fault
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByExample(@Param("record") SysFault record, @Param("example") SysFaultExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_fault
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByPrimaryKeySelective(SysFault record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_fault
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByPrimaryKey(SysFault record);
}