package com.qinjiangbo.gen.dao;

import com.qinjiangbo.gen.model.TchLectFile;
import com.qinjiangbo.gen.model.TchLectFileExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TchLectFileMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tch_lect_file
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int countByExample(TchLectFileExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tch_lect_file
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int deleteByExample(TchLectFileExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tch_lect_file
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int deleteByPrimaryKey(Long fileId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tch_lect_file
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int insert(TchLectFile record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tch_lect_file
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int insertSelective(TchLectFile record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tch_lect_file
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    List<TchLectFile> selectByExample(TchLectFileExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tch_lect_file
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    TchLectFile selectByPrimaryKey(Long fileId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tch_lect_file
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByExampleSelective(@Param("record") TchLectFile record, @Param("example") TchLectFileExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tch_lect_file
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByExample(@Param("record") TchLectFile record, @Param("example") TchLectFileExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tch_lect_file
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByPrimaryKeySelective(TchLectFile record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tch_lect_file
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByPrimaryKey(TchLectFile record);
}