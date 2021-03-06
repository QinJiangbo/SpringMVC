package com.qinjiangbo.gen.dao;

import com.qinjiangbo.gen.model.TchLectJob;
import com.qinjiangbo.gen.model.TchLectJobExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TchLectJobMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tch_lect_job
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int countByExample(TchLectJobExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tch_lect_job
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int deleteByExample(TchLectJobExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tch_lect_job
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int deleteByPrimaryKey(Long jobId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tch_lect_job
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int insert(TchLectJob record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tch_lect_job
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int insertSelective(TchLectJob record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tch_lect_job
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    List<TchLectJob> selectByExample(TchLectJobExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tch_lect_job
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    TchLectJob selectByPrimaryKey(Long jobId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tch_lect_job
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByExampleSelective(@Param("record") TchLectJob record, @Param("example") TchLectJobExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tch_lect_job
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByExample(@Param("record") TchLectJob record, @Param("example") TchLectJobExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tch_lect_job
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByPrimaryKeySelective(TchLectJob record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tch_lect_job
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByPrimaryKey(TchLectJob record);
}