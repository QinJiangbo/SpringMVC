package com.qinjiangbo.gen.dao;

import com.qinjiangbo.gen.model.WkSection;
import com.qinjiangbo.gen.model.WkSectionExample;
import com.qinjiangbo.gen.model.WkSectionKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WkSectionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wk_section
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int countByExample(WkSectionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wk_section
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int deleteByExample(WkSectionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wk_section
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int deleteByPrimaryKey(WkSectionKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wk_section
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int insert(WkSection record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wk_section
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int insertSelective(WkSection record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wk_section
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    List<WkSection> selectByExample(WkSectionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wk_section
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    WkSection selectByPrimaryKey(WkSectionKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wk_section
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByExampleSelective(@Param("record") WkSection record, @Param("example") WkSectionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wk_section
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByExample(@Param("record") WkSection record, @Param("example") WkSectionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wk_section
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByPrimaryKeySelective(WkSection record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wk_section
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByPrimaryKey(WkSection record);
}