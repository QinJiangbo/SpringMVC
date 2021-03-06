package com.qinjiangbo.gen.dao;

import com.qinjiangbo.gen.model.HrOrganizeUserExample;
import com.qinjiangbo.gen.model.HrOrganizeUserKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HrOrganizeUserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hr_organize_user
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int countByExample(HrOrganizeUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hr_organize_user
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int deleteByExample(HrOrganizeUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hr_organize_user
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int deleteByPrimaryKey(HrOrganizeUserKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hr_organize_user
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int insert(HrOrganizeUserKey record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hr_organize_user
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int insertSelective(HrOrganizeUserKey record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hr_organize_user
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    List<HrOrganizeUserKey> selectByExample(HrOrganizeUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hr_organize_user
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int updateByExampleSelective(@Param("record") HrOrganizeUserKey record, @Param("example") HrOrganizeUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hr_organize_user
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int updateByExample(@Param("record") HrOrganizeUserKey record, @Param("example") HrOrganizeUserExample example);
}