package com.qinjiangbo.gen.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysFaultExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sys_fault
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sys_fault
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sys_fault
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_fault
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public SysFaultExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_fault
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_fault
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_fault
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_fault
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_fault
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_fault
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_fault
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
     * This method corresponds to the database table sys_fault
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
     * This method corresponds to the database table sys_fault
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_fault
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
     * This class corresponds to the database table sys_fault
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

        public Criteria andFatIdIsNull() {
            addCriterion("fat_id is null");
            return (Criteria) this;
        }

        public Criteria andFatIdIsNotNull() {
            addCriterion("fat_id is not null");
            return (Criteria) this;
        }

        public Criteria andFatIdEqualTo(Long value) {
            addCriterion("fat_id =", value, "fatId");
            return (Criteria) this;
        }

        public Criteria andFatIdNotEqualTo(Long value) {
            addCriterion("fat_id <>", value, "fatId");
            return (Criteria) this;
        }

        public Criteria andFatIdGreaterThan(Long value) {
            addCriterion("fat_id >", value, "fatId");
            return (Criteria) this;
        }

        public Criteria andFatIdGreaterThanOrEqualTo(Long value) {
            addCriterion("fat_id >=", value, "fatId");
            return (Criteria) this;
        }

        public Criteria andFatIdLessThan(Long value) {
            addCriterion("fat_id <", value, "fatId");
            return (Criteria) this;
        }

        public Criteria andFatIdLessThanOrEqualTo(Long value) {
            addCriterion("fat_id <=", value, "fatId");
            return (Criteria) this;
        }

        public Criteria andFatIdIn(List<Long> values) {
            addCriterion("fat_id in", values, "fatId");
            return (Criteria) this;
        }

        public Criteria andFatIdNotIn(List<Long> values) {
            addCriterion("fat_id not in", values, "fatId");
            return (Criteria) this;
        }

        public Criteria andFatIdBetween(Long value1, Long value2) {
            addCriterion("fat_id between", value1, value2, "fatId");
            return (Criteria) this;
        }

        public Criteria andFatIdNotBetween(Long value1, Long value2) {
            addCriterion("fat_id not between", value1, value2, "fatId");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
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

        public Criteria andMobileIsNull() {
            addCriterion("mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andQqIsNull() {
            addCriterion("qq is null");
            return (Criteria) this;
        }

        public Criteria andQqIsNotNull() {
            addCriterion("qq is not null");
            return (Criteria) this;
        }

        public Criteria andQqEqualTo(String value) {
            addCriterion("qq =", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotEqualTo(String value) {
            addCriterion("qq <>", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqGreaterThan(String value) {
            addCriterion("qq >", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqGreaterThanOrEqualTo(String value) {
            addCriterion("qq >=", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLessThan(String value) {
            addCriterion("qq <", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLessThanOrEqualTo(String value) {
            addCriterion("qq <=", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLike(String value) {
            addCriterion("qq like", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotLike(String value) {
            addCriterion("qq not like", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqIn(List<String> values) {
            addCriterion("qq in", values, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotIn(List<String> values) {
            addCriterion("qq not in", values, "qq");
            return (Criteria) this;
        }

        public Criteria andQqBetween(String value1, String value2) {
            addCriterion("qq between", value1, value2, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotBetween(String value1, String value2) {
            addCriterion("qq not between", value1, value2, "qq");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
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

        public Criteria andUserDealIsNull() {
            addCriterion("user_deal is null");
            return (Criteria) this;
        }

        public Criteria andUserDealIsNotNull() {
            addCriterion("user_deal is not null");
            return (Criteria) this;
        }

        public Criteria andUserDealEqualTo(Long value) {
            addCriterion("user_deal =", value, "userDeal");
            return (Criteria) this;
        }

        public Criteria andUserDealNotEqualTo(Long value) {
            addCriterion("user_deal <>", value, "userDeal");
            return (Criteria) this;
        }

        public Criteria andUserDealGreaterThan(Long value) {
            addCriterion("user_deal >", value, "userDeal");
            return (Criteria) this;
        }

        public Criteria andUserDealGreaterThanOrEqualTo(Long value) {
            addCriterion("user_deal >=", value, "userDeal");
            return (Criteria) this;
        }

        public Criteria andUserDealLessThan(Long value) {
            addCriterion("user_deal <", value, "userDeal");
            return (Criteria) this;
        }

        public Criteria andUserDealLessThanOrEqualTo(Long value) {
            addCriterion("user_deal <=", value, "userDeal");
            return (Criteria) this;
        }

        public Criteria andUserDealIn(List<Long> values) {
            addCriterion("user_deal in", values, "userDeal");
            return (Criteria) this;
        }

        public Criteria andUserDealNotIn(List<Long> values) {
            addCriterion("user_deal not in", values, "userDeal");
            return (Criteria) this;
        }

        public Criteria andUserDealBetween(Long value1, Long value2) {
            addCriterion("user_deal between", value1, value2, "userDeal");
            return (Criteria) this;
        }

        public Criteria andUserDealNotBetween(Long value1, Long value2) {
            addCriterion("user_deal not between", value1, value2, "userDeal");
            return (Criteria) this;
        }

        public Criteria andTimeDealIsNull() {
            addCriterion("time_deal is null");
            return (Criteria) this;
        }

        public Criteria andTimeDealIsNotNull() {
            addCriterion("time_deal is not null");
            return (Criteria) this;
        }

        public Criteria andTimeDealEqualTo(Date value) {
            addCriterion("time_deal =", value, "timeDeal");
            return (Criteria) this;
        }

        public Criteria andTimeDealNotEqualTo(Date value) {
            addCriterion("time_deal <>", value, "timeDeal");
            return (Criteria) this;
        }

        public Criteria andTimeDealGreaterThan(Date value) {
            addCriterion("time_deal >", value, "timeDeal");
            return (Criteria) this;
        }

        public Criteria andTimeDealGreaterThanOrEqualTo(Date value) {
            addCriterion("time_deal >=", value, "timeDeal");
            return (Criteria) this;
        }

        public Criteria andTimeDealLessThan(Date value) {
            addCriterion("time_deal <", value, "timeDeal");
            return (Criteria) this;
        }

        public Criteria andTimeDealLessThanOrEqualTo(Date value) {
            addCriterion("time_deal <=", value, "timeDeal");
            return (Criteria) this;
        }

        public Criteria andTimeDealIn(List<Date> values) {
            addCriterion("time_deal in", values, "timeDeal");
            return (Criteria) this;
        }

        public Criteria andTimeDealNotIn(List<Date> values) {
            addCriterion("time_deal not in", values, "timeDeal");
            return (Criteria) this;
        }

        public Criteria andTimeDealBetween(Date value1, Date value2) {
            addCriterion("time_deal between", value1, value2, "timeDeal");
            return (Criteria) this;
        }

        public Criteria andTimeDealNotBetween(Date value1, Date value2) {
            addCriterion("time_deal not between", value1, value2, "timeDeal");
            return (Criteria) this;
        }

        public Criteria andDealMsgIsNull() {
            addCriterion("deal_msg is null");
            return (Criteria) this;
        }

        public Criteria andDealMsgIsNotNull() {
            addCriterion("deal_msg is not null");
            return (Criteria) this;
        }

        public Criteria andDealMsgEqualTo(String value) {
            addCriterion("deal_msg =", value, "dealMsg");
            return (Criteria) this;
        }

        public Criteria andDealMsgNotEqualTo(String value) {
            addCriterion("deal_msg <>", value, "dealMsg");
            return (Criteria) this;
        }

        public Criteria andDealMsgGreaterThan(String value) {
            addCriterion("deal_msg >", value, "dealMsg");
            return (Criteria) this;
        }

        public Criteria andDealMsgGreaterThanOrEqualTo(String value) {
            addCriterion("deal_msg >=", value, "dealMsg");
            return (Criteria) this;
        }

        public Criteria andDealMsgLessThan(String value) {
            addCriterion("deal_msg <", value, "dealMsg");
            return (Criteria) this;
        }

        public Criteria andDealMsgLessThanOrEqualTo(String value) {
            addCriterion("deal_msg <=", value, "dealMsg");
            return (Criteria) this;
        }

        public Criteria andDealMsgLike(String value) {
            addCriterion("deal_msg like", value, "dealMsg");
            return (Criteria) this;
        }

        public Criteria andDealMsgNotLike(String value) {
            addCriterion("deal_msg not like", value, "dealMsg");
            return (Criteria) this;
        }

        public Criteria andDealMsgIn(List<String> values) {
            addCriterion("deal_msg in", values, "dealMsg");
            return (Criteria) this;
        }

        public Criteria andDealMsgNotIn(List<String> values) {
            addCriterion("deal_msg not in", values, "dealMsg");
            return (Criteria) this;
        }

        public Criteria andDealMsgBetween(String value1, String value2) {
            addCriterion("deal_msg between", value1, value2, "dealMsg");
            return (Criteria) this;
        }

        public Criteria andDealMsgNotBetween(String value1, String value2) {
            addCriterion("deal_msg not between", value1, value2, "dealMsg");
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
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table sys_fault
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
     * This class corresponds to the database table sys_fault
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