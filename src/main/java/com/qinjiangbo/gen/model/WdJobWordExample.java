package com.qinjiangbo.gen.model;

import java.util.ArrayList;
import java.util.List;

public class WdJobWordExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table wd_job_word
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table wd_job_word
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table wd_job_word
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_job_word
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public WdJobWordExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_job_word
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_job_word
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_job_word
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_job_word
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_job_word
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_job_word
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_job_word
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
     * This method corresponds to the database table wd_job_word
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
     * This method corresponds to the database table wd_job_word
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_job_word
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
     * This class corresponds to the database table wd_job_word
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

        public Criteria andDetIdIsNull() {
            addCriterion("det_id is null");
            return (Criteria) this;
        }

        public Criteria andDetIdIsNotNull() {
            addCriterion("det_id is not null");
            return (Criteria) this;
        }

        public Criteria andDetIdEqualTo(Long value) {
            addCriterion("det_id =", value, "detId");
            return (Criteria) this;
        }

        public Criteria andDetIdNotEqualTo(Long value) {
            addCriterion("det_id <>", value, "detId");
            return (Criteria) this;
        }

        public Criteria andDetIdGreaterThan(Long value) {
            addCriterion("det_id >", value, "detId");
            return (Criteria) this;
        }

        public Criteria andDetIdGreaterThanOrEqualTo(Long value) {
            addCriterion("det_id >=", value, "detId");
            return (Criteria) this;
        }

        public Criteria andDetIdLessThan(Long value) {
            addCriterion("det_id <", value, "detId");
            return (Criteria) this;
        }

        public Criteria andDetIdLessThanOrEqualTo(Long value) {
            addCriterion("det_id <=", value, "detId");
            return (Criteria) this;
        }

        public Criteria andDetIdIn(List<Long> values) {
            addCriterion("det_id in", values, "detId");
            return (Criteria) this;
        }

        public Criteria andDetIdNotIn(List<Long> values) {
            addCriterion("det_id not in", values, "detId");
            return (Criteria) this;
        }

        public Criteria andDetIdBetween(Long value1, Long value2) {
            addCriterion("det_id between", value1, value2, "detId");
            return (Criteria) this;
        }

        public Criteria andDetIdNotBetween(Long value1, Long value2) {
            addCriterion("det_id not between", value1, value2, "detId");
            return (Criteria) this;
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

        public Criteria andWidIsNull() {
            addCriterion("wid is null");
            return (Criteria) this;
        }

        public Criteria andWidIsNotNull() {
            addCriterion("wid is not null");
            return (Criteria) this;
        }

        public Criteria andWidEqualTo(Long value) {
            addCriterion("wid =", value, "wid");
            return (Criteria) this;
        }

        public Criteria andWidNotEqualTo(Long value) {
            addCriterion("wid <>", value, "wid");
            return (Criteria) this;
        }

        public Criteria andWidGreaterThan(Long value) {
            addCriterion("wid >", value, "wid");
            return (Criteria) this;
        }

        public Criteria andWidGreaterThanOrEqualTo(Long value) {
            addCriterion("wid >=", value, "wid");
            return (Criteria) this;
        }

        public Criteria andWidLessThan(Long value) {
            addCriterion("wid <", value, "wid");
            return (Criteria) this;
        }

        public Criteria andWidLessThanOrEqualTo(Long value) {
            addCriterion("wid <=", value, "wid");
            return (Criteria) this;
        }

        public Criteria andWidIn(List<Long> values) {
            addCriterion("wid in", values, "wid");
            return (Criteria) this;
        }

        public Criteria andWidNotIn(List<Long> values) {
            addCriterion("wid not in", values, "wid");
            return (Criteria) this;
        }

        public Criteria andWidBetween(Long value1, Long value2) {
            addCriterion("wid between", value1, value2, "wid");
            return (Criteria) this;
        }

        public Criteria andWidNotBetween(Long value1, Long value2) {
            addCriterion("wid not between", value1, value2, "wid");
            return (Criteria) this;
        }

        public Criteria andSortWordIsNull() {
            addCriterion("sort_word is null");
            return (Criteria) this;
        }

        public Criteria andSortWordIsNotNull() {
            addCriterion("sort_word is not null");
            return (Criteria) this;
        }

        public Criteria andSortWordEqualTo(Long value) {
            addCriterion("sort_word =", value, "sortWord");
            return (Criteria) this;
        }

        public Criteria andSortWordNotEqualTo(Long value) {
            addCriterion("sort_word <>", value, "sortWord");
            return (Criteria) this;
        }

        public Criteria andSortWordGreaterThan(Long value) {
            addCriterion("sort_word >", value, "sortWord");
            return (Criteria) this;
        }

        public Criteria andSortWordGreaterThanOrEqualTo(Long value) {
            addCriterion("sort_word >=", value, "sortWord");
            return (Criteria) this;
        }

        public Criteria andSortWordLessThan(Long value) {
            addCriterion("sort_word <", value, "sortWord");
            return (Criteria) this;
        }

        public Criteria andSortWordLessThanOrEqualTo(Long value) {
            addCriterion("sort_word <=", value, "sortWord");
            return (Criteria) this;
        }

        public Criteria andSortWordIn(List<Long> values) {
            addCriterion("sort_word in", values, "sortWord");
            return (Criteria) this;
        }

        public Criteria andSortWordNotIn(List<Long> values) {
            addCriterion("sort_word not in", values, "sortWord");
            return (Criteria) this;
        }

        public Criteria andSortWordBetween(Long value1, Long value2) {
            addCriterion("sort_word between", value1, value2, "sortWord");
            return (Criteria) this;
        }

        public Criteria andSortWordNotBetween(Long value1, Long value2) {
            addCriterion("sort_word not between", value1, value2, "sortWord");
            return (Criteria) this;
        }

        public Criteria andWidaIsNull() {
            addCriterion("wida is null");
            return (Criteria) this;
        }

        public Criteria andWidaIsNotNull() {
            addCriterion("wida is not null");
            return (Criteria) this;
        }

        public Criteria andWidaEqualTo(Long value) {
            addCriterion("wida =", value, "wida");
            return (Criteria) this;
        }

        public Criteria andWidaNotEqualTo(Long value) {
            addCriterion("wida <>", value, "wida");
            return (Criteria) this;
        }

        public Criteria andWidaGreaterThan(Long value) {
            addCriterion("wida >", value, "wida");
            return (Criteria) this;
        }

        public Criteria andWidaGreaterThanOrEqualTo(Long value) {
            addCriterion("wida >=", value, "wida");
            return (Criteria) this;
        }

        public Criteria andWidaLessThan(Long value) {
            addCriterion("wida <", value, "wida");
            return (Criteria) this;
        }

        public Criteria andWidaLessThanOrEqualTo(Long value) {
            addCriterion("wida <=", value, "wida");
            return (Criteria) this;
        }

        public Criteria andWidaIn(List<Long> values) {
            addCriterion("wida in", values, "wida");
            return (Criteria) this;
        }

        public Criteria andWidaNotIn(List<Long> values) {
            addCriterion("wida not in", values, "wida");
            return (Criteria) this;
        }

        public Criteria andWidaBetween(Long value1, Long value2) {
            addCriterion("wida between", value1, value2, "wida");
            return (Criteria) this;
        }

        public Criteria andWidaNotBetween(Long value1, Long value2) {
            addCriterion("wida not between", value1, value2, "wida");
            return (Criteria) this;
        }

        public Criteria andWidbIsNull() {
            addCriterion("widb is null");
            return (Criteria) this;
        }

        public Criteria andWidbIsNotNull() {
            addCriterion("widb is not null");
            return (Criteria) this;
        }

        public Criteria andWidbEqualTo(Long value) {
            addCriterion("widb =", value, "widb");
            return (Criteria) this;
        }

        public Criteria andWidbNotEqualTo(Long value) {
            addCriterion("widb <>", value, "widb");
            return (Criteria) this;
        }

        public Criteria andWidbGreaterThan(Long value) {
            addCriterion("widb >", value, "widb");
            return (Criteria) this;
        }

        public Criteria andWidbGreaterThanOrEqualTo(Long value) {
            addCriterion("widb >=", value, "widb");
            return (Criteria) this;
        }

        public Criteria andWidbLessThan(Long value) {
            addCriterion("widb <", value, "widb");
            return (Criteria) this;
        }

        public Criteria andWidbLessThanOrEqualTo(Long value) {
            addCriterion("widb <=", value, "widb");
            return (Criteria) this;
        }

        public Criteria andWidbIn(List<Long> values) {
            addCriterion("widb in", values, "widb");
            return (Criteria) this;
        }

        public Criteria andWidbNotIn(List<Long> values) {
            addCriterion("widb not in", values, "widb");
            return (Criteria) this;
        }

        public Criteria andWidbBetween(Long value1, Long value2) {
            addCriterion("widb between", value1, value2, "widb");
            return (Criteria) this;
        }

        public Criteria andWidbNotBetween(Long value1, Long value2) {
            addCriterion("widb not between", value1, value2, "widb");
            return (Criteria) this;
        }

        public Criteria andWidcIsNull() {
            addCriterion("widc is null");
            return (Criteria) this;
        }

        public Criteria andWidcIsNotNull() {
            addCriterion("widc is not null");
            return (Criteria) this;
        }

        public Criteria andWidcEqualTo(Long value) {
            addCriterion("widc =", value, "widc");
            return (Criteria) this;
        }

        public Criteria andWidcNotEqualTo(Long value) {
            addCriterion("widc <>", value, "widc");
            return (Criteria) this;
        }

        public Criteria andWidcGreaterThan(Long value) {
            addCriterion("widc >", value, "widc");
            return (Criteria) this;
        }

        public Criteria andWidcGreaterThanOrEqualTo(Long value) {
            addCriterion("widc >=", value, "widc");
            return (Criteria) this;
        }

        public Criteria andWidcLessThan(Long value) {
            addCriterion("widc <", value, "widc");
            return (Criteria) this;
        }

        public Criteria andWidcLessThanOrEqualTo(Long value) {
            addCriterion("widc <=", value, "widc");
            return (Criteria) this;
        }

        public Criteria andWidcIn(List<Long> values) {
            addCriterion("widc in", values, "widc");
            return (Criteria) this;
        }

        public Criteria andWidcNotIn(List<Long> values) {
            addCriterion("widc not in", values, "widc");
            return (Criteria) this;
        }

        public Criteria andWidcBetween(Long value1, Long value2) {
            addCriterion("widc between", value1, value2, "widc");
            return (Criteria) this;
        }

        public Criteria andWidcNotBetween(Long value1, Long value2) {
            addCriterion("widc not between", value1, value2, "widc");
            return (Criteria) this;
        }

        public Criteria andWiddIsNull() {
            addCriterion("widd is null");
            return (Criteria) this;
        }

        public Criteria andWiddIsNotNull() {
            addCriterion("widd is not null");
            return (Criteria) this;
        }

        public Criteria andWiddEqualTo(Long value) {
            addCriterion("widd =", value, "widd");
            return (Criteria) this;
        }

        public Criteria andWiddNotEqualTo(Long value) {
            addCriterion("widd <>", value, "widd");
            return (Criteria) this;
        }

        public Criteria andWiddGreaterThan(Long value) {
            addCriterion("widd >", value, "widd");
            return (Criteria) this;
        }

        public Criteria andWiddGreaterThanOrEqualTo(Long value) {
            addCriterion("widd >=", value, "widd");
            return (Criteria) this;
        }

        public Criteria andWiddLessThan(Long value) {
            addCriterion("widd <", value, "widd");
            return (Criteria) this;
        }

        public Criteria andWiddLessThanOrEqualTo(Long value) {
            addCriterion("widd <=", value, "widd");
            return (Criteria) this;
        }

        public Criteria andWiddIn(List<Long> values) {
            addCriterion("widd in", values, "widd");
            return (Criteria) this;
        }

        public Criteria andWiddNotIn(List<Long> values) {
            addCriterion("widd not in", values, "widd");
            return (Criteria) this;
        }

        public Criteria andWiddBetween(Long value1, Long value2) {
            addCriterion("widd between", value1, value2, "widd");
            return (Criteria) this;
        }

        public Criteria andWiddNotBetween(Long value1, Long value2) {
            addCriterion("widd not between", value1, value2, "widd");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table wd_job_word
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
     * This class corresponds to the database table wd_job_word
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