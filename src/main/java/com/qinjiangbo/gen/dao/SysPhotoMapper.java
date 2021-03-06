package com.qinjiangbo.gen.dao;

import com.qinjiangbo.gen.model.SysPhoto;
import com.qinjiangbo.gen.model.SysPhotoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysPhotoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_photo
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int countByExample(SysPhotoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_photo
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int deleteByExample(SysPhotoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_photo
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int deleteByPrimaryKey(String photoId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_photo
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int insert(SysPhoto record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_photo
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int insertSelective(SysPhoto record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_photo
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    List<SysPhoto> selectByExample(SysPhotoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_photo
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    SysPhoto selectByPrimaryKey(String photoId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_photo
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByExampleSelective(@Param("record") SysPhoto record, @Param("example") SysPhotoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_photo
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByExample(@Param("record") SysPhoto record, @Param("example") SysPhotoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_photo
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByPrimaryKeySelective(SysPhoto record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_photo
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByPrimaryKey(SysPhoto record);
}