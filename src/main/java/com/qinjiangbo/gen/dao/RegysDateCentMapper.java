package com.qinjiangbo.gen.dao;

import com.qinjiangbo.gen.model.RegysDateCent;
import com.qinjiangbo.gen.model.RegysDateCentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RegysDateCentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regys_date_cent
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int countByExample(RegysDateCentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regys_date_cent
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int deleteByExample(RegysDateCentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regys_date_cent
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regys_date_cent
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int insert(RegysDateCent record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regys_date_cent
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int insertSelective(RegysDateCent record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regys_date_cent
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    List<RegysDateCent> selectByExample(RegysDateCentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regys_date_cent
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    RegysDateCent selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regys_date_cent
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByExampleSelective(@Param("record") RegysDateCent record, @Param("example") RegysDateCentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regys_date_cent
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByExample(@Param("record") RegysDateCent record, @Param("example") RegysDateCentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regys_date_cent
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByPrimaryKeySelective(RegysDateCent record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regys_date_cent
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByPrimaryKey(RegysDateCent record);
}