package com.org.fourfly.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class FourflyKqdistExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table fourfly_kqdist
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table fourfly_kqdist
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table fourfly_kqdist
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_kqdist
     *
     * @mbg.generated
     */
    public FourflyKqdistExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_kqdist
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_kqdist
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_kqdist
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_kqdist
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_kqdist
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_kqdist
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_kqdist
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
     * This method corresponds to the database table fourfly_kqdist
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
     * This method corresponds to the database table fourfly_kqdist
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_kqdist
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
     * This class corresponds to the database table fourfly_kqdist
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

        public Criteria andRecenameIsNull() {
            addCriterion("recename is null");
            return (Criteria) this;
        }

        public Criteria andRecenameIsNotNull() {
            addCriterion("recename is not null");
            return (Criteria) this;
        }

        public Criteria andRecenameEqualTo(String value) {
            addCriterion("recename =", value, "recename");
            return (Criteria) this;
        }

        public Criteria andRecenameNotEqualTo(String value) {
            addCriterion("recename <>", value, "recename");
            return (Criteria) this;
        }

        public Criteria andRecenameGreaterThan(String value) {
            addCriterion("recename >", value, "recename");
            return (Criteria) this;
        }

        public Criteria andRecenameGreaterThanOrEqualTo(String value) {
            addCriterion("recename >=", value, "recename");
            return (Criteria) this;
        }

        public Criteria andRecenameLessThan(String value) {
            addCriterion("recename <", value, "recename");
            return (Criteria) this;
        }

        public Criteria andRecenameLessThanOrEqualTo(String value) {
            addCriterion("recename <=", value, "recename");
            return (Criteria) this;
        }

        public Criteria andRecenameLike(String value) {
            addCriterion("recename like", value, "recename");
            return (Criteria) this;
        }

        public Criteria andRecenameNotLike(String value) {
            addCriterion("recename not like", value, "recename");
            return (Criteria) this;
        }

        public Criteria andRecenameIn(List<String> values) {
            addCriterion("recename in", values, "recename");
            return (Criteria) this;
        }

        public Criteria andRecenameNotIn(List<String> values) {
            addCriterion("recename not in", values, "recename");
            return (Criteria) this;
        }

        public Criteria andRecenameBetween(String value1, String value2) {
            addCriterion("recename between", value1, value2, "recename");
            return (Criteria) this;
        }

        public Criteria andRecenameNotBetween(String value1, String value2) {
            addCriterion("recename not between", value1, value2, "recename");
            return (Criteria) this;
        }

        public Criteria andReceidIsNull() {
            addCriterion("receid is null");
            return (Criteria) this;
        }

        public Criteria andReceidIsNotNull() {
            addCriterion("receid is not null");
            return (Criteria) this;
        }

        public Criteria andReceidEqualTo(String value) {
            addCriterion("receid =", value, "receid");
            return (Criteria) this;
        }

        public Criteria andReceidNotEqualTo(String value) {
            addCriterion("receid <>", value, "receid");
            return (Criteria) this;
        }

        public Criteria andReceidGreaterThan(String value) {
            addCriterion("receid >", value, "receid");
            return (Criteria) this;
        }

        public Criteria andReceidGreaterThanOrEqualTo(String value) {
            addCriterion("receid >=", value, "receid");
            return (Criteria) this;
        }

        public Criteria andReceidLessThan(String value) {
            addCriterion("receid <", value, "receid");
            return (Criteria) this;
        }

        public Criteria andReceidLessThanOrEqualTo(String value) {
            addCriterion("receid <=", value, "receid");
            return (Criteria) this;
        }

        public Criteria andReceidLike(String value) {
            addCriterion("receid like", value, "receid");
            return (Criteria) this;
        }

        public Criteria andReceidNotLike(String value) {
            addCriterion("receid not like", value, "receid");
            return (Criteria) this;
        }

        public Criteria andReceidIn(List<String> values) {
            addCriterion("receid in", values, "receid");
            return (Criteria) this;
        }

        public Criteria andReceidNotIn(List<String> values) {
            addCriterion("receid not in", values, "receid");
            return (Criteria) this;
        }

        public Criteria andReceidBetween(String value1, String value2) {
            addCriterion("receid between", value1, value2, "receid");
            return (Criteria) this;
        }

        public Criteria andReceidNotBetween(String value1, String value2) {
            addCriterion("receid not between", value1, value2, "receid");
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

        public Criteria andStartdtIsNull() {
            addCriterion("startdt is null");
            return (Criteria) this;
        }

        public Criteria andStartdtIsNotNull() {
            addCriterion("startdt is not null");
            return (Criteria) this;
        }

        public Criteria andStartdtEqualTo(Date value) {
            addCriterionForJDBCDate("startdt =", value, "startdt");
            return (Criteria) this;
        }

        public Criteria andStartdtNotEqualTo(Date value) {
            addCriterionForJDBCDate("startdt <>", value, "startdt");
            return (Criteria) this;
        }

        public Criteria andStartdtGreaterThan(Date value) {
            addCriterionForJDBCDate("startdt >", value, "startdt");
            return (Criteria) this;
        }

        public Criteria andStartdtGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("startdt >=", value, "startdt");
            return (Criteria) this;
        }

        public Criteria andStartdtLessThan(Date value) {
            addCriterionForJDBCDate("startdt <", value, "startdt");
            return (Criteria) this;
        }

        public Criteria andStartdtLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("startdt <=", value, "startdt");
            return (Criteria) this;
        }

        public Criteria andStartdtIn(List<Date> values) {
            addCriterionForJDBCDate("startdt in", values, "startdt");
            return (Criteria) this;
        }

        public Criteria andStartdtNotIn(List<Date> values) {
            addCriterionForJDBCDate("startdt not in", values, "startdt");
            return (Criteria) this;
        }

        public Criteria andStartdtBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("startdt between", value1, value2, "startdt");
            return (Criteria) this;
        }

        public Criteria andStartdtNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("startdt not between", value1, value2, "startdt");
            return (Criteria) this;
        }

        public Criteria andEnddtIsNull() {
            addCriterion("enddt is null");
            return (Criteria) this;
        }

        public Criteria andEnddtIsNotNull() {
            addCriterion("enddt is not null");
            return (Criteria) this;
        }

        public Criteria andEnddtEqualTo(Date value) {
            addCriterionForJDBCDate("enddt =", value, "enddt");
            return (Criteria) this;
        }

        public Criteria andEnddtNotEqualTo(Date value) {
            addCriterionForJDBCDate("enddt <>", value, "enddt");
            return (Criteria) this;
        }

        public Criteria andEnddtGreaterThan(Date value) {
            addCriterionForJDBCDate("enddt >", value, "enddt");
            return (Criteria) this;
        }

        public Criteria andEnddtGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("enddt >=", value, "enddt");
            return (Criteria) this;
        }

        public Criteria andEnddtLessThan(Date value) {
            addCriterionForJDBCDate("enddt <", value, "enddt");
            return (Criteria) this;
        }

        public Criteria andEnddtLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("enddt <=", value, "enddt");
            return (Criteria) this;
        }

        public Criteria andEnddtIn(List<Date> values) {
            addCriterionForJDBCDate("enddt in", values, "enddt");
            return (Criteria) this;
        }

        public Criteria andEnddtNotIn(List<Date> values) {
            addCriterionForJDBCDate("enddt not in", values, "enddt");
            return (Criteria) this;
        }

        public Criteria andEnddtBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("enddt between", value1, value2, "enddt");
            return (Criteria) this;
        }

        public Criteria andEnddtNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("enddt not between", value1, value2, "enddt");
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

        public Criteria andSortIsNull() {
            addCriterion("sort is null");
            return (Criteria) this;
        }

        public Criteria andSortIsNotNull() {
            addCriterion("sort is not null");
            return (Criteria) this;
        }

        public Criteria andSortEqualTo(Integer value) {
            addCriterion("sort =", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotEqualTo(Integer value) {
            addCriterion("sort <>", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThan(Integer value) {
            addCriterion("sort >", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("sort >=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThan(Integer value) {
            addCriterion("sort <", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThanOrEqualTo(Integer value) {
            addCriterion("sort <=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortIn(List<Integer> values) {
            addCriterion("sort in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotIn(List<Integer> values) {
            addCriterion("sort not in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortBetween(Integer value1, Integer value2) {
            addCriterion("sort between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotBetween(Integer value1, Integer value2) {
            addCriterion("sort not between", value1, value2, "sort");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table fourfly_kqdist
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
     * This class corresponds to the database table fourfly_kqdist
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