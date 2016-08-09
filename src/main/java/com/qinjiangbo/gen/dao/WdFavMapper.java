package com.qinjiangbo.gen.dao;

import com.qinjiangbo.gen.model.WdFav;
import com.qinjiangbo.gen.model.WdFavExample;
import com.qinjiangbo.gen.model.WdFavKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WdFavMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_fav
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int countByExample(WdFavExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_fav
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int deleteByExample(WdFavExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_fav
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int deleteByPrimaryKey(WdFavKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_fav
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int insert(WdFav record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_fav
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int insertSelective(WdFav record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_fav
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    List<WdFav> selectByExample(WdFavExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_fav
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    WdFav selectByPrimaryKey(WdFavKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_fav
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByExampleSelective(@Param("record") WdFav record, @Param("example") WdFavExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_fav
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByExample(@Param("record") WdFav record, @Param("example") WdFavExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_fav
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByPrimaryKeySelective(WdFav record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_fav
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByPrimaryKey(WdFav record);
}