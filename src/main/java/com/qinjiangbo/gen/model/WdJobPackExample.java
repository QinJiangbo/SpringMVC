package com.qinjiangbo.gen.model;

import java.util.ArrayList;
import java.util.List;

public class WdJobPackExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table wd_job_pack
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table wd_job_pack
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table wd_job_pack
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_job_pack
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public WdJobPackExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_job_pack
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_job_pack
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_job_pack
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_job_pack
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_job_pack
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_job_pack
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_job_pack
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
     * This method corresponds to the database table wd_job_pack
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
     * This method corresponds to the database table wd_job_pack
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_job_pack
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
     * This class corresponds to the database table wd_job_pack
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

        public Criteria andPackIdIsNull() {
            addCriterion("pack_id is null");
            return (Criteria) this;
        }

        public Criteria andPackIdIsNotNull() {
            addCriterion("pack_id is not null");
            return (Criteria) this;
        }

        public Criteria andPackIdEqualTo(Long value) {
            addCriterion("pack_id =", value, "packId");
            return (Criteria) this;
        }

        public Criteria andPackIdNotEqualTo(Long value) {
            addCriterion("pack_id <>", value, "packId");
            return (Criteria) this;
        }

        public Criteria andPackIdGreaterThan(Long value) {
            addCriterion("pack_id >", value, "packId");
            return (Criteria) this;
        }

        public Criteria andPackIdGreaterThanOrEqualTo(Long value) {
            addCriterion("pack_id >=", value, "packId");
            return (Criteria) this;
        }

        public Criteria andPackIdLessThan(Long value) {
            addCriterion("pack_id <", value, "packId");
            return (Criteria) this;
        }

        public Criteria andPackIdLessThanOrEqualTo(Long value) {
            addCriterion("pack_id <=", value, "packId");
            return (Criteria) this;
        }

        public Criteria andPackIdIn(List<Long> values) {
            addCriterion("pack_id in", values, "packId");
            return (Criteria) this;
        }

        public Criteria andPackIdNotIn(List<Long> values) {
            addCriterion("pack_id not in", values, "packId");
            return (Criteria) this;
        }

        public Criteria andPackIdBetween(Long value1, Long value2) {
            addCriterion("pack_id between", value1, value2, "packId");
            return (Criteria) this;
        }

        public Criteria andPackIdNotBetween(Long value1, Long value2) {
            addCriterion("pack_id not between", value1, value2, "packId");
            return (Criteria) this;
        }

        public Criteria andJobIdIsNull() {
            addCriterion("job_id is null");
            return (Criteria) this;
        }

        public Criteria andJobIdIsNotNull() {
            addCriterion("job_id is not null");
            return (Criteria) this;
        }

        public Criteria andJobIdEqualTo(Long value) {
            addCriterion("job_id =", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdNotEqualTo(Long value) {
            addCriterion("job_id <>", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdGreaterThan(Long value) {
            addCriterion("job_id >", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdGreaterThanOrEqualTo(Long value) {
            addCriterion("job_id >=", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdLessThan(Long value) {
            addCriterion("job_id <", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdLessThanOrEqualTo(Long value) {
            addCriterion("job_id <=", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdIn(List<Long> values) {
            addCriterion("job_id in", values, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdNotIn(List<Long> values) {
            addCriterion("job_id not in", values, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdBetween(Long value1, Long value2) {
            addCriterion("job_id between", value1, value2, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdNotBetween(Long value1, Long value2) {
            addCriterion("job_id not between", value1, value2, "jobId");
            return (Criteria) this;
        }

        public Criteria andNumWordIsNull() {
            addCriterion("num_word is null");
            return (Criteria) this;
        }

        public Criteria andNumWordIsNotNull() {
            addCriterion("num_word is not null");
            return (Criteria) this;
        }

        public Criteria andNumWordEqualTo(Long value) {
            addCriterion("num_word =", value, "numWord");
            return (Criteria) this;
        }

        public Criteria andNumWordNotEqualTo(Long value) {
            addCriterion("num_word <>", value, "numWord");
            return (Criteria) this;
        }

        public Criteria andNumWordGreaterThan(Long value) {
            addCriterion("num_word >", value, "numWord");
            return (Criteria) this;
        }

        public Criteria andNumWordGreaterThanOrEqualTo(Long value) {
            addCriterion("num_word >=", value, "numWord");
            return (Criteria) this;
        }

        public Criteria andNumWordLessThan(Long value) {
            addCriterion("num_word <", value, "numWord");
            return (Criteria) this;
        }

        public Criteria andNumWordLessThanOrEqualTo(Long value) {
            addCriterion("num_word <=", value, "numWord");
            return (Criteria) this;
        }

        public Criteria andNumWordIn(List<Long> values) {
            addCriterion("num_word in", values, "numWord");
            return (Criteria) this;
        }

        public Criteria andNumWordNotIn(List<Long> values) {
            addCriterion("num_word not in", values, "numWord");
            return (Criteria) this;
        }

        public Criteria andNumWordBetween(Long value1, Long value2) {
            addCriterion("num_word between", value1, value2, "numWord");
            return (Criteria) this;
        }

        public Criteria andNumWordNotBetween(Long value1, Long value2) {
            addCriterion("num_word not between", value1, value2, "numWord");
            return (Criteria) this;
        }

        public Criteria andSortPackIsNull() {
            addCriterion("sort_pack is null");
            return (Criteria) this;
        }

        public Criteria andSortPackIsNotNull() {
            addCriterion("sort_pack is not null");
            return (Criteria) this;
        }

        public Criteria andSortPackEqualTo(Long value) {
            addCriterion("sort_pack =", value, "sortPack");
            return (Criteria) this;
        }

        public Criteria andSortPackNotEqualTo(Long value) {
            addCriterion("sort_pack <>", value, "sortPack");
            return (Criteria) this;
        }

        public Criteria andSortPackGreaterThan(Long value) {
            addCriterion("sort_pack >", value, "sortPack");
            return (Criteria) this;
        }

        public Criteria andSortPackGreaterThanOrEqualTo(Long value) {
            addCriterion("sort_pack >=", value, "sortPack");
            return (Criteria) this;
        }

        public Criteria andSortPackLessThan(Long value) {
            addCriterion("sort_pack <", value, "sortPack");
            return (Criteria) this;
        }

        public Criteria andSortPackLessThanOrEqualTo(Long value) {
            addCriterion("sort_pack <=", value, "sortPack");
            return (Criteria) this;
        }

        public Criteria andSortPackIn(List<Long> values) {
            addCriterion("sort_pack in", values, "sortPack");
            return (Criteria) this;
        }

        public Criteria andSortPackNotIn(List<Long> values) {
            addCriterion("sort_pack not in", values, "sortPack");
            return (Criteria) this;
        }

        public Criteria andSortPackBetween(Long value1, Long value2) {
            addCriterion("sort_pack between", value1, value2, "sortPack");
            return (Criteria) this;
        }

        public Criteria andSortPackNotBetween(Long value1, Long value2) {
            addCriterion("sort_pack not between", value1, value2, "sortPack");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table wd_job_pack
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
     * This class corresponds to the database table wd_job_pack
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