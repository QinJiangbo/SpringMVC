package com.qinjiangbo.gen.dao;

import com.qinjiangbo.gen.model.WkFav;
import com.qinjiangbo.gen.model.WkFavExample;
import com.qinjiangbo.gen.model.WkFavKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WkFavMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wk_fav
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int countByExample(WkFavExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wk_fav
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int deleteByExample(WkFavExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wk_fav
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int deleteByPrimaryKey(WkFavKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wk_fav
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int insert(WkFav record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wk_fav
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int insertSelective(WkFav record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wk_fav
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    List<WkFav> selectByExample(WkFavExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wk_fav
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    WkFav selectByPrimaryKey(WkFavKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wk_fav
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByExampleSelective(@Param("record") WkFav record, @Param("example") WkFavExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wk_fav
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByExample(@Param("record") WkFav record, @Param("example") WkFavExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wk_fav
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByPrimaryKeySelective(WkFav record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wk_fav
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByPrimaryKey(WkFav record);
}