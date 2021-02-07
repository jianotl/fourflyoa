package com.org.fourfly.model;

import java.util.ArrayList;
import java.util.List;

public class FourflyHrsalarsExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table fourfly_hrsalars
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table fourfly_hrsalars
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table fourfly_hrsalars
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_hrsalars
     *
     * @mbg.generated
     */
    public FourflyHrsalarsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_hrsalars
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_hrsalars
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_hrsalars
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_hrsalars
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_hrsalars
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_hrsalars
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_hrsalars
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
     * This method corresponds to the database table fourfly_hrsalars
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
     * This method corresponds to the database table fourfly_hrsalars
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_hrsalars
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
     * This class corresponds to the database table fourfly_hrsalars
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

        public Criteria andMidIsNull() {
            addCriterion("mid is null");
            return (Criteria) this;
        }

        public Criteria andMidIsNotNull() {
            addCriterion("mid is not null");
            return (Criteria) this;
        }

        public Criteria andMidEqualTo(Short value) {
            addCriterion("mid =", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotEqualTo(Short value) {
            addCriterion("mid <>", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidGreaterThan(Short value) {
            addCriterion("mid >", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidGreaterThanOrEqualTo(Short value) {
            addCriterion("mid >=", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidLessThan(Short value) {
            addCriterion("mid <", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidLessThanOrEqualTo(Short value) {
            addCriterion("mid <=", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidIn(List<Short> values) {
            addCriterion("mid in", values, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotIn(List<Short> values) {
            addCriterion("mid not in", values, "mid");
            return (Criteria) this;
        }

        public Criteria andMidBetween(Short value1, Short value2) {
            addCriterion("mid between", value1, value2, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotBetween(Short value1, Short value2) {
            addCriterion("mid not between", value1, value2, "mid");
            return (Criteria) this;
        }

        public Criteria andSortIsNull() {
            addCriterion("sort is null");
            return (Criteria) this;
        }

        public Criteria andSortIsNotNull() {
            addCriterion("sort is not null");
            return (Criteria) this;
        }

        public Criteria andSortEqualTo(Short value) {
            addCriterion("sort =", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotEqualTo(Short value) {
            addCriterion("sort <>", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThan(Short value) {
            addCriterion("sort >", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThanOrEqualTo(Short value) {
            addCriterion("sort >=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThan(Short value) {
            addCriterion("sort <", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThanOrEqualTo(Short value) {
            addCriterion("sort <=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortIn(List<Short> values) {
            addCriterion("sort in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotIn(List<Short> values) {
            addCriterion("sort not in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortBetween(Short value1, Short value2) {
            addCriterion("sort between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotBetween(Short value1, Short value2) {
            addCriterion("sort not between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andFieldsIsNull() {
            addCriterion("fields is null");
            return (Criteria) this;
        }

        public Criteria andFieldsIsNotNull() {
            addCriterion("fields is not null");
            return (Criteria) this;
        }

        public Criteria andFieldsEqualTo(String value) {
            addCriterion("fields =", value, "fields");
            return (Criteria) this;
        }

        public Criteria andFieldsNotEqualTo(String value) {
            addCriterion("fields <>", value, "fields");
            return (Criteria) this;
        }

        public Criteria andFieldsGreaterThan(String value) {
            addCriterion("fields >", value, "fields");
            return (Criteria) this;
        }

        public Criteria andFieldsGreaterThanOrEqualTo(String value) {
            addCriterion("fields >=", value, "fields");
            return (Criteria) this;
        }

        public Criteria andFieldsLessThan(String value) {
            addCriterion("fields <", value, "fields");
            return (Criteria) this;
        }

        public Criteria andFieldsLessThanOrEqualTo(String value) {
            addCriterion("fields <=", value, "fields");
            return (Criteria) this;
        }

        public Criteria andFieldsLike(String value) {
            addCriterion("fields like", value, "fields");
            return (Criteria) this;
        }

        public Criteria andFieldsNotLike(String value) {
            addCriterion("fields not like", value, "fields");
            return (Criteria) this;
        }

        public Criteria andFieldsIn(List<String> values) {
            addCriterion("fields in", values, "fields");
            return (Criteria) this;
        }

        public Criteria andFieldsNotIn(List<String> values) {
            addCriterion("fields not in", values, "fields");
            return (Criteria) this;
        }

        public Criteria andFieldsBetween(String value1, String value2) {
            addCriterion("fields between", value1, value2, "fields");
            return (Criteria) this;
        }

        public Criteria andFieldsNotBetween(String value1, String value2) {
            addCriterion("fields not between", value1, value2, "fields");
            return (Criteria) this;
        }

        public Criteria andGongsiIsNull() {
            addCriterion("gongsi is null");
            return (Criteria) this;
        }

        public Criteria andGongsiIsNotNull() {
            addCriterion("gongsi is not null");
            return (Criteria) this;
        }

        public Criteria andGongsiEqualTo(String value) {
            addCriterion("gongsi =", value, "gongsi");
            return (Criteria) this;
        }

        public Criteria andGongsiNotEqualTo(String value) {
            addCriterion("gongsi <>", value, "gongsi");
            return (Criteria) this;
        }

        public Criteria andGongsiGreaterThan(String value) {
            addCriterion("gongsi >", value, "gongsi");
            return (Criteria) this;
        }

        public Criteria andGongsiGreaterThanOrEqualTo(String value) {
            addCriterion("gongsi >=", value, "gongsi");
            return (Criteria) this;
        }

        public Criteria andGongsiLessThan(String value) {
            addCriterion("gongsi <", value, "gongsi");
            return (Criteria) this;
        }

        public Criteria andGongsiLessThanOrEqualTo(String value) {
            addCriterion("gongsi <=", value, "gongsi");
            return (Criteria) this;
        }

        public Criteria andGongsiLike(String value) {
            addCriterion("gongsi like", value, "gongsi");
            return (Criteria) this;
        }

        public Criteria andGongsiNotLike(String value) {
            addCriterion("gongsi not like", value, "gongsi");
            return (Criteria) this;
        }

        public Criteria andGongsiIn(List<String> values) {
            addCriterion("gongsi in", values, "gongsi");
            return (Criteria) this;
        }

        public Criteria andGongsiNotIn(List<String> values) {
            addCriterion("gongsi not in", values, "gongsi");
            return (Criteria) this;
        }

        public Criteria andGongsiBetween(String value1, String value2) {
            addCriterion("gongsi between", value1, value2, "gongsi");
            return (Criteria) this;
        }

        public Criteria andGongsiNotBetween(String value1, String value2) {
            addCriterion("gongsi not between", value1, value2, "gongsi");
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

        public Criteria andBeizhuIsNull() {
            addCriterion("beizhu is null");
            return (Criteria) this;
        }

        public Criteria andBeizhuIsNotNull() {
            addCriterion("beizhu is not null");
            return (Criteria) this;
        }

        public Criteria andBeizhuEqualTo(String value) {
            addCriterion("beizhu =", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuNotEqualTo(String value) {
            addCriterion("beizhu <>", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuGreaterThan(String value) {
            addCriterion("beizhu >", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuGreaterThanOrEqualTo(String value) {
            addCriterion("beizhu >=", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuLessThan(String value) {
            addCriterion("beizhu <", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuLessThanOrEqualTo(String value) {
            addCriterion("beizhu <=", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuLike(String value) {
            addCriterion("beizhu like", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuNotLike(String value) {
            addCriterion("beizhu not like", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuIn(List<String> values) {
            addCriterion("beizhu in", values, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuNotIn(List<String> values) {
            addCriterion("beizhu not in", values, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuBetween(String value1, String value2) {
            addCriterion("beizhu between", value1, value2, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuNotBetween(String value1, String value2) {
            addCriterion("beizhu not between", value1, value2, "beizhu");
            return (Criteria) this;
        }

        public Criteria andDevzhiIsNull() {
            addCriterion("devzhi is null");
            return (Criteria) this;
        }

        public Criteria andDevzhiIsNotNull() {
            addCriterion("devzhi is not null");
            return (Criteria) this;
        }

        public Criteria andDevzhiEqualTo(String value) {
            addCriterion("devzhi =", value, "devzhi");
            return (Criteria) this;
        }

        public Criteria andDevzhiNotEqualTo(String value) {
            addCriterion("devzhi <>", value, "devzhi");
            return (Criteria) this;
        }

        public Criteria andDevzhiGreaterThan(String value) {
            addCriterion("devzhi >", value, "devzhi");
            return (Criteria) this;
        }

        public Criteria andDevzhiGreaterThanOrEqualTo(String value) {
            addCriterion("devzhi >=", value, "devzhi");
            return (Criteria) this;
        }

        public Criteria andDevzhiLessThan(String value) {
            addCriterion("devzhi <", value, "devzhi");
            return (Criteria) this;
        }

        public Criteria andDevzhiLessThanOrEqualTo(String value) {
            addCriterion("devzhi <=", value, "devzhi");
            return (Criteria) this;
        }

        public Criteria andDevzhiLike(String value) {
            addCriterion("devzhi like", value, "devzhi");
            return (Criteria) this;
        }

        public Criteria andDevzhiNotLike(String value) {
            addCriterion("devzhi not like", value, "devzhi");
            return (Criteria) this;
        }

        public Criteria andDevzhiIn(List<String> values) {
            addCriterion("devzhi in", values, "devzhi");
            return (Criteria) this;
        }

        public Criteria andDevzhiNotIn(List<String> values) {
            addCriterion("devzhi not in", values, "devzhi");
            return (Criteria) this;
        }

        public Criteria andDevzhiBetween(String value1, String value2) {
            addCriterion("devzhi between", value1, value2, "devzhi");
            return (Criteria) this;
        }

        public Criteria andDevzhiNotBetween(String value1, String value2) {
            addCriterion("devzhi not between", value1, value2, "devzhi");
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
     * This class corresponds to the database table fourfly_hrsalars
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
     * This class corresponds to the database table fourfly_hrsalars
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