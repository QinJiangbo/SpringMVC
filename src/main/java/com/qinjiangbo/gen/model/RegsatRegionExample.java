package com.qinjiangbo.gen.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RegsatRegionExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table regsat_region
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table regsat_region
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table regsat_region
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regsat_region
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public RegsatRegionExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regsat_region
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regsat_region
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regsat_region
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regsat_region
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regsat_region
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regsat_region
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regsat_region
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
     * This method corresponds to the database table regsat_region
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
     * This method corresponds to the database table regsat_region
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table regsat_region
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
     * This class corresponds to the database table regsat_region
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

        public Criteria andRegCodeIsNull() {
            addCriterion("reg_code is null");
            return (Criteria) this;
        }

        public Criteria andRegCodeIsNotNull() {
            addCriterion("reg_code is not null");
            return (Criteria) this;
        }

        public Criteria andRegCodeEqualTo(String value) {
            addCriterion("reg_code =", value, "regCode");
            return (Criteria) this;
        }

        public Criteria andRegCodeNotEqualTo(String value) {
            addCriterion("reg_code <>", value, "regCode");
            return (Criteria) this;
        }

        public Criteria andRegCodeGreaterThan(String value) {
            addCriterion("reg_code >", value, "regCode");
            return (Criteria) this;
        }

        public Criteria andRegCodeGreaterThanOrEqualTo(String value) {
            addCriterion("reg_code >=", value, "regCode");
            return (Criteria) this;
        }

        public Criteria andRegCodeLessThan(String value) {
            addCriterion("reg_code <", value, "regCode");
            return (Criteria) this;
        }

        public Criteria andRegCodeLessThanOrEqualTo(String value) {
            addCriterion("reg_code <=", value, "regCode");
            return (Criteria) this;
        }

        public Criteria andRegCodeLike(String value) {
            addCriterion("reg_code like", value, "regCode");
            return (Criteria) this;
        }

        public Criteria andRegCodeNotLike(String value) {
            addCriterion("reg_code not like", value, "regCode");
            return (Criteria) this;
        }

        public Criteria andRegCodeIn(List<String> values) {
            addCriterion("reg_code in", values, "regCode");
            return (Criteria) this;
        }

        public Criteria andRegCodeNotIn(List<String> values) {
            addCriterion("reg_code not in", values, "regCode");
            return (Criteria) this;
        }

        public Criteria andRegCodeBetween(String value1, String value2) {
            addCriterion("reg_code between", value1, value2, "regCode");
            return (Criteria) this;
        }

        public Criteria andRegCodeNotBetween(String value1, String value2) {
            addCriterion("reg_code not between", value1, value2, "regCode");
            return (Criteria) this;
        }

        public Criteria andRegNameIsNull() {
            addCriterion("reg_name is null");
            return (Criteria) this;
        }

        public Criteria andRegNameIsNotNull() {
            addCriterion("reg_name is not null");
            return (Criteria) this;
        }

        public Criteria andRegNameEqualTo(String value) {
            addCriterion("reg_name =", value, "regName");
            return (Criteria) this;
        }

        public Criteria andRegNameNotEqualTo(String value) {
            addCriterion("reg_name <>", value, "regName");
            return (Criteria) this;
        }

        public Criteria andRegNameGreaterThan(String value) {
            addCriterion("reg_name >", value, "regName");
            return (Criteria) this;
        }

        public Criteria andRegNameGreaterThanOrEqualTo(String value) {
            addCriterion("reg_name >=", value, "regName");
            return (Criteria) this;
        }

        public Criteria andRegNameLessThan(String value) {
            addCriterion("reg_name <", value, "regName");
            return (Criteria) this;
        }

        public Criteria andRegNameLessThanOrEqualTo(String value) {
            addCriterion("reg_name <=", value, "regName");
            return (Criteria) this;
        }

        public Criteria andRegNameLike(String value) {
            addCriterion("reg_name like", value, "regName");
            return (Criteria) this;
        }

        public Criteria andRegNameNotLike(String value) {
            addCriterion("reg_name not like", value, "regName");
            return (Criteria) this;
        }

        public Criteria andRegNameIn(List<String> values) {
            addCriterion("reg_name in", values, "regName");
            return (Criteria) this;
        }

        public Criteria andRegNameNotIn(List<String> values) {
            addCriterion("reg_name not in", values, "regName");
            return (Criteria) this;
        }

        public Criteria andRegNameBetween(String value1, String value2) {
            addCriterion("reg_name between", value1, value2, "regName");
            return (Criteria) this;
        }

        public Criteria andRegNameNotBetween(String value1, String value2) {
            addCriterion("reg_name not between", value1, value2, "regName");
            return (Criteria) this;
        }

        public Criteria andRegShortIsNull() {
            addCriterion("reg_short is null");
            return (Criteria) this;
        }

        public Criteria andRegShortIsNotNull() {
            addCriterion("reg_short is not null");
            return (Criteria) this;
        }

        public Criteria andRegShortEqualTo(String value) {
            addCriterion("reg_short =", value, "regShort");
            return (Criteria) this;
        }

        public Criteria andRegShortNotEqualTo(String value) {
            addCriterion("reg_short <>", value, "regShort");
            return (Criteria) this;
        }

        public Criteria andRegShortGreaterThan(String value) {
            addCriterion("reg_short >", value, "regShort");
            return (Criteria) this;
        }

        public Criteria andRegShortGreaterThanOrEqualTo(String value) {
            addCriterion("reg_short >=", value, "regShort");
            return (Criteria) this;
        }

        public Criteria andRegShortLessThan(String value) {
            addCriterion("reg_short <", value, "regShort");
            return (Criteria) this;
        }

        public Criteria andRegShortLessThanOrEqualTo(String value) {
            addCriterion("reg_short <=", value, "regShort");
            return (Criteria) this;
        }

        public Criteria andRegShortLike(String value) {
            addCriterion("reg_short like", value, "regShort");
            return (Criteria) this;
        }

        public Criteria andRegShortNotLike(String value) {
            addCriterion("reg_short not like", value, "regShort");
            return (Criteria) this;
        }

        public Criteria andRegShortIn(List<String> values) {
            addCriterion("reg_short in", values, "regShort");
            return (Criteria) this;
        }

        public Criteria andRegShortNotIn(List<String> values) {
            addCriterion("reg_short not in", values, "regShort");
            return (Criteria) this;
        }

        public Criteria andRegShortBetween(String value1, String value2) {
            addCriterion("reg_short between", value1, value2, "regShort");
            return (Criteria) this;
        }

        public Criteria andRegShortNotBetween(String value1, String value2) {
            addCriterion("reg_short not between", value1, value2, "regShort");
            return (Criteria) this;
        }

        public Criteria andUpRegIsNull() {
            addCriterion("up_reg is null");
            return (Criteria) this;
        }

        public Criteria andUpRegIsNotNull() {
            addCriterion("up_reg is not null");
            return (Criteria) this;
        }

        public Criteria andUpRegEqualTo(String value) {
            addCriterion("up_reg =", value, "upReg");
            return (Criteria) this;
        }

        public Criteria andUpRegNotEqualTo(String value) {
            addCriterion("up_reg <>", value, "upReg");
            return (Criteria) this;
        }

        public Criteria andUpRegGreaterThan(String value) {
            addCriterion("up_reg >", value, "upReg");
            return (Criteria) this;
        }

        public Criteria andUpRegGreaterThanOrEqualTo(String value) {
            addCriterion("up_reg >=", value, "upReg");
            return (Criteria) this;
        }

        public Criteria andUpRegLessThan(String value) {
            addCriterion("up_reg <", value, "upReg");
            return (Criteria) this;
        }

        public Criteria andUpRegLessThanOrEqualTo(String value) {
            addCriterion("up_reg <=", value, "upReg");
            return (Criteria) this;
        }

        public Criteria andUpRegLike(String value) {
            addCriterion("up_reg like", value, "upReg");
            return (Criteria) this;
        }

        public Criteria andUpRegNotLike(String value) {
            addCriterion("up_reg not like", value, "upReg");
            return (Criteria) this;
        }

        public Criteria andUpRegIn(List<String> values) {
            addCriterion("up_reg in", values, "upReg");
            return (Criteria) this;
        }

        public Criteria andUpRegNotIn(List<String> values) {
            addCriterion("up_reg not in", values, "upReg");
            return (Criteria) this;
        }

        public Criteria andUpRegBetween(String value1, String value2) {
            addCriterion("up_reg between", value1, value2, "upReg");
            return (Criteria) this;
        }

        public Criteria andUpRegNotBetween(String value1, String value2) {
            addCriterion("up_reg not between", value1, value2, "upReg");
            return (Criteria) this;
        }

        public Criteria andIsCatchIsNull() {
            addCriterion("is_catch is null");
            return (Criteria) this;
        }

        public Criteria andIsCatchIsNotNull() {
            addCriterion("is_catch is not null");
            return (Criteria) this;
        }

        public Criteria andIsCatchEqualTo(Integer value) {
            addCriterion("is_catch =", value, "isCatch");
            return (Criteria) this;
        }

        public Criteria andIsCatchNotEqualTo(Integer value) {
            addCriterion("is_catch <>", value, "isCatch");
            return (Criteria) this;
        }

        public Criteria andIsCatchGreaterThan(Integer value) {
            addCriterion("is_catch >", value, "isCatch");
            return (Criteria) this;
        }

        public Criteria andIsCatchGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_catch >=", value, "isCatch");
            return (Criteria) this;
        }

        public Criteria andIsCatchLessThan(Integer value) {
            addCriterion("is_catch <", value, "isCatch");
            return (Criteria) this;
        }

        public Criteria andIsCatchLessThanOrEqualTo(Integer value) {
            addCriterion("is_catch <=", value, "isCatch");
            return (Criteria) this;
        }

        public Criteria andIsCatchIn(List<Integer> values) {
            addCriterion("is_catch in", values, "isCatch");
            return (Criteria) this;
        }

        public Criteria andIsCatchNotIn(List<Integer> values) {
            addCriterion("is_catch not in", values, "isCatch");
            return (Criteria) this;
        }

        public Criteria andIsCatchBetween(Integer value1, Integer value2) {
            addCriterion("is_catch between", value1, value2, "isCatch");
            return (Criteria) this;
        }

        public Criteria andIsCatchNotBetween(Integer value1, Integer value2) {
            addCriterion("is_catch not between", value1, value2, "isCatch");
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

        public Criteria andRegNameEnIsNull() {
            addCriterion("reg_name_en is null");
            return (Criteria) this;
        }

        public Criteria andRegNameEnIsNotNull() {
            addCriterion("reg_name_en is not null");
            return (Criteria) this;
        }

        public Criteria andRegNameEnEqualTo(String value) {
            addCriterion("reg_name_en =", value, "regNameEn");
            return (Criteria) this;
        }

        public Criteria andRegNameEnNotEqualTo(String value) {
            addCriterion("reg_name_en <>", value, "regNameEn");
            return (Criteria) this;
        }

        public Criteria andRegNameEnGreaterThan(String value) {
            addCriterion("reg_name_en >", value, "regNameEn");
            return (Criteria) this;
        }

        public Criteria andRegNameEnGreaterThanOrEqualTo(String value) {
            addCriterion("reg_name_en >=", value, "regNameEn");
            return (Criteria) this;
        }

        public Criteria andRegNameEnLessThan(String value) {
            addCriterion("reg_name_en <", value, "regNameEn");
            return (Criteria) this;
        }

        public Criteria andRegNameEnLessThanOrEqualTo(String value) {
            addCriterion("reg_name_en <=", value, "regNameEn");
            return (Criteria) this;
        }

        public Criteria andRegNameEnLike(String value) {
            addCriterion("reg_name_en like", value, "regNameEn");
            return (Criteria) this;
        }

        public Criteria andRegNameEnNotLike(String value) {
            addCriterion("reg_name_en not like", value, "regNameEn");
            return (Criteria) this;
        }

        public Criteria andRegNameEnIn(List<String> values) {
            addCriterion("reg_name_en in", values, "regNameEn");
            return (Criteria) this;
        }

        public Criteria andRegNameEnNotIn(List<String> values) {
            addCriterion("reg_name_en not in", values, "regNameEn");
            return (Criteria) this;
        }

        public Criteria andRegNameEnBetween(String value1, String value2) {
            addCriterion("reg_name_en between", value1, value2, "regNameEn");
            return (Criteria) this;
        }

        public Criteria andRegNameEnNotBetween(String value1, String value2) {
            addCriterion("reg_name_en not between", value1, value2, "regNameEn");
            return (Criteria) this;
        }

        public Criteria andRegCodeBaseIsNull() {
            addCriterion("reg_code_base is null");
            return (Criteria) this;
        }

        public Criteria andRegCodeBaseIsNotNull() {
            addCriterion("reg_code_base is not null");
            return (Criteria) this;
        }

        public Criteria andRegCodeBaseEqualTo(String value) {
            addCriterion("reg_code_base =", value, "regCodeBase");
            return (Criteria) this;
        }

        public Criteria andRegCodeBaseNotEqualTo(String value) {
            addCriterion("reg_code_base <>", value, "regCodeBase");
            return (Criteria) this;
        }

        public Criteria andRegCodeBaseGreaterThan(String value) {
            addCriterion("reg_code_base >", value, "regCodeBase");
            return (Criteria) this;
        }

        public Criteria andRegCodeBaseGreaterThanOrEqualTo(String value) {
            addCriterion("reg_code_base >=", value, "regCodeBase");
            return (Criteria) this;
        }

        public Criteria andRegCodeBaseLessThan(String value) {
            addCriterion("reg_code_base <", value, "regCodeBase");
            return (Criteria) this;
        }

        public Criteria andRegCodeBaseLessThanOrEqualTo(String value) {
            addCriterion("reg_code_base <=", value, "regCodeBase");
            return (Criteria) this;
        }

        public Criteria andRegCodeBaseLike(String value) {
            addCriterion("reg_code_base like", value, "regCodeBase");
            return (Criteria) this;
        }

        public Criteria andRegCodeBaseNotLike(String value) {
            addCriterion("reg_code_base not like", value, "regCodeBase");
            return (Criteria) this;
        }

        public Criteria andRegCodeBaseIn(List<String> values) {
            addCriterion("reg_code_base in", values, "regCodeBase");
            return (Criteria) this;
        }

        public Criteria andRegCodeBaseNotIn(List<String> values) {
            addCriterion("reg_code_base not in", values, "regCodeBase");
            return (Criteria) this;
        }

        public Criteria andRegCodeBaseBetween(String value1, String value2) {
            addCriterion("reg_code_base between", value1, value2, "regCodeBase");
            return (Criteria) this;
        }

        public Criteria andRegCodeBaseNotBetween(String value1, String value2) {
            addCriterion("reg_code_base not between", value1, value2, "regCodeBase");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table regsat_region
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
     * This class corresponds to the database table regsat_region
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