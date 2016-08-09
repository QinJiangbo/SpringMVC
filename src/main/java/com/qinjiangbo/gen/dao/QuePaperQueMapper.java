package com.qinjiangbo.gen.dao;

import com.qinjiangbo.gen.model.QuePaperQue;
import com.qinjiangbo.gen.model.QuePaperQueExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QuePaperQueMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table que_paper_que
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int countByExample(QuePaperQueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table que_paper_que
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int deleteByExample(QuePaperQueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table que_paper_que
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int deleteByPrimaryKey(Long qid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table que_paper_que
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int insert(QuePaperQue record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table que_paper_que
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int insertSelective(QuePaperQue record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table que_paper_que
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    List<QuePaperQue> selectByExample(QuePaperQueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table que_paper_que
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    QuePaperQue selectByPrimaryKey(Long qid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table que_paper_que
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByExampleSelective(@Param("record") QuePaperQue record, @Param("example") QuePaperQueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table que_paper_que
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByExample(@Param("record") QuePaperQue record, @Param("example") QuePaperQueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table que_paper_que
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByPrimaryKeySelective(QuePaperQue record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table que_paper_que
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByPrimaryKey(QuePaperQue record);
}