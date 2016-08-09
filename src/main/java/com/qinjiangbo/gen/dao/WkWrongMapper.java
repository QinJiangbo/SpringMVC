package com.qinjiangbo.gen.dao;

import com.qinjiangbo.gen.model.WkWrong;
import com.qinjiangbo.gen.model.WkWrongExample;
import com.qinjiangbo.gen.model.WkWrongKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WkWrongMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wk_wrong
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int countByExample(WkWrongExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wk_wrong
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int deleteByExample(WkWrongExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wk_wrong
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int deleteByPrimaryKey(WkWrongKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wk_wrong
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int insert(WkWrong record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wk_wrong
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int insertSelective(WkWrong record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wk_wrong
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    List<WkWrong> selectByExample(WkWrongExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wk_wrong
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    WkWrong selectByPrimaryKey(WkWrongKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wk_wrong
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByExampleSelective(@Param("record") WkWrong record, @Param("example") WkWrongExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wk_wrong
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByExample(@Param("record") WkWrong record, @Param("example") WkWrongExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wk_wrong
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByPrimaryKeySelective(WkWrong record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wk_wrong
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByPrimaryKey(WkWrong record);
}