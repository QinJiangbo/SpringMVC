package com.qinjiangbo.gen.dao;

import com.qinjiangbo.gen.model.RegsatDict;
import com.qinjiangbo.gen.model.RegsatDictExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RegsatDictMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regsat_dict
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int countByExample(RegsatDictExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regsat_dict
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int deleteByExample(RegsatDictExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regsat_dict
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int deleteByPrimaryKey(Integer dictId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regsat_dict
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int insert(RegsatDict record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regsat_dict
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int insertSelective(RegsatDict record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regsat_dict
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    List<RegsatDict> selectByExample(RegsatDictExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regsat_dict
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    RegsatDict selectByPrimaryKey(Integer dictId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regsat_dict
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByExampleSelective(@Param("record") RegsatDict record, @Param("example") RegsatDictExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regsat_dict
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByExample(@Param("record") RegsatDict record, @Param("example") RegsatDictExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regsat_dict
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByPrimaryKeySelective(RegsatDict record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regsat_dict
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByPrimaryKey(RegsatDict record);
}