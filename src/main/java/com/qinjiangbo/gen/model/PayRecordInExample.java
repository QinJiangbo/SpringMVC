package com.qinjiangbo.gen.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PayRecordInExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table pay_record_in
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table pay_record_in
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table pay_record_in
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_record_in
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public PayRecordInExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_record_in
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_record_in
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_record_in
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_record_in
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_record_in
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_record_in
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_record_in
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
     * This method corresponds to the database table pay_record_in
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
     * This method corresponds to the database table pay_record_in
     *
     * @mbggenerated Tue Jun 21 00:00:03 CST 2016
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_record_in
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
     * This class corresponds to the database table pay_record_in
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

        public Criteria andInIdIsNull() {
            addCriterion("in_id is null");
            return (Criteria) this;
        }

        public Criteria andInIdIsNotNull() {
            addCriterion("in_id is not null");
            return (Criteria) this;
        }

        public Criteria andInIdEqualTo(Long value) {
            addCriterion("in_id =", value, "inId");
            return (Criteria) this;
        }

        public Criteria andInIdNotEqualTo(Long value) {
            addCriterion("in_id <>", value, "inId");
            return (Criteria) this;
        }

        public Criteria andInIdGreaterThan(Long value) {
            addCriterion("in_id >", value, "inId");
            return (Criteria) this;
        }

        public Criteria andInIdGreaterThanOrEqualTo(Long value) {
            addCriterion("in_id >=", value, "inId");
            return (Criteria) this;
        }

        public Criteria andInIdLessThan(Long value) {
            addCriterion("in_id <", value, "inId");
            return (Criteria) this;
        }

        public Criteria andInIdLessThanOrEqualTo(Long value) {
            addCriterion("in_id <=", value, "inId");
            return (Criteria) this;
        }

        public Criteria andInIdIn(List<Long> values) {
            addCriterion("in_id in", values, "inId");
            return (Criteria) this;
        }

        public Criteria andInIdNotIn(List<Long> values) {
            addCriterion("in_id not in", values, "inId");
            return (Criteria) this;
        }

        public Criteria andInIdBetween(Long value1, Long value2) {
            addCriterion("in_id between", value1, value2, "inId");
            return (Criteria) this;
        }

        public Criteria andInIdNotBetween(Long value1, Long value2) {
            addCriterion("in_id not between", value1, value2, "inId");
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

        public Criteria andFundIdIsNull() {
            addCriterion("fund_id is null");
            return (Criteria) this;
        }

        public Criteria andFundIdIsNotNull() {
            addCriterion("fund_id is not null");
            return (Criteria) this;
        }

        public Criteria andFundIdEqualTo(Long value) {
            addCriterion("fund_id =", value, "fundId");
            return (Criteria) this;
        }

        public Criteria andFundIdNotEqualTo(Long value) {
            addCriterion("fund_id <>", value, "fundId");
            return (Criteria) this;
        }

        public Criteria andFundIdGreaterThan(Long value) {
            addCriterion("fund_id >", value, "fundId");
            return (Criteria) this;
        }

        public Criteria andFundIdGreaterThanOrEqualTo(Long value) {
            addCriterion("fund_id >=", value, "fundId");
            return (Criteria) this;
        }

        public Criteria andFundIdLessThan(Long value) {
            addCriterion("fund_id <", value, "fundId");
            return (Criteria) this;
        }

        public Criteria andFundIdLessThanOrEqualTo(Long value) {
            addCriterion("fund_id <=", value, "fundId");
            return (Criteria) this;
        }

        public Criteria andFundIdIn(List<Long> values) {
            addCriterion("fund_id in", values, "fundId");
            return (Criteria) this;
        }

        public Criteria andFundIdNotIn(List<Long> values) {
            addCriterion("fund_id not in", values, "fundId");
            return (Criteria) this;
        }

        public Criteria andFundIdBetween(Long value1, Long value2) {
            addCriterion("fund_id between", value1, value2, "fundId");
            return (Criteria) this;
        }

        public Criteria andFundIdNotBetween(Long value1, Long value2) {
            addCriterion("fund_id not between", value1, value2, "fundId");
            return (Criteria) this;
        }

        public Criteria andDirectIsNull() {
            addCriterion("direct is null");
            return (Criteria) this;
        }

        public Criteria andDirectIsNotNull() {
            addCriterion("direct is not null");
            return (Criteria) this;
        }

        public Criteria andDirectEqualTo(Integer value) {
            addCriterion("direct =", value, "direct");
            return (Criteria) this;
        }

        public Criteria andDirectNotEqualTo(Integer value) {
            addCriterion("direct <>", value, "direct");
            return (Criteria) this;
        }

        public Criteria andDirectGreaterThan(Integer value) {
            addCriterion("direct >", value, "direct");
            return (Criteria) this;
        }

        public Criteria andDirectGreaterThanOrEqualTo(Integer value) {
            addCriterion("direct >=", value, "direct");
            return (Criteria) this;
        }

        public Criteria andDirectLessThan(Integer value) {
            addCriterion("direct <", value, "direct");
            return (Criteria) this;
        }

        public Criteria andDirectLessThanOrEqualTo(Integer value) {
            addCriterion("direct <=", value, "direct");
            return (Criteria) this;
        }

        public Criteria andDirectIn(List<Integer> values) {
            addCriterion("direct in", values, "direct");
            return (Criteria) this;
        }

        public Criteria andDirectNotIn(List<Integer> values) {
            addCriterion("direct not in", values, "direct");
            return (Criteria) this;
        }

        public Criteria andDirectBetween(Integer value1, Integer value2) {
            addCriterion("direct between", value1, value2, "direct");
            return (Criteria) this;
        }

        public Criteria andDirectNotBetween(Integer value1, Integer value2) {
            addCriterion("direct not between", value1, value2, "direct");
            return (Criteria) this;
        }

        public Criteria andTradeModeIsNull() {
            addCriterion("trade_mode is null");
            return (Criteria) this;
        }

        public Criteria andTradeModeIsNotNull() {
            addCriterion("trade_mode is not null");
            return (Criteria) this;
        }

        public Criteria andTradeModeEqualTo(Long value) {
            addCriterion("trade_mode =", value, "tradeMode");
            return (Criteria) this;
        }

        public Criteria andTradeModeNotEqualTo(Long value) {
            addCriterion("trade_mode <>", value, "tradeMode");
            return (Criteria) this;
        }

        public Criteria andTradeModeGreaterThan(Long value) {
            addCriterion("trade_mode >", value, "tradeMode");
            return (Criteria) this;
        }

        public Criteria andTradeModeGreaterThanOrEqualTo(Long value) {
            addCriterion("trade_mode >=", value, "tradeMode");
            return (Criteria) this;
        }

        public Criteria andTradeModeLessThan(Long value) {
            addCriterion("trade_mode <", value, "tradeMode");
            return (Criteria) this;
        }

        public Criteria andTradeModeLessThanOrEqualTo(Long value) {
            addCriterion("trade_mode <=", value, "tradeMode");
            return (Criteria) this;
        }

        public Criteria andTradeModeIn(List<Long> values) {
            addCriterion("trade_mode in", values, "tradeMode");
            return (Criteria) this;
        }

        public Criteria andTradeModeNotIn(List<Long> values) {
            addCriterion("trade_mode not in", values, "tradeMode");
            return (Criteria) this;
        }

        public Criteria andTradeModeBetween(Long value1, Long value2) {
            addCriterion("trade_mode between", value1, value2, "tradeMode");
            return (Criteria) this;
        }

        public Criteria andTradeModeNotBetween(Long value1, Long value2) {
            addCriterion("trade_mode not between", value1, value2, "tradeMode");
            return (Criteria) this;
        }

        public Criteria andTradeTypeIsNull() {
            addCriterion("trade_type is null");
            return (Criteria) this;
        }

        public Criteria andTradeTypeIsNotNull() {
            addCriterion("trade_type is not null");
            return (Criteria) this;
        }

        public Criteria andTradeTypeEqualTo(Long value) {
            addCriterion("trade_type =", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeNotEqualTo(Long value) {
            addCriterion("trade_type <>", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeGreaterThan(Long value) {
            addCriterion("trade_type >", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeGreaterThanOrEqualTo(Long value) {
            addCriterion("trade_type >=", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeLessThan(Long value) {
            addCriterion("trade_type <", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeLessThanOrEqualTo(Long value) {
            addCriterion("trade_type <=", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeIn(List<Long> values) {
            addCriterion("trade_type in", values, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeNotIn(List<Long> values) {
            addCriterion("trade_type not in", values, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeBetween(Long value1, Long value2) {
            addCriterion("trade_type between", value1, value2, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeNotBetween(Long value1, Long value2) {
            addCriterion("trade_type not between", value1, value2, "tradeType");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNull() {
            addCriterion("money is null");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNotNull() {
            addCriterion("money is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyEqualTo(BigDecimal value) {
            addCriterion("money =", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotEqualTo(BigDecimal value) {
            addCriterion("money <>", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThan(BigDecimal value) {
            addCriterion("money >", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("money >=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThan(BigDecimal value) {
            addCriterion("money <", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("money <=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyIn(List<BigDecimal> values) {
            addCriterion("money in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotIn(List<BigDecimal> values) {
            addCriterion("money not in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("money between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("money not between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyCoupIsNull() {
            addCriterion("money_coup is null");
            return (Criteria) this;
        }

        public Criteria andMoneyCoupIsNotNull() {
            addCriterion("money_coup is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyCoupEqualTo(BigDecimal value) {
            addCriterion("money_coup =", value, "moneyCoup");
            return (Criteria) this;
        }

        public Criteria andMoneyCoupNotEqualTo(BigDecimal value) {
            addCriterion("money_coup <>", value, "moneyCoup");
            return (Criteria) this;
        }

        public Criteria andMoneyCoupGreaterThan(BigDecimal value) {
            addCriterion("money_coup >", value, "moneyCoup");
            return (Criteria) this;
        }

        public Criteria andMoneyCoupGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("money_coup >=", value, "moneyCoup");
            return (Criteria) this;
        }

        public Criteria andMoneyCoupLessThan(BigDecimal value) {
            addCriterion("money_coup <", value, "moneyCoup");
            return (Criteria) this;
        }

        public Criteria andMoneyCoupLessThanOrEqualTo(BigDecimal value) {
            addCriterion("money_coup <=", value, "moneyCoup");
            return (Criteria) this;
        }

        public Criteria andMoneyCoupIn(List<BigDecimal> values) {
            addCriterion("money_coup in", values, "moneyCoup");
            return (Criteria) this;
        }

        public Criteria andMoneyCoupNotIn(List<BigDecimal> values) {
            addCriterion("money_coup not in", values, "moneyCoup");
            return (Criteria) this;
        }

        public Criteria andMoneyCoupBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("money_coup between", value1, value2, "moneyCoup");
            return (Criteria) this;
        }

        public Criteria andMoneyCoupNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("money_coup not between", value1, value2, "moneyCoup");
            return (Criteria) this;
        }

        public Criteria andMoneyBeforeIsNull() {
            addCriterion("money_before is null");
            return (Criteria) this;
        }

        public Criteria andMoneyBeforeIsNotNull() {
            addCriterion("money_before is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyBeforeEqualTo(BigDecimal value) {
            addCriterion("money_before =", value, "moneyBefore");
            return (Criteria) this;
        }

        public Criteria andMoneyBeforeNotEqualTo(BigDecimal value) {
            addCriterion("money_before <>", value, "moneyBefore");
            return (Criteria) this;
        }

        public Criteria andMoneyBeforeGreaterThan(BigDecimal value) {
            addCriterion("money_before >", value, "moneyBefore");
            return (Criteria) this;
        }

        public Criteria andMoneyBeforeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("money_before >=", value, "moneyBefore");
            return (Criteria) this;
        }

        public Criteria andMoneyBeforeLessThan(BigDecimal value) {
            addCriterion("money_before <", value, "moneyBefore");
            return (Criteria) this;
        }

        public Criteria andMoneyBeforeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("money_before <=", value, "moneyBefore");
            return (Criteria) this;
        }

        public Criteria andMoneyBeforeIn(List<BigDecimal> values) {
            addCriterion("money_before in", values, "moneyBefore");
            return (Criteria) this;
        }

        public Criteria andMoneyBeforeNotIn(List<BigDecimal> values) {
            addCriterion("money_before not in", values, "moneyBefore");
            return (Criteria) this;
        }

        public Criteria andMoneyBeforeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("money_before between", value1, value2, "moneyBefore");
            return (Criteria) this;
        }

        public Criteria andMoneyBeforeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("money_before not between", value1, value2, "moneyBefore");
            return (Criteria) this;
        }

        public Criteria andCurrencyIsNull() {
            addCriterion("currency is null");
            return (Criteria) this;
        }

        public Criteria andCurrencyIsNotNull() {
            addCriterion("currency is not null");
            return (Criteria) this;
        }

        public Criteria andCurrencyEqualTo(Long value) {
            addCriterion("currency =", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotEqualTo(Long value) {
            addCriterion("currency <>", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyGreaterThan(Long value) {
            addCriterion("currency >", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyGreaterThanOrEqualTo(Long value) {
            addCriterion("currency >=", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLessThan(Long value) {
            addCriterion("currency <", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLessThanOrEqualTo(Long value) {
            addCriterion("currency <=", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyIn(List<Long> values) {
            addCriterion("currency in", values, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotIn(List<Long> values) {
            addCriterion("currency not in", values, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyBetween(Long value1, Long value2) {
            addCriterion("currency between", value1, value2, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotBetween(Long value1, Long value2) {
            addCriterion("currency not between", value1, value2, "currency");
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

        public Criteria andInUpIsNull() {
            addCriterion("in_up is null");
            return (Criteria) this;
        }

        public Criteria andInUpIsNotNull() {
            addCriterion("in_up is not null");
            return (Criteria) this;
        }

        public Criteria andInUpEqualTo(Long value) {
            addCriterion("in_up =", value, "inUp");
            return (Criteria) this;
        }

        public Criteria andInUpNotEqualTo(Long value) {
            addCriterion("in_up <>", value, "inUp");
            return (Criteria) this;
        }

        public Criteria andInUpGreaterThan(Long value) {
            addCriterion("in_up >", value, "inUp");
            return (Criteria) this;
        }

        public Criteria andInUpGreaterThanOrEqualTo(Long value) {
            addCriterion("in_up >=", value, "inUp");
            return (Criteria) this;
        }

        public Criteria andInUpLessThan(Long value) {
            addCriterion("in_up <", value, "inUp");
            return (Criteria) this;
        }

        public Criteria andInUpLessThanOrEqualTo(Long value) {
            addCriterion("in_up <=", value, "inUp");
            return (Criteria) this;
        }

        public Criteria andInUpIn(List<Long> values) {
            addCriterion("in_up in", values, "inUp");
            return (Criteria) this;
        }

        public Criteria andInUpNotIn(List<Long> values) {
            addCriterion("in_up not in", values, "inUp");
            return (Criteria) this;
        }

        public Criteria andInUpBetween(Long value1, Long value2) {
            addCriterion("in_up between", value1, value2, "inUp");
            return (Criteria) this;
        }

        public Criteria andInUpNotBetween(Long value1, Long value2) {
            addCriterion("in_up not between", value1, value2, "inUp");
            return (Criteria) this;
        }

        public Criteria andPayIdToIsNull() {
            addCriterion("pay_id_to is null");
            return (Criteria) this;
        }

        public Criteria andPayIdToIsNotNull() {
            addCriterion("pay_id_to is not null");
            return (Criteria) this;
        }

        public Criteria andPayIdToEqualTo(Long value) {
            addCriterion("pay_id_to =", value, "payIdTo");
            return (Criteria) this;
        }

        public Criteria andPayIdToNotEqualTo(Long value) {
            addCriterion("pay_id_to <>", value, "payIdTo");
            return (Criteria) this;
        }

        public Criteria andPayIdToGreaterThan(Long value) {
            addCriterion("pay_id_to >", value, "payIdTo");
            return (Criteria) this;
        }

        public Criteria andPayIdToGreaterThanOrEqualTo(Long value) {
            addCriterion("pay_id_to >=", value, "payIdTo");
            return (Criteria) this;
        }

        public Criteria andPayIdToLessThan(Long value) {
            addCriterion("pay_id_to <", value, "payIdTo");
            return (Criteria) this;
        }

        public Criteria andPayIdToLessThanOrEqualTo(Long value) {
            addCriterion("pay_id_to <=", value, "payIdTo");
            return (Criteria) this;
        }

        public Criteria andPayIdToIn(List<Long> values) {
            addCriterion("pay_id_to in", values, "payIdTo");
            return (Criteria) this;
        }

        public Criteria andPayIdToNotIn(List<Long> values) {
            addCriterion("pay_id_to not in", values, "payIdTo");
            return (Criteria) this;
        }

        public Criteria andPayIdToBetween(Long value1, Long value2) {
            addCriterion("pay_id_to between", value1, value2, "payIdTo");
            return (Criteria) this;
        }

        public Criteria andPayIdToNotBetween(Long value1, Long value2) {
            addCriterion("pay_id_to not between", value1, value2, "payIdTo");
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
     * This class corresponds to the database table pay_record_in
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
     * This class corresponds to the database table pay_record_in
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