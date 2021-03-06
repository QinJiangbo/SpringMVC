package com.qinjiangbo.gen.dao;

import com.qinjiangbo.gen.model.WkCurrent;
import com.qinjiangbo.gen.model.WkCurrentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WkCurrentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wk_current
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int countByExample(WkCurrentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wk_current
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int deleteByExample(WkCurrentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wk_current
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int deleteByPrimaryKey(Long wkId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wk_current
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int insert(WkCurrent record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wk_current
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int insertSelective(WkCurrent record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wk_current
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    List<WkCurrent> selectByExample(WkCurrentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wk_current
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    WkCurrent selectByPrimaryKey(Long wkId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wk_current
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByExampleSelective(@Param("record") WkCurrent record, @Param("example") WkCurrentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wk_current
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByExample(@Param("record") WkCurrent record, @Param("example") WkCurrentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wk_current
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByPrimaryKeySelective(WkCurrent record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wk_current
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByPrimaryKey(WkCurrent record);
}