package com.qinjiangbo.gen.dao;

import com.qinjiangbo.gen.model.RegsatRegdet;
import com.qinjiangbo.gen.model.RegsatRegdetExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RegsatRegdetMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regsat_regdet
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int countByExample(RegsatRegdetExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regsat_regdet
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int deleteByExample(RegsatRegdetExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regsat_regdet
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int deleteByPrimaryKey(Long detId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regsat_regdet
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int insert(RegsatRegdet record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regsat_regdet
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int insertSelective(RegsatRegdet record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regsat_regdet
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    List<RegsatRegdet> selectByExample(RegsatRegdetExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regsat_regdet
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    RegsatRegdet selectByPrimaryKey(Long detId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regsat_regdet
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByExampleSelective(@Param("record") RegsatRegdet record, @Param("example") RegsatRegdetExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regsat_regdet
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByExample(@Param("record") RegsatRegdet record, @Param("example") RegsatRegdetExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regsat_regdet
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByPrimaryKeySelective(RegsatRegdet record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regsat_regdet
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByPrimaryKey(RegsatRegdet record);
}