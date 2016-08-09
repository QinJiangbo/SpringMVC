package com.qinjiangbo.gen.dao;

import com.qinjiangbo.gen.model.WkJobmb;
import com.qinjiangbo.gen.model.WkJobmbExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WkJobmbMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wk_jobmb
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int countByExample(WkJobmbExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wk_jobmb
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int deleteByExample(WkJobmbExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wk_jobmb
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int deleteByPrimaryKey(Long mbId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wk_jobmb
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int insert(WkJobmb record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wk_jobmb
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int insertSelective(WkJobmb record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wk_jobmb
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    List<WkJobmb> selectByExample(WkJobmbExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wk_jobmb
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    WkJobmb selectByPrimaryKey(Long mbId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wk_jobmb
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByExampleSelective(@Param("record") WkJobmb record, @Param("example") WkJobmbExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wk_jobmb
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByExample(@Param("record") WkJobmb record, @Param("example") WkJobmbExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wk_jobmb
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByPrimaryKeySelective(WkJobmb record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wk_jobmb
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByPrimaryKey(WkJobmb record);
}