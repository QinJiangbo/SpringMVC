package com.qinjiangbo.gen.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class RegsatPayrefundDetExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table regsat_payrefund_det
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table regsat_payrefund_det
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table regsat_payrefund_det
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regsat_payrefund_det
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public RegsatPayrefundDetExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regsat_payrefund_det
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regsat_payrefund_det
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regsat_payrefund_det
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regsat_payrefund_det
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regsat_payrefund_det
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regsat_payrefund_det
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regsat_payrefund_det
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
     * This method corresponds to the database table regsat_payrefund_det
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
     * This method corresponds to the database table regsat_payrefund_det
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regsat_payrefund_det
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
     * This class corresponds to the database table regsat_payrefund_det
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

        public Criteria andRefIdIsNull() {
            addCriterion("ref_id is null");
            return (Criteria) this;
        }

        public Criteria andRefIdIsNotNull() {
            addCriterion("ref_id is not null");
            return (Criteria) this;
        }

        public Criteria andRefIdEqualTo(Long value) {
            addCriterion("ref_id =", value, "refId");
            return (Criteria) this;
        }

        public Criteria andRefIdNotEqualTo(Long value) {
            addCriterion("ref_id <>", value, "refId");
            return (Criteria) this;
        }

        public Criteria andRefIdGreaterThan(Long value) {
            addCriterion("ref_id >", value, "refId");
            return (Criteria) this;
        }

        public Criteria andRefIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ref_id >=", value, "refId");
            return (Criteria) this;
        }

        public Criteria andRefIdLessThan(Long value) {
            addCriterion("ref_id <", value, "refId");
            return (Criteria) this;
        }

        public Criteria andRefIdLessThanOrEqualTo(Long value) {
            addCriterion("ref_id <=", value, "refId");
            return (Criteria) this;
        }

        public Criteria andRefIdIn(List<Long> values) {
            addCriterion("ref_id in", values, "refId");
            return (Criteria) this;
        }

        public Criteria andRefIdNotIn(List<Long> values) {
            addCriterion("ref_id not in", values, "refId");
            return (Criteria) this;
        }

        public Criteria andRefIdBetween(Long value1, Long value2) {
            addCriterion("ref_id between", value1, value2, "refId");
            return (Criteria) this;
        }

        public Criteria andRefIdNotBetween(Long value1, Long value2) {
            addCriterion("ref_id not between", value1, value2, "refId");
            return (Criteria) this;
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

        public Criteria andRegIdFirstIsNull() {
            addCriterion("reg_id_first is null");
            return (Criteria) this;
        }

        public Criteria andRegIdFirstIsNotNull() {
            addCriterion("reg_id_first is not null");
            return (Criteria) this;
        }

        public Criteria andRegIdFirstEqualTo(Long value) {
            addCriterion("reg_id_first =", value, "regIdFirst");
            return (Criteria) this;
        }

        public Criteria andRegIdFirstNotEqualTo(Long value) {
            addCriterion("reg_id_first <>", value, "regIdFirst");
            return (Criteria) this;
        }

        public Criteria andRegIdFirstGreaterThan(Long value) {
            addCriterion("reg_id_first >", value, "regIdFirst");
            return (Criteria) this;
        }

        public Criteria andRegIdFirstGreaterThanOrEqualTo(Long value) {
            addCriterion("reg_id_first >=", value, "regIdFirst");
            return (Criteria) this;
        }

        public Criteria andRegIdFirstLessThan(Long value) {
            addCriterion("reg_id_first <", value, "regIdFirst");
            return (Criteria) this;
        }

        public Criteria andRegIdFirstLessThanOrEqualTo(Long value) {
            addCriterion("reg_id_first <=", value, "regIdFirst");
            return (Criteria) this;
        }

        public Criteria andRegIdFirstIn(List<Long> values) {
            addCriterion("reg_id_first in", values, "regIdFirst");
            return (Criteria) this;
        }

        public Criteria andRegIdFirstNotIn(List<Long> values) {
            addCriterion("reg_id_first not in", values, "regIdFirst");
            return (Criteria) this;
        }

        public Criteria andRegIdFirstBetween(Long value1, Long value2) {
            addCriterion("reg_id_first between", value1, value2, "regIdFirst");
            return (Criteria) this;
        }

        public Criteria andRegIdFirstNotBetween(Long value1, Long value2) {
            addCriterion("reg_id_first not between", value1, value2, "regIdFirst");
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

        public Criteria andRtnMsgIsNull() {
            addCriterion("rtn_msg is null");
            return (Criteria) this;
        }

        public Criteria andRtnMsgIsNotNull() {
            addCriterion("rtn_msg is not null");
            return (Criteria) this;
        }

        public Criteria andRtnMsgEqualTo(String value) {
            addCriterion("rtn_msg =", value, "rtnMsg");
            return (Criteria) this;
        }

        public Criteria andRtnMsgNotEqualTo(String value) {
            addCriterion("rtn_msg <>", value, "rtnMsg");
            return (Criteria) this;
        }

        public Criteria andRtnMsgGreaterThan(String value) {
            addCriterion("rtn_msg >", value, "rtnMsg");
            return (Criteria) this;
        }

        public Criteria andRtnMsgGreaterThanOrEqualTo(String value) {
            addCriterion("rtn_msg >=", value, "rtnMsg");
            return (Criteria) this;
        }

        public Criteria andRtnMsgLessThan(String value) {
            addCriterion("rtn_msg <", value, "rtnMsg");
            return (Criteria) this;
        }

        public Criteria andRtnMsgLessThanOrEqualTo(String value) {
            addCriterion("rtn_msg <=", value, "rtnMsg");
            return (Criteria) this;
        }

        public Criteria andRtnMsgLike(String value) {
            addCriterion("rtn_msg like", value, "rtnMsg");
            return (Criteria) this;
        }

        public Criteria andRtnMsgNotLike(String value) {
            addCriterion("rtn_msg not like", value, "rtnMsg");
            return (Criteria) this;
        }

        public Criteria andRtnMsgIn(List<String> values) {
            addCriterion("rtn_msg in", values, "rtnMsg");
            return (Criteria) this;
        }

        public Criteria andRtnMsgNotIn(List<String> values) {
            addCriterion("rtn_msg not in", values, "rtnMsg");
            return (Criteria) this;
        }

        public Criteria andRtnMsgBetween(String value1, String value2) {
            addCriterion("rtn_msg between", value1, value2, "rtnMsg");
            return (Criteria) this;
        }

        public Criteria andRtnMsgNotBetween(String value1, String value2) {
            addCriterion("rtn_msg not between", value1, value2, "rtnMsg");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table regsat_payrefund_det
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
     * This class corresponds to the database table regsat_payrefund_det
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