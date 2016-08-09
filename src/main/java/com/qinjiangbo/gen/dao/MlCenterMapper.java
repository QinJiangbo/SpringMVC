package com.qinjiangbo.gen.dao;

import com.qinjiangbo.gen.model.MlCenter;
import com.qinjiangbo.gen.model.MlCenterExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MlCenterMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ml_center
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int countByExample(MlCenterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ml_center
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int deleteByExample(MlCenterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ml_center
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int deleteByPrimaryKey(Long centId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ml_center
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int insert(MlCenter record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ml_center
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int insertSelective(MlCenter record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ml_center
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    List<MlCenter> selectByExample(MlCenterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ml_center
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    MlCenter selectByPrimaryKey(Long centId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ml_center
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int updateByExampleSelective(@Param("record") MlCenter record, @Param("example") MlCenterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ml_center
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int updateByExample(@Param("record") MlCenter record, @Param("example") MlCenterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ml_center
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int updateByPrimaryKeySelective(MlCenter record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ml_center
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int updateByPrimaryKey(MlCenter record);
}