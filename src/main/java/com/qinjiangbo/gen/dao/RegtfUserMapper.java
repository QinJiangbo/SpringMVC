package com.qinjiangbo.gen.dao;

import com.qinjiangbo.gen.model.RegtfUser;
import com.qinjiangbo.gen.model.RegtfUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RegtfUserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regtf_user
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int countByExample(RegtfUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regtf_user
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int deleteByExample(RegtfUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regtf_user
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int deleteByPrimaryKey(Long userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regtf_user
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int insert(RegtfUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regtf_user
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int insertSelective(RegtfUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regtf_user
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    List<RegtfUser> selectByExample(RegtfUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regtf_user
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    RegtfUser selectByPrimaryKey(Long userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regtf_user
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByExampleSelective(@Param("record") RegtfUser record, @Param("example") RegtfUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regtf_user
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByExample(@Param("record") RegtfUser record, @Param("example") RegtfUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regtf_user
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByPrimaryKeySelective(RegtfUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regtf_user
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByPrimaryKey(RegtfUser record);
}