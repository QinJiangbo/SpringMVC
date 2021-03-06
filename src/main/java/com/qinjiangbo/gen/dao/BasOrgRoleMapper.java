package com.qinjiangbo.gen.dao;

import com.qinjiangbo.gen.model.BasOrgRole;
import com.qinjiangbo.gen.model.BasOrgRoleExample;
import com.qinjiangbo.gen.model.BasOrgRoleKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BasOrgRoleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bas_org_role
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int countByExample(BasOrgRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bas_org_role
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int deleteByExample(BasOrgRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bas_org_role
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int deleteByPrimaryKey(BasOrgRoleKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bas_org_role
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int insert(BasOrgRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bas_org_role
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int insertSelective(BasOrgRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bas_org_role
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    List<BasOrgRole> selectByExample(BasOrgRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bas_org_role
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    BasOrgRole selectByPrimaryKey(BasOrgRoleKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bas_org_role
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int updateByExampleSelective(@Param("record") BasOrgRole record, @Param("example") BasOrgRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bas_org_role
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int updateByExample(@Param("record") BasOrgRole record, @Param("example") BasOrgRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bas_org_role
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int updateByPrimaryKeySelective(BasOrgRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bas_org_role
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int updateByPrimaryKey(BasOrgRole record);
}