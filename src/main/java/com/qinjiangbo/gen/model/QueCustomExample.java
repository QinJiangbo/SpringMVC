package com.qinjiangbo.gen.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class QueCustomExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table que_custom
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table que_custom
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table que_custom
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table que_custom
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public QueCustomExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table que_custom
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table que_custom
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table que_custom
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table que_custom
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table que_custom
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table que_custom
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table que_custom
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
     * This method corresponds to the database table que_custom
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
     * This method corresponds to the database table que_custom
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table que_custom
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
     * This class corresponds to the database table que_custom
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

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andGuidsIsNull() {
            addCriterion("guids is null");
            return (Criteria) this;
        }

        public Criteria andGuidsIsNotNull() {
            addCriterion("guids is not null");
            return (Criteria) this;
        }

        public Criteria andGuidsEqualTo(String value) {
            addCriterion("guids =", value, "guids");
            return (Criteria) this;
        }

        public Criteria andGuidsNotEqualTo(String value) {
            addCriterion("guids <>", value, "guids");
            return (Criteria) this;
        }

        public Criteria andGuidsGreaterThan(String value) {
            addCriterion("guids >", value, "guids");
            return (Criteria) this;
        }

        public Criteria andGuidsGreaterThanOrEqualTo(String value) {
            addCriterion("guids >=", value, "guids");
            return (Criteria) this;
        }

        public Criteria andGuidsLessThan(String value) {
            addCriterion("guids <", value, "guids");
            return (Criteria) this;
        }

        public Criteria andGuidsLessThanOrEqualTo(String value) {
            addCriterion("guids <=", value, "guids");
            return (Criteria) this;
        }

        public Criteria andGuidsLike(String value) {
            addCriterion("guids like", value, "guids");
            return (Criteria) this;
        }

        public Criteria andGuidsNotLike(String value) {
            addCriterion("guids not like", value, "guids");
            return (Criteria) this;
        }

        public Criteria andGuidsIn(List<String> values) {
            addCriterion("guids in", values, "guids");
            return (Criteria) this;
        }

        public Criteria andGuidsNotIn(List<String> values) {
            addCriterion("guids not in", values, "guids");
            return (Criteria) this;
        }

        public Criteria andGuidsBetween(String value1, String value2) {
            addCriterion("guids between", value1, value2, "guids");
            return (Criteria) this;
        }

        public Criteria andGuidsNotBetween(String value1, String value2) {
            addCriterion("guids not between", value1, value2, "guids");
            return (Criteria) this;
        }

        public Criteria andNumQueIsNull() {
            addCriterion("num_que is null");
            return (Criteria) this;
        }

        public Criteria andNumQueIsNotNull() {
            addCriterion("num_que is not null");
            return (Criteria) this;
        }

        public Criteria andNumQueEqualTo(Integer value) {
            addCriterion("num_que =", value, "numQue");
            return (Criteria) this;
        }

        public Criteria andNumQueNotEqualTo(Integer value) {
            addCriterion("num_que <>", value, "numQue");
            return (Criteria) this;
        }

        public Criteria andNumQueGreaterThan(Integer value) {
            addCriterion("num_que >", value, "numQue");
            return (Criteria) this;
        }

        public Criteria andNumQueGreaterThanOrEqualTo(Integer value) {
            addCriterion("num_que >=", value, "numQue");
            return (Criteria) this;
        }

        public Criteria andNumQueLessThan(Integer value) {
            addCriterion("num_que <", value, "numQue");
            return (Criteria) this;
        }

        public Criteria andNumQueLessThanOrEqualTo(Integer value) {
            addCriterion("num_que <=", value, "numQue");
            return (Criteria) this;
        }

        public Criteria andNumQueIn(List<Integer> values) {
            addCriterion("num_que in", values, "numQue");
            return (Criteria) this;
        }

        public Criteria andNumQueNotIn(List<Integer> values) {
            addCriterion("num_que not in", values, "numQue");
            return (Criteria) this;
        }

        public Criteria andNumQueBetween(Integer value1, Integer value2) {
            addCriterion("num_que between", value1, value2, "numQue");
            return (Criteria) this;
        }

        public Criteria andNumQueNotBetween(Integer value1, Integer value2) {
            addCriterion("num_que not between", value1, value2, "numQue");
            return (Criteria) this;
        }

        public Criteria andQueDescIsNull() {
            addCriterion("que_desc is null");
            return (Criteria) this;
        }

        public Criteria andQueDescIsNotNull() {
            addCriterion("que_desc is not null");
            return (Criteria) this;
        }

        public Criteria andQueDescEqualTo(String value) {
            addCriterion("que_desc =", value, "queDesc");
            return (Criteria) this;
        }

        public Criteria andQueDescNotEqualTo(String value) {
            addCriterion("que_desc <>", value, "queDesc");
            return (Criteria) this;
        }

        public Criteria andQueDescGreaterThan(String value) {
            addCriterion("que_desc >", value, "queDesc");
            return (Criteria) this;
        }

        public Criteria andQueDescGreaterThanOrEqualTo(String value) {
            addCriterion("que_desc >=", value, "queDesc");
            return (Criteria) this;
        }

        public Criteria andQueDescLessThan(String value) {
            addCriterion("que_desc <", value, "queDesc");
            return (Criteria) this;
        }

        public Criteria andQueDescLessThanOrEqualTo(String value) {
            addCriterion("que_desc <=", value, "queDesc");
            return (Criteria) this;
        }

        public Criteria andQueDescLike(String value) {
            addCriterion("que_desc like", value, "queDesc");
            return (Criteria) this;
        }

        public Criteria andQueDescNotLike(String value) {
            addCriterion("que_desc not like", value, "queDesc");
            return (Criteria) this;
        }

        public Criteria andQueDescIn(List<String> values) {
            addCriterion("que_desc in", values, "queDesc");
            return (Criteria) this;
        }

        public Criteria andQueDescNotIn(List<String> values) {
            addCriterion("que_desc not in", values, "queDesc");
            return (Criteria) this;
        }

        public Criteria andQueDescBetween(String value1, String value2) {
            addCriterion("que_desc between", value1, value2, "queDesc");
            return (Criteria) this;
        }

        public Criteria andQueDescNotBetween(String value1, String value2) {
            addCriterion("que_desc not between", value1, value2, "queDesc");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andTimeCreateIsNull() {
            addCriterion("time_create is null");
            return (Criteria) this;
        }

        public Criteria andTimeCreateIsNotNull() {
            addCriterion("time_create is not null");
            return (Criteria) this;
        }

        public Criteria andTimeCreateEqualTo(Date value) {
            addCriterion("time_create =", value, "timeCreate");
            return (Criteria) this;
        }

        public Criteria andTimeCreateNotEqualTo(Date value) {
            addCriterion("time_create <>", value, "timeCreate");
            return (Criteria) this;
        }

        public Criteria andTimeCreateGreaterThan(Date value) {
            addCriterion("time_create >", value, "timeCreate");
            return (Criteria) this;
        }

        public Criteria andTimeCreateGreaterThanOrEqualTo(Date value) {
            addCriterion("time_create >=", value, "timeCreate");
            return (Criteria) this;
        }

        public Criteria andTimeCreateLessThan(Date value) {
            addCriterion("time_create <", value, "timeCreate");
            return (Criteria) this;
        }

        public Criteria andTimeCreateLessThanOrEqualTo(Date value) {
            addCriterion("time_create <=", value, "timeCreate");
            return (Criteria) this;
        }

        public Criteria andTimeCreateIn(List<Date> values) {
            addCriterion("time_create in", values, "timeCreate");
            return (Criteria) this;
        }

        public Criteria andTimeCreateNotIn(List<Date> values) {
            addCriterion("time_create not in", values, "timeCreate");
            return (Criteria) this;
        }

        public Criteria andTimeCreateBetween(Date value1, Date value2) {
            addCriterion("time_create between", value1, value2, "timeCreate");
            return (Criteria) this;
        }

        public Criteria andTimeCreateNotBetween(Date value1, Date value2) {
            addCriterion("time_create not between", value1, value2, "timeCreate");
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

        public Criteria andUserCreateIsNull() {
            addCriterion("user_create is null");
            return (Criteria) this;
        }

        public Criteria andUserCreateIsNotNull() {
            addCriterion("user_create is not null");
            return (Criteria) this;
        }

        public Criteria andUserCreateEqualTo(Long value) {
            addCriterion("user_create =", value, "userCreate");
            return (Criteria) this;
        }

        public Criteria andUserCreateNotEqualTo(Long value) {
            addCriterion("user_create <>", value, "userCreate");
            return (Criteria) this;
        }

        public Criteria andUserCreateGreaterThan(Long value) {
            addCriterion("user_create >", value, "userCreate");
            return (Criteria) this;
        }

        public Criteria andUserCreateGreaterThanOrEqualTo(Long value) {
            addCriterion("user_create >=", value, "userCreate");
            return (Criteria) this;
        }

        public Criteria andUserCreateLessThan(Long value) {
            addCriterion("user_create <", value, "userCreate");
            return (Criteria) this;
        }

        public Criteria andUserCreateLessThanOrEqualTo(Long value) {
            addCriterion("user_create <=", value, "userCreate");
            return (Criteria) this;
        }

        public Criteria andUserCreateIn(List<Long> values) {
            addCriterion("user_create in", values, "userCreate");
            return (Criteria) this;
        }

        public Criteria andUserCreateNotIn(List<Long> values) {
            addCriterion("user_create not in", values, "userCreate");
            return (Criteria) this;
        }

        public Criteria andUserCreateBetween(Long value1, Long value2) {
            addCriterion("user_create between", value1, value2, "userCreate");
            return (Criteria) this;
        }

        public Criteria andUserCreateNotBetween(Long value1, Long value2) {
            addCriterion("user_create not between", value1, value2, "userCreate");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table que_custom
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
     * This class corresponds to the database table que_custom
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