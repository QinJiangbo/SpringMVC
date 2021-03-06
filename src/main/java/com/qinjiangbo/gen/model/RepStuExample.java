package com.qinjiangbo.gen.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RepStuExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table rep_stu
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table rep_stu
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table rep_stu
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rep_stu
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public RepStuExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rep_stu
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rep_stu
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rep_stu
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rep_stu
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rep_stu
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rep_stu
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rep_stu
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
     * This method corresponds to the database table rep_stu
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
     * This method corresponds to the database table rep_stu
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rep_stu
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
     * This class corresponds to the database table rep_stu
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andAttrIdIsNull() {
            addCriterion("attr_id is null");
            return (Criteria) this;
        }

        public Criteria andAttrIdIsNotNull() {
            addCriterion("attr_id is not null");
            return (Criteria) this;
        }

        public Criteria andAttrIdEqualTo(Long value) {
            addCriterion("attr_id =", value, "attrId");
            return (Criteria) this;
        }

        public Criteria andAttrIdNotEqualTo(Long value) {
            addCriterion("attr_id <>", value, "attrId");
            return (Criteria) this;
        }

        public Criteria andAttrIdGreaterThan(Long value) {
            addCriterion("attr_id >", value, "attrId");
            return (Criteria) this;
        }

        public Criteria andAttrIdGreaterThanOrEqualTo(Long value) {
            addCriterion("attr_id >=", value, "attrId");
            return (Criteria) this;
        }

        public Criteria andAttrIdLessThan(Long value) {
            addCriterion("attr_id <", value, "attrId");
            return (Criteria) this;
        }

        public Criteria andAttrIdLessThanOrEqualTo(Long value) {
            addCriterion("attr_id <=", value, "attrId");
            return (Criteria) this;
        }

        public Criteria andAttrIdIn(List<Long> values) {
            addCriterion("attr_id in", values, "attrId");
            return (Criteria) this;
        }

        public Criteria andAttrIdNotIn(List<Long> values) {
            addCriterion("attr_id not in", values, "attrId");
            return (Criteria) this;
        }

        public Criteria andAttrIdBetween(Long value1, Long value2) {
            addCriterion("attr_id between", value1, value2, "attrId");
            return (Criteria) this;
        }

        public Criteria andAttrIdNotBetween(Long value1, Long value2) {
            addCriterion("attr_id not between", value1, value2, "attrId");
            return (Criteria) this;
        }

        public Criteria andTestTypeIsNull() {
            addCriterion("test_type is null");
            return (Criteria) this;
        }

        public Criteria andTestTypeIsNotNull() {
            addCriterion("test_type is not null");
            return (Criteria) this;
        }

        public Criteria andTestTypeEqualTo(Long value) {
            addCriterion("test_type =", value, "testType");
            return (Criteria) this;
        }

        public Criteria andTestTypeNotEqualTo(Long value) {
            addCriterion("test_type <>", value, "testType");
            return (Criteria) this;
        }

        public Criteria andTestTypeGreaterThan(Long value) {
            addCriterion("test_type >", value, "testType");
            return (Criteria) this;
        }

        public Criteria andTestTypeGreaterThanOrEqualTo(Long value) {
            addCriterion("test_type >=", value, "testType");
            return (Criteria) this;
        }

        public Criteria andTestTypeLessThan(Long value) {
            addCriterion("test_type <", value, "testType");
            return (Criteria) this;
        }

        public Criteria andTestTypeLessThanOrEqualTo(Long value) {
            addCriterion("test_type <=", value, "testType");
            return (Criteria) this;
        }

        public Criteria andTestTypeIn(List<Long> values) {
            addCriterion("test_type in", values, "testType");
            return (Criteria) this;
        }

        public Criteria andTestTypeNotIn(List<Long> values) {
            addCriterion("test_type not in", values, "testType");
            return (Criteria) this;
        }

        public Criteria andTestTypeBetween(Long value1, Long value2) {
            addCriterion("test_type between", value1, value2, "testType");
            return (Criteria) this;
        }

        public Criteria andTestTypeNotBetween(Long value1, Long value2) {
            addCriterion("test_type not between", value1, value2, "testType");
            return (Criteria) this;
        }

        public Criteria andTimeConsumingIsNull() {
            addCriterion("time_consuming is null");
            return (Criteria) this;
        }

        public Criteria andTimeConsumingIsNotNull() {
            addCriterion("time_consuming is not null");
            return (Criteria) this;
        }

        public Criteria andTimeConsumingEqualTo(Integer value) {
            addCriterion("time_consuming =", value, "timeConsuming");
            return (Criteria) this;
        }

        public Criteria andTimeConsumingNotEqualTo(Integer value) {
            addCriterion("time_consuming <>", value, "timeConsuming");
            return (Criteria) this;
        }

        public Criteria andTimeConsumingGreaterThan(Integer value) {
            addCriterion("time_consuming >", value, "timeConsuming");
            return (Criteria) this;
        }

        public Criteria andTimeConsumingGreaterThanOrEqualTo(Integer value) {
            addCriterion("time_consuming >=", value, "timeConsuming");
            return (Criteria) this;
        }

        public Criteria andTimeConsumingLessThan(Integer value) {
            addCriterion("time_consuming <", value, "timeConsuming");
            return (Criteria) this;
        }

        public Criteria andTimeConsumingLessThanOrEqualTo(Integer value) {
            addCriterion("time_consuming <=", value, "timeConsuming");
            return (Criteria) this;
        }

        public Criteria andTimeConsumingIn(List<Integer> values) {
            addCriterion("time_consuming in", values, "timeConsuming");
            return (Criteria) this;
        }

        public Criteria andTimeConsumingNotIn(List<Integer> values) {
            addCriterion("time_consuming not in", values, "timeConsuming");
            return (Criteria) this;
        }

        public Criteria andTimeConsumingBetween(Integer value1, Integer value2) {
            addCriterion("time_consuming between", value1, value2, "timeConsuming");
            return (Criteria) this;
        }

        public Criteria andTimeConsumingNotBetween(Integer value1, Integer value2) {
            addCriterion("time_consuming not between", value1, value2, "timeConsuming");
            return (Criteria) this;
        }

        public Criteria andTimeSecIsNull() {
            addCriterion("time_sec is null");
            return (Criteria) this;
        }

        public Criteria andTimeSecIsNotNull() {
            addCriterion("time_sec is not null");
            return (Criteria) this;
        }

        public Criteria andTimeSecEqualTo(Integer value) {
            addCriterion("time_sec =", value, "timeSec");
            return (Criteria) this;
        }

        public Criteria andTimeSecNotEqualTo(Integer value) {
            addCriterion("time_sec <>", value, "timeSec");
            return (Criteria) this;
        }

        public Criteria andTimeSecGreaterThan(Integer value) {
            addCriterion("time_sec >", value, "timeSec");
            return (Criteria) this;
        }

        public Criteria andTimeSecGreaterThanOrEqualTo(Integer value) {
            addCriterion("time_sec >=", value, "timeSec");
            return (Criteria) this;
        }

        public Criteria andTimeSecLessThan(Integer value) {
            addCriterion("time_sec <", value, "timeSec");
            return (Criteria) this;
        }

        public Criteria andTimeSecLessThanOrEqualTo(Integer value) {
            addCriterion("time_sec <=", value, "timeSec");
            return (Criteria) this;
        }

        public Criteria andTimeSecIn(List<Integer> values) {
            addCriterion("time_sec in", values, "timeSec");
            return (Criteria) this;
        }

        public Criteria andTimeSecNotIn(List<Integer> values) {
            addCriterion("time_sec not in", values, "timeSec");
            return (Criteria) this;
        }

        public Criteria andTimeSecBetween(Integer value1, Integer value2) {
            addCriterion("time_sec between", value1, value2, "timeSec");
            return (Criteria) this;
        }

        public Criteria andTimeSecNotBetween(Integer value1, Integer value2) {
            addCriterion("time_sec not between", value1, value2, "timeSec");
            return (Criteria) this;
        }

        public Criteria andNumAllIsNull() {
            addCriterion("num_all is null");
            return (Criteria) this;
        }

        public Criteria andNumAllIsNotNull() {
            addCriterion("num_all is not null");
            return (Criteria) this;
        }

        public Criteria andNumAllEqualTo(Integer value) {
            addCriterion("num_all =", value, "numAll");
            return (Criteria) this;
        }

        public Criteria andNumAllNotEqualTo(Integer value) {
            addCriterion("num_all <>", value, "numAll");
            return (Criteria) this;
        }

        public Criteria andNumAllGreaterThan(Integer value) {
            addCriterion("num_all >", value, "numAll");
            return (Criteria) this;
        }

        public Criteria andNumAllGreaterThanOrEqualTo(Integer value) {
            addCriterion("num_all >=", value, "numAll");
            return (Criteria) this;
        }

        public Criteria andNumAllLessThan(Integer value) {
            addCriterion("num_all <", value, "numAll");
            return (Criteria) this;
        }

        public Criteria andNumAllLessThanOrEqualTo(Integer value) {
            addCriterion("num_all <=", value, "numAll");
            return (Criteria) this;
        }

        public Criteria andNumAllIn(List<Integer> values) {
            addCriterion("num_all in", values, "numAll");
            return (Criteria) this;
        }

        public Criteria andNumAllNotIn(List<Integer> values) {
            addCriterion("num_all not in", values, "numAll");
            return (Criteria) this;
        }

        public Criteria andNumAllBetween(Integer value1, Integer value2) {
            addCriterion("num_all between", value1, value2, "numAll");
            return (Criteria) this;
        }

        public Criteria andNumAllNotBetween(Integer value1, Integer value2) {
            addCriterion("num_all not between", value1, value2, "numAll");
            return (Criteria) this;
        }

        public Criteria andNumRightIsNull() {
            addCriterion("num_right is null");
            return (Criteria) this;
        }

        public Criteria andNumRightIsNotNull() {
            addCriterion("num_right is not null");
            return (Criteria) this;
        }

        public Criteria andNumRightEqualTo(Integer value) {
            addCriterion("num_right =", value, "numRight");
            return (Criteria) this;
        }

        public Criteria andNumRightNotEqualTo(Integer value) {
            addCriterion("num_right <>", value, "numRight");
            return (Criteria) this;
        }

        public Criteria andNumRightGreaterThan(Integer value) {
            addCriterion("num_right >", value, "numRight");
            return (Criteria) this;
        }

        public Criteria andNumRightGreaterThanOrEqualTo(Integer value) {
            addCriterion("num_right >=", value, "numRight");
            return (Criteria) this;
        }

        public Criteria andNumRightLessThan(Integer value) {
            addCriterion("num_right <", value, "numRight");
            return (Criteria) this;
        }

        public Criteria andNumRightLessThanOrEqualTo(Integer value) {
            addCriterion("num_right <=", value, "numRight");
            return (Criteria) this;
        }

        public Criteria andNumRightIn(List<Integer> values) {
            addCriterion("num_right in", values, "numRight");
            return (Criteria) this;
        }

        public Criteria andNumRightNotIn(List<Integer> values) {
            addCriterion("num_right not in", values, "numRight");
            return (Criteria) this;
        }

        public Criteria andNumRightBetween(Integer value1, Integer value2) {
            addCriterion("num_right between", value1, value2, "numRight");
            return (Criteria) this;
        }

        public Criteria andNumRightNotBetween(Integer value1, Integer value2) {
            addCriterion("num_right not between", value1, value2, "numRight");
            return (Criteria) this;
        }

        public Criteria andNumWrongIsNull() {
            addCriterion("num_wrong is null");
            return (Criteria) this;
        }

        public Criteria andNumWrongIsNotNull() {
            addCriterion("num_wrong is not null");
            return (Criteria) this;
        }

        public Criteria andNumWrongEqualTo(Integer value) {
            addCriterion("num_wrong =", value, "numWrong");
            return (Criteria) this;
        }

        public Criteria andNumWrongNotEqualTo(Integer value) {
            addCriterion("num_wrong <>", value, "numWrong");
            return (Criteria) this;
        }

        public Criteria andNumWrongGreaterThan(Integer value) {
            addCriterion("num_wrong >", value, "numWrong");
            return (Criteria) this;
        }

        public Criteria andNumWrongGreaterThanOrEqualTo(Integer value) {
            addCriterion("num_wrong >=", value, "numWrong");
            return (Criteria) this;
        }

        public Criteria andNumWrongLessThan(Integer value) {
            addCriterion("num_wrong <", value, "numWrong");
            return (Criteria) this;
        }

        public Criteria andNumWrongLessThanOrEqualTo(Integer value) {
            addCriterion("num_wrong <=", value, "numWrong");
            return (Criteria) this;
        }

        public Criteria andNumWrongIn(List<Integer> values) {
            addCriterion("num_wrong in", values, "numWrong");
            return (Criteria) this;
        }

        public Criteria andNumWrongNotIn(List<Integer> values) {
            addCriterion("num_wrong not in", values, "numWrong");
            return (Criteria) this;
        }

        public Criteria andNumWrongBetween(Integer value1, Integer value2) {
            addCriterion("num_wrong between", value1, value2, "numWrong");
            return (Criteria) this;
        }

        public Criteria andNumWrongNotBetween(Integer value1, Integer value2) {
            addCriterion("num_wrong not between", value1, value2, "numWrong");
            return (Criteria) this;
        }

        public Criteria andScoreIsNull() {
            addCriterion("score is null");
            return (Criteria) this;
        }

        public Criteria andScoreIsNotNull() {
            addCriterion("score is not null");
            return (Criteria) this;
        }

        public Criteria andScoreEqualTo(BigDecimal value) {
            addCriterion("score =", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotEqualTo(BigDecimal value) {
            addCriterion("score <>", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThan(BigDecimal value) {
            addCriterion("score >", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("score >=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThan(BigDecimal value) {
            addCriterion("score <", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThanOrEqualTo(BigDecimal value) {
            addCriterion("score <=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreIn(List<BigDecimal> values) {
            addCriterion("score in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotIn(List<BigDecimal> values) {
            addCriterion("score not in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("score between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("score not between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScorePrevIsNull() {
            addCriterion("score_prev is null");
            return (Criteria) this;
        }

        public Criteria andScorePrevIsNotNull() {
            addCriterion("score_prev is not null");
            return (Criteria) this;
        }

        public Criteria andScorePrevEqualTo(BigDecimal value) {
            addCriterion("score_prev =", value, "scorePrev");
            return (Criteria) this;
        }

        public Criteria andScorePrevNotEqualTo(BigDecimal value) {
            addCriterion("score_prev <>", value, "scorePrev");
            return (Criteria) this;
        }

        public Criteria andScorePrevGreaterThan(BigDecimal value) {
            addCriterion("score_prev >", value, "scorePrev");
            return (Criteria) this;
        }

        public Criteria andScorePrevGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("score_prev >=", value, "scorePrev");
            return (Criteria) this;
        }

        public Criteria andScorePrevLessThan(BigDecimal value) {
            addCriterion("score_prev <", value, "scorePrev");
            return (Criteria) this;
        }

        public Criteria andScorePrevLessThanOrEqualTo(BigDecimal value) {
            addCriterion("score_prev <=", value, "scorePrev");
            return (Criteria) this;
        }

        public Criteria andScorePrevIn(List<BigDecimal> values) {
            addCriterion("score_prev in", values, "scorePrev");
            return (Criteria) this;
        }

        public Criteria andScorePrevNotIn(List<BigDecimal> values) {
            addCriterion("score_prev not in", values, "scorePrev");
            return (Criteria) this;
        }

        public Criteria andScorePrevBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("score_prev between", value1, value2, "scorePrev");
            return (Criteria) this;
        }

        public Criteria andScorePrevNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("score_prev not between", value1, value2, "scorePrev");
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
     * This class corresponds to the database table rep_stu
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
     * This class corresponds to the database table rep_stu
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