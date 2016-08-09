package com.qinjiangbo.gen.dao;

import com.qinjiangbo.gen.model.BasOrgEmp;
import com.qinjiangbo.gen.model.BasOrgEmpExample;
import com.qinjiangbo.gen.model.BasOrgEmpKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BasOrgEmpMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bas_org_emp
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int countByExample(BasOrgEmpExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bas_org_emp
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int deleteByExample(BasOrgEmpExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bas_org_emp
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int deleteByPrimaryKey(BasOrgEmpKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bas_org_emp
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int insert(BasOrgEmp record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bas_org_emp
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int insertSelective(BasOrgEmp record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bas_org_emp
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    List<BasOrgEmp> selectByExample(BasOrgEmpExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bas_org_emp
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    BasOrgEmp selectByPrimaryKey(BasOrgEmpKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bas_org_emp
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int updateByExampleSelective(@Param("record") BasOrgEmp record, @Param("example") BasOrgEmpExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bas_org_emp
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int updateByExample(@Param("record") BasOrgEmp record, @Param("example") BasOrgEmpExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bas_org_emp
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int updateByPrimaryKeySelective(BasOrgEmp record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bas_org_emp
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int updateByPrimaryKey(BasOrgEmp record);
}