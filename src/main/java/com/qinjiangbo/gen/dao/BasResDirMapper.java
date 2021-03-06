package com.qinjiangbo.gen.dao;

import com.qinjiangbo.gen.model.BasResDir;
import com.qinjiangbo.gen.model.BasResDirExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BasResDirMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bas_res_dir
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int countByExample(BasResDirExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bas_res_dir
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int deleteByExample(BasResDirExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bas_res_dir
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int insert(BasResDir record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bas_res_dir
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int insertSelective(BasResDir record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bas_res_dir
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    List<BasResDir> selectByExample(BasResDirExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bas_res_dir
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int updateByExampleSelective(@Param("record") BasResDir record, @Param("example") BasResDirExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bas_res_dir
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int updateByExample(@Param("record") BasResDir record, @Param("example") BasResDirExample example);
}