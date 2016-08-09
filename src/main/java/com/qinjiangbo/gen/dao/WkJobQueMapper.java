package com.qinjiangbo.gen.dao;

import com.qinjiangbo.gen.model.WkJobQue;
import com.qinjiangbo.gen.model.WkJobQueExample;
import com.qinjiangbo.gen.model.WkJobQueKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WkJobQueMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wk_job_que
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int countByExample(WkJobQueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wk_job_que
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int deleteByExample(WkJobQueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wk_job_que
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int deleteByPrimaryKey(WkJobQueKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wk_job_que
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int insert(WkJobQue record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wk_job_que
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int insertSelective(WkJobQue record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wk_job_que
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    List<WkJobQue> selectByExample(WkJobQueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wk_job_que
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    WkJobQue selectByPrimaryKey(WkJobQueKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wk_job_que
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByExampleSelective(@Param("record") WkJobQue record, @Param("example") WkJobQueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wk_job_que
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByExample(@Param("record") WkJobQue record, @Param("example") WkJobQueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wk_job_que
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByPrimaryKeySelective(WkJobQue record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wk_job_que
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByPrimaryKey(WkJobQue record);
}