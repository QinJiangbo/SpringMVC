package com.qinjiangbo.gen.model;

import java.io.Serializable;

public class RegysCentMonthKey implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column regys_cent_month.test_month
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private Long testMonth;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column regys_cent_month.reg_provin
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private Long regProvin;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column regys_cent_month.test_tp
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private Integer testTp;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table regys_cent_month
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column regys_cent_month.test_month
     *
     * @return the value of regys_cent_month.test_month
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public Long getTestMonth() {
        return testMonth;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column regys_cent_month.test_month
     *
     * @param testMonth the value for regys_cent_month.test_month
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setTestMonth(Long testMonth) {
        this.testMonth = testMonth;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column regys_cent_month.reg_provin
     *
     * @return the value of regys_cent_month.reg_provin
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public Long getRegProvin() {
        return regProvin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column regys_cent_month.reg_provin
     *
     * @param regProvin the value for regys_cent_month.reg_provin
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setRegProvin(Long regProvin) {
        this.regProvin = regProvin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column regys_cent_month.test_tp
     *
     * @return the value of regys_cent_month.test_tp
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public Integer getTestTp() {
        return testTp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column regys_cent_month.test_tp
     *
     * @param testTp the value for regys_cent_month.test_tp
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setTestTp(Integer testTp) {
        this.testTp = testTp;
    }
}