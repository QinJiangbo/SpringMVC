package com.qinjiangbo.gen.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PayCardExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table pay_card
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table pay_card
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table pay_card
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_card
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public PayCardExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_card
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_card
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_card
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_card
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_card
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_card
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_card
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
     * This method corresponds to the database table pay_card
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
     * This method corresponds to the database table pay_card
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_card
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
     * This class corresponds to the database table pay_card
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

        public Criteria andCardIdIsNull() {
            addCriterion("card_id is null");
            return (Criteria) this;
        }

        public Criteria andCardIdIsNotNull() {
            addCriterion("card_id is not null");
            return (Criteria) this;
        }

        public Criteria andCardIdEqualTo(Long value) {
            addCriterion("card_id =", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotEqualTo(Long value) {
            addCriterion("card_id <>", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdGreaterThan(Long value) {
            addCriterion("card_id >", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdGreaterThanOrEqualTo(Long value) {
            addCriterion("card_id >=", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdLessThan(Long value) {
            addCriterion("card_id <", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdLessThanOrEqualTo(Long value) {
            addCriterion("card_id <=", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdIn(List<Long> values) {
            addCriterion("card_id in", values, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotIn(List<Long> values) {
            addCriterion("card_id not in", values, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdBetween(Long value1, Long value2) {
            addCriterion("card_id between", value1, value2, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotBetween(Long value1, Long value2) {
            addCriterion("card_id not between", value1, value2, "cardId");
            return (Criteria) this;
        }

        public Criteria andPayIdIsNull() {
            addCriterion("pay_id is null");
            return (Criteria) this;
        }

        public Criteria andPayIdIsNotNull() {
            addCriterion("pay_id is not null");
            return (Criteria) this;
        }

        public Criteria andPayIdEqualTo(Long value) {
            addCriterion("pay_id =", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdNotEqualTo(Long value) {
            addCriterion("pay_id <>", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdGreaterThan(Long value) {
            addCriterion("pay_id >", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdGreaterThanOrEqualTo(Long value) {
            addCriterion("pay_id >=", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdLessThan(Long value) {
            addCriterion("pay_id <", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdLessThanOrEqualTo(Long value) {
            addCriterion("pay_id <=", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdIn(List<Long> values) {
            addCriterion("pay_id in", values, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdNotIn(List<Long> values) {
            addCriterion("pay_id not in", values, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdBetween(Long value1, Long value2) {
            addCriterion("pay_id between", value1, value2, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdNotBetween(Long value1, Long value2) {
            addCriterion("pay_id not between", value1, value2, "payId");
            return (Criteria) this;
        }

        public Criteria andCardTypeIsNull() {
            addCriterion("card_type is null");
            return (Criteria) this;
        }

        public Criteria andCardTypeIsNotNull() {
            addCriterion("card_type is not null");
            return (Criteria) this;
        }

        public Criteria andCardTypeEqualTo(Long value) {
            addCriterion("card_type =", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeNotEqualTo(Long value) {
            addCriterion("card_type <>", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeGreaterThan(Long value) {
            addCriterion("card_type >", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeGreaterThanOrEqualTo(Long value) {
            addCriterion("card_type >=", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeLessThan(Long value) {
            addCriterion("card_type <", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeLessThanOrEqualTo(Long value) {
            addCriterion("card_type <=", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeIn(List<Long> values) {
            addCriterion("card_type in", values, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeNotIn(List<Long> values) {
            addCriterion("card_type not in", values, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeBetween(Long value1, Long value2) {
            addCriterion("card_type between", value1, value2, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeNotBetween(Long value1, Long value2) {
            addCriterion("card_type not between", value1, value2, "cardType");
            return (Criteria) this;
        }

        public Criteria andIsCheckIsNull() {
            addCriterion("is_check is null");
            return (Criteria) this;
        }

        public Criteria andIsCheckIsNotNull() {
            addCriterion("is_check is not null");
            return (Criteria) this;
        }

        public Criteria andIsCheckEqualTo(Long value) {
            addCriterion("is_check =", value, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckNotEqualTo(Long value) {
            addCriterion("is_check <>", value, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckGreaterThan(Long value) {
            addCriterion("is_check >", value, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckGreaterThanOrEqualTo(Long value) {
            addCriterion("is_check >=", value, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckLessThan(Long value) {
            addCriterion("is_check <", value, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckLessThanOrEqualTo(Long value) {
            addCriterion("is_check <=", value, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckIn(List<Long> values) {
            addCriterion("is_check in", values, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckNotIn(List<Long> values) {
            addCriterion("is_check not in", values, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckBetween(Long value1, Long value2) {
            addCriterion("is_check between", value1, value2, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckNotBetween(Long value1, Long value2) {
            addCriterion("is_check not between", value1, value2, "isCheck");
            return (Criteria) this;
        }

        public Criteria andCardCodeIsNull() {
            addCriterion("card_code is null");
            return (Criteria) this;
        }

        public Criteria andCardCodeIsNotNull() {
            addCriterion("card_code is not null");
            return (Criteria) this;
        }

        public Criteria andCardCodeEqualTo(String value) {
            addCriterion("card_code =", value, "cardCode");
            return (Criteria) this;
        }

        public Criteria andCardCodeNotEqualTo(String value) {
            addCriterion("card_code <>", value, "cardCode");
            return (Criteria) this;
        }

        public Criteria andCardCodeGreaterThan(String value) {
            addCriterion("card_code >", value, "cardCode");
            return (Criteria) this;
        }

        public Criteria andCardCodeGreaterThanOrEqualTo(String value) {
            addCriterion("card_code >=", value, "cardCode");
            return (Criteria) this;
        }

        public Criteria andCardCodeLessThan(String value) {
            addCriterion("card_code <", value, "cardCode");
            return (Criteria) this;
        }

        public Criteria andCardCodeLessThanOrEqualTo(String value) {
            addCriterion("card_code <=", value, "cardCode");
            return (Criteria) this;
        }

        public Criteria andCardCodeLike(String value) {
            addCriterion("card_code like", value, "cardCode");
            return (Criteria) this;
        }

        public Criteria andCardCodeNotLike(String value) {
            addCriterion("card_code not like", value, "cardCode");
            return (Criteria) this;
        }

        public Criteria andCardCodeIn(List<String> values) {
            addCriterion("card_code in", values, "cardCode");
            return (Criteria) this;
        }

        public Criteria andCardCodeNotIn(List<String> values) {
            addCriterion("card_code not in", values, "cardCode");
            return (Criteria) this;
        }

        public Criteria andCardCodeBetween(String value1, String value2) {
            addCriterion("card_code between", value1, value2, "cardCode");
            return (Criteria) this;
        }

        public Criteria andCardCodeNotBetween(String value1, String value2) {
            addCriterion("card_code not between", value1, value2, "cardCode");
            return (Criteria) this;
        }

        public Criteria andCardBankIsNull() {
            addCriterion("card_bank is null");
            return (Criteria) this;
        }

        public Criteria andCardBankIsNotNull() {
            addCriterion("card_bank is not null");
            return (Criteria) this;
        }

        public Criteria andCardBankEqualTo(String value) {
            addCriterion("card_bank =", value, "cardBank");
            return (Criteria) this;
        }

        public Criteria andCardBankNotEqualTo(String value) {
            addCriterion("card_bank <>", value, "cardBank");
            return (Criteria) this;
        }

        public Criteria andCardBankGreaterThan(String value) {
            addCriterion("card_bank >", value, "cardBank");
            return (Criteria) this;
        }

        public Criteria andCardBankGreaterThanOrEqualTo(String value) {
            addCriterion("card_bank >=", value, "cardBank");
            return (Criteria) this;
        }

        public Criteria andCardBankLessThan(String value) {
            addCriterion("card_bank <", value, "cardBank");
            return (Criteria) this;
        }

        public Criteria andCardBankLessThanOrEqualTo(String value) {
            addCriterion("card_bank <=", value, "cardBank");
            return (Criteria) this;
        }

        public Criteria andCardBankLike(String value) {
            addCriterion("card_bank like", value, "cardBank");
            return (Criteria) this;
        }

        public Criteria andCardBankNotLike(String value) {
            addCriterion("card_bank not like", value, "cardBank");
            return (Criteria) this;
        }

        public Criteria andCardBankIn(List<String> values) {
            addCriterion("card_bank in", values, "cardBank");
            return (Criteria) this;
        }

        public Criteria andCardBankNotIn(List<String> values) {
            addCriterion("card_bank not in", values, "cardBank");
            return (Criteria) this;
        }

        public Criteria andCardBankBetween(String value1, String value2) {
            addCriterion("card_bank between", value1, value2, "cardBank");
            return (Criteria) this;
        }

        public Criteria andCardBankNotBetween(String value1, String value2) {
            addCriterion("card_bank not between", value1, value2, "cardBank");
            return (Criteria) this;
        }

        public Criteria andCardNameIsNull() {
            addCriterion("card_name is null");
            return (Criteria) this;
        }

        public Criteria andCardNameIsNotNull() {
            addCriterion("card_name is not null");
            return (Criteria) this;
        }

        public Criteria andCardNameEqualTo(String value) {
            addCriterion("card_name =", value, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameNotEqualTo(String value) {
            addCriterion("card_name <>", value, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameGreaterThan(String value) {
            addCriterion("card_name >", value, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameGreaterThanOrEqualTo(String value) {
            addCriterion("card_name >=", value, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameLessThan(String value) {
            addCriterion("card_name <", value, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameLessThanOrEqualTo(String value) {
            addCriterion("card_name <=", value, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameLike(String value) {
            addCriterion("card_name like", value, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameNotLike(String value) {
            addCriterion("card_name not like", value, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameIn(List<String> values) {
            addCriterion("card_name in", values, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameNotIn(List<String> values) {
            addCriterion("card_name not in", values, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameBetween(String value1, String value2) {
            addCriterion("card_name between", value1, value2, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameNotBetween(String value1, String value2) {
            addCriterion("card_name not between", value1, value2, "cardName");
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

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Long value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Long value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Long value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Long value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Long value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Long value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Long> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Long> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Long value1, Long value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Long value1, Long value2) {
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
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table pay_card
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
     * This class corresponds to the database table pay_card
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