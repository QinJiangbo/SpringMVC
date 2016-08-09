package com.qinjiangbo.gen.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysSmsExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sys_sms
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sys_sms
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sys_sms
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_sms
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public SysSmsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_sms
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_sms
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_sms
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_sms
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_sms
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_sms
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_sms
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
     * This method corresponds to the database table sys_sms
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
     * This method corresponds to the database table sys_sms
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_sms
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
     * This class corresponds to the database table sys_sms
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

        public Criteria andMsgIdIsNull() {
            addCriterion("msg_id is null");
            return (Criteria) this;
        }

        public Criteria andMsgIdIsNotNull() {
            addCriterion("msg_id is not null");
            return (Criteria) this;
        }

        public Criteria andMsgIdEqualTo(Long value) {
            addCriterion("msg_id =", value, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdNotEqualTo(Long value) {
            addCriterion("msg_id <>", value, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdGreaterThan(Long value) {
            addCriterion("msg_id >", value, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdGreaterThanOrEqualTo(Long value) {
            addCriterion("msg_id >=", value, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdLessThan(Long value) {
            addCriterion("msg_id <", value, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdLessThanOrEqualTo(Long value) {
            addCriterion("msg_id <=", value, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdIn(List<Long> values) {
            addCriterion("msg_id in", values, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdNotIn(List<Long> values) {
            addCriterion("msg_id not in", values, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdBetween(Long value1, Long value2) {
            addCriterion("msg_id between", value1, value2, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdNotBetween(Long value1, Long value2) {
            addCriterion("msg_id not between", value1, value2, "msgId");
            return (Criteria) this;
        }

        public Criteria andBusiTpIsNull() {
            addCriterion("busi_tp is null");
            return (Criteria) this;
        }

        public Criteria andBusiTpIsNotNull() {
            addCriterion("busi_tp is not null");
            return (Criteria) this;
        }

        public Criteria andBusiTpEqualTo(Integer value) {
            addCriterion("busi_tp =", value, "busiTp");
            return (Criteria) this;
        }

        public Criteria andBusiTpNotEqualTo(Integer value) {
            addCriterion("busi_tp <>", value, "busiTp");
            return (Criteria) this;
        }

        public Criteria andBusiTpGreaterThan(Integer value) {
            addCriterion("busi_tp >", value, "busiTp");
            return (Criteria) this;
        }

        public Criteria andBusiTpGreaterThanOrEqualTo(Integer value) {
            addCriterion("busi_tp >=", value, "busiTp");
            return (Criteria) this;
        }

        public Criteria andBusiTpLessThan(Integer value) {
            addCriterion("busi_tp <", value, "busiTp");
            return (Criteria) this;
        }

        public Criteria andBusiTpLessThanOrEqualTo(Integer value) {
            addCriterion("busi_tp <=", value, "busiTp");
            return (Criteria) this;
        }

        public Criteria andBusiTpIn(List<Integer> values) {
            addCriterion("busi_tp in", values, "busiTp");
            return (Criteria) this;
        }

        public Criteria andBusiTpNotIn(List<Integer> values) {
            addCriterion("busi_tp not in", values, "busiTp");
            return (Criteria) this;
        }

        public Criteria andBusiTpBetween(Integer value1, Integer value2) {
            addCriterion("busi_tp between", value1, value2, "busiTp");
            return (Criteria) this;
        }

        public Criteria andBusiTpNotBetween(Integer value1, Integer value2) {
            addCriterion("busi_tp not between", value1, value2, "busiTp");
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

        public Criteria andMsgTpIsNull() {
            addCriterion("msg_tp is null");
            return (Criteria) this;
        }

        public Criteria andMsgTpIsNotNull() {
            addCriterion("msg_tp is not null");
            return (Criteria) this;
        }

        public Criteria andMsgTpEqualTo(Integer value) {
            addCriterion("msg_tp =", value, "msgTp");
            return (Criteria) this;
        }

        public Criteria andMsgTpNotEqualTo(Integer value) {
            addCriterion("msg_tp <>", value, "msgTp");
            return (Criteria) this;
        }

        public Criteria andMsgTpGreaterThan(Integer value) {
            addCriterion("msg_tp >", value, "msgTp");
            return (Criteria) this;
        }

        public Criteria andMsgTpGreaterThanOrEqualTo(Integer value) {
            addCriterion("msg_tp >=", value, "msgTp");
            return (Criteria) this;
        }

        public Criteria andMsgTpLessThan(Integer value) {
            addCriterion("msg_tp <", value, "msgTp");
            return (Criteria) this;
        }

        public Criteria andMsgTpLessThanOrEqualTo(Integer value) {
            addCriterion("msg_tp <=", value, "msgTp");
            return (Criteria) this;
        }

        public Criteria andMsgTpIn(List<Integer> values) {
            addCriterion("msg_tp in", values, "msgTp");
            return (Criteria) this;
        }

        public Criteria andMsgTpNotIn(List<Integer> values) {
            addCriterion("msg_tp not in", values, "msgTp");
            return (Criteria) this;
        }

        public Criteria andMsgTpBetween(Integer value1, Integer value2) {
            addCriterion("msg_tp between", value1, value2, "msgTp");
            return (Criteria) this;
        }

        public Criteria andMsgTpNotBetween(Integer value1, Integer value2) {
            addCriterion("msg_tp not between", value1, value2, "msgTp");
            return (Criteria) this;
        }

        public Criteria andNumUserIsNull() {
            addCriterion("num_user is null");
            return (Criteria) this;
        }

        public Criteria andNumUserIsNotNull() {
            addCriterion("num_user is not null");
            return (Criteria) this;
        }

        public Criteria andNumUserEqualTo(Long value) {
            addCriterion("num_user =", value, "numUser");
            return (Criteria) this;
        }

        public Criteria andNumUserNotEqualTo(Long value) {
            addCriterion("num_user <>", value, "numUser");
            return (Criteria) this;
        }

        public Criteria andNumUserGreaterThan(Long value) {
            addCriterion("num_user >", value, "numUser");
            return (Criteria) this;
        }

        public Criteria andNumUserGreaterThanOrEqualTo(Long value) {
            addCriterion("num_user >=", value, "numUser");
            return (Criteria) this;
        }

        public Criteria andNumUserLessThan(Long value) {
            addCriterion("num_user <", value, "numUser");
            return (Criteria) this;
        }

        public Criteria andNumUserLessThanOrEqualTo(Long value) {
            addCriterion("num_user <=", value, "numUser");
            return (Criteria) this;
        }

        public Criteria andNumUserIn(List<Long> values) {
            addCriterion("num_user in", values, "numUser");
            return (Criteria) this;
        }

        public Criteria andNumUserNotIn(List<Long> values) {
            addCriterion("num_user not in", values, "numUser");
            return (Criteria) this;
        }

        public Criteria andNumUserBetween(Long value1, Long value2) {
            addCriterion("num_user between", value1, value2, "numUser");
            return (Criteria) this;
        }

        public Criteria andNumUserNotBetween(Long value1, Long value2) {
            addCriterion("num_user not between", value1, value2, "numUser");
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
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table sys_sms
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
     * This class corresponds to the database table sys_sms
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