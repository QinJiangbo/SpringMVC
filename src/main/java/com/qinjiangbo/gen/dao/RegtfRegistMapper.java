package com.qinjiangbo.gen.dao;

import com.qinjiangbo.gen.model.RegtfRegist;
import com.qinjiangbo.gen.model.RegtfRegistExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RegtfRegistMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regtf_regist
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int countByExample(RegtfRegistExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regtf_regist
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int deleteByExample(RegtfRegistExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regtf_regist
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int deleteByPrimaryKey(Long regId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regtf_regist
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int insert(RegtfRegist record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regtf_regist
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int insertSelective(RegtfRegist record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regtf_regist
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    List<RegtfRegist> selectByExample(RegtfRegistExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regtf_regist
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    RegtfRegist selectByPrimaryKey(Long regId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regtf_regist
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByExampleSelective(@Param("record") RegtfRegist record, @Param("example") RegtfRegistExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regtf_regist
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByExample(@Param("record") RegtfRegist record, @Param("example") RegtfRegistExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regtf_regist
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByPrimaryKeySelective(RegtfRegist record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regtf_regist
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByPrimaryKey(RegtfRegist record);
}