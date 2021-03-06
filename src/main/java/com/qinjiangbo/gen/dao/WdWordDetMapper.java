package com.qinjiangbo.gen.dao;

import com.qinjiangbo.gen.model.WdWordDet;
import com.qinjiangbo.gen.model.WdWordDetExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WdWordDetMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_word_det
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int countByExample(WdWordDetExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_word_det
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int deleteByExample(WdWordDetExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_word_det
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int deleteByPrimaryKey(Long semId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_word_det
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int insert(WdWordDet record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_word_det
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int insertSelective(WdWordDet record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_word_det
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    List<WdWordDet> selectByExample(WdWordDetExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_word_det
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    WdWordDet selectByPrimaryKey(Long semId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_word_det
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByExampleSelective(@Param("record") WdWordDet record, @Param("example") WdWordDetExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_word_det
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByExample(@Param("record") WdWordDet record, @Param("example") WdWordDetExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_word_det
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByPrimaryKeySelective(WdWordDet record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_word_det
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByPrimaryKey(WdWordDet record);
}