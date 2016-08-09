package com.qinjiangbo.gen.dao;

import com.qinjiangbo.gen.model.QueArticle;
import com.qinjiangbo.gen.model.QueArticleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QueArticleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table que_article
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int countByExample(QueArticleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table que_article
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int deleteByExample(QueArticleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table que_article
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int deleteByPrimaryKey(Long artId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table que_article
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int insert(QueArticle record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table que_article
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int insertSelective(QueArticle record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table que_article
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    List<QueArticle> selectByExample(QueArticleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table que_article
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    QueArticle selectByPrimaryKey(Long artId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table que_article
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByExampleSelective(@Param("record") QueArticle record, @Param("example") QueArticleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table que_article
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByExample(@Param("record") QueArticle record, @Param("example") QueArticleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table que_article
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByPrimaryKeySelective(QueArticle record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table que_article
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByPrimaryKey(QueArticle record);
}