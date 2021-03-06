package com.qinjiangbo.gen.dao;

import com.qinjiangbo.gen.model.BaiduUser;
import com.qinjiangbo.gen.model.BaiduUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaiduUserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table baidu_user
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int countByExample(BaiduUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table baidu_user
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int deleteByExample(BaiduUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table baidu_user
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int deleteByPrimaryKey(Long userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table baidu_user
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int insert(BaiduUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table baidu_user
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int insertSelective(BaiduUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table baidu_user
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    List<BaiduUser> selectByExample(BaiduUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table baidu_user
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    BaiduUser selectByPrimaryKey(Long userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table baidu_user
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int updateByExampleSelective(@Param("record") BaiduUser record, @Param("example") BaiduUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table baidu_user
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int updateByExample(@Param("record") BaiduUser record, @Param("example") BaiduUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table baidu_user
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int updateByPrimaryKeySelective(BaiduUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table baidu_user
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int updateByPrimaryKey(BaiduUser record);
}