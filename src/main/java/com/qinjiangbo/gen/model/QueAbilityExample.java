package com.qinjiangbo.gen.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class QueAbilityExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table que_ability
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table que_ability
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table que_ability
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table que_ability
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public QueAbilityExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table que_ability
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table que_ability
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table que_ability
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table que_ability
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table que_ability
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table que_ability
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table que_ability
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
     * This method corresponds to the database table que_ability
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
     * This method corresponds to the database table que_ability
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table que_ability
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
     * This class corresponds to the database table que_ability
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

        public Criteria andAbilityCodeIsNull() {
            addCriterion("ability_code is null");
            return (Criteria) this;
        }

        public Criteria andAbilityCodeIsNotNull() {
            addCriterion("ability_code is not null");
            return (Criteria) this;
        }

        public Criteria andAbilityCodeEqualTo(String value) {
            addCriterion("ability_code =", value, "abilityCode");
            return (Criteria) this;
        }

        public Criteria andAbilityCodeNotEqualTo(String value) {
            addCriterion("ability_code <>", value, "abilityCode");
            return (Criteria) this;
        }

        public Criteria andAbilityCodeGreaterThan(String value) {
            addCriterion("ability_code >", value, "abilityCode");
            return (Criteria) this;
        }

        public Criteria andAbilityCodeGreaterThanOrEqualTo(String value) {
            addCriterion("ability_code >=", value, "abilityCode");
            return (Criteria) this;
        }

        public Criteria andAbilityCodeLessThan(String value) {
            addCriterion("ability_code <", value, "abilityCode");
            return (Criteria) this;
        }

        public Criteria andAbilityCodeLessThanOrEqualTo(String value) {
            addCriterion("ability_code <=", value, "abilityCode");
            return (Criteria) this;
        }

        public Criteria andAbilityCodeLike(String value) {
            addCriterion("ability_code like", value, "abilityCode");
            return (Criteria) this;
        }

        public Criteria andAbilityCodeNotLike(String value) {
            addCriterion("ability_code not like", value, "abilityCode");
            return (Criteria) this;
        }

        public Criteria andAbilityCodeIn(List<String> values) {
            addCriterion("ability_code in", values, "abilityCode");
            return (Criteria) this;
        }

        public Criteria andAbilityCodeNotIn(List<String> values) {
            addCriterion("ability_code not in", values, "abilityCode");
            return (Criteria) this;
        }

        public Criteria andAbilityCodeBetween(String value1, String value2) {
            addCriterion("ability_code between", value1, value2, "abilityCode");
            return (Criteria) this;
        }

        public Criteria andAbilityCodeNotBetween(String value1, String value2) {
            addCriterion("ability_code not between", value1, value2, "abilityCode");
            return (Criteria) this;
        }

        public Criteria andLevIsNull() {
            addCriterion("lev is null");
            return (Criteria) this;
        }

        public Criteria andLevIsNotNull() {
            addCriterion("lev is not null");
            return (Criteria) this;
        }

        public Criteria andLevEqualTo(Integer value) {
            addCriterion("lev =", value, "lev");
            return (Criteria) this;
        }

        public Criteria andLevNotEqualTo(Integer value) {
            addCriterion("lev <>", value, "lev");
            return (Criteria) this;
        }

        public Criteria andLevGreaterThan(Integer value) {
            addCriterion("lev >", value, "lev");
            return (Criteria) this;
        }

        public Criteria andLevGreaterThanOrEqualTo(Integer value) {
            addCriterion("lev >=", value, "lev");
            return (Criteria) this;
        }

        public Criteria andLevLessThan(Integer value) {
            addCriterion("lev <", value, "lev");
            return (Criteria) this;
        }

        public Criteria andLevLessThanOrEqualTo(Integer value) {
            addCriterion("lev <=", value, "lev");
            return (Criteria) this;
        }

        public Criteria andLevIn(List<Integer> values) {
            addCriterion("lev in", values, "lev");
            return (Criteria) this;
        }

        public Criteria andLevNotIn(List<Integer> values) {
            addCriterion("lev not in", values, "lev");
            return (Criteria) this;
        }

        public Criteria andLevBetween(Integer value1, Integer value2) {
            addCriterion("lev between", value1, value2, "lev");
            return (Criteria) this;
        }

        public Criteria andLevNotBetween(Integer value1, Integer value2) {
            addCriterion("lev not between", value1, value2, "lev");
            return (Criteria) this;
        }

        public Criteria andNameAbilityIsNull() {
            addCriterion("name_ability is null");
            return (Criteria) this;
        }

        public Criteria andNameAbilityIsNotNull() {
            addCriterion("name_ability is not null");
            return (Criteria) this;
        }

        public Criteria andNameAbilityEqualTo(String value) {
            addCriterion("name_ability =", value, "nameAbility");
            return (Criteria) this;
        }

        public Criteria andNameAbilityNotEqualTo(String value) {
            addCriterion("name_ability <>", value, "nameAbility");
            return (Criteria) this;
        }

        public Criteria andNameAbilityGreaterThan(String value) {
            addCriterion("name_ability >", value, "nameAbility");
            return (Criteria) this;
        }

        public Criteria andNameAbilityGreaterThanOrEqualTo(String value) {
            addCriterion("name_ability >=", value, "nameAbility");
            return (Criteria) this;
        }

        public Criteria andNameAbilityLessThan(String value) {
            addCriterion("name_ability <", value, "nameAbility");
            return (Criteria) this;
        }

        public Criteria andNameAbilityLessThanOrEqualTo(String value) {
            addCriterion("name_ability <=", value, "nameAbility");
            return (Criteria) this;
        }

        public Criteria andNameAbilityLike(String value) {
            addCriterion("name_ability like", value, "nameAbility");
            return (Criteria) this;
        }

        public Criteria andNameAbilityNotLike(String value) {
            addCriterion("name_ability not like", value, "nameAbility");
            return (Criteria) this;
        }

        public Criteria andNameAbilityIn(List<String> values) {
            addCriterion("name_ability in", values, "nameAbility");
            return (Criteria) this;
        }

        public Criteria andNameAbilityNotIn(List<String> values) {
            addCriterion("name_ability not in", values, "nameAbility");
            return (Criteria) this;
        }

        public Criteria andNameAbilityBetween(String value1, String value2) {
            addCriterion("name_ability between", value1, value2, "nameAbility");
            return (Criteria) this;
        }

        public Criteria andNameAbilityNotBetween(String value1, String value2) {
            addCriterion("name_ability not between", value1, value2, "nameAbility");
            return (Criteria) this;
        }

        public Criteria andNameChIsNull() {
            addCriterion("name_ch is null");
            return (Criteria) this;
        }

        public Criteria andNameChIsNotNull() {
            addCriterion("name_ch is not null");
            return (Criteria) this;
        }

        public Criteria andNameChEqualTo(String value) {
            addCriterion("name_ch =", value, "nameCh");
            return (Criteria) this;
        }

        public Criteria andNameChNotEqualTo(String value) {
            addCriterion("name_ch <>", value, "nameCh");
            return (Criteria) this;
        }

        public Criteria andNameChGreaterThan(String value) {
            addCriterion("name_ch >", value, "nameCh");
            return (Criteria) this;
        }

        public Criteria andNameChGreaterThanOrEqualTo(String value) {
            addCriterion("name_ch >=", value, "nameCh");
            return (Criteria) this;
        }

        public Criteria andNameChLessThan(String value) {
            addCriterion("name_ch <", value, "nameCh");
            return (Criteria) this;
        }

        public Criteria andNameChLessThanOrEqualTo(String value) {
            addCriterion("name_ch <=", value, "nameCh");
            return (Criteria) this;
        }

        public Criteria andNameChLike(String value) {
            addCriterion("name_ch like", value, "nameCh");
            return (Criteria) this;
        }

        public Criteria andNameChNotLike(String value) {
            addCriterion("name_ch not like", value, "nameCh");
            return (Criteria) this;
        }

        public Criteria andNameChIn(List<String> values) {
            addCriterion("name_ch in", values, "nameCh");
            return (Criteria) this;
        }

        public Criteria andNameChNotIn(List<String> values) {
            addCriterion("name_ch not in", values, "nameCh");
            return (Criteria) this;
        }

        public Criteria andNameChBetween(String value1, String value2) {
            addCriterion("name_ch between", value1, value2, "nameCh");
            return (Criteria) this;
        }

        public Criteria andNameChNotBetween(String value1, String value2) {
            addCriterion("name_ch not between", value1, value2, "nameCh");
            return (Criteria) this;
        }

        public Criteria andNameShortIsNull() {
            addCriterion("name_short is null");
            return (Criteria) this;
        }

        public Criteria andNameShortIsNotNull() {
            addCriterion("name_short is not null");
            return (Criteria) this;
        }

        public Criteria andNameShortEqualTo(String value) {
            addCriterion("name_short =", value, "nameShort");
            return (Criteria) this;
        }

        public Criteria andNameShortNotEqualTo(String value) {
            addCriterion("name_short <>", value, "nameShort");
            return (Criteria) this;
        }

        public Criteria andNameShortGreaterThan(String value) {
            addCriterion("name_short >", value, "nameShort");
            return (Criteria) this;
        }

        public Criteria andNameShortGreaterThanOrEqualTo(String value) {
            addCriterion("name_short >=", value, "nameShort");
            return (Criteria) this;
        }

        public Criteria andNameShortLessThan(String value) {
            addCriterion("name_short <", value, "nameShort");
            return (Criteria) this;
        }

        public Criteria andNameShortLessThanOrEqualTo(String value) {
            addCriterion("name_short <=", value, "nameShort");
            return (Criteria) this;
        }

        public Criteria andNameShortLike(String value) {
            addCriterion("name_short like", value, "nameShort");
            return (Criteria) this;
        }

        public Criteria andNameShortNotLike(String value) {
            addCriterion("name_short not like", value, "nameShort");
            return (Criteria) this;
        }

        public Criteria andNameShortIn(List<String> values) {
            addCriterion("name_short in", values, "nameShort");
            return (Criteria) this;
        }

        public Criteria andNameShortNotIn(List<String> values) {
            addCriterion("name_short not in", values, "nameShort");
            return (Criteria) this;
        }

        public Criteria andNameShortBetween(String value1, String value2) {
            addCriterion("name_short between", value1, value2, "nameShort");
            return (Criteria) this;
        }

        public Criteria andNameShortNotBetween(String value1, String value2) {
            addCriterion("name_short not between", value1, value2, "nameShort");
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

        public Criteria andSortNoIsNull() {
            addCriterion("sort_no is null");
            return (Criteria) this;
        }

        public Criteria andSortNoIsNotNull() {
            addCriterion("sort_no is not null");
            return (Criteria) this;
        }

        public Criteria andSortNoEqualTo(Integer value) {
            addCriterion("sort_no =", value, "sortNo");
            return (Criteria) this;
        }

        public Criteria andSortNoNotEqualTo(Integer value) {
            addCriterion("sort_no <>", value, "sortNo");
            return (Criteria) this;
        }

        public Criteria andSortNoGreaterThan(Integer value) {
            addCriterion("sort_no >", value, "sortNo");
            return (Criteria) this;
        }

        public Criteria andSortNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("sort_no >=", value, "sortNo");
            return (Criteria) this;
        }

        public Criteria andSortNoLessThan(Integer value) {
            addCriterion("sort_no <", value, "sortNo");
            return (Criteria) this;
        }

        public Criteria andSortNoLessThanOrEqualTo(Integer value) {
            addCriterion("sort_no <=", value, "sortNo");
            return (Criteria) this;
        }

        public Criteria andSortNoIn(List<Integer> values) {
            addCriterion("sort_no in", values, "sortNo");
            return (Criteria) this;
        }

        public Criteria andSortNoNotIn(List<Integer> values) {
            addCriterion("sort_no not in", values, "sortNo");
            return (Criteria) this;
        }

        public Criteria andSortNoBetween(Integer value1, Integer value2) {
            addCriterion("sort_no between", value1, value2, "sortNo");
            return (Criteria) this;
        }

        public Criteria andSortNoNotBetween(Integer value1, Integer value2) {
            addCriterion("sort_no not between", value1, value2, "sortNo");
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

        public Criteria andUpCodeIsNull() {
            addCriterion("up_code is null");
            return (Criteria) this;
        }

        public Criteria andUpCodeIsNotNull() {
            addCriterion("up_code is not null");
            return (Criteria) this;
        }

        public Criteria andUpCodeEqualTo(String value) {
            addCriterion("up_code =", value, "upCode");
            return (Criteria) this;
        }

        public Criteria andUpCodeNotEqualTo(String value) {
            addCriterion("up_code <>", value, "upCode");
            return (Criteria) this;
        }

        public Criteria andUpCodeGreaterThan(String value) {
            addCriterion("up_code >", value, "upCode");
            return (Criteria) this;
        }

        public Criteria andUpCodeGreaterThanOrEqualTo(String value) {
            addCriterion("up_code >=", value, "upCode");
            return (Criteria) this;
        }

        public Criteria andUpCodeLessThan(String value) {
            addCriterion("up_code <", value, "upCode");
            return (Criteria) this;
        }

        public Criteria andUpCodeLessThanOrEqualTo(String value) {
            addCriterion("up_code <=", value, "upCode");
            return (Criteria) this;
        }

        public Criteria andUpCodeLike(String value) {
            addCriterion("up_code like", value, "upCode");
            return (Criteria) this;
        }

        public Criteria andUpCodeNotLike(String value) {
            addCriterion("up_code not like", value, "upCode");
            return (Criteria) this;
        }

        public Criteria andUpCodeIn(List<String> values) {
            addCriterion("up_code in", values, "upCode");
            return (Criteria) this;
        }

        public Criteria andUpCodeNotIn(List<String> values) {
            addCriterion("up_code not in", values, "upCode");
            return (Criteria) this;
        }

        public Criteria andUpCodeBetween(String value1, String value2) {
            addCriterion("up_code between", value1, value2, "upCode");
            return (Criteria) this;
        }

        public Criteria andUpCodeNotBetween(String value1, String value2) {
            addCriterion("up_code not between", value1, value2, "upCode");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table que_ability
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
     * This class corresponds to the database table que_ability
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