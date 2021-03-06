package com.qinjiangbo.gen.dao;

import com.qinjiangbo.gen.model.WkCurrentBak;
import com.qinjiangbo.gen.model.WkCurrentBakExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WkCurrentBakMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wk_current_bak
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int countByExample(WkCurrentBakExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wk_current_bak
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int deleteByExample(WkCurrentBakExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wk_current_bak
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int deleteByPrimaryKey(Long wkId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wk_current_bak
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int insert(WkCurrentBak record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wk_current_bak
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int insertSelective(WkCurrentBak record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wk_current_bak
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    List<WkCurrentBak> selectByExample(WkCurrentBakExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wk_current_bak
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    WkCurrentBak selectByPrimaryKey(Long wkId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wk_current_bak
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByExampleSelective(@Param("record") WkCurrentBak record, @Param("example") WkCurrentBakExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wk_current_bak
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByExample(@Param("record") WkCurrentBak record, @Param("example") WkCurrentBakExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wk_current_bak
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByPrimaryKeySelective(WkCurrentBak record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wk_current_bak
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByPrimaryKey(WkCurrentBak record);
}