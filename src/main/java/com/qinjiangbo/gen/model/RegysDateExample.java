package com.qinjiangbo.gen.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RegysDateExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table regys_date
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table regys_date
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table regys_date
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regys_date
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public RegysDateExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regys_date
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regys_date
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regys_date
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regys_date
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regys_date
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regys_date
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regys_date
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regys_date
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regys_date
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regys_date
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table regys_date
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andTestIdIsNull() {
            addCriterion("test_id is null");
            return (Criteria) this;
        }

        public Criteria andTestIdIsNotNull() {
            addCriterion("test_id is not null");
            return (Criteria) this;
        }

        public Criteria andTestIdEqualTo(Long value) {
            addCriterion("test_id =", value, "testId");
            return (Criteria) this;
        }

        public Criteria andTestIdNotEqualTo(Long value) {
            addCriterion("test_id <>", value, "testId");
            return (Criteria) this;
        }

        public Criteria andTestIdGreaterThan(Long value) {
            addCriterion("test_id >", value, "testId");
            return (Criteria) this;
        }

        public Criteria andTestIdGreaterThanOrEqualTo(Long value) {
            addCriterion("test_id >=", value, "testId");
            return (Criteria) this;
        }

        public Criteria andTestIdLessThan(Long value) {
            addCriterion("test_id <", value, "testId");
            return (Criteria) this;
        }

        public Criteria andTestIdLessThanOrEqualTo(Long value) {
            addCriterion("test_id <=", value, "testId");
            return (Criteria) this;
        }

        public Criteria andTestIdIn(List<Long> values) {
            addCriterion("test_id in", values, "testId");
            return (Criteria) this;
        }

        public Criteria andTestIdNotIn(List<Long> values) {
            addCriterion("test_id not in", values, "testId");
            return (Criteria) this;
        }

        public Criteria andTestIdBetween(Long value1, Long value2) {
            addCriterion("test_id between", value1, value2, "testId");
            return (Criteria) this;
        }

        public Criteria andTestIdNotBetween(Long value1, Long value2) {
            addCriterion("test_id not between", value1, value2, "testId");
            return (Criteria) this;
        }

        public Criteria andTestDateIsNull() {
            addCriterion("test_date is null");
            return (Criteria) this;
        }

        public Criteria andTestDateIsNotNull() {
            addCriterion("test_date is not null");
            return (Criteria) this;
        }

        public Criteria andTestDateEqualTo(Date value) {
            addCriterion("test_date =", value, "testDate");
            return (Criteria) this;
        }

        public Criteria andTestDateNotEqualTo(Date value) {
            addCriterion("test_date <>", value, "testDate");
            return (Criteria) this;
        }

        public Criteria andTestDateGreaterThan(Date value) {
            addCriterion("test_date >", value, "testDate");
            return (Criteria) this;
        }

        public Criteria andTestDateGreaterThanOrEqualTo(Date value) {
            addCriterion("test_date >=", value, "testDate");
            return (Criteria) this;
        }

        public Criteria andTestDateLessThan(Date value) {
            addCriterion("test_date <", value, "testDate");
            return (Criteria) this;
        }

        public Criteria andTestDateLessThanOrEqualTo(Date value) {
            addCriterion("test_date <=", value, "testDate");
            return (Criteria) this;
        }

        public Criteria andTestDateIn(List<Date> values) {
            addCriterion("test_date in", values, "testDate");
            return (Criteria) this;
        }

        public Criteria andTestDateNotIn(List<Date> values) {
            addCriterion("test_date not in", values, "testDate");
            return (Criteria) this;
        }

        public Criteria andTestDateBetween(Date value1, Date value2) {
            addCriterion("test_date between", value1, value2, "testDate");
            return (Criteria) this;
        }

        public Criteria andTestDateNotBetween(Date value1, Date value2) {
            addCriterion("test_date not between", value1, value2, "testDate");
            return (Criteria) this;
        }

        public Criteria andTestTpIsNull() {
            addCriterion("test_tp is null");
            return (Criteria) this;
        }

        public Criteria andTestTpIsNotNull() {
            addCriterion("test_tp is not null");
            return (Criteria) this;
        }

        public Criteria andTestTpEqualTo(Integer value) {
            addCriterion("test_tp =", value, "testTp");
            return (Criteria) this;
        }

        public Criteria andTestTpNotEqualTo(Integer value) {
            addCriterion("test_tp <>", value, "testTp");
            return (Criteria) this;
        }

        public Criteria andTestTpGreaterThan(Integer value) {
            addCriterion("test_tp >", value, "testTp");
            return (Criteria) this;
        }

        public Criteria andTestTpGreaterThanOrEqualTo(Integer value) {
            addCriterion("test_tp >=", value, "testTp");
            return (Criteria) this;
        }

        public Criteria andTestTpLessThan(Integer value) {
            addCriterion("test_tp <", value, "testTp");
            return (Criteria) this;
        }

        public Criteria andTestTpLessThanOrEqualTo(Integer value) {
            addCriterion("test_tp <=", value, "testTp");
            return (Criteria) this;
        }

        public Criteria andTestTpIn(List<Integer> values) {
            addCriterion("test_tp in", values, "testTp");
            return (Criteria) this;
        }

        public Criteria andTestTpNotIn(List<Integer> values) {
            addCriterion("test_tp not in", values, "testTp");
            return (Criteria) this;
        }

        public Criteria andTestTpBetween(Integer value1, Integer value2) {
            addCriterion("test_tp between", value1, value2, "testTp");
            return (Criteria) this;
        }

        public Criteria andTestTpNotBetween(Integer value1, Integer value2) {
            addCriterion("test_tp not between", value1, value2, "testTp");
            return (Criteria) this;
        }

        public Criteria andTestMonthIsNull() {
            addCriterion("test_month is null");
            return (Criteria) this;
        }

        public Criteria andTestMonthIsNotNull() {
            addCriterion("test_month is not null");
            return (Criteria) this;
        }

        public Criteria andTestMonthEqualTo(Long value) {
            addCriterion("test_month =", value, "testMonth");
            return (Criteria) this;
        }

        public Criteria andTestMonthNotEqualTo(Long value) {
            addCriterion("test_month <>", value, "testMonth");
            return (Criteria) this;
        }

        public Criteria andTestMonthGreaterThan(Long value) {
            addCriterion("test_month >", value, "testMonth");
            return (Criteria) this;
        }

        public Criteria andTestMonthGreaterThanOrEqualTo(Long value) {
            addCriterion("test_month >=", value, "testMonth");
            return (Criteria) this;
        }

        public Criteria andTestMonthLessThan(Long value) {
            addCriterion("test_month <", value, "testMonth");
            return (Criteria) this;
        }

        public Criteria andTestMonthLessThanOrEqualTo(Long value) {
            addCriterion("test_month <=", value, "testMonth");
            return (Criteria) this;
        }

        public Criteria andTestMonthIn(List<Long> values) {
            addCriterion("test_month in", values, "testMonth");
            return (Criteria) this;
        }

        public Criteria andTestMonthNotIn(List<Long> values) {
            addCriterion("test_month not in", values, "testMonth");
            return (Criteria) this;
        }

        public Criteria andTestMonthBetween(Long value1, Long value2) {
            addCriterion("test_month between", value1, value2, "testMonth");
            return (Criteria) this;
        }

        public Criteria andTestMonthNotBetween(Long value1, Long value2) {
            addCriterion("test_month not between", value1, value2, "testMonth");
            return (Criteria) this;
        }

        public Criteria andTestSubjectIsNull() {
            addCriterion("test_subject is null");
            return (Criteria) this;
        }

        public Criteria andTestSubjectIsNotNull() {
            addCriterion("test_subject is not null");
            return (Criteria) this;
        }

        public Criteria andTestSubjectEqualTo(String value) {
            addCriterion("test_subject =", value, "testSubject");
            return (Criteria) this;
        }

        public Criteria andTestSubjectNotEqualTo(String value) {
            addCriterion("test_subject <>", value, "testSubject");
            return (Criteria) this;
        }

        public Criteria andTestSubjectGreaterThan(String value) {
            addCriterion("test_subject >", value, "testSubject");
            return (Criteria) this;
        }

        public Criteria andTestSubjectGreaterThanOrEqualTo(String value) {
            addCriterion("test_subject >=", value, "testSubject");
            return (Criteria) this;
        }

        public Criteria andTestSubjectLessThan(String value) {
            addCriterion("test_subject <", value, "testSubject");
            return (Criteria) this;
        }

        public Criteria andTestSubjectLessThanOrEqualTo(String value) {
            addCriterion("test_subject <=", value, "testSubject");
            return (Criteria) this;
        }

        public Criteria andTestSubjectLike(String value) {
            addCriterion("test_subject like", value, "testSubject");
            return (Criteria) this;
        }

        public Criteria andTestSubjectNotLike(String value) {
            addCriterion("test_subject not like", value, "testSubject");
            return (Criteria) this;
        }

        public Criteria andTestSubjectIn(List<String> values) {
            addCriterion("test_subject in", values, "testSubject");
            return (Criteria) this;
        }

        public Criteria andTestSubjectNotIn(List<String> values) {
            addCriterion("test_subject not in", values, "testSubject");
            return (Criteria) this;
        }

        public Criteria andTestSubjectBetween(String value1, String value2) {
            addCriterion("test_subject between", value1, value2, "testSubject");
            return (Criteria) this;
        }

        public Criteria andTestSubjectNotBetween(String value1, String value2) {
            addCriterion("test_subject not between", value1, value2, "testSubject");
            return (Criteria) this;
        }

        public Criteria andTimeStartIsNull() {
            addCriterion("time_start is null");
            return (Criteria) this;
        }

        public Criteria andTimeStartIsNotNull() {
            addCriterion("time_start is not null");
            return (Criteria) this;
        }

        public Criteria andTimeStartEqualTo(Date value) {
            addCriterion("time_start =", value, "timeStart");
            return (Criteria) this;
        }

        public Criteria andTimeStartNotEqualTo(Date value) {
            addCriterion("time_start <>", value, "timeStart");
            return (Criteria) this;
        }

        public Criteria andTimeStartGreaterThan(Date value) {
            addCriterion("time_start >", value, "timeStart");
            return (Criteria) this;
        }

        public Criteria andTimeStartGreaterThanOrEqualTo(Date value) {
            addCriterion("time_start >=", value, "timeStart");
            return (Criteria) this;
        }

        public Criteria andTimeStartLessThan(Date value) {
            addCriterion("time_start <", value, "timeStart");
            return (Criteria) this;
        }

        public Criteria andTimeStartLessThanOrEqualTo(Date value) {
            addCriterion("time_start <=", value, "timeStart");
            return (Criteria) this;
        }

        public Criteria andTimeStartIn(List<Date> values) {
            addCriterion("time_start in", values, "timeStart");
            return (Criteria) this;
        }

        public Criteria andTimeStartNotIn(List<Date> values) {
            addCriterion("time_start not in", values, "timeStart");
            return (Criteria) this;
        }

        public Criteria andTimeStartBetween(Date value1, Date value2) {
            addCriterion("time_start between", value1, value2, "timeStart");
            return (Criteria) this;
        }

        public Criteria andTimeStartNotBetween(Date value1, Date value2) {
            addCriterion("time_start not between", value1, value2, "timeStart");
            return (Criteria) this;
        }

        public Criteria andTimeDeadlineIsNull() {
            addCriterion("time_deadline is null");
            return (Criteria) this;
        }

        public Criteria andTimeDeadlineIsNotNull() {
            addCriterion("time_deadline is not null");
            return (Criteria) this;
        }

        public Criteria andTimeDeadlineEqualTo(Date value) {
            addCriterion("time_deadline =", value, "timeDeadline");
            return (Criteria) this;
        }

        public Criteria andTimeDeadlineNotEqualTo(Date value) {
            addCriterion("time_deadline <>", value, "timeDeadline");
            return (Criteria) this;
        }

        public Criteria andTimeDeadlineGreaterThan(Date value) {
            addCriterion("time_deadline >", value, "timeDeadline");
            return (Criteria) this;
        }

        public Criteria andTimeDeadlineGreaterThanOrEqualTo(Date value) {
            addCriterion("time_deadline >=", value, "timeDeadline");
            return (Criteria) this;
        }

        public Criteria andTimeDeadlineLessThan(Date value) {
            addCriterion("time_deadline <", value, "timeDeadline");
            return (Criteria) this;
        }

        public Criteria andTimeDeadlineLessThanOrEqualTo(Date value) {
            addCriterion("time_deadline <=", value, "timeDeadline");
            return (Criteria) this;
        }

        public Criteria andTimeDeadlineIn(List<Date> values) {
            addCriterion("time_deadline in", values, "timeDeadline");
            return (Criteria) this;
        }

        public Criteria andTimeDeadlineNotIn(List<Date> values) {
            addCriterion("time_deadline not in", values, "timeDeadline");
            return (Criteria) this;
        }

        public Criteria andTimeDeadlineBetween(Date value1, Date value2) {
            addCriterion("time_deadline between", value1, value2, "timeDeadline");
            return (Criteria) this;
        }

        public Criteria andTimeDeadlineNotBetween(Date value1, Date value2) {
            addCriterion("time_deadline not between", value1, value2, "timeDeadline");
            return (Criteria) this;
        }

        public Criteria andTimeDeadline2IsNull() {
            addCriterion("time_deadline2 is null");
            return (Criteria) this;
        }

        public Criteria andTimeDeadline2IsNotNull() {
            addCriterion("time_deadline2 is not null");
            return (Criteria) this;
        }

        public Criteria andTimeDeadline2EqualTo(Date value) {
            addCriterion("time_deadline2 =", value, "timeDeadline2");
            return (Criteria) this;
        }

        public Criteria andTimeDeadline2NotEqualTo(Date value) {
            addCriterion("time_deadline2 <>", value, "timeDeadline2");
            return (Criteria) this;
        }

        public Criteria andTimeDeadline2GreaterThan(Date value) {
            addCriterion("time_deadline2 >", value, "timeDeadline2");
            return (Criteria) this;
        }

        public Criteria andTimeDeadline2GreaterThanOrEqualTo(Date value) {
            addCriterion("time_deadline2 >=", value, "timeDeadline2");
            return (Criteria) this;
        }

        public Criteria andTimeDeadline2LessThan(Date value) {
            addCriterion("time_deadline2 <", value, "timeDeadline2");
            return (Criteria) this;
        }

        public Criteria andTimeDeadline2LessThanOrEqualTo(Date value) {
            addCriterion("time_deadline2 <=", value, "timeDeadline2");
            return (Criteria) this;
        }

        public Criteria andTimeDeadline2In(List<Date> values) {
            addCriterion("time_deadline2 in", values, "timeDeadline2");
            return (Criteria) this;
        }

        public Criteria andTimeDeadline2NotIn(List<Date> values) {
            addCriterion("time_deadline2 not in", values, "timeDeadline2");
            return (Criteria) this;
        }

        public Criteria andTimeDeadline2Between(Date value1, Date value2) {
            addCriterion("time_deadline2 between", value1, value2, "timeDeadline2");
            return (Criteria) this;
        }

        public Criteria andTimeDeadline2NotBetween(Date value1, Date value2) {
            addCriterion("time_deadline2 not between", value1, value2, "timeDeadline2");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNull() {
            addCriterion("money is null");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNotNull() {
            addCriterion("money is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyEqualTo(BigDecimal value) {
            addCriterion("money =", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotEqualTo(BigDecimal value) {
            addCriterion("money <>", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThan(BigDecimal value) {
            addCriterion("money >", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("money >=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThan(BigDecimal value) {
            addCriterion("money <", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("money <=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyIn(List<BigDecimal> values) {
            addCriterion("money in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotIn(List<BigDecimal> values) {
            addCriterion("money not in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("money between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("money not between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLateIsNull() {
            addCriterion("money_late is null");
            return (Criteria) this;
        }

        public Criteria andMoneyLateIsNotNull() {
            addCriterion("money_late is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyLateEqualTo(BigDecimal value) {
            addCriterion("money_late =", value, "moneyLate");
            return (Criteria) this;
        }

        public Criteria andMoneyLateNotEqualTo(BigDecimal value) {
            addCriterion("money_late <>", value, "moneyLate");
            return (Criteria) this;
        }

        public Criteria andMoneyLateGreaterThan(BigDecimal value) {
            addCriterion("money_late >", value, "moneyLate");
            return (Criteria) this;
        }

        public Criteria andMoneyLateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("money_late >=", value, "moneyLate");
            return (Criteria) this;
        }

        public Criteria andMoneyLateLessThan(BigDecimal value) {
            addCriterion("money_late <", value, "moneyLate");
            return (Criteria) this;
        }

        public Criteria andMoneyLateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("money_late <=", value, "moneyLate");
            return (Criteria) this;
        }

        public Criteria andMoneyLateIn(List<BigDecimal> values) {
            addCriterion("money_late in", values, "moneyLate");
            return (Criteria) this;
        }

        public Criteria andMoneyLateNotIn(List<BigDecimal> values) {
            addCriterion("money_late not in", values, "moneyLate");
            return (Criteria) this;
        }

        public Criteria andMoneyLateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("money_late between", value1, value2, "moneyLate");
            return (Criteria) this;
        }

        public Criteria andMoneyLateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("money_late not between", value1, value2, "moneyLate");
            return (Criteria) this;
        }

        public Criteria andTimeScoreIsNull() {
            addCriterion("time_score is null");
            return (Criteria) this;
        }

        public Criteria andTimeScoreIsNotNull() {
            addCriterion("time_score is not null");
            return (Criteria) this;
        }

        public Criteria andTimeScoreEqualTo(Date value) {
            addCriterion("time_score =", value, "timeScore");
            return (Criteria) this;
        }

        public Criteria andTimeScoreNotEqualTo(Date value) {
            addCriterion("time_score <>", value, "timeScore");
            return (Criteria) this;
        }

        public Criteria andTimeScoreGreaterThan(Date value) {
            addCriterion("time_score >", value, "timeScore");
            return (Criteria) this;
        }

        public Criteria andTimeScoreGreaterThanOrEqualTo(Date value) {
            addCriterion("time_score >=", value, "timeScore");
            return (Criteria) this;
        }

        public Criteria andTimeScoreLessThan(Date value) {
            addCriterion("time_score <", value, "timeScore");
            return (Criteria) this;
        }

        public Criteria andTimeScoreLessThanOrEqualTo(Date value) {
            addCriterion("time_score <=", value, "timeScore");
            return (Criteria) this;
        }

        public Criteria andTimeScoreIn(List<Date> values) {
            addCriterion("time_score in", values, "timeScore");
            return (Criteria) this;
        }

        public Criteria andTimeScoreNotIn(List<Date> values) {
            addCriterion("time_score not in", values, "timeScore");
            return (Criteria) this;
        }

        public Criteria andTimeScoreBetween(Date value1, Date value2) {
            addCriterion("time_score between", value1, value2, "timeScore");
            return (Criteria) this;
        }

        public Criteria andTimeScoreNotBetween(Date value1, Date value2) {
            addCriterion("time_score not between", value1, value2, "timeScore");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andTimeUpdateIsNull() {
            addCriterion("time_update is null");
            return (Criteria) this;
        }

        public Criteria andTimeUpdateIsNotNull() {
            addCriterion("time_update is not null");
            return (Criteria) this;
        }

        public Criteria andTimeUpdateEqualTo(Date value) {
            addCriterion("time_update =", value, "timeUpdate");
            return (Criteria) this;
        }

        public Criteria andTimeUpdateNotEqualTo(Date value) {
            addCriterion("time_update <>", value, "timeUpdate");
            return (Criteria) this;
        }

        public Criteria andTimeUpdateGreaterThan(Date value) {
            addCriterion("time_update >", value, "timeUpdate");
            return (Criteria) this;
        }

        public Criteria andTimeUpdateGreaterThanOrEqualTo(Date value) {
            addCriterion("time_update >=", value, "timeUpdate");
            return (Criteria) this;
        }

        public Criteria andTimeUpdateLessThan(Date value) {
            addCriterion("time_update <", value, "timeUpdate");
            return (Criteria) this;
        }

        public Criteria andTimeUpdateLessThanOrEqualTo(Date value) {
            addCriterion("time_update <=", value, "timeUpdate");
            return (Criteria) this;
        }

        public Criteria andTimeUpdateIn(List<Date> values) {
            addCriterion("time_update in", values, "timeUpdate");
            return (Criteria) this;
        }

        public Criteria andTimeUpdateNotIn(List<Date> values) {
            addCriterion("time_update not in", values, "timeUpdate");
            return (Criteria) this;
        }

        public Criteria andTimeUpdateBetween(Date value1, Date value2) {
            addCriterion("time_update between", value1, value2, "timeUpdate");
            return (Criteria) this;
        }

        public Criteria andTimeUpdateNotBetween(Date value1, Date value2) {
            addCriterion("time_update not between", value1, value2, "timeUpdate");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table regys_date
     *
     * @mbggenerated do_not_delete_during_merge Tue Jun 21 00:00:04 CST 2016
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table regys_date
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}