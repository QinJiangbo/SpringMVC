package com.qinjiangbo.gen.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PayAdjestExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table pay_adjest
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table pay_adjest
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table pay_adjest
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_adjest
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public PayAdjestExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_adjest
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_adjest
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_adjest
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_adjest
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_adjest
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_adjest
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_adjest
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
     * This method corresponds to the database table pay_adjest
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
     * This method corresponds to the database table pay_adjest
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_adjest
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
     * This class corresponds to the database table pay_adjest
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

        public Criteria andAdjIdIsNull() {
            addCriterion("adj_id is null");
            return (Criteria) this;
        }

        public Criteria andAdjIdIsNotNull() {
            addCriterion("adj_id is not null");
            return (Criteria) this;
        }

        public Criteria andAdjIdEqualTo(Long value) {
            addCriterion("adj_id =", value, "adjId");
            return (Criteria) this;
        }

        public Criteria andAdjIdNotEqualTo(Long value) {
            addCriterion("adj_id <>", value, "adjId");
            return (Criteria) this;
        }

        public Criteria andAdjIdGreaterThan(Long value) {
            addCriterion("adj_id >", value, "adjId");
            return (Criteria) this;
        }

        public Criteria andAdjIdGreaterThanOrEqualTo(Long value) {
            addCriterion("adj_id >=", value, "adjId");
            return (Criteria) this;
        }

        public Criteria andAdjIdLessThan(Long value) {
            addCriterion("adj_id <", value, "adjId");
            return (Criteria) this;
        }

        public Criteria andAdjIdLessThanOrEqualTo(Long value) {
            addCriterion("adj_id <=", value, "adjId");
            return (Criteria) this;
        }

        public Criteria andAdjIdIn(List<Long> values) {
            addCriterion("adj_id in", values, "adjId");
            return (Criteria) this;
        }

        public Criteria andAdjIdNotIn(List<Long> values) {
            addCriterion("adj_id not in", values, "adjId");
            return (Criteria) this;
        }

        public Criteria andAdjIdBetween(Long value1, Long value2) {
            addCriterion("adj_id between", value1, value2, "adjId");
            return (Criteria) this;
        }

        public Criteria andAdjIdNotBetween(Long value1, Long value2) {
            addCriterion("adj_id not between", value1, value2, "adjId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Long value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Long value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Long value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Long value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Long value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Long value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Long> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Long> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Long value1, Long value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Long value1, Long value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOutIdIsNull() {
            addCriterion("out_id is null");
            return (Criteria) this;
        }

        public Criteria andOutIdIsNotNull() {
            addCriterion("out_id is not null");
            return (Criteria) this;
        }

        public Criteria andOutIdEqualTo(Long value) {
            addCriterion("out_id =", value, "outId");
            return (Criteria) this;
        }

        public Criteria andOutIdNotEqualTo(Long value) {
            addCriterion("out_id <>", value, "outId");
            return (Criteria) this;
        }

        public Criteria andOutIdGreaterThan(Long value) {
            addCriterion("out_id >", value, "outId");
            return (Criteria) this;
        }

        public Criteria andOutIdGreaterThanOrEqualTo(Long value) {
            addCriterion("out_id >=", value, "outId");
            return (Criteria) this;
        }

        public Criteria andOutIdLessThan(Long value) {
            addCriterion("out_id <", value, "outId");
            return (Criteria) this;
        }

        public Criteria andOutIdLessThanOrEqualTo(Long value) {
            addCriterion("out_id <=", value, "outId");
            return (Criteria) this;
        }

        public Criteria andOutIdIn(List<Long> values) {
            addCriterion("out_id in", values, "outId");
            return (Criteria) this;
        }

        public Criteria andOutIdNotIn(List<Long> values) {
            addCriterion("out_id not in", values, "outId");
            return (Criteria) this;
        }

        public Criteria andOutIdBetween(Long value1, Long value2) {
            addCriterion("out_id between", value1, value2, "outId");
            return (Criteria) this;
        }

        public Criteria andOutIdNotBetween(Long value1, Long value2) {
            addCriterion("out_id not between", value1, value2, "outId");
            return (Criteria) this;
        }

        public Criteria andMoneyOutIsNull() {
            addCriterion("money_out is null");
            return (Criteria) this;
        }

        public Criteria andMoneyOutIsNotNull() {
            addCriterion("money_out is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyOutEqualTo(BigDecimal value) {
            addCriterion("money_out =", value, "moneyOut");
            return (Criteria) this;
        }

        public Criteria andMoneyOutNotEqualTo(BigDecimal value) {
            addCriterion("money_out <>", value, "moneyOut");
            return (Criteria) this;
        }

        public Criteria andMoneyOutGreaterThan(BigDecimal value) {
            addCriterion("money_out >", value, "moneyOut");
            return (Criteria) this;
        }

        public Criteria andMoneyOutGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("money_out >=", value, "moneyOut");
            return (Criteria) this;
        }

        public Criteria andMoneyOutLessThan(BigDecimal value) {
            addCriterion("money_out <", value, "moneyOut");
            return (Criteria) this;
        }

        public Criteria andMoneyOutLessThanOrEqualTo(BigDecimal value) {
            addCriterion("money_out <=", value, "moneyOut");
            return (Criteria) this;
        }

        public Criteria andMoneyOutIn(List<BigDecimal> values) {
            addCriterion("money_out in", values, "moneyOut");
            return (Criteria) this;
        }

        public Criteria andMoneyOutNotIn(List<BigDecimal> values) {
            addCriterion("money_out not in", values, "moneyOut");
            return (Criteria) this;
        }

        public Criteria andMoneyOutBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("money_out between", value1, value2, "moneyOut");
            return (Criteria) this;
        }

        public Criteria andMoneyOutNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("money_out not between", value1, value2, "moneyOut");
            return (Criteria) this;
        }

        public Criteria andRequIdIsNull() {
            addCriterion("requ_id is null");
            return (Criteria) this;
        }

        public Criteria andRequIdIsNotNull() {
            addCriterion("requ_id is not null");
            return (Criteria) this;
        }

        public Criteria andRequIdEqualTo(Long value) {
            addCriterion("requ_id =", value, "requId");
            return (Criteria) this;
        }

        public Criteria andRequIdNotEqualTo(Long value) {
            addCriterion("requ_id <>", value, "requId");
            return (Criteria) this;
        }

        public Criteria andRequIdGreaterThan(Long value) {
            addCriterion("requ_id >", value, "requId");
            return (Criteria) this;
        }

        public Criteria andRequIdGreaterThanOrEqualTo(Long value) {
            addCriterion("requ_id >=", value, "requId");
            return (Criteria) this;
        }

        public Criteria andRequIdLessThan(Long value) {
            addCriterion("requ_id <", value, "requId");
            return (Criteria) this;
        }

        public Criteria andRequIdLessThanOrEqualTo(Long value) {
            addCriterion("requ_id <=", value, "requId");
            return (Criteria) this;
        }

        public Criteria andRequIdIn(List<Long> values) {
            addCriterion("requ_id in", values, "requId");
            return (Criteria) this;
        }

        public Criteria andRequIdNotIn(List<Long> values) {
            addCriterion("requ_id not in", values, "requId");
            return (Criteria) this;
        }

        public Criteria andRequIdBetween(Long value1, Long value2) {
            addCriterion("requ_id between", value1, value2, "requId");
            return (Criteria) this;
        }

        public Criteria andRequIdNotBetween(Long value1, Long value2) {
            addCriterion("requ_id not between", value1, value2, "requId");
            return (Criteria) this;
        }

        public Criteria andMoneyBankIsNull() {
            addCriterion("money_bank is null");
            return (Criteria) this;
        }

        public Criteria andMoneyBankIsNotNull() {
            addCriterion("money_bank is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyBankEqualTo(BigDecimal value) {
            addCriterion("money_bank =", value, "moneyBank");
            return (Criteria) this;
        }

        public Criteria andMoneyBankNotEqualTo(BigDecimal value) {
            addCriterion("money_bank <>", value, "moneyBank");
            return (Criteria) this;
        }

        public Criteria andMoneyBankGreaterThan(BigDecimal value) {
            addCriterion("money_bank >", value, "moneyBank");
            return (Criteria) this;
        }

        public Criteria andMoneyBankGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("money_bank >=", value, "moneyBank");
            return (Criteria) this;
        }

        public Criteria andMoneyBankLessThan(BigDecimal value) {
            addCriterion("money_bank <", value, "moneyBank");
            return (Criteria) this;
        }

        public Criteria andMoneyBankLessThanOrEqualTo(BigDecimal value) {
            addCriterion("money_bank <=", value, "moneyBank");
            return (Criteria) this;
        }

        public Criteria andMoneyBankIn(List<BigDecimal> values) {
            addCriterion("money_bank in", values, "moneyBank");
            return (Criteria) this;
        }

        public Criteria andMoneyBankNotIn(List<BigDecimal> values) {
            addCriterion("money_bank not in", values, "moneyBank");
            return (Criteria) this;
        }

        public Criteria andMoneyBankBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("money_bank between", value1, value2, "moneyBank");
            return (Criteria) this;
        }

        public Criteria andMoneyBankNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("money_bank not between", value1, value2, "moneyBank");
            return (Criteria) this;
        }

        public Criteria andMoneyAdjIsNull() {
            addCriterion("money_adj is null");
            return (Criteria) this;
        }

        public Criteria andMoneyAdjIsNotNull() {
            addCriterion("money_adj is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyAdjEqualTo(BigDecimal value) {
            addCriterion("money_adj =", value, "moneyAdj");
            return (Criteria) this;
        }

        public Criteria andMoneyAdjNotEqualTo(BigDecimal value) {
            addCriterion("money_adj <>", value, "moneyAdj");
            return (Criteria) this;
        }

        public Criteria andMoneyAdjGreaterThan(BigDecimal value) {
            addCriterion("money_adj >", value, "moneyAdj");
            return (Criteria) this;
        }

        public Criteria andMoneyAdjGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("money_adj >=", value, "moneyAdj");
            return (Criteria) this;
        }

        public Criteria andMoneyAdjLessThan(BigDecimal value) {
            addCriterion("money_adj <", value, "moneyAdj");
            return (Criteria) this;
        }

        public Criteria andMoneyAdjLessThanOrEqualTo(BigDecimal value) {
            addCriterion("money_adj <=", value, "moneyAdj");
            return (Criteria) this;
        }

        public Criteria andMoneyAdjIn(List<BigDecimal> values) {
            addCriterion("money_adj in", values, "moneyAdj");
            return (Criteria) this;
        }

        public Criteria andMoneyAdjNotIn(List<BigDecimal> values) {
            addCriterion("money_adj not in", values, "moneyAdj");
            return (Criteria) this;
        }

        public Criteria andMoneyAdjBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("money_adj between", value1, value2, "moneyAdj");
            return (Criteria) this;
        }

        public Criteria andMoneyAdjNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("money_adj not between", value1, value2, "moneyAdj");
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
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table pay_adjest
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
     * This class corresponds to the database table pay_adjest
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