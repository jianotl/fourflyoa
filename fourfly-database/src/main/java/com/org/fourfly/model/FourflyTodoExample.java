package com.org.fourfly.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FourflyTodoExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table fourfly_todo
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table fourfly_todo
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table fourfly_todo
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_todo
     *
     * @mbg.generated
     */
    public FourflyTodoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_todo
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_todo
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_todo
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_todo
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_todo
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_todo
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_todo
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
     * This method corresponds to the database table fourfly_todo
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
     * This method corresponds to the database table fourfly_todo
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_todo
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
     * This class corresponds to the database table fourfly_todo
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

        public Criteria andMessIsNull() {
            addCriterion("mess is null");
            return (Criteria) this;
        }

        public Criteria andMessIsNotNull() {
            addCriterion("mess is not null");
            return (Criteria) this;
        }

        public Criteria andMessEqualTo(String value) {
            addCriterion("mess =", value, "mess");
            return (Criteria) this;
        }

        public Criteria andMessNotEqualTo(String value) {
            addCriterion("mess <>", value, "mess");
            return (Criteria) this;
        }

        public Criteria andMessGreaterThan(String value) {
            addCriterion("mess >", value, "mess");
            return (Criteria) this;
        }

        public Criteria andMessGreaterThanOrEqualTo(String value) {
            addCriterion("mess >=", value, "mess");
            return (Criteria) this;
        }

        public Criteria andMessLessThan(String value) {
            addCriterion("mess <", value, "mess");
            return (Criteria) this;
        }

        public Criteria andMessLessThanOrEqualTo(String value) {
            addCriterion("mess <=", value, "mess");
            return (Criteria) this;
        }

        public Criteria andMessLike(String value) {
            addCriterion("mess like", value, "mess");
            return (Criteria) this;
        }

        public Criteria andMessNotLike(String value) {
            addCriterion("mess not like", value, "mess");
            return (Criteria) this;
        }

        public Criteria andMessIn(List<String> values) {
            addCriterion("mess in", values, "mess");
            return (Criteria) this;
        }

        public Criteria andMessNotIn(List<String> values) {
            addCriterion("mess not in", values, "mess");
            return (Criteria) this;
        }

        public Criteria andMessBetween(String value1, String value2) {
            addCriterion("mess between", value1, value2, "mess");
            return (Criteria) this;
        }

        public Criteria andMessNotBetween(String value1, String value2) {
            addCriterion("mess not between", value1, value2, "mess");
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

        public Criteria andTableIsNull() {
            addCriterion("table is null");
            return (Criteria) this;
        }

        public Criteria andTableIsNotNull() {
            addCriterion("table is not null");
            return (Criteria) this;
        }

        public Criteria andTableEqualTo(String value) {
            addCriterion("table =", value, "table");
            return (Criteria) this;
        }

        public Criteria andTableNotEqualTo(String value) {
            addCriterion("table <>", value, "table");
            return (Criteria) this;
        }

        public Criteria andTableGreaterThan(String value) {
            addCriterion("table >", value, "table");
            return (Criteria) this;
        }

        public Criteria andTableGreaterThanOrEqualTo(String value) {
            addCriterion("table >=", value, "table");
            return (Criteria) this;
        }

        public Criteria andTableLessThan(String value) {
            addCriterion("table <", value, "table");
            return (Criteria) this;
        }

        public Criteria andTableLessThanOrEqualTo(String value) {
            addCriterion("table <=", value, "table");
            return (Criteria) this;
        }

        public Criteria andTableLike(String value) {
            addCriterion("table like", value, "table");
            return (Criteria) this;
        }

        public Criteria andTableNotLike(String value) {
            addCriterion("table not like", value, "table");
            return (Criteria) this;
        }

        public Criteria andTableIn(List<String> values) {
            addCriterion("table in", values, "table");
            return (Criteria) this;
        }

        public Criteria andTableNotIn(List<String> values) {
            addCriterion("table not in", values, "table");
            return (Criteria) this;
        }

        public Criteria andTableBetween(String value1, String value2) {
            addCriterion("table between", value1, value2, "table");
            return (Criteria) this;
        }

        public Criteria andTableNotBetween(String value1, String value2) {
            addCriterion("table not between", value1, value2, "table");
            return (Criteria) this;
        }

        public Criteria andMidIsNull() {
            addCriterion("mid is null");
            return (Criteria) this;
        }

        public Criteria andMidIsNotNull() {
            addCriterion("mid is not null");
            return (Criteria) this;
        }

        public Criteria andMidEqualTo(Integer value) {
            addCriterion("mid =", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotEqualTo(Integer value) {
            addCriterion("mid <>", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidGreaterThan(Integer value) {
            addCriterion("mid >", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidGreaterThanOrEqualTo(Integer value) {
            addCriterion("mid >=", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidLessThan(Integer value) {
            addCriterion("mid <", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidLessThanOrEqualTo(Integer value) {
            addCriterion("mid <=", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidIn(List<Integer> values) {
            addCriterion("mid in", values, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotIn(List<Integer> values) {
            addCriterion("mid not in", values, "mid");
            return (Criteria) this;
        }

        public Criteria andMidBetween(Integer value1, Integer value2) {
            addCriterion("mid between", value1, value2, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotBetween(Integer value1, Integer value2) {
            addCriterion("mid not between", value1, value2, "mid");
            return (Criteria) this;
        }

        public Criteria andReaddtIsNull() {
            addCriterion("readdt is null");
            return (Criteria) this;
        }

        public Criteria andReaddtIsNotNull() {
            addCriterion("readdt is not null");
            return (Criteria) this;
        }

        public Criteria andReaddtEqualTo(Date value) {
            addCriterion("readdt =", value, "readdt");
            return (Criteria) this;
        }

        public Criteria andReaddtNotEqualTo(Date value) {
            addCriterion("readdt <>", value, "readdt");
            return (Criteria) this;
        }

        public Criteria andReaddtGreaterThan(Date value) {
            addCriterion("readdt >", value, "readdt");
            return (Criteria) this;
        }

        public Criteria andReaddtGreaterThanOrEqualTo(Date value) {
            addCriterion("readdt >=", value, "readdt");
            return (Criteria) this;
        }

        public Criteria andReaddtLessThan(Date value) {
            addCriterion("readdt <", value, "readdt");
            return (Criteria) this;
        }

        public Criteria andReaddtLessThanOrEqualTo(Date value) {
            addCriterion("readdt <=", value, "readdt");
            return (Criteria) this;
        }

        public Criteria andReaddtIn(List<Date> values) {
            addCriterion("readdt in", values, "readdt");
            return (Criteria) this;
        }

        public Criteria andReaddtNotIn(List<Date> values) {
            addCriterion("readdt not in", values, "readdt");
            return (Criteria) this;
        }

        public Criteria andReaddtBetween(Date value1, Date value2) {
            addCriterion("readdt between", value1, value2, "readdt");
            return (Criteria) this;
        }

        public Criteria andReaddtNotBetween(Date value1, Date value2) {
            addCriterion("readdt not between", value1, value2, "readdt");
            return (Criteria) this;
        }

        public Criteria andTododtIsNull() {
            addCriterion("tododt is null");
            return (Criteria) this;
        }

        public Criteria andTododtIsNotNull() {
            addCriterion("tododt is not null");
            return (Criteria) this;
        }

        public Criteria andTododtEqualTo(Date value) {
            addCriterion("tododt =", value, "tododt");
            return (Criteria) this;
        }

        public Criteria andTododtNotEqualTo(Date value) {
            addCriterion("tododt <>", value, "tododt");
            return (Criteria) this;
        }

        public Criteria andTododtGreaterThan(Date value) {
            addCriterion("tododt >", value, "tododt");
            return (Criteria) this;
        }

        public Criteria andTododtGreaterThanOrEqualTo(Date value) {
            addCriterion("tododt >=", value, "tododt");
            return (Criteria) this;
        }

        public Criteria andTododtLessThan(Date value) {
            addCriterion("tododt <", value, "tododt");
            return (Criteria) this;
        }

        public Criteria andTododtLessThanOrEqualTo(Date value) {
            addCriterion("tododt <=", value, "tododt");
            return (Criteria) this;
        }

        public Criteria andTododtIn(List<Date> values) {
            addCriterion("tododt in", values, "tododt");
            return (Criteria) this;
        }

        public Criteria andTododtNotIn(List<Date> values) {
            addCriterion("tododt not in", values, "tododt");
            return (Criteria) this;
        }

        public Criteria andTododtBetween(Date value1, Date value2) {
            addCriterion("tododt between", value1, value2, "tododt");
            return (Criteria) this;
        }

        public Criteria andTododtNotBetween(Date value1, Date value2) {
            addCriterion("tododt not between", value1, value2, "tododt");
            return (Criteria) this;
        }

        public Criteria andModenumIsNull() {
            addCriterion("modenum is null");
            return (Criteria) this;
        }

        public Criteria andModenumIsNotNull() {
            addCriterion("modenum is not null");
            return (Criteria) this;
        }

        public Criteria andModenumEqualTo(String value) {
            addCriterion("modenum =", value, "modenum");
            return (Criteria) this;
        }

        public Criteria andModenumNotEqualTo(String value) {
            addCriterion("modenum <>", value, "modenum");
            return (Criteria) this;
        }

        public Criteria andModenumGreaterThan(String value) {
            addCriterion("modenum >", value, "modenum");
            return (Criteria) this;
        }

        public Criteria andModenumGreaterThanOrEqualTo(String value) {
            addCriterion("modenum >=", value, "modenum");
            return (Criteria) this;
        }

        public Criteria andModenumLessThan(String value) {
            addCriterion("modenum <", value, "modenum");
            return (Criteria) this;
        }

        public Criteria andModenumLessThanOrEqualTo(String value) {
            addCriterion("modenum <=", value, "modenum");
            return (Criteria) this;
        }

        public Criteria andModenumLike(String value) {
            addCriterion("modenum like", value, "modenum");
            return (Criteria) this;
        }

        public Criteria andModenumNotLike(String value) {
            addCriterion("modenum not like", value, "modenum");
            return (Criteria) this;
        }

        public Criteria andModenumIn(List<String> values) {
            addCriterion("modenum in", values, "modenum");
            return (Criteria) this;
        }

        public Criteria andModenumNotIn(List<String> values) {
            addCriterion("modenum not in", values, "modenum");
            return (Criteria) this;
        }

        public Criteria andModenumBetween(String value1, String value2) {
            addCriterion("modenum between", value1, value2, "modenum");
            return (Criteria) this;
        }

        public Criteria andModenumNotBetween(String value1, String value2) {
            addCriterion("modenum not between", value1, value2, "modenum");
            return (Criteria) this;
        }

        public Criteria andUrlIsNull() {
            addCriterion("url is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("url is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("url =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("url <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("url >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("url >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("url <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("url <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("url like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("url not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("url in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("url not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("url between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("url not between", value1, value2, "url");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table fourfly_todo
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
     * This class corresponds to the database table fourfly_todo
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