package com.qinjiangbo.gen.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RegktKtPlanExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table regkt_kt_plan
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table regkt_kt_plan
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table regkt_kt_plan
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regkt_kt_plan
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public RegktKtPlanExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regkt_kt_plan
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regkt_kt_plan
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regkt_kt_plan
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regkt_kt_plan
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regkt_kt_plan
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regkt_kt_plan
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regkt_kt_plan
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
     * This method corresponds to the database table regkt_kt_plan
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
     * This method corresponds to the database table regkt_kt_plan
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regkt_kt_plan
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
     * This class corresponds to the database table regkt_kt_plan
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

        public Criteria andPlainIdIsNull() {
            addCriterion("plain_id is null");
            return (Criteria) this;
        }

        public Criteria andPlainIdIsNotNull() {
            addCriterion("plain_id is not null");
            return (Criteria) this;
        }

        public Criteria andPlainIdEqualTo(Long value) {
            addCriterion("plain_id =", value, "plainId");
            return (Criteria) this;
        }

        public Criteria andPlainIdNotEqualTo(Long value) {
            addCriterion("plain_id <>", value, "plainId");
            return (Criteria) this;
        }

        public Criteria andPlainIdGreaterThan(Long value) {
            addCriterion("plain_id >", value, "plainId");
            return (Criteria) this;
        }

        public Criteria andPlainIdGreaterThanOrEqualTo(Long value) {
            addCriterion("plain_id >=", value, "plainId");
            return (Criteria) this;
        }

        public Criteria andPlainIdLessThan(Long value) {
            addCriterion("plain_id <", value, "plainId");
            return (Criteria) this;
        }

        public Criteria andPlainIdLessThanOrEqualTo(Long value) {
            addCriterion("plain_id <=", value, "plainId");
            return (Criteria) this;
        }

        public Criteria andPlainIdIn(List<Long> values) {
            addCriterion("plain_id in", values, "plainId");
            return (Criteria) this;
        }

        public Criteria andPlainIdNotIn(List<Long> values) {
            addCriterion("plain_id not in", values, "plainId");
            return (Criteria) this;
        }

        public Criteria andPlainIdBetween(Long value1, Long value2) {
            addCriterion("plain_id between", value1, value2, "plainId");
            return (Criteria) this;
        }

        public Criteria andPlainIdNotBetween(Long value1, Long value2) {
            addCriterion("plain_id not between", value1, value2, "plainId");
            return (Criteria) this;
        }

        public Criteria andKtIdIsNull() {
            addCriterion("kt_id is null");
            return (Criteria) this;
        }

        public Criteria andKtIdIsNotNull() {
            addCriterion("kt_id is not null");
            return (Criteria) this;
        }

        public Criteria andKtIdEqualTo(Long value) {
            addCriterion("kt_id =", value, "ktId");
            return (Criteria) this;
        }

        public Criteria andKtIdNotEqualTo(Long value) {
            addCriterion("kt_id <>", value, "ktId");
            return (Criteria) this;
        }

        public Criteria andKtIdGreaterThan(Long value) {
            addCriterion("kt_id >", value, "ktId");
            return (Criteria) this;
        }

        public Criteria andKtIdGreaterThanOrEqualTo(Long value) {
            addCriterion("kt_id >=", value, "ktId");
            return (Criteria) this;
        }

        public Criteria andKtIdLessThan(Long value) {
            addCriterion("kt_id <", value, "ktId");
            return (Criteria) this;
        }

        public Criteria andKtIdLessThanOrEqualTo(Long value) {
            addCriterion("kt_id <=", value, "ktId");
            return (Criteria) this;
        }

        public Criteria andKtIdIn(List<Long> values) {
            addCriterion("kt_id in", values, "ktId");
            return (Criteria) this;
        }

        public Criteria andKtIdNotIn(List<Long> values) {
            addCriterion("kt_id not in", values, "ktId");
            return (Criteria) this;
        }

        public Criteria andKtIdBetween(Long value1, Long value2) {
            addCriterion("kt_id between", value1, value2, "ktId");
            return (Criteria) this;
        }

        public Criteria andKtIdNotBetween(Long value1, Long value2) {
            addCriterion("kt_id not between", value1, value2, "ktId");
            return (Criteria) this;
        }

        public Criteria andSortNoIsNull() {
            addCriterion("sort_no is null");
            return (Criteria) this;
        }

        public Criteria andSortNoIsNotNull() {
            addCriterion("sort_no is not null");
            return (Criteria) this;
        }

        public Criteria andSortNoEqualTo(Long value) {
            addCriterion("sort_no =", value, "sortNo");
            return (Criteria) this;
        }

        public Criteria andSortNoNotEqualTo(Long value) {
            addCriterion("sort_no <>", value, "sortNo");
            return (Criteria) this;
        }

        public Criteria andSortNoGreaterThan(Long value) {
            addCriterion("sort_no >", value, "sortNo");
            return (Criteria) this;
        }

        public Criteria andSortNoGreaterThanOrEqualTo(Long value) {
            addCriterion("sort_no >=", value, "sortNo");
            return (Criteria) this;
        }

        public Criteria andSortNoLessThan(Long value) {
            addCriterion("sort_no <", value, "sortNo");
            return (Criteria) this;
        }

        public Criteria andSortNoLessThanOrEqualTo(Long value) {
            addCriterion("sort_no <=", value, "sortNo");
            return (Criteria) this;
        }

        public Criteria andSortNoIn(List<Long> values) {
            addCriterion("sort_no in", values, "sortNo");
            return (Criteria) this;
        }

        public Criteria andSortNoNotIn(List<Long> values) {
            addCriterion("sort_no not in", values, "sortNo");
            return (Criteria) this;
        }

        public Criteria andSortNoBetween(Long value1, Long value2) {
            addCriterion("sort_no between", value1, value2, "sortNo");
            return (Criteria) this;
        }

        public Criteria andSortNoNotBetween(Long value1, Long value2) {
            addCriterion("sort_no not between", value1, value2, "sortNo");
            return (Criteria) this;
        }

        public Criteria andTrafficIsNull() {
            addCriterion("traffic is null");
            return (Criteria) this;
        }

        public Criteria andTrafficIsNotNull() {
            addCriterion("traffic is not null");
            return (Criteria) this;
        }

        public Criteria andTrafficEqualTo(String value) {
            addCriterion("traffic =", value, "traffic");
            return (Criteria) this;
        }

        public Criteria andTrafficNotEqualTo(String value) {
            addCriterion("traffic <>", value, "traffic");
            return (Criteria) this;
        }

        public Criteria andTrafficGreaterThan(String value) {
            addCriterion("traffic >", value, "traffic");
            return (Criteria) this;
        }

        public Criteria andTrafficGreaterThanOrEqualTo(String value) {
            addCriterion("traffic >=", value, "traffic");
            return (Criteria) this;
        }

        public Criteria andTrafficLessThan(String value) {
            addCriterion("traffic <", value, "traffic");
            return (Criteria) this;
        }

        public Criteria andTrafficLessThanOrEqualTo(String value) {
            addCriterion("traffic <=", value, "traffic");
            return (Criteria) this;
        }

        public Criteria andTrafficLike(String value) {
            addCriterion("traffic like", value, "traffic");
            return (Criteria) this;
        }

        public Criteria andTrafficNotLike(String value) {
            addCriterion("traffic not like", value, "traffic");
            return (Criteria) this;
        }

        public Criteria andTrafficIn(List<String> values) {
            addCriterion("traffic in", values, "traffic");
            return (Criteria) this;
        }

        public Criteria andTrafficNotIn(List<String> values) {
            addCriterion("traffic not in", values, "traffic");
            return (Criteria) this;
        }

        public Criteria andTrafficBetween(String value1, String value2) {
            addCriterion("traffic between", value1, value2, "traffic");
            return (Criteria) this;
        }

        public Criteria andTrafficNotBetween(String value1, String value2) {
            addCriterion("traffic not between", value1, value2, "traffic");
            return (Criteria) this;
        }

        public Criteria andSchedulingIsNull() {
            addCriterion("scheduling is null");
            return (Criteria) this;
        }

        public Criteria andSchedulingIsNotNull() {
            addCriterion("scheduling is not null");
            return (Criteria) this;
        }

        public Criteria andSchedulingEqualTo(String value) {
            addCriterion("scheduling =", value, "scheduling");
            return (Criteria) this;
        }

        public Criteria andSchedulingNotEqualTo(String value) {
            addCriterion("scheduling <>", value, "scheduling");
            return (Criteria) this;
        }

        public Criteria andSchedulingGreaterThan(String value) {
            addCriterion("scheduling >", value, "scheduling");
            return (Criteria) this;
        }

        public Criteria andSchedulingGreaterThanOrEqualTo(String value) {
            addCriterion("scheduling >=", value, "scheduling");
            return (Criteria) this;
        }

        public Criteria andSchedulingLessThan(String value) {
            addCriterion("scheduling <", value, "scheduling");
            return (Criteria) this;
        }

        public Criteria andSchedulingLessThanOrEqualTo(String value) {
            addCriterion("scheduling <=", value, "scheduling");
            return (Criteria) this;
        }

        public Criteria andSchedulingLike(String value) {
            addCriterion("scheduling like", value, "scheduling");
            return (Criteria) this;
        }

        public Criteria andSchedulingNotLike(String value) {
            addCriterion("scheduling not like", value, "scheduling");
            return (Criteria) this;
        }

        public Criteria andSchedulingIn(List<String> values) {
            addCriterion("scheduling in", values, "scheduling");
            return (Criteria) this;
        }

        public Criteria andSchedulingNotIn(List<String> values) {
            addCriterion("scheduling not in", values, "scheduling");
            return (Criteria) this;
        }

        public Criteria andSchedulingBetween(String value1, String value2) {
            addCriterion("scheduling between", value1, value2, "scheduling");
            return (Criteria) this;
        }

        public Criteria andSchedulingNotBetween(String value1, String value2) {
            addCriterion("scheduling not between", value1, value2, "scheduling");
            return (Criteria) this;
        }

        public Criteria andFoodIsNull() {
            addCriterion("food is null");
            return (Criteria) this;
        }

        public Criteria andFoodIsNotNull() {
            addCriterion("food is not null");
            return (Criteria) this;
        }

        public Criteria andFoodEqualTo(String value) {
            addCriterion("food =", value, "food");
            return (Criteria) this;
        }

        public Criteria andFoodNotEqualTo(String value) {
            addCriterion("food <>", value, "food");
            return (Criteria) this;
        }

        public Criteria andFoodGreaterThan(String value) {
            addCriterion("food >", value, "food");
            return (Criteria) this;
        }

        public Criteria andFoodGreaterThanOrEqualTo(String value) {
            addCriterion("food >=", value, "food");
            return (Criteria) this;
        }

        public Criteria andFoodLessThan(String value) {
            addCriterion("food <", value, "food");
            return (Criteria) this;
        }

        public Criteria andFoodLessThanOrEqualTo(String value) {
            addCriterion("food <=", value, "food");
            return (Criteria) this;
        }

        public Criteria andFoodLike(String value) {
            addCriterion("food like", value, "food");
            return (Criteria) this;
        }

        public Criteria andFoodNotLike(String value) {
            addCriterion("food not like", value, "food");
            return (Criteria) this;
        }

        public Criteria andFoodIn(List<String> values) {
            addCriterion("food in", values, "food");
            return (Criteria) this;
        }

        public Criteria andFoodNotIn(List<String> values) {
            addCriterion("food not in", values, "food");
            return (Criteria) this;
        }

        public Criteria andFoodBetween(String value1, String value2) {
            addCriterion("food between", value1, value2, "food");
            return (Criteria) this;
        }

        public Criteria andFoodNotBetween(String value1, String value2) {
            addCriterion("food not between", value1, value2, "food");
            return (Criteria) this;
        }

        public Criteria andHotelIsNull() {
            addCriterion("hotel is null");
            return (Criteria) this;
        }

        public Criteria andHotelIsNotNull() {
            addCriterion("hotel is not null");
            return (Criteria) this;
        }

        public Criteria andHotelEqualTo(String value) {
            addCriterion("hotel =", value, "hotel");
            return (Criteria) this;
        }

        public Criteria andHotelNotEqualTo(String value) {
            addCriterion("hotel <>", value, "hotel");
            return (Criteria) this;
        }

        public Criteria andHotelGreaterThan(String value) {
            addCriterion("hotel >", value, "hotel");
            return (Criteria) this;
        }

        public Criteria andHotelGreaterThanOrEqualTo(String value) {
            addCriterion("hotel >=", value, "hotel");
            return (Criteria) this;
        }

        public Criteria andHotelLessThan(String value) {
            addCriterion("hotel <", value, "hotel");
            return (Criteria) this;
        }

        public Criteria andHotelLessThanOrEqualTo(String value) {
            addCriterion("hotel <=", value, "hotel");
            return (Criteria) this;
        }

        public Criteria andHotelLike(String value) {
            addCriterion("hotel like", value, "hotel");
            return (Criteria) this;
        }

        public Criteria andHotelNotLike(String value) {
            addCriterion("hotel not like", value, "hotel");
            return (Criteria) this;
        }

        public Criteria andHotelIn(List<String> values) {
            addCriterion("hotel in", values, "hotel");
            return (Criteria) this;
        }

        public Criteria andHotelNotIn(List<String> values) {
            addCriterion("hotel not in", values, "hotel");
            return (Criteria) this;
        }

        public Criteria andHotelBetween(String value1, String value2) {
            addCriterion("hotel between", value1, value2, "hotel");
            return (Criteria) this;
        }

        public Criteria andHotelNotBetween(String value1, String value2) {
            addCriterion("hotel not between", value1, value2, "hotel");
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
     * This class corresponds to the database table regkt_kt_plan
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
     * This class corresponds to the database table regkt_kt_plan
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