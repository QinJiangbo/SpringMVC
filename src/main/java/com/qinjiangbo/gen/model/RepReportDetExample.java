package com.qinjiangbo.gen.model;

import java.util.ArrayList;
import java.util.List;

public class RepReportDetExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table rep_report_det
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table rep_report_det
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table rep_report_det
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rep_report_det
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public RepReportDetExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rep_report_det
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rep_report_det
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rep_report_det
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rep_report_det
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rep_report_det
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rep_report_det
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rep_report_det
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
     * This method corresponds to the database table rep_report_det
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
     * This method corresponds to the database table rep_report_det
     *
     * @mbggenerated Tue Jun 21 00:00:04 CST 2016
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rep_report_det
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
     * This class corresponds to the database table rep_report_det
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

        public Criteria andRepIdIsNull() {
            addCriterion("rep_id is null");
            return (Criteria) this;
        }

        public Criteria andRepIdIsNotNull() {
            addCriterion("rep_id is not null");
            return (Criteria) this;
        }

        public Criteria andRepIdEqualTo(Long value) {
            addCriterion("rep_id =", value, "repId");
            return (Criteria) this;
        }

        public Criteria andRepIdNotEqualTo(Long value) {
            addCriterion("rep_id <>", value, "repId");
            return (Criteria) this;
        }

        public Criteria andRepIdGreaterThan(Long value) {
            addCriterion("rep_id >", value, "repId");
            return (Criteria) this;
        }

        public Criteria andRepIdGreaterThanOrEqualTo(Long value) {
            addCriterion("rep_id >=", value, "repId");
            return (Criteria) this;
        }

        public Criteria andRepIdLessThan(Long value) {
            addCriterion("rep_id <", value, "repId");
            return (Criteria) this;
        }

        public Criteria andRepIdLessThanOrEqualTo(Long value) {
            addCriterion("rep_id <=", value, "repId");
            return (Criteria) this;
        }

        public Criteria andRepIdIn(List<Long> values) {
            addCriterion("rep_id in", values, "repId");
            return (Criteria) this;
        }

        public Criteria andRepIdNotIn(List<Long> values) {
            addCriterion("rep_id not in", values, "repId");
            return (Criteria) this;
        }

        public Criteria andRepIdBetween(Long value1, Long value2) {
            addCriterion("rep_id between", value1, value2, "repId");
            return (Criteria) this;
        }

        public Criteria andRepIdNotBetween(Long value1, Long value2) {
            addCriterion("rep_id not between", value1, value2, "repId");
            return (Criteria) this;
        }

        public Criteria andY0IsNull() {
            addCriterion("y0 is null");
            return (Criteria) this;
        }

        public Criteria andY0IsNotNull() {
            addCriterion("y0 is not null");
            return (Criteria) this;
        }

        public Criteria andY0EqualTo(Long value) {
            addCriterion("y0 =", value, "y0");
            return (Criteria) this;
        }

        public Criteria andY0NotEqualTo(Long value) {
            addCriterion("y0 <>", value, "y0");
            return (Criteria) this;
        }

        public Criteria andY0GreaterThan(Long value) {
            addCriterion("y0 >", value, "y0");
            return (Criteria) this;
        }

        public Criteria andY0GreaterThanOrEqualTo(Long value) {
            addCriterion("y0 >=", value, "y0");
            return (Criteria) this;
        }

        public Criteria andY0LessThan(Long value) {
            addCriterion("y0 <", value, "y0");
            return (Criteria) this;
        }

        public Criteria andY0LessThanOrEqualTo(Long value) {
            addCriterion("y0 <=", value, "y0");
            return (Criteria) this;
        }

        public Criteria andY0In(List<Long> values) {
            addCriterion("y0 in", values, "y0");
            return (Criteria) this;
        }

        public Criteria andY0NotIn(List<Long> values) {
            addCriterion("y0 not in", values, "y0");
            return (Criteria) this;
        }

        public Criteria andY0Between(Long value1, Long value2) {
            addCriterion("y0 between", value1, value2, "y0");
            return (Criteria) this;
        }

        public Criteria andY0NotBetween(Long value1, Long value2) {
            addCriterion("y0 not between", value1, value2, "y0");
            return (Criteria) this;
        }

        public Criteria andY1IsNull() {
            addCriterion("y1 is null");
            return (Criteria) this;
        }

        public Criteria andY1IsNotNull() {
            addCriterion("y1 is not null");
            return (Criteria) this;
        }

        public Criteria andY1EqualTo(Long value) {
            addCriterion("y1 =", value, "y1");
            return (Criteria) this;
        }

        public Criteria andY1NotEqualTo(Long value) {
            addCriterion("y1 <>", value, "y1");
            return (Criteria) this;
        }

        public Criteria andY1GreaterThan(Long value) {
            addCriterion("y1 >", value, "y1");
            return (Criteria) this;
        }

        public Criteria andY1GreaterThanOrEqualTo(Long value) {
            addCriterion("y1 >=", value, "y1");
            return (Criteria) this;
        }

        public Criteria andY1LessThan(Long value) {
            addCriterion("y1 <", value, "y1");
            return (Criteria) this;
        }

        public Criteria andY1LessThanOrEqualTo(Long value) {
            addCriterion("y1 <=", value, "y1");
            return (Criteria) this;
        }

        public Criteria andY1In(List<Long> values) {
            addCriterion("y1 in", values, "y1");
            return (Criteria) this;
        }

        public Criteria andY1NotIn(List<Long> values) {
            addCriterion("y1 not in", values, "y1");
            return (Criteria) this;
        }

        public Criteria andY1Between(Long value1, Long value2) {
            addCriterion("y1 between", value1, value2, "y1");
            return (Criteria) this;
        }

        public Criteria andY1NotBetween(Long value1, Long value2) {
            addCriterion("y1 not between", value1, value2, "y1");
            return (Criteria) this;
        }

        public Criteria andY2IsNull() {
            addCriterion("y2 is null");
            return (Criteria) this;
        }

        public Criteria andY2IsNotNull() {
            addCriterion("y2 is not null");
            return (Criteria) this;
        }

        public Criteria andY2EqualTo(Long value) {
            addCriterion("y2 =", value, "y2");
            return (Criteria) this;
        }

        public Criteria andY2NotEqualTo(Long value) {
            addCriterion("y2 <>", value, "y2");
            return (Criteria) this;
        }

        public Criteria andY2GreaterThan(Long value) {
            addCriterion("y2 >", value, "y2");
            return (Criteria) this;
        }

        public Criteria andY2GreaterThanOrEqualTo(Long value) {
            addCriterion("y2 >=", value, "y2");
            return (Criteria) this;
        }

        public Criteria andY2LessThan(Long value) {
            addCriterion("y2 <", value, "y2");
            return (Criteria) this;
        }

        public Criteria andY2LessThanOrEqualTo(Long value) {
            addCriterion("y2 <=", value, "y2");
            return (Criteria) this;
        }

        public Criteria andY2In(List<Long> values) {
            addCriterion("y2 in", values, "y2");
            return (Criteria) this;
        }

        public Criteria andY2NotIn(List<Long> values) {
            addCriterion("y2 not in", values, "y2");
            return (Criteria) this;
        }

        public Criteria andY2Between(Long value1, Long value2) {
            addCriterion("y2 between", value1, value2, "y2");
            return (Criteria) this;
        }

        public Criteria andY2NotBetween(Long value1, Long value2) {
            addCriterion("y2 not between", value1, value2, "y2");
            return (Criteria) this;
        }

        public Criteria andY3IsNull() {
            addCriterion("y3 is null");
            return (Criteria) this;
        }

        public Criteria andY3IsNotNull() {
            addCriterion("y3 is not null");
            return (Criteria) this;
        }

        public Criteria andY3EqualTo(Long value) {
            addCriterion("y3 =", value, "y3");
            return (Criteria) this;
        }

        public Criteria andY3NotEqualTo(Long value) {
            addCriterion("y3 <>", value, "y3");
            return (Criteria) this;
        }

        public Criteria andY3GreaterThan(Long value) {
            addCriterion("y3 >", value, "y3");
            return (Criteria) this;
        }

        public Criteria andY3GreaterThanOrEqualTo(Long value) {
            addCriterion("y3 >=", value, "y3");
            return (Criteria) this;
        }

        public Criteria andY3LessThan(Long value) {
            addCriterion("y3 <", value, "y3");
            return (Criteria) this;
        }

        public Criteria andY3LessThanOrEqualTo(Long value) {
            addCriterion("y3 <=", value, "y3");
            return (Criteria) this;
        }

        public Criteria andY3In(List<Long> values) {
            addCriterion("y3 in", values, "y3");
            return (Criteria) this;
        }

        public Criteria andY3NotIn(List<Long> values) {
            addCriterion("y3 not in", values, "y3");
            return (Criteria) this;
        }

        public Criteria andY3Between(Long value1, Long value2) {
            addCriterion("y3 between", value1, value2, "y3");
            return (Criteria) this;
        }

        public Criteria andY3NotBetween(Long value1, Long value2) {
            addCriterion("y3 not between", value1, value2, "y3");
            return (Criteria) this;
        }

        public Criteria andY4IsNull() {
            addCriterion("y4 is null");
            return (Criteria) this;
        }

        public Criteria andY4IsNotNull() {
            addCriterion("y4 is not null");
            return (Criteria) this;
        }

        public Criteria andY4EqualTo(Long value) {
            addCriterion("y4 =", value, "y4");
            return (Criteria) this;
        }

        public Criteria andY4NotEqualTo(Long value) {
            addCriterion("y4 <>", value, "y4");
            return (Criteria) this;
        }

        public Criteria andY4GreaterThan(Long value) {
            addCriterion("y4 >", value, "y4");
            return (Criteria) this;
        }

        public Criteria andY4GreaterThanOrEqualTo(Long value) {
            addCriterion("y4 >=", value, "y4");
            return (Criteria) this;
        }

        public Criteria andY4LessThan(Long value) {
            addCriterion("y4 <", value, "y4");
            return (Criteria) this;
        }

        public Criteria andY4LessThanOrEqualTo(Long value) {
            addCriterion("y4 <=", value, "y4");
            return (Criteria) this;
        }

        public Criteria andY4In(List<Long> values) {
            addCriterion("y4 in", values, "y4");
            return (Criteria) this;
        }

        public Criteria andY4NotIn(List<Long> values) {
            addCriterion("y4 not in", values, "y4");
            return (Criteria) this;
        }

        public Criteria andY4Between(Long value1, Long value2) {
            addCriterion("y4 between", value1, value2, "y4");
            return (Criteria) this;
        }

        public Criteria andY4NotBetween(Long value1, Long value2) {
            addCriterion("y4 not between", value1, value2, "y4");
            return (Criteria) this;
        }

        public Criteria andY5IsNull() {
            addCriterion("y5 is null");
            return (Criteria) this;
        }

        public Criteria andY5IsNotNull() {
            addCriterion("y5 is not null");
            return (Criteria) this;
        }

        public Criteria andY5EqualTo(Long value) {
            addCriterion("y5 =", value, "y5");
            return (Criteria) this;
        }

        public Criteria andY5NotEqualTo(Long value) {
            addCriterion("y5 <>", value, "y5");
            return (Criteria) this;
        }

        public Criteria andY5GreaterThan(Long value) {
            addCriterion("y5 >", value, "y5");
            return (Criteria) this;
        }

        public Criteria andY5GreaterThanOrEqualTo(Long value) {
            addCriterion("y5 >=", value, "y5");
            return (Criteria) this;
        }

        public Criteria andY5LessThan(Long value) {
            addCriterion("y5 <", value, "y5");
            return (Criteria) this;
        }

        public Criteria andY5LessThanOrEqualTo(Long value) {
            addCriterion("y5 <=", value, "y5");
            return (Criteria) this;
        }

        public Criteria andY5In(List<Long> values) {
            addCriterion("y5 in", values, "y5");
            return (Criteria) this;
        }

        public Criteria andY5NotIn(List<Long> values) {
            addCriterion("y5 not in", values, "y5");
            return (Criteria) this;
        }

        public Criteria andY5Between(Long value1, Long value2) {
            addCriterion("y5 between", value1, value2, "y5");
            return (Criteria) this;
        }

        public Criteria andY5NotBetween(Long value1, Long value2) {
            addCriterion("y5 not between", value1, value2, "y5");
            return (Criteria) this;
        }

        public Criteria andY6IsNull() {
            addCriterion("y6 is null");
            return (Criteria) this;
        }

        public Criteria andY6IsNotNull() {
            addCriterion("y6 is not null");
            return (Criteria) this;
        }

        public Criteria andY6EqualTo(Long value) {
            addCriterion("y6 =", value, "y6");
            return (Criteria) this;
        }

        public Criteria andY6NotEqualTo(Long value) {
            addCriterion("y6 <>", value, "y6");
            return (Criteria) this;
        }

        public Criteria andY6GreaterThan(Long value) {
            addCriterion("y6 >", value, "y6");
            return (Criteria) this;
        }

        public Criteria andY6GreaterThanOrEqualTo(Long value) {
            addCriterion("y6 >=", value, "y6");
            return (Criteria) this;
        }

        public Criteria andY6LessThan(Long value) {
            addCriterion("y6 <", value, "y6");
            return (Criteria) this;
        }

        public Criteria andY6LessThanOrEqualTo(Long value) {
            addCriterion("y6 <=", value, "y6");
            return (Criteria) this;
        }

        public Criteria andY6In(List<Long> values) {
            addCriterion("y6 in", values, "y6");
            return (Criteria) this;
        }

        public Criteria andY6NotIn(List<Long> values) {
            addCriterion("y6 not in", values, "y6");
            return (Criteria) this;
        }

        public Criteria andY6Between(Long value1, Long value2) {
            addCriterion("y6 between", value1, value2, "y6");
            return (Criteria) this;
        }

        public Criteria andY6NotBetween(Long value1, Long value2) {
            addCriterion("y6 not between", value1, value2, "y6");
            return (Criteria) this;
        }

        public Criteria andY7IsNull() {
            addCriterion("y7 is null");
            return (Criteria) this;
        }

        public Criteria andY7IsNotNull() {
            addCriterion("y7 is not null");
            return (Criteria) this;
        }

        public Criteria andY7EqualTo(Long value) {
            addCriterion("y7 =", value, "y7");
            return (Criteria) this;
        }

        public Criteria andY7NotEqualTo(Long value) {
            addCriterion("y7 <>", value, "y7");
            return (Criteria) this;
        }

        public Criteria andY7GreaterThan(Long value) {
            addCriterion("y7 >", value, "y7");
            return (Criteria) this;
        }

        public Criteria andY7GreaterThanOrEqualTo(Long value) {
            addCriterion("y7 >=", value, "y7");
            return (Criteria) this;
        }

        public Criteria andY7LessThan(Long value) {
            addCriterion("y7 <", value, "y7");
            return (Criteria) this;
        }

        public Criteria andY7LessThanOrEqualTo(Long value) {
            addCriterion("y7 <=", value, "y7");
            return (Criteria) this;
        }

        public Criteria andY7In(List<Long> values) {
            addCriterion("y7 in", values, "y7");
            return (Criteria) this;
        }

        public Criteria andY7NotIn(List<Long> values) {
            addCriterion("y7 not in", values, "y7");
            return (Criteria) this;
        }

        public Criteria andY7Between(Long value1, Long value2) {
            addCriterion("y7 between", value1, value2, "y7");
            return (Criteria) this;
        }

        public Criteria andY7NotBetween(Long value1, Long value2) {
            addCriterion("y7 not between", value1, value2, "y7");
            return (Criteria) this;
        }

        public Criteria andY8IsNull() {
            addCriterion("y8 is null");
            return (Criteria) this;
        }

        public Criteria andY8IsNotNull() {
            addCriterion("y8 is not null");
            return (Criteria) this;
        }

        public Criteria andY8EqualTo(Long value) {
            addCriterion("y8 =", value, "y8");
            return (Criteria) this;
        }

        public Criteria andY8NotEqualTo(Long value) {
            addCriterion("y8 <>", value, "y8");
            return (Criteria) this;
        }

        public Criteria andY8GreaterThan(Long value) {
            addCriterion("y8 >", value, "y8");
            return (Criteria) this;
        }

        public Criteria andY8GreaterThanOrEqualTo(Long value) {
            addCriterion("y8 >=", value, "y8");
            return (Criteria) this;
        }

        public Criteria andY8LessThan(Long value) {
            addCriterion("y8 <", value, "y8");
            return (Criteria) this;
        }

        public Criteria andY8LessThanOrEqualTo(Long value) {
            addCriterion("y8 <=", value, "y8");
            return (Criteria) this;
        }

        public Criteria andY8In(List<Long> values) {
            addCriterion("y8 in", values, "y8");
            return (Criteria) this;
        }

        public Criteria andY8NotIn(List<Long> values) {
            addCriterion("y8 not in", values, "y8");
            return (Criteria) this;
        }

        public Criteria andY8Between(Long value1, Long value2) {
            addCriterion("y8 between", value1, value2, "y8");
            return (Criteria) this;
        }

        public Criteria andY8NotBetween(Long value1, Long value2) {
            addCriterion("y8 not between", value1, value2, "y8");
            return (Criteria) this;
        }

        public Criteria andY9IsNull() {
            addCriterion("y9 is null");
            return (Criteria) this;
        }

        public Criteria andY9IsNotNull() {
            addCriterion("y9 is not null");
            return (Criteria) this;
        }

        public Criteria andY9EqualTo(Long value) {
            addCriterion("y9 =", value, "y9");
            return (Criteria) this;
        }

        public Criteria andY9NotEqualTo(Long value) {
            addCriterion("y9 <>", value, "y9");
            return (Criteria) this;
        }

        public Criteria andY9GreaterThan(Long value) {
            addCriterion("y9 >", value, "y9");
            return (Criteria) this;
        }

        public Criteria andY9GreaterThanOrEqualTo(Long value) {
            addCriterion("y9 >=", value, "y9");
            return (Criteria) this;
        }

        public Criteria andY9LessThan(Long value) {
            addCriterion("y9 <", value, "y9");
            return (Criteria) this;
        }

        public Criteria andY9LessThanOrEqualTo(Long value) {
            addCriterion("y9 <=", value, "y9");
            return (Criteria) this;
        }

        public Criteria andY9In(List<Long> values) {
            addCriterion("y9 in", values, "y9");
            return (Criteria) this;
        }

        public Criteria andY9NotIn(List<Long> values) {
            addCriterion("y9 not in", values, "y9");
            return (Criteria) this;
        }

        public Criteria andY9Between(Long value1, Long value2) {
            addCriterion("y9 between", value1, value2, "y9");
            return (Criteria) this;
        }

        public Criteria andY9NotBetween(Long value1, Long value2) {
            addCriterion("y9 not between", value1, value2, "y9");
            return (Criteria) this;
        }

        public Criteria andY10IsNull() {
            addCriterion("y10 is null");
            return (Criteria) this;
        }

        public Criteria andY10IsNotNull() {
            addCriterion("y10 is not null");
            return (Criteria) this;
        }

        public Criteria andY10EqualTo(Long value) {
            addCriterion("y10 =", value, "y10");
            return (Criteria) this;
        }

        public Criteria andY10NotEqualTo(Long value) {
            addCriterion("y10 <>", value, "y10");
            return (Criteria) this;
        }

        public Criteria andY10GreaterThan(Long value) {
            addCriterion("y10 >", value, "y10");
            return (Criteria) this;
        }

        public Criteria andY10GreaterThanOrEqualTo(Long value) {
            addCriterion("y10 >=", value, "y10");
            return (Criteria) this;
        }

        public Criteria andY10LessThan(Long value) {
            addCriterion("y10 <", value, "y10");
            return (Criteria) this;
        }

        public Criteria andY10LessThanOrEqualTo(Long value) {
            addCriterion("y10 <=", value, "y10");
            return (Criteria) this;
        }

        public Criteria andY10In(List<Long> values) {
            addCriterion("y10 in", values, "y10");
            return (Criteria) this;
        }

        public Criteria andY10NotIn(List<Long> values) {
            addCriterion("y10 not in", values, "y10");
            return (Criteria) this;
        }

        public Criteria andY10Between(Long value1, Long value2) {
            addCriterion("y10 between", value1, value2, "y10");
            return (Criteria) this;
        }

        public Criteria andY10NotBetween(Long value1, Long value2) {
            addCriterion("y10 not between", value1, value2, "y10");
            return (Criteria) this;
        }

        public Criteria andY11IsNull() {
            addCriterion("y11 is null");
            return (Criteria) this;
        }

        public Criteria andY11IsNotNull() {
            addCriterion("y11 is not null");
            return (Criteria) this;
        }

        public Criteria andY11EqualTo(Long value) {
            addCriterion("y11 =", value, "y11");
            return (Criteria) this;
        }

        public Criteria andY11NotEqualTo(Long value) {
            addCriterion("y11 <>", value, "y11");
            return (Criteria) this;
        }

        public Criteria andY11GreaterThan(Long value) {
            addCriterion("y11 >", value, "y11");
            return (Criteria) this;
        }

        public Criteria andY11GreaterThanOrEqualTo(Long value) {
            addCriterion("y11 >=", value, "y11");
            return (Criteria) this;
        }

        public Criteria andY11LessThan(Long value) {
            addCriterion("y11 <", value, "y11");
            return (Criteria) this;
        }

        public Criteria andY11LessThanOrEqualTo(Long value) {
            addCriterion("y11 <=", value, "y11");
            return (Criteria) this;
        }

        public Criteria andY11In(List<Long> values) {
            addCriterion("y11 in", values, "y11");
            return (Criteria) this;
        }

        public Criteria andY11NotIn(List<Long> values) {
            addCriterion("y11 not in", values, "y11");
            return (Criteria) this;
        }

        public Criteria andY11Between(Long value1, Long value2) {
            addCriterion("y11 between", value1, value2, "y11");
            return (Criteria) this;
        }

        public Criteria andY11NotBetween(Long value1, Long value2) {
            addCriterion("y11 not between", value1, value2, "y11");
            return (Criteria) this;
        }

        public Criteria andY12IsNull() {
            addCriterion("y12 is null");
            return (Criteria) this;
        }

        public Criteria andY12IsNotNull() {
            addCriterion("y12 is not null");
            return (Criteria) this;
        }

        public Criteria andY12EqualTo(Long value) {
            addCriterion("y12 =", value, "y12");
            return (Criteria) this;
        }

        public Criteria andY12NotEqualTo(Long value) {
            addCriterion("y12 <>", value, "y12");
            return (Criteria) this;
        }

        public Criteria andY12GreaterThan(Long value) {
            addCriterion("y12 >", value, "y12");
            return (Criteria) this;
        }

        public Criteria andY12GreaterThanOrEqualTo(Long value) {
            addCriterion("y12 >=", value, "y12");
            return (Criteria) this;
        }

        public Criteria andY12LessThan(Long value) {
            addCriterion("y12 <", value, "y12");
            return (Criteria) this;
        }

        public Criteria andY12LessThanOrEqualTo(Long value) {
            addCriterion("y12 <=", value, "y12");
            return (Criteria) this;
        }

        public Criteria andY12In(List<Long> values) {
            addCriterion("y12 in", values, "y12");
            return (Criteria) this;
        }

        public Criteria andY12NotIn(List<Long> values) {
            addCriterion("y12 not in", values, "y12");
            return (Criteria) this;
        }

        public Criteria andY12Between(Long value1, Long value2) {
            addCriterion("y12 between", value1, value2, "y12");
            return (Criteria) this;
        }

        public Criteria andY12NotBetween(Long value1, Long value2) {
            addCriterion("y12 not between", value1, value2, "y12");
            return (Criteria) this;
        }

        public Criteria andY13IsNull() {
            addCriterion("y13 is null");
            return (Criteria) this;
        }

        public Criteria andY13IsNotNull() {
            addCriterion("y13 is not null");
            return (Criteria) this;
        }

        public Criteria andY13EqualTo(Long value) {
            addCriterion("y13 =", value, "y13");
            return (Criteria) this;
        }

        public Criteria andY13NotEqualTo(Long value) {
            addCriterion("y13 <>", value, "y13");
            return (Criteria) this;
        }

        public Criteria andY13GreaterThan(Long value) {
            addCriterion("y13 >", value, "y13");
            return (Criteria) this;
        }

        public Criteria andY13GreaterThanOrEqualTo(Long value) {
            addCriterion("y13 >=", value, "y13");
            return (Criteria) this;
        }

        public Criteria andY13LessThan(Long value) {
            addCriterion("y13 <", value, "y13");
            return (Criteria) this;
        }

        public Criteria andY13LessThanOrEqualTo(Long value) {
            addCriterion("y13 <=", value, "y13");
            return (Criteria) this;
        }

        public Criteria andY13In(List<Long> values) {
            addCriterion("y13 in", values, "y13");
            return (Criteria) this;
        }

        public Criteria andY13NotIn(List<Long> values) {
            addCriterion("y13 not in", values, "y13");
            return (Criteria) this;
        }

        public Criteria andY13Between(Long value1, Long value2) {
            addCriterion("y13 between", value1, value2, "y13");
            return (Criteria) this;
        }

        public Criteria andY13NotBetween(Long value1, Long value2) {
            addCriterion("y13 not between", value1, value2, "y13");
            return (Criteria) this;
        }

        public Criteria andY14IsNull() {
            addCriterion("y14 is null");
            return (Criteria) this;
        }

        public Criteria andY14IsNotNull() {
            addCriterion("y14 is not null");
            return (Criteria) this;
        }

        public Criteria andY14EqualTo(Long value) {
            addCriterion("y14 =", value, "y14");
            return (Criteria) this;
        }

        public Criteria andY14NotEqualTo(Long value) {
            addCriterion("y14 <>", value, "y14");
            return (Criteria) this;
        }

        public Criteria andY14GreaterThan(Long value) {
            addCriterion("y14 >", value, "y14");
            return (Criteria) this;
        }

        public Criteria andY14GreaterThanOrEqualTo(Long value) {
            addCriterion("y14 >=", value, "y14");
            return (Criteria) this;
        }

        public Criteria andY14LessThan(Long value) {
            addCriterion("y14 <", value, "y14");
            return (Criteria) this;
        }

        public Criteria andY14LessThanOrEqualTo(Long value) {
            addCriterion("y14 <=", value, "y14");
            return (Criteria) this;
        }

        public Criteria andY14In(List<Long> values) {
            addCriterion("y14 in", values, "y14");
            return (Criteria) this;
        }

        public Criteria andY14NotIn(List<Long> values) {
            addCriterion("y14 not in", values, "y14");
            return (Criteria) this;
        }

        public Criteria andY14Between(Long value1, Long value2) {
            addCriterion("y14 between", value1, value2, "y14");
            return (Criteria) this;
        }

        public Criteria andY14NotBetween(Long value1, Long value2) {
            addCriterion("y14 not between", value1, value2, "y14");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table rep_report_det
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
     * This class corresponds to the database table rep_report_det
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