package com.qinjiangbo.gen.dao;

import com.qinjiangbo.gen.model.QuePaper;
import com.qinjiangbo.gen.model.QuePaperExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QuePaperMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table que_paper
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int countByExample(QuePaperExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table que_paper
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int deleteByExample(QuePaperExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table que_paper
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int deleteByPrimaryKey(Long papId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table que_paper
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int insert(QuePaper record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table que_paper
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int insertSelective(QuePaper record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table que_paper
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    List<QuePaper> selectByExample(QuePaperExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table que_paper
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    QuePaper selectByPrimaryKey(Long papId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table que_paper
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByExampleSelective(@Param("record") QuePaper record, @Param("example") QuePaperExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table que_paper
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByExample(@Param("record") QuePaper record, @Param("example") QuePaperExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table que_paper
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByPrimaryKeySelective(QuePaper record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table que_paper
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByPrimaryKey(QuePaper record);
}