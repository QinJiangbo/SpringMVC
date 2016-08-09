package com.qinjiangbo.gen.dao;

import com.qinjiangbo.gen.model.BasOrgMsg;
import com.qinjiangbo.gen.model.BasOrgMsgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BasOrgMsgMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bas_org_msg
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int countByExample(BasOrgMsgExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bas_org_msg
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int deleteByExample(BasOrgMsgExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bas_org_msg
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int deleteByPrimaryKey(Long msgId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bas_org_msg
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int insert(BasOrgMsg record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bas_org_msg
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int insertSelective(BasOrgMsg record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bas_org_msg
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    List<BasOrgMsg> selectByExample(BasOrgMsgExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bas_org_msg
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    BasOrgMsg selectByPrimaryKey(Long msgId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bas_org_msg
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int updateByExampleSelective(@Param("record") BasOrgMsg record, @Param("example") BasOrgMsgExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bas_org_msg
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int updateByExample(@Param("record") BasOrgMsg record, @Param("example") BasOrgMsgExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bas_org_msg
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int updateByPrimaryKeySelective(BasOrgMsg record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bas_org_msg
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int updateByPrimaryKey(BasOrgMsg record);
}