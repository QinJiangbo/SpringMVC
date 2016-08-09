package com.qinjiangbo.gen.dao;

import com.qinjiangbo.gen.model.WkCurrentOld;
import com.qinjiangbo.gen.model.WkCurrentOldExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WkCurrentOldMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wk_current_old
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int countByExample(WkCurrentOldExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wk_current_old
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int deleteByExample(WkCurrentOldExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wk_current_old
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int deleteByPrimaryKey(Long wkId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wk_current_old
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int insert(WkCurrentOld record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wk_current_old
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int insertSelective(WkCurrentOld record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wk_current_old
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    List<WkCurrentOld> selectByExample(WkCurrentOldExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wk_current_old
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    WkCurrentOld selectByPrimaryKey(Long wkId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wk_current_old
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByExampleSelective(@Param("record") WkCurrentOld record, @Param("example") WkCurrentOldExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wk_current_old
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByExample(@Param("record") WkCurrentOld record, @Param("example") WkCurrentOldExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wk_current_old
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByPrimaryKeySelective(WkCurrentOld record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wk_current_old
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByPrimaryKey(WkCurrentOld record);
}