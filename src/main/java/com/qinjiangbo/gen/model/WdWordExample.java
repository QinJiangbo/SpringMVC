package com.qinjiangbo.gen.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WdWordExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table wd_word
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table wd_word
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table wd_word
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_word
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public WdWordExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_word
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_word
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_word
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_word
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_word
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_word
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_word
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
     * This method corresponds to the database table wd_word
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
     * This method corresponds to the database table wd_word
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_word
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
     * This class corresponds to the database table wd_word
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

        public Criteria andWordIsNull() {
            addCriterion("word is null");
            return (Criteria) this;
        }

        public Criteria andWordIsNotNull() {
            addCriterion("word is not null");
            return (Criteria) this;
        }

        public Criteria andWordEqualTo(String value) {
            addCriterion("word =", value, "word");
            return (Criteria) this;
        }

        public Criteria andWordNotEqualTo(String value) {
            addCriterion("word <>", value, "word");
            return (Criteria) this;
        }

        public Criteria andWordGreaterThan(String value) {
            addCriterion("word >", value, "word");
            return (Criteria) this;
        }

        public Criteria andWordGreaterThanOrEqualTo(String value) {
            addCriterion("word >=", value, "word");
            return (Criteria) this;
        }

        public Criteria andWordLessThan(String value) {
            addCriterion("word <", value, "word");
            return (Criteria) this;
        }

        public Criteria andWordLessThanOrEqualTo(String value) {
            addCriterion("word <=", value, "word");
            return (Criteria) this;
        }

        public Criteria andWordLike(String value) {
            addCriterion("word like", value, "word");
            return (Criteria) this;
        }

        public Criteria andWordNotLike(String value) {
            addCriterion("word not like", value, "word");
            return (Criteria) this;
        }

        public Criteria andWordIn(List<String> values) {
            addCriterion("word in", values, "word");
            return (Criteria) this;
        }

        public Criteria andWordNotIn(List<String> values) {
            addCriterion("word not in", values, "word");
            return (Criteria) this;
        }

        public Criteria andWordBetween(String value1, String value2) {
            addCriterion("word between", value1, value2, "word");
            return (Criteria) this;
        }

        public Criteria andWordNotBetween(String value1, String value2) {
            addCriterion("word not between", value1, value2, "word");
            return (Criteria) this;
        }

        public Criteria andPhoneticaIsNull() {
            addCriterion("phonetica is null");
            return (Criteria) this;
        }

        public Criteria andPhoneticaIsNotNull() {
            addCriterion("phonetica is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneticaEqualTo(String value) {
            addCriterion("phonetica =", value, "phonetica");
            return (Criteria) this;
        }

        public Criteria andPhoneticaNotEqualTo(String value) {
            addCriterion("phonetica <>", value, "phonetica");
            return (Criteria) this;
        }

        public Criteria andPhoneticaGreaterThan(String value) {
            addCriterion("phonetica >", value, "phonetica");
            return (Criteria) this;
        }

        public Criteria andPhoneticaGreaterThanOrEqualTo(String value) {
            addCriterion("phonetica >=", value, "phonetica");
            return (Criteria) this;
        }

        public Criteria andPhoneticaLessThan(String value) {
            addCriterion("phonetica <", value, "phonetica");
            return (Criteria) this;
        }

        public Criteria andPhoneticaLessThanOrEqualTo(String value) {
            addCriterion("phonetica <=", value, "phonetica");
            return (Criteria) this;
        }

        public Criteria andPhoneticaLike(String value) {
            addCriterion("phonetica like", value, "phonetica");
            return (Criteria) this;
        }

        public Criteria andPhoneticaNotLike(String value) {
            addCriterion("phonetica not like", value, "phonetica");
            return (Criteria) this;
        }

        public Criteria andPhoneticaIn(List<String> values) {
            addCriterion("phonetica in", values, "phonetica");
            return (Criteria) this;
        }

        public Criteria andPhoneticaNotIn(List<String> values) {
            addCriterion("phonetica not in", values, "phonetica");
            return (Criteria) this;
        }

        public Criteria andPhoneticaBetween(String value1, String value2) {
            addCriterion("phonetica between", value1, value2, "phonetica");
            return (Criteria) this;
        }

        public Criteria andPhoneticaNotBetween(String value1, String value2) {
            addCriterion("phonetica not between", value1, value2, "phonetica");
            return (Criteria) this;
        }

        public Criteria andAudioaIsNull() {
            addCriterion("audioa is null");
            return (Criteria) this;
        }

        public Criteria andAudioaIsNotNull() {
            addCriterion("audioa is not null");
            return (Criteria) this;
        }

        public Criteria andAudioaEqualTo(String value) {
            addCriterion("audioa =", value, "audioa");
            return (Criteria) this;
        }

        public Criteria andAudioaNotEqualTo(String value) {
            addCriterion("audioa <>", value, "audioa");
            return (Criteria) this;
        }

        public Criteria andAudioaGreaterThan(String value) {
            addCriterion("audioa >", value, "audioa");
            return (Criteria) this;
        }

        public Criteria andAudioaGreaterThanOrEqualTo(String value) {
            addCriterion("audioa >=", value, "audioa");
            return (Criteria) this;
        }

        public Criteria andAudioaLessThan(String value) {
            addCriterion("audioa <", value, "audioa");
            return (Criteria) this;
        }

        public Criteria andAudioaLessThanOrEqualTo(String value) {
            addCriterion("audioa <=", value, "audioa");
            return (Criteria) this;
        }

        public Criteria andAudioaLike(String value) {
            addCriterion("audioa like", value, "audioa");
            return (Criteria) this;
        }

        public Criteria andAudioaNotLike(String value) {
            addCriterion("audioa not like", value, "audioa");
            return (Criteria) this;
        }

        public Criteria andAudioaIn(List<String> values) {
            addCriterion("audioa in", values, "audioa");
            return (Criteria) this;
        }

        public Criteria andAudioaNotIn(List<String> values) {
            addCriterion("audioa not in", values, "audioa");
            return (Criteria) this;
        }

        public Criteria andAudioaBetween(String value1, String value2) {
            addCriterion("audioa between", value1, value2, "audioa");
            return (Criteria) this;
        }

        public Criteria andAudioaNotBetween(String value1, String value2) {
            addCriterion("audioa not between", value1, value2, "audioa");
            return (Criteria) this;
        }

        public Criteria andPhoneticeIsNull() {
            addCriterion("phonetice is null");
            return (Criteria) this;
        }

        public Criteria andPhoneticeIsNotNull() {
            addCriterion("phonetice is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneticeEqualTo(String value) {
            addCriterion("phonetice =", value, "phonetice");
            return (Criteria) this;
        }

        public Criteria andPhoneticeNotEqualTo(String value) {
            addCriterion("phonetice <>", value, "phonetice");
            return (Criteria) this;
        }

        public Criteria andPhoneticeGreaterThan(String value) {
            addCriterion("phonetice >", value, "phonetice");
            return (Criteria) this;
        }

        public Criteria andPhoneticeGreaterThanOrEqualTo(String value) {
            addCriterion("phonetice >=", value, "phonetice");
            return (Criteria) this;
        }

        public Criteria andPhoneticeLessThan(String value) {
            addCriterion("phonetice <", value, "phonetice");
            return (Criteria) this;
        }

        public Criteria andPhoneticeLessThanOrEqualTo(String value) {
            addCriterion("phonetice <=", value, "phonetice");
            return (Criteria) this;
        }

        public Criteria andPhoneticeLike(String value) {
            addCriterion("phonetice like", value, "phonetice");
            return (Criteria) this;
        }

        public Criteria andPhoneticeNotLike(String value) {
            addCriterion("phonetice not like", value, "phonetice");
            return (Criteria) this;
        }

        public Criteria andPhoneticeIn(List<String> values) {
            addCriterion("phonetice in", values, "phonetice");
            return (Criteria) this;
        }

        public Criteria andPhoneticeNotIn(List<String> values) {
            addCriterion("phonetice not in", values, "phonetice");
            return (Criteria) this;
        }

        public Criteria andPhoneticeBetween(String value1, String value2) {
            addCriterion("phonetice between", value1, value2, "phonetice");
            return (Criteria) this;
        }

        public Criteria andPhoneticeNotBetween(String value1, String value2) {
            addCriterion("phonetice not between", value1, value2, "phonetice");
            return (Criteria) this;
        }

        public Criteria andAudioeIsNull() {
            addCriterion("audioe is null");
            return (Criteria) this;
        }

        public Criteria andAudioeIsNotNull() {
            addCriterion("audioe is not null");
            return (Criteria) this;
        }

        public Criteria andAudioeEqualTo(String value) {
            addCriterion("audioe =", value, "audioe");
            return (Criteria) this;
        }

        public Criteria andAudioeNotEqualTo(String value) {
            addCriterion("audioe <>", value, "audioe");
            return (Criteria) this;
        }

        public Criteria andAudioeGreaterThan(String value) {
            addCriterion("audioe >", value, "audioe");
            return (Criteria) this;
        }

        public Criteria andAudioeGreaterThanOrEqualTo(String value) {
            addCriterion("audioe >=", value, "audioe");
            return (Criteria) this;
        }

        public Criteria andAudioeLessThan(String value) {
            addCriterion("audioe <", value, "audioe");
            return (Criteria) this;
        }

        public Criteria andAudioeLessThanOrEqualTo(String value) {
            addCriterion("audioe <=", value, "audioe");
            return (Criteria) this;
        }

        public Criteria andAudioeLike(String value) {
            addCriterion("audioe like", value, "audioe");
            return (Criteria) this;
        }

        public Criteria andAudioeNotLike(String value) {
            addCriterion("audioe not like", value, "audioe");
            return (Criteria) this;
        }

        public Criteria andAudioeIn(List<String> values) {
            addCriterion("audioe in", values, "audioe");
            return (Criteria) this;
        }

        public Criteria andAudioeNotIn(List<String> values) {
            addCriterion("audioe not in", values, "audioe");
            return (Criteria) this;
        }

        public Criteria andAudioeBetween(String value1, String value2) {
            addCriterion("audioe between", value1, value2, "audioe");
            return (Criteria) this;
        }

        public Criteria andAudioeNotBetween(String value1, String value2) {
            addCriterion("audioe not between", value1, value2, "audioe");
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
     * This class corresponds to the database table wd_word
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
     * This class corresponds to the database table wd_word
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