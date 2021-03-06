package com.org.fourfly.model;

import java.util.ArrayList;
import java.util.List;

public class FourflyFlowCnameExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table fourfly_flow_cname
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table fourfly_flow_cname
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table fourfly_flow_cname
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_flow_cname
     *
     * @mbg.generated
     */
    public FourflyFlowCnameExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_flow_cname
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_flow_cname
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_flow_cname
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_flow_cname
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_flow_cname
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_flow_cname
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_flow_cname
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
     * This method corresponds to the database table fourfly_flow_cname
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
     * This method corresponds to the database table fourfly_flow_cname
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_flow_cname
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
     * This class corresponds to the database table fourfly_flow_cname
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

        public Criteria andNumIsNull() {
            addCriterion("num is null");
            return (Criteria) this;
        }

        public Criteria andNumIsNotNull() {
            addCriterion("num is not null");
            return (Criteria) this;
        }

        public Criteria andNumEqualTo(String value) {
            addCriterion("num =", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotEqualTo(String value) {
            addCriterion("num <>", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThan(String value) {
            addCriterion("num >", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThanOrEqualTo(String value) {
            addCriterion("num >=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThan(String value) {
            addCriterion("num <", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThanOrEqualTo(String value) {
            addCriterion("num <=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLike(String value) {
            addCriterion("num like", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotLike(String value) {
            addCriterion("num not like", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumIn(List<String> values) {
            addCriterion("num in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotIn(List<String> values) {
            addCriterion("num not in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumBetween(String value1, String value2) {
            addCriterion("num between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotBetween(String value1, String value2) {
            addCriterion("num not between", value1, value2, "num");
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

        public Criteria andCheckidIsNull() {
            addCriterion("checkid is null");
            return (Criteria) this;
        }

        public Criteria andCheckidIsNotNull() {
            addCriterion("checkid is not null");
            return (Criteria) this;
        }

        public Criteria andCheckidEqualTo(String value) {
            addCriterion("checkid =", value, "checkid");
            return (Criteria) this;
        }

        public Criteria andCheckidNotEqualTo(String value) {
            addCriterion("checkid <>", value, "checkid");
            return (Criteria) this;
        }

        public Criteria andCheckidGreaterThan(String value) {
            addCriterion("checkid >", value, "checkid");
            return (Criteria) this;
        }

        public Criteria andCheckidGreaterThanOrEqualTo(String value) {
            addCriterion("checkid >=", value, "checkid");
            return (Criteria) this;
        }

        public Criteria andCheckidLessThan(String value) {
            addCriterion("checkid <", value, "checkid");
            return (Criteria) this;
        }

        public Criteria andCheckidLessThanOrEqualTo(String value) {
            addCriterion("checkid <=", value, "checkid");
            return (Criteria) this;
        }

        public Criteria andCheckidLike(String value) {
            addCriterion("checkid like", value, "checkid");
            return (Criteria) this;
        }

        public Criteria andCheckidNotLike(String value) {
            addCriterion("checkid not like", value, "checkid");
            return (Criteria) this;
        }

        public Criteria andCheckidIn(List<String> values) {
            addCriterion("checkid in", values, "checkid");
            return (Criteria) this;
        }

        public Criteria andCheckidNotIn(List<String> values) {
            addCriterion("checkid not in", values, "checkid");
            return (Criteria) this;
        }

        public Criteria andCheckidBetween(String value1, String value2) {
            addCriterion("checkid between", value1, value2, "checkid");
            return (Criteria) this;
        }

        public Criteria andCheckidNotBetween(String value1, String value2) {
            addCriterion("checkid not between", value1, value2, "checkid");
            return (Criteria) this;
        }

        public Criteria andChecknameIsNull() {
            addCriterion("checkname is null");
            return (Criteria) this;
        }

        public Criteria andChecknameIsNotNull() {
            addCriterion("checkname is not null");
            return (Criteria) this;
        }

        public Criteria andChecknameEqualTo(String value) {
            addCriterion("checkname =", value, "checkname");
            return (Criteria) this;
        }

        public Criteria andChecknameNotEqualTo(String value) {
            addCriterion("checkname <>", value, "checkname");
            return (Criteria) this;
        }

        public Criteria andChecknameGreaterThan(String value) {
            addCriterion("checkname >", value, "checkname");
            return (Criteria) this;
        }

        public Criteria andChecknameGreaterThanOrEqualTo(String value) {
            addCriterion("checkname >=", value, "checkname");
            return (Criteria) this;
        }

        public Criteria andChecknameLessThan(String value) {
            addCriterion("checkname <", value, "checkname");
            return (Criteria) this;
        }

        public Criteria andChecknameLessThanOrEqualTo(String value) {
            addCriterion("checkname <=", value, "checkname");
            return (Criteria) this;
        }

        public Criteria andChecknameLike(String value) {
            addCriterion("checkname like", value, "checkname");
            return (Criteria) this;
        }

        public Criteria andChecknameNotLike(String value) {
            addCriterion("checkname not like", value, "checkname");
            return (Criteria) this;
        }

        public Criteria andChecknameIn(List<String> values) {
            addCriterion("checkname in", values, "checkname");
            return (Criteria) this;
        }

        public Criteria andChecknameNotIn(List<String> values) {
            addCriterion("checkname not in", values, "checkname");
            return (Criteria) this;
        }

        public Criteria andChecknameBetween(String value1, String value2) {
            addCriterion("checkname between", value1, value2, "checkname");
            return (Criteria) this;
        }

        public Criteria andChecknameNotBetween(String value1, String value2) {
            addCriterion("checkname not between", value1, value2, "checkname");
            return (Criteria) this;
        }

        public Criteria andPidIsNull() {
            addCriterion("pid is null");
            return (Criteria) this;
        }

        public Criteria andPidIsNotNull() {
            addCriterion("pid is not null");
            return (Criteria) this;
        }

        public Criteria andPidEqualTo(Integer value) {
            addCriterion("pid =", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotEqualTo(Integer value) {
            addCriterion("pid <>", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThan(Integer value) {
            addCriterion("pid >", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThanOrEqualTo(Integer value) {
            addCriterion("pid >=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThan(Integer value) {
            addCriterion("pid <", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThanOrEqualTo(Integer value) {
            addCriterion("pid <=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidIn(List<Integer> values) {
            addCriterion("pid in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotIn(List<Integer> values) {
            addCriterion("pid not in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidBetween(Integer value1, Integer value2) {
            addCriterion("pid between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotBetween(Integer value1, Integer value2) {
            addCriterion("pid not between", value1, value2, "pid");
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
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table fourfly_flow_cname
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
     * This class corresponds to the database table fourfly_flow_cname
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