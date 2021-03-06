package com.qinjiangbo.gen.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HrUserExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table hr_user
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table hr_user
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table hr_user
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hr_user
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public HrUserExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hr_user
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hr_user
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hr_user
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hr_user
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hr_user
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hr_user
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hr_user
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hr_user
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
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
     * This method corresponds to the database table hr_user
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hr_user
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table hr_user
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
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

        public Criteria andAcPhoneIsNull() {
            addCriterion("ac_phone is null");
            return (Criteria) this;
        }

        public Criteria andAcPhoneIsNotNull() {
            addCriterion("ac_phone is not null");
            return (Criteria) this;
        }

        public Criteria andAcPhoneEqualTo(String value) {
            addCriterion("ac_phone =", value, "acPhone");
            return (Criteria) this;
        }

        public Criteria andAcPhoneNotEqualTo(String value) {
            addCriterion("ac_phone <>", value, "acPhone");
            return (Criteria) this;
        }

        public Criteria andAcPhoneGreaterThan(String value) {
            addCriterion("ac_phone >", value, "acPhone");
            return (Criteria) this;
        }

        public Criteria andAcPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("ac_phone >=", value, "acPhone");
            return (Criteria) this;
        }

        public Criteria andAcPhoneLessThan(String value) {
            addCriterion("ac_phone <", value, "acPhone");
            return (Criteria) this;
        }

        public Criteria andAcPhoneLessThanOrEqualTo(String value) {
            addCriterion("ac_phone <=", value, "acPhone");
            return (Criteria) this;
        }

        public Criteria andAcPhoneLike(String value) {
            addCriterion("ac_phone like", value, "acPhone");
            return (Criteria) this;
        }

        public Criteria andAcPhoneNotLike(String value) {
            addCriterion("ac_phone not like", value, "acPhone");
            return (Criteria) this;
        }

        public Criteria andAcPhoneIn(List<String> values) {
            addCriterion("ac_phone in", values, "acPhone");
            return (Criteria) this;
        }

        public Criteria andAcPhoneNotIn(List<String> values) {
            addCriterion("ac_phone not in", values, "acPhone");
            return (Criteria) this;
        }

        public Criteria andAcPhoneBetween(String value1, String value2) {
            addCriterion("ac_phone between", value1, value2, "acPhone");
            return (Criteria) this;
        }

        public Criteria andAcPhoneNotBetween(String value1, String value2) {
            addCriterion("ac_phone not between", value1, value2, "acPhone");
            return (Criteria) this;
        }

        public Criteria andAcEmailIsNull() {
            addCriterion("ac_email is null");
            return (Criteria) this;
        }

        public Criteria andAcEmailIsNotNull() {
            addCriterion("ac_email is not null");
            return (Criteria) this;
        }

        public Criteria andAcEmailEqualTo(String value) {
            addCriterion("ac_email =", value, "acEmail");
            return (Criteria) this;
        }

        public Criteria andAcEmailNotEqualTo(String value) {
            addCriterion("ac_email <>", value, "acEmail");
            return (Criteria) this;
        }

        public Criteria andAcEmailGreaterThan(String value) {
            addCriterion("ac_email >", value, "acEmail");
            return (Criteria) this;
        }

        public Criteria andAcEmailGreaterThanOrEqualTo(String value) {
            addCriterion("ac_email >=", value, "acEmail");
            return (Criteria) this;
        }

        public Criteria andAcEmailLessThan(String value) {
            addCriterion("ac_email <", value, "acEmail");
            return (Criteria) this;
        }

        public Criteria andAcEmailLessThanOrEqualTo(String value) {
            addCriterion("ac_email <=", value, "acEmail");
            return (Criteria) this;
        }

        public Criteria andAcEmailLike(String value) {
            addCriterion("ac_email like", value, "acEmail");
            return (Criteria) this;
        }

        public Criteria andAcEmailNotLike(String value) {
            addCriterion("ac_email not like", value, "acEmail");
            return (Criteria) this;
        }

        public Criteria andAcEmailIn(List<String> values) {
            addCriterion("ac_email in", values, "acEmail");
            return (Criteria) this;
        }

        public Criteria andAcEmailNotIn(List<String> values) {
            addCriterion("ac_email not in", values, "acEmail");
            return (Criteria) this;
        }

        public Criteria andAcEmailBetween(String value1, String value2) {
            addCriterion("ac_email between", value1, value2, "acEmail");
            return (Criteria) this;
        }

        public Criteria andAcEmailNotBetween(String value1, String value2) {
            addCriterion("ac_email not between", value1, value2, "acEmail");
            return (Criteria) this;
        }

        public Criteria andAcPwdIsNull() {
            addCriterion("ac_pwd is null");
            return (Criteria) this;
        }

        public Criteria andAcPwdIsNotNull() {
            addCriterion("ac_pwd is not null");
            return (Criteria) this;
        }

        public Criteria andAcPwdEqualTo(String value) {
            addCriterion("ac_pwd =", value, "acPwd");
            return (Criteria) this;
        }

        public Criteria andAcPwdNotEqualTo(String value) {
            addCriterion("ac_pwd <>", value, "acPwd");
            return (Criteria) this;
        }

        public Criteria andAcPwdGreaterThan(String value) {
            addCriterion("ac_pwd >", value, "acPwd");
            return (Criteria) this;
        }

        public Criteria andAcPwdGreaterThanOrEqualTo(String value) {
            addCriterion("ac_pwd >=", value, "acPwd");
            return (Criteria) this;
        }

        public Criteria andAcPwdLessThan(String value) {
            addCriterion("ac_pwd <", value, "acPwd");
            return (Criteria) this;
        }

        public Criteria andAcPwdLessThanOrEqualTo(String value) {
            addCriterion("ac_pwd <=", value, "acPwd");
            return (Criteria) this;
        }

        public Criteria andAcPwdLike(String value) {
            addCriterion("ac_pwd like", value, "acPwd");
            return (Criteria) this;
        }

        public Criteria andAcPwdNotLike(String value) {
            addCriterion("ac_pwd not like", value, "acPwd");
            return (Criteria) this;
        }

        public Criteria andAcPwdIn(List<String> values) {
            addCriterion("ac_pwd in", values, "acPwd");
            return (Criteria) this;
        }

        public Criteria andAcPwdNotIn(List<String> values) {
            addCriterion("ac_pwd not in", values, "acPwd");
            return (Criteria) this;
        }

        public Criteria andAcPwdBetween(String value1, String value2) {
            addCriterion("ac_pwd between", value1, value2, "acPwd");
            return (Criteria) this;
        }

        public Criteria andAcPwdNotBetween(String value1, String value2) {
            addCriterion("ac_pwd not between", value1, value2, "acPwd");
            return (Criteria) this;
        }

        public Criteria andHrCodeIsNull() {
            addCriterion("hr_code is null");
            return (Criteria) this;
        }

        public Criteria andHrCodeIsNotNull() {
            addCriterion("hr_code is not null");
            return (Criteria) this;
        }

        public Criteria andHrCodeEqualTo(String value) {
            addCriterion("hr_code =", value, "hrCode");
            return (Criteria) this;
        }

        public Criteria andHrCodeNotEqualTo(String value) {
            addCriterion("hr_code <>", value, "hrCode");
            return (Criteria) this;
        }

        public Criteria andHrCodeGreaterThan(String value) {
            addCriterion("hr_code >", value, "hrCode");
            return (Criteria) this;
        }

        public Criteria andHrCodeGreaterThanOrEqualTo(String value) {
            addCriterion("hr_code >=", value, "hrCode");
            return (Criteria) this;
        }

        public Criteria andHrCodeLessThan(String value) {
            addCriterion("hr_code <", value, "hrCode");
            return (Criteria) this;
        }

        public Criteria andHrCodeLessThanOrEqualTo(String value) {
            addCriterion("hr_code <=", value, "hrCode");
            return (Criteria) this;
        }

        public Criteria andHrCodeLike(String value) {
            addCriterion("hr_code like", value, "hrCode");
            return (Criteria) this;
        }

        public Criteria andHrCodeNotLike(String value) {
            addCriterion("hr_code not like", value, "hrCode");
            return (Criteria) this;
        }

        public Criteria andHrCodeIn(List<String> values) {
            addCriterion("hr_code in", values, "hrCode");
            return (Criteria) this;
        }

        public Criteria andHrCodeNotIn(List<String> values) {
            addCriterion("hr_code not in", values, "hrCode");
            return (Criteria) this;
        }

        public Criteria andHrCodeBetween(String value1, String value2) {
            addCriterion("hr_code between", value1, value2, "hrCode");
            return (Criteria) this;
        }

        public Criteria andHrCodeNotBetween(String value1, String value2) {
            addCriterion("hr_code not between", value1, value2, "hrCode");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andTimeEntryIsNull() {
            addCriterion("time_entry is null");
            return (Criteria) this;
        }

        public Criteria andTimeEntryIsNotNull() {
            addCriterion("time_entry is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEntryEqualTo(Date value) {
            addCriterion("time_entry =", value, "timeEntry");
            return (Criteria) this;
        }

        public Criteria andTimeEntryNotEqualTo(Date value) {
            addCriterion("time_entry <>", value, "timeEntry");
            return (Criteria) this;
        }

        public Criteria andTimeEntryGreaterThan(Date value) {
            addCriterion("time_entry >", value, "timeEntry");
            return (Criteria) this;
        }

        public Criteria andTimeEntryGreaterThanOrEqualTo(Date value) {
            addCriterion("time_entry >=", value, "timeEntry");
            return (Criteria) this;
        }

        public Criteria andTimeEntryLessThan(Date value) {
            addCriterion("time_entry <", value, "timeEntry");
            return (Criteria) this;
        }

        public Criteria andTimeEntryLessThanOrEqualTo(Date value) {
            addCriterion("time_entry <=", value, "timeEntry");
            return (Criteria) this;
        }

        public Criteria andTimeEntryIn(List<Date> values) {
            addCriterion("time_entry in", values, "timeEntry");
            return (Criteria) this;
        }

        public Criteria andTimeEntryNotIn(List<Date> values) {
            addCriterion("time_entry not in", values, "timeEntry");
            return (Criteria) this;
        }

        public Criteria andTimeEntryBetween(Date value1, Date value2) {
            addCriterion("time_entry between", value1, value2, "timeEntry");
            return (Criteria) this;
        }

        public Criteria andTimeEntryNotBetween(Date value1, Date value2) {
            addCriterion("time_entry not between", value1, value2, "timeEntry");
            return (Criteria) this;
        }

        public Criteria andTimeLeaveIsNull() {
            addCriterion("time_leave is null");
            return (Criteria) this;
        }

        public Criteria andTimeLeaveIsNotNull() {
            addCriterion("time_leave is not null");
            return (Criteria) this;
        }

        public Criteria andTimeLeaveEqualTo(Date value) {
            addCriterion("time_leave =", value, "timeLeave");
            return (Criteria) this;
        }

        public Criteria andTimeLeaveNotEqualTo(Date value) {
            addCriterion("time_leave <>", value, "timeLeave");
            return (Criteria) this;
        }

        public Criteria andTimeLeaveGreaterThan(Date value) {
            addCriterion("time_leave >", value, "timeLeave");
            return (Criteria) this;
        }

        public Criteria andTimeLeaveGreaterThanOrEqualTo(Date value) {
            addCriterion("time_leave >=", value, "timeLeave");
            return (Criteria) this;
        }

        public Criteria andTimeLeaveLessThan(Date value) {
            addCriterion("time_leave <", value, "timeLeave");
            return (Criteria) this;
        }

        public Criteria andTimeLeaveLessThanOrEqualTo(Date value) {
            addCriterion("time_leave <=", value, "timeLeave");
            return (Criteria) this;
        }

        public Criteria andTimeLeaveIn(List<Date> values) {
            addCriterion("time_leave in", values, "timeLeave");
            return (Criteria) this;
        }

        public Criteria andTimeLeaveNotIn(List<Date> values) {
            addCriterion("time_leave not in", values, "timeLeave");
            return (Criteria) this;
        }

        public Criteria andTimeLeaveBetween(Date value1, Date value2) {
            addCriterion("time_leave between", value1, value2, "timeLeave");
            return (Criteria) this;
        }

        public Criteria andTimeLeaveNotBetween(Date value1, Date value2) {
            addCriterion("time_leave not between", value1, value2, "timeLeave");
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

        public Criteria andNumErrIsNull() {
            addCriterion("num_err is null");
            return (Criteria) this;
        }

        public Criteria andNumErrIsNotNull() {
            addCriterion("num_err is not null");
            return (Criteria) this;
        }

        public Criteria andNumErrEqualTo(Integer value) {
            addCriterion("num_err =", value, "numErr");
            return (Criteria) this;
        }

        public Criteria andNumErrNotEqualTo(Integer value) {
            addCriterion("num_err <>", value, "numErr");
            return (Criteria) this;
        }

        public Criteria andNumErrGreaterThan(Integer value) {
            addCriterion("num_err >", value, "numErr");
            return (Criteria) this;
        }

        public Criteria andNumErrGreaterThanOrEqualTo(Integer value) {
            addCriterion("num_err >=", value, "numErr");
            return (Criteria) this;
        }

        public Criteria andNumErrLessThan(Integer value) {
            addCriterion("num_err <", value, "numErr");
            return (Criteria) this;
        }

        public Criteria andNumErrLessThanOrEqualTo(Integer value) {
            addCriterion("num_err <=", value, "numErr");
            return (Criteria) this;
        }

        public Criteria andNumErrIn(List<Integer> values) {
            addCriterion("num_err in", values, "numErr");
            return (Criteria) this;
        }

        public Criteria andNumErrNotIn(List<Integer> values) {
            addCriterion("num_err not in", values, "numErr");
            return (Criteria) this;
        }

        public Criteria andNumErrBetween(Integer value1, Integer value2) {
            addCriterion("num_err between", value1, value2, "numErr");
            return (Criteria) this;
        }

        public Criteria andNumErrNotBetween(Integer value1, Integer value2) {
            addCriterion("num_err not between", value1, value2, "numErr");
            return (Criteria) this;
        }

        public Criteria andTimeErrIsNull() {
            addCriterion("time_err is null");
            return (Criteria) this;
        }

        public Criteria andTimeErrIsNotNull() {
            addCriterion("time_err is not null");
            return (Criteria) this;
        }

        public Criteria andTimeErrEqualTo(Date value) {
            addCriterion("time_err =", value, "timeErr");
            return (Criteria) this;
        }

        public Criteria andTimeErrNotEqualTo(Date value) {
            addCriterion("time_err <>", value, "timeErr");
            return (Criteria) this;
        }

        public Criteria andTimeErrGreaterThan(Date value) {
            addCriterion("time_err >", value, "timeErr");
            return (Criteria) this;
        }

        public Criteria andTimeErrGreaterThanOrEqualTo(Date value) {
            addCriterion("time_err >=", value, "timeErr");
            return (Criteria) this;
        }

        public Criteria andTimeErrLessThan(Date value) {
            addCriterion("time_err <", value, "timeErr");
            return (Criteria) this;
        }

        public Criteria andTimeErrLessThanOrEqualTo(Date value) {
            addCriterion("time_err <=", value, "timeErr");
            return (Criteria) this;
        }

        public Criteria andTimeErrIn(List<Date> values) {
            addCriterion("time_err in", values, "timeErr");
            return (Criteria) this;
        }

        public Criteria andTimeErrNotIn(List<Date> values) {
            addCriterion("time_err not in", values, "timeErr");
            return (Criteria) this;
        }

        public Criteria andTimeErrBetween(Date value1, Date value2) {
            addCriterion("time_err between", value1, value2, "timeErr");
            return (Criteria) this;
        }

        public Criteria andTimeErrNotBetween(Date value1, Date value2) {
            addCriterion("time_err not between", value1, value2, "timeErr");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table hr_user
     *
     * @mbggenerated do_not_delete_during_merge Tue Jun 21 00:00:03 CST 2016
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table hr_user
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
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