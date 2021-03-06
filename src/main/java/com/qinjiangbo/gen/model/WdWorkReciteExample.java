package com.qinjiangbo.gen.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WdWorkReciteExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table wd_work_recite
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table wd_work_recite
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table wd_work_recite
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_work_recite
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public WdWorkReciteExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_work_recite
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_work_recite
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_work_recite
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_work_recite
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_work_recite
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_work_recite
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_work_recite
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
     * This method corresponds to the database table wd_work_recite
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
     * This method corresponds to the database table wd_work_recite
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_work_recite
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
     * This class corresponds to the database table wd_work_recite
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

        public Criteria andRecIdIsNull() {
            addCriterion("rec_id is null");
            return (Criteria) this;
        }

        public Criteria andRecIdIsNotNull() {
            addCriterion("rec_id is not null");
            return (Criteria) this;
        }

        public Criteria andRecIdEqualTo(Long value) {
            addCriterion("rec_id =", value, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdNotEqualTo(Long value) {
            addCriterion("rec_id <>", value, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdGreaterThan(Long value) {
            addCriterion("rec_id >", value, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdGreaterThanOrEqualTo(Long value) {
            addCriterion("rec_id >=", value, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdLessThan(Long value) {
            addCriterion("rec_id <", value, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdLessThanOrEqualTo(Long value) {
            addCriterion("rec_id <=", value, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdIn(List<Long> values) {
            addCriterion("rec_id in", values, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdNotIn(List<Long> values) {
            addCriterion("rec_id not in", values, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdBetween(Long value1, Long value2) {
            addCriterion("rec_id between", value1, value2, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdNotBetween(Long value1, Long value2) {
            addCriterion("rec_id not between", value1, value2, "recId");
            return (Criteria) this;
        }

        public Criteria andWkIdIsNull() {
            addCriterion("wk_id is null");
            return (Criteria) this;
        }

        public Criteria andWkIdIsNotNull() {
            addCriterion("wk_id is not null");
            return (Criteria) this;
        }

        public Criteria andWkIdEqualTo(Long value) {
            addCriterion("wk_id =", value, "wkId");
            return (Criteria) this;
        }

        public Criteria andWkIdNotEqualTo(Long value) {
            addCriterion("wk_id <>", value, "wkId");
            return (Criteria) this;
        }

        public Criteria andWkIdGreaterThan(Long value) {
            addCriterion("wk_id >", value, "wkId");
            return (Criteria) this;
        }

        public Criteria andWkIdGreaterThanOrEqualTo(Long value) {
            addCriterion("wk_id >=", value, "wkId");
            return (Criteria) this;
        }

        public Criteria andWkIdLessThan(Long value) {
            addCriterion("wk_id <", value, "wkId");
            return (Criteria) this;
        }

        public Criteria andWkIdLessThanOrEqualTo(Long value) {
            addCriterion("wk_id <=", value, "wkId");
            return (Criteria) this;
        }

        public Criteria andWkIdIn(List<Long> values) {
            addCriterion("wk_id in", values, "wkId");
            return (Criteria) this;
        }

        public Criteria andWkIdNotIn(List<Long> values) {
            addCriterion("wk_id not in", values, "wkId");
            return (Criteria) this;
        }

        public Criteria andWkIdBetween(Long value1, Long value2) {
            addCriterion("wk_id between", value1, value2, "wkId");
            return (Criteria) this;
        }

        public Criteria andWkIdNotBetween(Long value1, Long value2) {
            addCriterion("wk_id not between", value1, value2, "wkId");
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

        public Criteria andNumSecIsNull() {
            addCriterion("num_sec is null");
            return (Criteria) this;
        }

        public Criteria andNumSecIsNotNull() {
            addCriterion("num_sec is not null");
            return (Criteria) this;
        }

        public Criteria andNumSecEqualTo(Long value) {
            addCriterion("num_sec =", value, "numSec");
            return (Criteria) this;
        }

        public Criteria andNumSecNotEqualTo(Long value) {
            addCriterion("num_sec <>", value, "numSec");
            return (Criteria) this;
        }

        public Criteria andNumSecGreaterThan(Long value) {
            addCriterion("num_sec >", value, "numSec");
            return (Criteria) this;
        }

        public Criteria andNumSecGreaterThanOrEqualTo(Long value) {
            addCriterion("num_sec >=", value, "numSec");
            return (Criteria) this;
        }

        public Criteria andNumSecLessThan(Long value) {
            addCriterion("num_sec <", value, "numSec");
            return (Criteria) this;
        }

        public Criteria andNumSecLessThanOrEqualTo(Long value) {
            addCriterion("num_sec <=", value, "numSec");
            return (Criteria) this;
        }

        public Criteria andNumSecIn(List<Long> values) {
            addCriterion("num_sec in", values, "numSec");
            return (Criteria) this;
        }

        public Criteria andNumSecNotIn(List<Long> values) {
            addCriterion("num_sec not in", values, "numSec");
            return (Criteria) this;
        }

        public Criteria andNumSecBetween(Long value1, Long value2) {
            addCriterion("num_sec between", value1, value2, "numSec");
            return (Criteria) this;
        }

        public Criteria andNumSecNotBetween(Long value1, Long value2) {
            addCriterion("num_sec not between", value1, value2, "numSec");
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
     * This class corresponds to the database table wd_work_recite
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
     * This class corresponds to the database table wd_work_recite
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