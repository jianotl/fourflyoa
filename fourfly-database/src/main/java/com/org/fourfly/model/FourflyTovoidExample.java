package com.org.fourfly.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class FourflyTovoidExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table fourfly_tovoid
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table fourfly_tovoid
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table fourfly_tovoid
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_tovoid
     *
     * @mbg.generated
     */
    public FourflyTovoidExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_tovoid
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_tovoid
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_tovoid
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_tovoid
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_tovoid
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_tovoid
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_tovoid
     *
     * @mbg.generated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_tovoid
     *
     * @mbg.generated
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
     * This method corresponds to the database table fourfly_tovoid
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_tovoid
     *
     * @mbg.generated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table fourfly_tovoid
     *
     * @mbg.generated
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(Short value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(Short value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(Short value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(Short value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(Short value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(Short value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<Short> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<Short> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(Short value1, Short value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(Short value1, Short value2) {
            addCriterion("uid not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andOptdtIsNull() {
            addCriterion("optdt is null");
            return (Criteria) this;
        }

        public Criteria andOptdtIsNotNull() {
            addCriterion("optdt is not null");
            return (Criteria) this;
        }

        public Criteria andOptdtEqualTo(Date value) {
            addCriterion("optdt =", value, "optdt");
            return (Criteria) this;
        }

        public Criteria andOptdtNotEqualTo(Date value) {
            addCriterion("optdt <>", value, "optdt");
            return (Criteria) this;
        }

        public Criteria andOptdtGreaterThan(Date value) {
            addCriterion("optdt >", value, "optdt");
            return (Criteria) this;
        }

        public Criteria andOptdtGreaterThanOrEqualTo(Date value) {
            addCriterion("optdt >=", value, "optdt");
            return (Criteria) this;
        }

        public Criteria andOptdtLessThan(Date value) {
            addCriterion("optdt <", value, "optdt");
            return (Criteria) this;
        }

        public Criteria andOptdtLessThanOrEqualTo(Date value) {
            addCriterion("optdt <=", value, "optdt");
            return (Criteria) this;
        }

        public Criteria andOptdtIn(List<Date> values) {
            addCriterion("optdt in", values, "optdt");
            return (Criteria) this;
        }

        public Criteria andOptdtNotIn(List<Date> values) {
            addCriterion("optdt not in", values, "optdt");
            return (Criteria) this;
        }

        public Criteria andOptdtBetween(Date value1, Date value2) {
            addCriterion("optdt between", value1, value2, "optdt");
            return (Criteria) this;
        }

        public Criteria andOptdtNotBetween(Date value1, Date value2) {
            addCriterion("optdt not between", value1, value2, "optdt");
            return (Criteria) this;
        }

        public Criteria andOptidIsNull() {
            addCriterion("optid is null");
            return (Criteria) this;
        }

        public Criteria andOptidIsNotNull() {
            addCriterion("optid is not null");
            return (Criteria) this;
        }

        public Criteria andOptidEqualTo(Short value) {
            addCriterion("optid =", value, "optid");
            return (Criteria) this;
        }

        public Criteria andOptidNotEqualTo(Short value) {
            addCriterion("optid <>", value, "optid");
            return (Criteria) this;
        }

        public Criteria andOptidGreaterThan(Short value) {
            addCriterion("optid >", value, "optid");
            return (Criteria) this;
        }

        public Criteria andOptidGreaterThanOrEqualTo(Short value) {
            addCriterion("optid >=", value, "optid");
            return (Criteria) this;
        }

        public Criteria andOptidLessThan(Short value) {
            addCriterion("optid <", value, "optid");
            return (Criteria) this;
        }

        public Criteria andOptidLessThanOrEqualTo(Short value) {
            addCriterion("optid <=", value, "optid");
            return (Criteria) this;
        }

        public Criteria andOptidIn(List<Short> values) {
            addCriterion("optid in", values, "optid");
            return (Criteria) this;
        }

        public Criteria andOptidNotIn(List<Short> values) {
            addCriterion("optid not in", values, "optid");
            return (Criteria) this;
        }

        public Criteria andOptidBetween(Short value1, Short value2) {
            addCriterion("optid between", value1, value2, "optid");
            return (Criteria) this;
        }

        public Criteria andOptidNotBetween(Short value1, Short value2) {
            addCriterion("optid not between", value1, value2, "optid");
            return (Criteria) this;
        }

        public Criteria andOptnameIsNull() {
            addCriterion("optname is null");
            return (Criteria) this;
        }

        public Criteria andOptnameIsNotNull() {
            addCriterion("optname is not null");
            return (Criteria) this;
        }

        public Criteria andOptnameEqualTo(String value) {
            addCriterion("optname =", value, "optname");
            return (Criteria) this;
        }

        public Criteria andOptnameNotEqualTo(String value) {
            addCriterion("optname <>", value, "optname");
            return (Criteria) this;
        }

        public Criteria andOptnameGreaterThan(String value) {
            addCriterion("optname >", value, "optname");
            return (Criteria) this;
        }

        public Criteria andOptnameGreaterThanOrEqualTo(String value) {
            addCriterion("optname >=", value, "optname");
            return (Criteria) this;
        }

        public Criteria andOptnameLessThan(String value) {
            addCriterion("optname <", value, "optname");
            return (Criteria) this;
        }

        public Criteria andOptnameLessThanOrEqualTo(String value) {
            addCriterion("optname <=", value, "optname");
            return (Criteria) this;
        }

        public Criteria andOptnameLike(String value) {
            addCriterion("optname like", value, "optname");
            return (Criteria) this;
        }

        public Criteria andOptnameNotLike(String value) {
            addCriterion("optname not like", value, "optname");
            return (Criteria) this;
        }

        public Criteria andOptnameIn(List<String> values) {
            addCriterion("optname in", values, "optname");
            return (Criteria) this;
        }

        public Criteria andOptnameNotIn(List<String> values) {
            addCriterion("optname not in", values, "optname");
            return (Criteria) this;
        }

        public Criteria andOptnameBetween(String value1, String value2) {
            addCriterion("optname between", value1, value2, "optname");
            return (Criteria) this;
        }

        public Criteria andOptnameNotBetween(String value1, String value2) {
            addCriterion("optname not between", value1, value2, "optname");
            return (Criteria) this;
        }

        public Criteria andApplydtIsNull() {
            addCriterion("applydt is null");
            return (Criteria) this;
        }

        public Criteria andApplydtIsNotNull() {
            addCriterion("applydt is not null");
            return (Criteria) this;
        }

        public Criteria andApplydtEqualTo(Date value) {
            addCriterionForJDBCDate("applydt =", value, "applydt");
            return (Criteria) this;
        }

        public Criteria andApplydtNotEqualTo(Date value) {
            addCriterionForJDBCDate("applydt <>", value, "applydt");
            return (Criteria) this;
        }

        public Criteria andApplydtGreaterThan(Date value) {
            addCriterionForJDBCDate("applydt >", value, "applydt");
            return (Criteria) this;
        }

        public Criteria andApplydtGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("applydt >=", value, "applydt");
            return (Criteria) this;
        }

        public Criteria andApplydtLessThan(Date value) {
            addCriterionForJDBCDate("applydt <", value, "applydt");
            return (Criteria) this;
        }

        public Criteria andApplydtLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("applydt <=", value, "applydt");
            return (Criteria) this;
        }

        public Criteria andApplydtIn(List<Date> values) {
            addCriterionForJDBCDate("applydt in", values, "applydt");
            return (Criteria) this;
        }

        public Criteria andApplydtNotIn(List<Date> values) {
            addCriterionForJDBCDate("applydt not in", values, "applydt");
            return (Criteria) this;
        }

        public Criteria andApplydtBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("applydt between", value1, value2, "applydt");
            return (Criteria) this;
        }

        public Criteria andApplydtNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("applydt not between", value1, value2, "applydt");
            return (Criteria) this;
        }

        public Criteria andExplainIsNull() {
            addCriterion("explain is null");
            return (Criteria) this;
        }

        public Criteria andExplainIsNotNull() {
            addCriterion("explain is not null");
            return (Criteria) this;
        }

        public Criteria andExplainEqualTo(String value) {
            addCriterion("explain =", value, "explain");
            return (Criteria) this;
        }

        public Criteria andExplainNotEqualTo(String value) {
            addCriterion("explain <>", value, "explain");
            return (Criteria) this;
        }

        public Criteria andExplainGreaterThan(String value) {
            addCriterion("explain >", value, "explain");
            return (Criteria) this;
        }

        public Criteria andExplainGreaterThanOrEqualTo(String value) {
            addCriterion("explain >=", value, "explain");
            return (Criteria) this;
        }

        public Criteria andExplainLessThan(String value) {
            addCriterion("explain <", value, "explain");
            return (Criteria) this;
        }

        public Criteria andExplainLessThanOrEqualTo(String value) {
            addCriterion("explain <=", value, "explain");
            return (Criteria) this;
        }

        public Criteria andExplainLike(String value) {
            addCriterion("explain like", value, "explain");
            return (Criteria) this;
        }

        public Criteria andExplainNotLike(String value) {
            addCriterion("explain not like", value, "explain");
            return (Criteria) this;
        }

        public Criteria andExplainIn(List<String> values) {
            addCriterion("explain in", values, "explain");
            return (Criteria) this;
        }

        public Criteria andExplainNotIn(List<String> values) {
            addCriterion("explain not in", values, "explain");
            return (Criteria) this;
        }

        public Criteria andExplainBetween(String value1, String value2) {
            addCriterion("explain between", value1, value2, "explain");
            return (Criteria) this;
        }

        public Criteria andExplainNotBetween(String value1, String value2) {
            addCriterion("explain not between", value1, value2, "explain");
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

        public Criteria andStatusEqualTo(Boolean value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Boolean value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Boolean value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Boolean value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Boolean> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Boolean> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andIsturnIsNull() {
            addCriterion("isturn is null");
            return (Criteria) this;
        }

        public Criteria andIsturnIsNotNull() {
            addCriterion("isturn is not null");
            return (Criteria) this;
        }

        public Criteria andIsturnEqualTo(Boolean value) {
            addCriterion("isturn =", value, "isturn");
            return (Criteria) this;
        }

        public Criteria andIsturnNotEqualTo(Boolean value) {
            addCriterion("isturn <>", value, "isturn");
            return (Criteria) this;
        }

        public Criteria andIsturnGreaterThan(Boolean value) {
            addCriterion("isturn >", value, "isturn");
            return (Criteria) this;
        }

        public Criteria andIsturnGreaterThanOrEqualTo(Boolean value) {
            addCriterion("isturn >=", value, "isturn");
            return (Criteria) this;
        }

        public Criteria andIsturnLessThan(Boolean value) {
            addCriterion("isturn <", value, "isturn");
            return (Criteria) this;
        }

        public Criteria andIsturnLessThanOrEqualTo(Boolean value) {
            addCriterion("isturn <=", value, "isturn");
            return (Criteria) this;
        }

        public Criteria andIsturnIn(List<Boolean> values) {
            addCriterion("isturn in", values, "isturn");
            return (Criteria) this;
        }

        public Criteria andIsturnNotIn(List<Boolean> values) {
            addCriterion("isturn not in", values, "isturn");
            return (Criteria) this;
        }

        public Criteria andIsturnBetween(Boolean value1, Boolean value2) {
            addCriterion("isturn between", value1, value2, "isturn");
            return (Criteria) this;
        }

        public Criteria andIsturnNotBetween(Boolean value1, Boolean value2) {
            addCriterion("isturn not between", value1, value2, "isturn");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Boolean value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Boolean value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Boolean value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Boolean value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Boolean value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Boolean> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Boolean> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Boolean value1, Boolean value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andModenameIsNull() {
            addCriterion("modename is null");
            return (Criteria) this;
        }

        public Criteria andModenameIsNotNull() {
            addCriterion("modename is not null");
            return (Criteria) this;
        }

        public Criteria andModenameEqualTo(String value) {
            addCriterion("modename =", value, "modename");
            return (Criteria) this;
        }

        public Criteria andModenameNotEqualTo(String value) {
            addCriterion("modename <>", value, "modename");
            return (Criteria) this;
        }

        public Criteria andModenameGreaterThan(String value) {
            addCriterion("modename >", value, "modename");
            return (Criteria) this;
        }

        public Criteria andModenameGreaterThanOrEqualTo(String value) {
            addCriterion("modename >=", value, "modename");
            return (Criteria) this;
        }

        public Criteria andModenameLessThan(String value) {
            addCriterion("modename <", value, "modename");
            return (Criteria) this;
        }

        public Criteria andModenameLessThanOrEqualTo(String value) {
            addCriterion("modename <=", value, "modename");
            return (Criteria) this;
        }

        public Criteria andModenameLike(String value) {
            addCriterion("modename like", value, "modename");
            return (Criteria) this;
        }

        public Criteria andModenameNotLike(String value) {
            addCriterion("modename not like", value, "modename");
            return (Criteria) this;
        }

        public Criteria andModenameIn(List<String> values) {
            addCriterion("modename in", values, "modename");
            return (Criteria) this;
        }

        public Criteria andModenameNotIn(List<String> values) {
            addCriterion("modename not in", values, "modename");
            return (Criteria) this;
        }

        public Criteria andModenameBetween(String value1, String value2) {
            addCriterion("modename between", value1, value2, "modename");
            return (Criteria) this;
        }

        public Criteria andModenameNotBetween(String value1, String value2) {
            addCriterion("modename not between", value1, value2, "modename");
            return (Criteria) this;
        }

        public Criteria andModeidIsNull() {
            addCriterion("modeid is null");
            return (Criteria) this;
        }

        public Criteria andModeidIsNotNull() {
            addCriterion("modeid is not null");
            return (Criteria) this;
        }

        public Criteria andModeidEqualTo(Short value) {
            addCriterion("modeid =", value, "modeid");
            return (Criteria) this;
        }

        public Criteria andModeidNotEqualTo(Short value) {
            addCriterion("modeid <>", value, "modeid");
            return (Criteria) this;
        }

        public Criteria andModeidGreaterThan(Short value) {
            addCriterion("modeid >", value, "modeid");
            return (Criteria) this;
        }

        public Criteria andModeidGreaterThanOrEqualTo(Short value) {
            addCriterion("modeid >=", value, "modeid");
            return (Criteria) this;
        }

        public Criteria andModeidLessThan(Short value) {
            addCriterion("modeid <", value, "modeid");
            return (Criteria) this;
        }

        public Criteria andModeidLessThanOrEqualTo(Short value) {
            addCriterion("modeid <=", value, "modeid");
            return (Criteria) this;
        }

        public Criteria andModeidIn(List<Short> values) {
            addCriterion("modeid in", values, "modeid");
            return (Criteria) this;
        }

        public Criteria andModeidNotIn(List<Short> values) {
            addCriterion("modeid not in", values, "modeid");
            return (Criteria) this;
        }

        public Criteria andModeidBetween(Short value1, Short value2) {
            addCriterion("modeid between", value1, value2, "modeid");
            return (Criteria) this;
        }

        public Criteria andModeidNotBetween(Short value1, Short value2) {
            addCriterion("modeid not between", value1, value2, "modeid");
            return (Criteria) this;
        }

        public Criteria andTonumIsNull() {
            addCriterion("tonum is null");
            return (Criteria) this;
        }

        public Criteria andTonumIsNotNull() {
            addCriterion("tonum is not null");
            return (Criteria) this;
        }

        public Criteria andTonumEqualTo(String value) {
            addCriterion("tonum =", value, "tonum");
            return (Criteria) this;
        }

        public Criteria andTonumNotEqualTo(String value) {
            addCriterion("tonum <>", value, "tonum");
            return (Criteria) this;
        }

        public Criteria andTonumGreaterThan(String value) {
            addCriterion("tonum >", value, "tonum");
            return (Criteria) this;
        }

        public Criteria andTonumGreaterThanOrEqualTo(String value) {
            addCriterion("tonum >=", value, "tonum");
            return (Criteria) this;
        }

        public Criteria andTonumLessThan(String value) {
            addCriterion("tonum <", value, "tonum");
            return (Criteria) this;
        }

        public Criteria andTonumLessThanOrEqualTo(String value) {
            addCriterion("tonum <=", value, "tonum");
            return (Criteria) this;
        }

        public Criteria andTonumLike(String value) {
            addCriterion("tonum like", value, "tonum");
            return (Criteria) this;
        }

        public Criteria andTonumNotLike(String value) {
            addCriterion("tonum not like", value, "tonum");
            return (Criteria) this;
        }

        public Criteria andTonumIn(List<String> values) {
            addCriterion("tonum in", values, "tonum");
            return (Criteria) this;
        }

        public Criteria andTonumNotIn(List<String> values) {
            addCriterion("tonum not in", values, "tonum");
            return (Criteria) this;
        }

        public Criteria andTonumBetween(String value1, String value2) {
            addCriterion("tonum between", value1, value2, "tonum");
            return (Criteria) this;
        }

        public Criteria andTonumNotBetween(String value1, String value2) {
            addCriterion("tonum not between", value1, value2, "tonum");
            return (Criteria) this;
        }

        public Criteria andComidIsNull() {
            addCriterion("comid is null");
            return (Criteria) this;
        }

        public Criteria andComidIsNotNull() {
            addCriterion("comid is not null");
            return (Criteria) this;
        }

        public Criteria andComidEqualTo(Short value) {
            addCriterion("comid =", value, "comid");
            return (Criteria) this;
        }

        public Criteria andComidNotEqualTo(Short value) {
            addCriterion("comid <>", value, "comid");
            return (Criteria) this;
        }

        public Criteria andComidGreaterThan(Short value) {
            addCriterion("comid >", value, "comid");
            return (Criteria) this;
        }

        public Criteria andComidGreaterThanOrEqualTo(Short value) {
            addCriterion("comid >=", value, "comid");
            return (Criteria) this;
        }

        public Criteria andComidLessThan(Short value) {
            addCriterion("comid <", value, "comid");
            return (Criteria) this;
        }

        public Criteria andComidLessThanOrEqualTo(Short value) {
            addCriterion("comid <=", value, "comid");
            return (Criteria) this;
        }

        public Criteria andComidIn(List<Short> values) {
            addCriterion("comid in", values, "comid");
            return (Criteria) this;
        }

        public Criteria andComidNotIn(List<Short> values) {
            addCriterion("comid not in", values, "comid");
            return (Criteria) this;
        }

        public Criteria andComidBetween(Short value1, Short value2) {
            addCriterion("comid between", value1, value2, "comid");
            return (Criteria) this;
        }

        public Criteria andComidNotBetween(Short value1, Short value2) {
            addCriterion("comid not between", value1, value2, "comid");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table fourfly_tovoid
     *
     * @mbg.generated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table fourfly_tovoid
     *
     * @mbg.generated
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