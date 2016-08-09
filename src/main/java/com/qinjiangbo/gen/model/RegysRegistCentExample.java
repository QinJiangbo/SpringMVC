package com.qinjiangbo.gen.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RegysRegistCentExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table regys_regist_cent
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table regys_regist_cent
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table regys_regist_cent
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regys_regist_cent
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public RegysRegistCentExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regys_regist_cent
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regys_regist_cent
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regys_regist_cent
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regys_regist_cent
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regys_regist_cent
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regys_regist_cent
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regys_regist_cent
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
     * This method corresponds to the database table regys_regist_cent
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
     * This method corresponds to the database table regys_regist_cent
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regys_regist_cent
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
     * This class corresponds to the database table regys_regist_cent
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

        public Criteria andRegIdIsNull() {
            addCriterion("reg_id is null");
            return (Criteria) this;
        }

        public Criteria andRegIdIsNotNull() {
            addCriterion("reg_id is not null");
            return (Criteria) this;
        }

        public Criteria andRegIdEqualTo(Long value) {
            addCriterion("reg_id =", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotEqualTo(Long value) {
            addCriterion("reg_id <>", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdGreaterThan(Long value) {
            addCriterion("reg_id >", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdGreaterThanOrEqualTo(Long value) {
            addCriterion("reg_id >=", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLessThan(Long value) {
            addCriterion("reg_id <", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLessThanOrEqualTo(Long value) {
            addCriterion("reg_id <=", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdIn(List<Long> values) {
            addCriterion("reg_id in", values, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotIn(List<Long> values) {
            addCriterion("reg_id not in", values, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdBetween(Long value1, Long value2) {
            addCriterion("reg_id between", value1, value2, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotBetween(Long value1, Long value2) {
            addCriterion("reg_id not between", value1, value2, "regId");
            return (Criteria) this;
        }

        public Criteria andCentIdIsNull() {
            addCriterion("cent_id is null");
            return (Criteria) this;
        }

        public Criteria andCentIdIsNotNull() {
            addCriterion("cent_id is not null");
            return (Criteria) this;
        }

        public Criteria andCentIdEqualTo(Long value) {
            addCriterion("cent_id =", value, "centId");
            return (Criteria) this;
        }

        public Criteria andCentIdNotEqualTo(Long value) {
            addCriterion("cent_id <>", value, "centId");
            return (Criteria) this;
        }

        public Criteria andCentIdGreaterThan(Long value) {
            addCriterion("cent_id >", value, "centId");
            return (Criteria) this;
        }

        public Criteria andCentIdGreaterThanOrEqualTo(Long value) {
            addCriterion("cent_id >=", value, "centId");
            return (Criteria) this;
        }

        public Criteria andCentIdLessThan(Long value) {
            addCriterion("cent_id <", value, "centId");
            return (Criteria) this;
        }

        public Criteria andCentIdLessThanOrEqualTo(Long value) {
            addCriterion("cent_id <=", value, "centId");
            return (Criteria) this;
        }

        public Criteria andCentIdIn(List<Long> values) {
            addCriterion("cent_id in", values, "centId");
            return (Criteria) this;
        }

        public Criteria andCentIdNotIn(List<Long> values) {
            addCriterion("cent_id not in", values, "centId");
            return (Criteria) this;
        }

        public Criteria andCentIdBetween(Long value1, Long value2) {
            addCriterion("cent_id between", value1, value2, "centId");
            return (Criteria) this;
        }

        public Criteria andCentIdNotBetween(Long value1, Long value2) {
            addCriterion("cent_id not between", value1, value2, "centId");
            return (Criteria) this;
        }

        public Criteria andRegProvinIsNull() {
            addCriterion("reg_provin is null");
            return (Criteria) this;
        }

        public Criteria andRegProvinIsNotNull() {
            addCriterion("reg_provin is not null");
            return (Criteria) this;
        }

        public Criteria andRegProvinEqualTo(Long value) {
            addCriterion("reg_provin =", value, "regProvin");
            return (Criteria) this;
        }

        public Criteria andRegProvinNotEqualTo(Long value) {
            addCriterion("reg_provin <>", value, "regProvin");
            return (Criteria) this;
        }

        public Criteria andRegProvinGreaterThan(Long value) {
            addCriterion("reg_provin >", value, "regProvin");
            return (Criteria) this;
        }

        public Criteria andRegProvinGreaterThanOrEqualTo(Long value) {
            addCriterion("reg_provin >=", value, "regProvin");
            return (Criteria) this;
        }

        public Criteria andRegProvinLessThan(Long value) {
            addCriterion("reg_provin <", value, "regProvin");
            return (Criteria) this;
        }

        public Criteria andRegProvinLessThanOrEqualTo(Long value) {
            addCriterion("reg_provin <=", value, "regProvin");
            return (Criteria) this;
        }

        public Criteria andRegProvinIn(List<Long> values) {
            addCriterion("reg_provin in", values, "regProvin");
            return (Criteria) this;
        }

        public Criteria andRegProvinNotIn(List<Long> values) {
            addCriterion("reg_provin not in", values, "regProvin");
            return (Criteria) this;
        }

        public Criteria andRegProvinBetween(Long value1, Long value2) {
            addCriterion("reg_provin between", value1, value2, "regProvin");
            return (Criteria) this;
        }

        public Criteria andRegProvinNotBetween(Long value1, Long value2) {
            addCriterion("reg_provin not between", value1, value2, "regProvin");
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

        public Criteria andSortIsNull() {
            addCriterion("sort is null");
            return (Criteria) this;
        }

        public Criteria andSortIsNotNull() {
            addCriterion("sort is not null");
            return (Criteria) this;
        }

        public Criteria andSortEqualTo(Integer value) {
            addCriterion("sort =", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotEqualTo(Integer value) {
            addCriterion("sort <>", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThan(Integer value) {
            addCriterion("sort >", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("sort >=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThan(Integer value) {
            addCriterion("sort <", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThanOrEqualTo(Integer value) {
            addCriterion("sort <=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortIn(List<Integer> values) {
            addCriterion("sort in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotIn(List<Integer> values) {
            addCriterion("sort not in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortBetween(Integer value1, Integer value2) {
            addCriterion("sort between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotBetween(Integer value1, Integer value2) {
            addCriterion("sort not between", value1, value2, "sort");
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
     * This class corresponds to the database table regys_regist_cent
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
     * This class corresponds to the database table regys_regist_cent
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