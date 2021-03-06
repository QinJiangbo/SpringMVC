package com.qinjiangbo.gen.dao;

import com.qinjiangbo.gen.model.BasOrgUser;
import com.qinjiangbo.gen.model.BasOrgUserExample;
import com.qinjiangbo.gen.model.BasOrgUserKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BasOrgUserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bas_org_user
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int countByExample(BasOrgUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bas_org_user
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int deleteByExample(BasOrgUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bas_org_user
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int deleteByPrimaryKey(BasOrgUserKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bas_org_user
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int insert(BasOrgUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bas_org_user
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int insertSelective(BasOrgUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bas_org_user
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    List<BasOrgUser> selectByExample(BasOrgUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bas_org_user
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    BasOrgUser selectByPrimaryKey(BasOrgUserKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bas_org_user
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int updateByExampleSelective(@Param("record") BasOrgUser record, @Param("example") BasOrgUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bas_org_user
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int updateByExample(@Param("record") BasOrgUser record, @Param("example") BasOrgUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bas_org_user
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int updateByPrimaryKeySelective(BasOrgUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bas_org_user
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int updateByPrimaryKey(BasOrgUser record);
}