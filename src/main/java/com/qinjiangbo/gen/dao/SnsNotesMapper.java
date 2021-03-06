package com.qinjiangbo.gen.dao;

import com.qinjiangbo.gen.model.SnsNotes;
import com.qinjiangbo.gen.model.SnsNotesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SnsNotesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sns_notes
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int countByExample(SnsNotesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sns_notes
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int deleteByExample(SnsNotesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sns_notes
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int deleteByPrimaryKey(Long noteId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sns_notes
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int insert(SnsNotes record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sns_notes
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int insertSelective(SnsNotes record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sns_notes
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    List<SnsNotes> selectByExample(SnsNotesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sns_notes
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    SnsNotes selectByPrimaryKey(Long noteId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sns_notes
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByExampleSelective(@Param("record") SnsNotes record, @Param("example") SnsNotesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sns_notes
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByExample(@Param("record") SnsNotes record, @Param("example") SnsNotesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sns_notes
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByPrimaryKeySelective(SnsNotes record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sns_notes
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    int updateByPrimaryKey(SnsNotes record);
}