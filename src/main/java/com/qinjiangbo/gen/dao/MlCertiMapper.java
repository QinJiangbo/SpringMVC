package com.qinjiangbo.gen.dao;

import com.qinjiangbo.gen.model.MlCerti;
import com.qinjiangbo.gen.model.MlCertiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MlCertiMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ml_certi
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int countByExample(MlCertiExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ml_certi
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int deleteByExample(MlCertiExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ml_certi
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int deleteByPrimaryKey(Long certiId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ml_certi
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int insert(MlCerti record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ml_certi
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int insertSelective(MlCerti record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ml_certi
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    List<MlCerti> selectByExample(MlCertiExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ml_certi
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    MlCerti selectByPrimaryKey(Long certiId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ml_certi
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int updateByExampleSelective(@Param("record") MlCerti record, @Param("example") MlCertiExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ml_certi
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int updateByExample(@Param("record") MlCerti record, @Param("example") MlCertiExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ml_certi
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int updateByPrimaryKeySelective(MlCerti record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ml_certi
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    int updateByPrimaryKey(MlCerti record);
}