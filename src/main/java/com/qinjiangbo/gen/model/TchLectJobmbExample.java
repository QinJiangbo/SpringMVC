package com.qinjiangbo.gen.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TchLectJobmbExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tch_lect_jobmb
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tch_lect_jobmb
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tch_lect_jobmb
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tch_lect_jobmb
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public TchLectJobmbExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tch_lect_jobmb
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tch_lect_jobmb
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tch_lect_jobmb
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tch_lect_jobmb
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tch_lect_jobmb
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tch_lect_jobmb
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tch_lect_jobmb
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
     * This method corresponds to the database table tch_lect_jobmb
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
     * This method corresponds to the database table tch_lect_jobmb
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tch_lect_jobmb
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
     * This class corresponds to the database table tch_lect_jobmb
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

        public Criteria andMbSidIsNull() {
            addCriterion("mb_sid is null");
            return (Criteria) this;
        }

        public Criteria andMbSidIsNotNull() {
            addCriterion("mb_sid is not null");
            return (Criteria) this;
        }

        public Criteria andMbSidEqualTo(Long value) {
            addCriterion("mb_sid =", value, "mbSid");
            return (Criteria) this;
        }

        public Criteria andMbSidNotEqualTo(Long value) {
            addCriterion("mb_sid <>", value, "mbSid");
            return (Criteria) this;
        }

        public Criteria andMbSidGreaterThan(Long value) {
            addCriterion("mb_sid >", value, "mbSid");
            return (Criteria) this;
        }

        public Criteria andMbSidGreaterThanOrEqualTo(Long value) {
            addCriterion("mb_sid >=", value, "mbSid");
            return (Criteria) this;
        }

        public Criteria andMbSidLessThan(Long value) {
            addCriterion("mb_sid <", value, "mbSid");
            return (Criteria) this;
        }

        public Criteria andMbSidLessThanOrEqualTo(Long value) {
            addCriterion("mb_sid <=", value, "mbSid");
            return (Criteria) this;
        }

        public Criteria andMbSidIn(List<Long> values) {
            addCriterion("mb_sid in", values, "mbSid");
            return (Criteria) this;
        }

        public Criteria andMbSidNotIn(List<Long> values) {
            addCriterion("mb_sid not in", values, "mbSid");
            return (Criteria) this;
        }

        public Criteria andMbSidBetween(Long value1, Long value2) {
            addCriterion("mb_sid between", value1, value2, "mbSid");
            return (Criteria) this;
        }

        public Criteria andMbSidNotBetween(Long value1, Long value2) {
            addCriterion("mb_sid not between", value1, value2, "mbSid");
            return (Criteria) this;
        }

        public Criteria andMbIdIsNull() {
            addCriterion("mb_id is null");
            return (Criteria) this;
        }

        public Criteria andMbIdIsNotNull() {
            addCriterion("mb_id is not null");
            return (Criteria) this;
        }

        public Criteria andMbIdEqualTo(Long value) {
            addCriterion("mb_id =", value, "mbId");
            return (Criteria) this;
        }

        public Criteria andMbIdNotEqualTo(Long value) {
            addCriterion("mb_id <>", value, "mbId");
            return (Criteria) this;
        }

        public Criteria andMbIdGreaterThan(Long value) {
            addCriterion("mb_id >", value, "mbId");
            return (Criteria) this;
        }

        public Criteria andMbIdGreaterThanOrEqualTo(Long value) {
            addCriterion("mb_id >=", value, "mbId");
            return (Criteria) this;
        }

        public Criteria andMbIdLessThan(Long value) {
            addCriterion("mb_id <", value, "mbId");
            return (Criteria) this;
        }

        public Criteria andMbIdLessThanOrEqualTo(Long value) {
            addCriterion("mb_id <=", value, "mbId");
            return (Criteria) this;
        }

        public Criteria andMbIdIn(List<Long> values) {
            addCriterion("mb_id in", values, "mbId");
            return (Criteria) this;
        }

        public Criteria andMbIdNotIn(List<Long> values) {
            addCriterion("mb_id not in", values, "mbId");
            return (Criteria) this;
        }

        public Criteria andMbIdBetween(Long value1, Long value2) {
            addCriterion("mb_id between", value1, value2, "mbId");
            return (Criteria) this;
        }

        public Criteria andMbIdNotBetween(Long value1, Long value2) {
            addCriterion("mb_id not between", value1, value2, "mbId");
            return (Criteria) this;
        }

        public Criteria andMbNameIsNull() {
            addCriterion("mb_name is null");
            return (Criteria) this;
        }

        public Criteria andMbNameIsNotNull() {
            addCriterion("mb_name is not null");
            return (Criteria) this;
        }

        public Criteria andMbNameEqualTo(String value) {
            addCriterion("mb_name =", value, "mbName");
            return (Criteria) this;
        }

        public Criteria andMbNameNotEqualTo(String value) {
            addCriterion("mb_name <>", value, "mbName");
            return (Criteria) this;
        }

        public Criteria andMbNameGreaterThan(String value) {
            addCriterion("mb_name >", value, "mbName");
            return (Criteria) this;
        }

        public Criteria andMbNameGreaterThanOrEqualTo(String value) {
            addCriterion("mb_name >=", value, "mbName");
            return (Criteria) this;
        }

        public Criteria andMbNameLessThan(String value) {
            addCriterion("mb_name <", value, "mbName");
            return (Criteria) this;
        }

        public Criteria andMbNameLessThanOrEqualTo(String value) {
            addCriterion("mb_name <=", value, "mbName");
            return (Criteria) this;
        }

        public Criteria andMbNameLike(String value) {
            addCriterion("mb_name like", value, "mbName");
            return (Criteria) this;
        }

        public Criteria andMbNameNotLike(String value) {
            addCriterion("mb_name not like", value, "mbName");
            return (Criteria) this;
        }

        public Criteria andMbNameIn(List<String> values) {
            addCriterion("mb_name in", values, "mbName");
            return (Criteria) this;
        }

        public Criteria andMbNameNotIn(List<String> values) {
            addCriterion("mb_name not in", values, "mbName");
            return (Criteria) this;
        }

        public Criteria andMbNameBetween(String value1, String value2) {
            addCriterion("mb_name between", value1, value2, "mbName");
            return (Criteria) this;
        }

        public Criteria andMbNameNotBetween(String value1, String value2) {
            addCriterion("mb_name not between", value1, value2, "mbName");
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

        public Criteria andLectIdIsNull() {
            addCriterion("lect_id is null");
            return (Criteria) this;
        }

        public Criteria andLectIdIsNotNull() {
            addCriterion("lect_id is not null");
            return (Criteria) this;
        }

        public Criteria andLectIdEqualTo(Long value) {
            addCriterion("lect_id =", value, "lectId");
            return (Criteria) this;
        }

        public Criteria andLectIdNotEqualTo(Long value) {
            addCriterion("lect_id <>", value, "lectId");
            return (Criteria) this;
        }

        public Criteria andLectIdGreaterThan(Long value) {
            addCriterion("lect_id >", value, "lectId");
            return (Criteria) this;
        }

        public Criteria andLectIdGreaterThanOrEqualTo(Long value) {
            addCriterion("lect_id >=", value, "lectId");
            return (Criteria) this;
        }

        public Criteria andLectIdLessThan(Long value) {
            addCriterion("lect_id <", value, "lectId");
            return (Criteria) this;
        }

        public Criteria andLectIdLessThanOrEqualTo(Long value) {
            addCriterion("lect_id <=", value, "lectId");
            return (Criteria) this;
        }

        public Criteria andLectIdIn(List<Long> values) {
            addCriterion("lect_id in", values, "lectId");
            return (Criteria) this;
        }

        public Criteria andLectIdNotIn(List<Long> values) {
            addCriterion("lect_id not in", values, "lectId");
            return (Criteria) this;
        }

        public Criteria andLectIdBetween(Long value1, Long value2) {
            addCriterion("lect_id between", value1, value2, "lectId");
            return (Criteria) this;
        }

        public Criteria andLectIdNotBetween(Long value1, Long value2) {
            addCriterion("lect_id not between", value1, value2, "lectId");
            return (Criteria) this;
        }

        public Criteria andPptIdIsNull() {
            addCriterion("ppt_id is null");
            return (Criteria) this;
        }

        public Criteria andPptIdIsNotNull() {
            addCriterion("ppt_id is not null");
            return (Criteria) this;
        }

        public Criteria andPptIdEqualTo(Long value) {
            addCriterion("ppt_id =", value, "pptId");
            return (Criteria) this;
        }

        public Criteria andPptIdNotEqualTo(Long value) {
            addCriterion("ppt_id <>", value, "pptId");
            return (Criteria) this;
        }

        public Criteria andPptIdGreaterThan(Long value) {
            addCriterion("ppt_id >", value, "pptId");
            return (Criteria) this;
        }

        public Criteria andPptIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ppt_id >=", value, "pptId");
            return (Criteria) this;
        }

        public Criteria andPptIdLessThan(Long value) {
            addCriterion("ppt_id <", value, "pptId");
            return (Criteria) this;
        }

        public Criteria andPptIdLessThanOrEqualTo(Long value) {
            addCriterion("ppt_id <=", value, "pptId");
            return (Criteria) this;
        }

        public Criteria andPptIdIn(List<Long> values) {
            addCriterion("ppt_id in", values, "pptId");
            return (Criteria) this;
        }

        public Criteria andPptIdNotIn(List<Long> values) {
            addCriterion("ppt_id not in", values, "pptId");
            return (Criteria) this;
        }

        public Criteria andPptIdBetween(Long value1, Long value2) {
            addCriterion("ppt_id between", value1, value2, "pptId");
            return (Criteria) this;
        }

        public Criteria andPptIdNotBetween(Long value1, Long value2) {
            addCriterion("ppt_id not between", value1, value2, "pptId");
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

        public Criteria andWorkTypeIsNull() {
            addCriterion("work_type is null");
            return (Criteria) this;
        }

        public Criteria andWorkTypeIsNotNull() {
            addCriterion("work_type is not null");
            return (Criteria) this;
        }

        public Criteria andWorkTypeEqualTo(Long value) {
            addCriterion("work_type =", value, "workType");
            return (Criteria) this;
        }

        public Criteria andWorkTypeNotEqualTo(Long value) {
            addCriterion("work_type <>", value, "workType");
            return (Criteria) this;
        }

        public Criteria andWorkTypeGreaterThan(Long value) {
            addCriterion("work_type >", value, "workType");
            return (Criteria) this;
        }

        public Criteria andWorkTypeGreaterThanOrEqualTo(Long value) {
            addCriterion("work_type >=", value, "workType");
            return (Criteria) this;
        }

        public Criteria andWorkTypeLessThan(Long value) {
            addCriterion("work_type <", value, "workType");
            return (Criteria) this;
        }

        public Criteria andWorkTypeLessThanOrEqualTo(Long value) {
            addCriterion("work_type <=", value, "workType");
            return (Criteria) this;
        }

        public Criteria andWorkTypeIn(List<Long> values) {
            addCriterion("work_type in", values, "workType");
            return (Criteria) this;
        }

        public Criteria andWorkTypeNotIn(List<Long> values) {
            addCriterion("work_type not in", values, "workType");
            return (Criteria) this;
        }

        public Criteria andWorkTypeBetween(Long value1, Long value2) {
            addCriterion("work_type between", value1, value2, "workType");
            return (Criteria) this;
        }

        public Criteria andWorkTypeNotBetween(Long value1, Long value2) {
            addCriterion("work_type not between", value1, value2, "workType");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tch_lect_jobmb
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
     * This class corresponds to the database table tch_lect_jobmb
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