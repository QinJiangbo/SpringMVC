package com.qinjiangbo.gen.dao;

import com.qinjiangbo.gen.model.RegysDate;
import com.qinjiangbo.gen.model.RegysDateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RegysDateMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regys_date
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int countByExample(RegysDateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regys_date
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int deleteByExample(RegysDateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regys_date
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int deleteByPrimaryKey(Long testId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regys_date
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int insert(RegysDate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regys_date
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int insertSelective(RegysDate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regys_date
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    List<RegysDate> selectByExample(RegysDateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regys_date
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    RegysDate selectByPrimaryKey(Long testId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regys_date
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByExampleSelective(@Param("record") RegysDate record, @Param("example") RegysDateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regys_date
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByExample(@Param("record") RegysDate record, @Param("example") RegysDateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regys_date
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByPrimaryKeySelective(RegysDate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regys_date
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByPrimaryKey(RegysDate record);
}