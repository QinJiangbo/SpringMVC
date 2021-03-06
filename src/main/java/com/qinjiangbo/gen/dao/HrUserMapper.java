package com.qinjiangbo.gen.dao;

import com.qinjiangbo.gen.model.HrUser;
import com.qinjiangbo.gen.model.HrUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HrUserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hr_user
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int countByExample(HrUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hr_user
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int deleteByExample(HrUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hr_user
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int deleteByPrimaryKey(Long userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hr_user
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int insert(HrUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hr_user
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int insertSelective(HrUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hr_user
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    List<HrUser> selectByExample(HrUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hr_user
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    HrUser selectByPrimaryKey(Long userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hr_user
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int updateByExampleSelective(@Param("record") HrUser record, @Param("example") HrUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hr_user
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int updateByExample(@Param("record") HrUser record, @Param("example") HrUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hr_user
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int updateByPrimaryKeySelective(HrUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hr_user
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int updateByPrimaryKey(HrUser record);
}