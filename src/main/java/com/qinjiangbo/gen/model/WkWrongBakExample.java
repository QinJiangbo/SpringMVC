package com.qinjiangbo.gen.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WkWrongBakExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table wk_wrong_bak
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table wk_wrong_bak
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table wk_wrong_bak
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wk_wrong_bak
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public WkWrongBakExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wk_wrong_bak
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wk_wrong_bak
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wk_wrong_bak
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wk_wrong_bak
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wk_wrong_bak
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wk_wrong_bak
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wk_wrong_bak
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
     * This method corresponds to the database table wk_wrong_bak
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
     * This method corresponds to the database table wk_wrong_bak
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wk_wrong_bak
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
     * This class corresponds to the database table wk_wrong_bak
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

        public Criteria andQueIdIsNull() {
            addCriterion("que_id is null");
            return (Criteria) this;
        }

        public Criteria andQueIdIsNotNull() {
            addCriterion("que_id is not null");
            return (Criteria) this;
        }

        public Criteria andQueIdEqualTo(Long value) {
            addCriterion("que_id =", value, "queId");
            return (Criteria) this;
        }

        public Criteria andQueIdNotEqualTo(Long value) {
            addCriterion("que_id <>", value, "queId");
            return (Criteria) this;
        }

        public Criteria andQueIdGreaterThan(Long value) {
            addCriterion("que_id >", value, "queId");
            return (Criteria) this;
        }

        public Criteria andQueIdGreaterThanOrEqualTo(Long value) {
            addCriterion("que_id >=", value, "queId");
            return (Criteria) this;
        }

        public Criteria andQueIdLessThan(Long value) {
            addCriterion("que_id <", value, "queId");
            return (Criteria) this;
        }

        public Criteria andQueIdLessThanOrEqualTo(Long value) {
            addCriterion("que_id <=", value, "queId");
            return (Criteria) this;
        }

        public Criteria andQueIdIn(List<Long> values) {
            addCriterion("que_id in", values, "queId");
            return (Criteria) this;
        }

        public Criteria andQueIdNotIn(List<Long> values) {
            addCriterion("que_id not in", values, "queId");
            return (Criteria) this;
        }

        public Criteria andQueIdBetween(Long value1, Long value2) {
            addCriterion("que_id between", value1, value2, "queId");
            return (Criteria) this;
        }

        public Criteria andQueIdNotBetween(Long value1, Long value2) {
            addCriterion("que_id not between", value1, value2, "queId");
            return (Criteria) this;
        }

        public Criteria andTimeFirstIsNull() {
            addCriterion("time_first is null");
            return (Criteria) this;
        }

        public Criteria andTimeFirstIsNotNull() {
            addCriterion("time_first is not null");
            return (Criteria) this;
        }

        public Criteria andTimeFirstEqualTo(Date value) {
            addCriterion("time_first =", value, "timeFirst");
            return (Criteria) this;
        }

        public Criteria andTimeFirstNotEqualTo(Date value) {
            addCriterion("time_first <>", value, "timeFirst");
            return (Criteria) this;
        }

        public Criteria andTimeFirstGreaterThan(Date value) {
            addCriterion("time_first >", value, "timeFirst");
            return (Criteria) this;
        }

        public Criteria andTimeFirstGreaterThanOrEqualTo(Date value) {
            addCriterion("time_first >=", value, "timeFirst");
            return (Criteria) this;
        }

        public Criteria andTimeFirstLessThan(Date value) {
            addCriterion("time_first <", value, "timeFirst");
            return (Criteria) this;
        }

        public Criteria andTimeFirstLessThanOrEqualTo(Date value) {
            addCriterion("time_first <=", value, "timeFirst");
            return (Criteria) this;
        }

        public Criteria andTimeFirstIn(List<Date> values) {
            addCriterion("time_first in", values, "timeFirst");
            return (Criteria) this;
        }

        public Criteria andTimeFirstNotIn(List<Date> values) {
            addCriterion("time_first not in", values, "timeFirst");
            return (Criteria) this;
        }

        public Criteria andTimeFirstBetween(Date value1, Date value2) {
            addCriterion("time_first between", value1, value2, "timeFirst");
            return (Criteria) this;
        }

        public Criteria andTimeFirstNotBetween(Date value1, Date value2) {
            addCriterion("time_first not between", value1, value2, "timeFirst");
            return (Criteria) this;
        }

        public Criteria andTimeLastIsNull() {
            addCriterion("time_last is null");
            return (Criteria) this;
        }

        public Criteria andTimeLastIsNotNull() {
            addCriterion("time_last is not null");
            return (Criteria) this;
        }

        public Criteria andTimeLastEqualTo(Date value) {
            addCriterion("time_last =", value, "timeLast");
            return (Criteria) this;
        }

        public Criteria andTimeLastNotEqualTo(Date value) {
            addCriterion("time_last <>", value, "timeLast");
            return (Criteria) this;
        }

        public Criteria andTimeLastGreaterThan(Date value) {
            addCriterion("time_last >", value, "timeLast");
            return (Criteria) this;
        }

        public Criteria andTimeLastGreaterThanOrEqualTo(Date value) {
            addCriterion("time_last >=", value, "timeLast");
            return (Criteria) this;
        }

        public Criteria andTimeLastLessThan(Date value) {
            addCriterion("time_last <", value, "timeLast");
            return (Criteria) this;
        }

        public Criteria andTimeLastLessThanOrEqualTo(Date value) {
            addCriterion("time_last <=", value, "timeLast");
            return (Criteria) this;
        }

        public Criteria andTimeLastIn(List<Date> values) {
            addCriterion("time_last in", values, "timeLast");
            return (Criteria) this;
        }

        public Criteria andTimeLastNotIn(List<Date> values) {
            addCriterion("time_last not in", values, "timeLast");
            return (Criteria) this;
        }

        public Criteria andTimeLastBetween(Date value1, Date value2) {
            addCriterion("time_last between", value1, value2, "timeLast");
            return (Criteria) this;
        }

        public Criteria andTimeLastNotBetween(Date value1, Date value2) {
            addCriterion("time_last not between", value1, value2, "timeLast");
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
     * This class corresponds to the database table wk_wrong_bak
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
     * This class corresponds to the database table wk_wrong_bak
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