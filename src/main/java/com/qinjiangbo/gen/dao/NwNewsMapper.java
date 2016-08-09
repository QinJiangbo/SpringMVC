package com.qinjiangbo.gen.dao;

import com.qinjiangbo.gen.model.NwNews;
import com.qinjiangbo.gen.model.NwNewsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NwNewsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nw_news
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int countByExample(NwNewsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nw_news
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int deleteByExample(NwNewsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nw_news
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int deleteByPrimaryKey(Long newsId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nw_news
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int insert(NwNews record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nw_news
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int insertSelective(NwNews record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nw_news
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    List<NwNews> selectByExample(NwNewsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nw_news
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    NwNews selectByPrimaryKey(Long newsId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nw_news
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int updateByExampleSelective(@Param("record") NwNews record, @Param("example") NwNewsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nw_news
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int updateByExample(@Param("record") NwNews record, @Param("example") NwNewsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nw_news
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int updateByPrimaryKeySelective(NwNews record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nw_news
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int updateByPrimaryKey(NwNews record);
}