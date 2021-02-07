package com.org.fourfly.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FourflyWorcExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table fourfly_worc
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table fourfly_worc
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table fourfly_worc
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_worc
     *
     * @mbg.generated
     */
    public FourflyWorcExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_worc
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_worc
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_worc
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_worc
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_worc
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_worc
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_worc
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
     * This method corresponds to the database table fourfly_worc
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
     * This method corresponds to the database table fourfly_worc
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fourfly_worc
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
     * This class corresponds to the database table fourfly_worc
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

        public Criteria andGuannameIsNull() {
            addCriterion("guanname is null");
            return (Criteria) this;
        }

        public Criteria andGuannameIsNotNull() {
            addCriterion("guanname is not null");
            return (Criteria) this;
        }

        public Criteria andGuannameEqualTo(String value) {
            addCriterion("guanname =", value, "guanname");
            return (Criteria) this;
        }

        public Criteria andGuannameNotEqualTo(String value) {
            addCriterion("guanname <>", value, "guanname");
            return (Criteria) this;
        }

        public Criteria andGuannameGreaterThan(String value) {
            addCriterion("guanname >", value, "guanname");
            return (Criteria) this;
        }

        public Criteria andGuannameGreaterThanOrEqualTo(String value) {
            addCriterion("guanname >=", value, "guanname");
            return (Criteria) this;
        }

        public Criteria andGuannameLessThan(String value) {
            addCriterion("guanname <", value, "guanname");
            return (Criteria) this;
        }

        public Criteria andGuannameLessThanOrEqualTo(String value) {
            addCriterion("guanname <=", value, "guanname");
            return (Criteria) this;
        }

        public Criteria andGuannameLike(String value) {
            addCriterion("guanname like", value, "guanname");
            return (Criteria) this;
        }

        public Criteria andGuannameNotLike(String value) {
            addCriterion("guanname not like", value, "guanname");
            return (Criteria) this;
        }

        public Criteria andGuannameIn(List<String> values) {
            addCriterion("guanname in", values, "guanname");
            return (Criteria) this;
        }

        public Criteria andGuannameNotIn(List<String> values) {
            addCriterion("guanname not in", values, "guanname");
            return (Criteria) this;
        }

        public Criteria andGuannameBetween(String value1, String value2) {
            addCriterion("guanname between", value1, value2, "guanname");
            return (Criteria) this;
        }

        public Criteria andGuannameNotBetween(String value1, String value2) {
            addCriterion("guanname not between", value1, value2, "guanname");
            return (Criteria) this;
        }

        public Criteria andGuanidIsNull() {
            addCriterion("guanid is null");
            return (Criteria) this;
        }

        public Criteria andGuanidIsNotNull() {
            addCriterion("guanid is not null");
            return (Criteria) this;
        }

        public Criteria andGuanidEqualTo(String value) {
            addCriterion("guanid =", value, "guanid");
            return (Criteria) this;
        }

        public Criteria andGuanidNotEqualTo(String value) {
            addCriterion("guanid <>", value, "guanid");
            return (Criteria) this;
        }

        public Criteria andGuanidGreaterThan(String value) {
            addCriterion("guanid >", value, "guanid");
            return (Criteria) this;
        }

        public Criteria andGuanidGreaterThanOrEqualTo(String value) {
            addCriterion("guanid >=", value, "guanid");
            return (Criteria) this;
        }

        public Criteria andGuanidLessThan(String value) {
            addCriterion("guanid <", value, "guanid");
            return (Criteria) this;
        }

        public Criteria andGuanidLessThanOrEqualTo(String value) {
            addCriterion("guanid <=", value, "guanid");
            return (Criteria) this;
        }

        public Criteria andGuanidLike(String value) {
            addCriterion("guanid like", value, "guanid");
            return (Criteria) this;
        }

        public Criteria andGuanidNotLike(String value) {
            addCriterion("guanid not like", value, "guanid");
            return (Criteria) this;
        }

        public Criteria andGuanidIn(List<String> values) {
            addCriterion("guanid in", values, "guanid");
            return (Criteria) this;
        }

        public Criteria andGuanidNotIn(List<String> values) {
            addCriterion("guanid not in", values, "guanid");
            return (Criteria) this;
        }

        public Criteria andGuanidBetween(String value1, String value2) {
            addCriterion("guanid between", value1, value2, "guanid");
            return (Criteria) this;
        }

        public Criteria andGuanidNotBetween(String value1, String value2) {
            addCriterion("guanid not between", value1, value2, "guanid");
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

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(Integer value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(Integer value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(Integer value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(Integer value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(Integer value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<Integer> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<Integer> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(Integer value1, Integer value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(Integer value1, Integer value2) {
            addCriterion("uid not between", value1, value2, "uid");
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

        public Criteria andUptypeIsNull() {
            addCriterion("uptype is null");
            return (Criteria) this;
        }

        public Criteria andUptypeIsNotNull() {
            addCriterion("uptype is not null");
            return (Criteria) this;
        }

        public Criteria andUptypeEqualTo(String value) {
            addCriterion("uptype =", value, "uptype");
            return (Criteria) this;
        }

        public Criteria andUptypeNotEqualTo(String value) {
            addCriterion("uptype <>", value, "uptype");
            return (Criteria) this;
        }

        public Criteria andUptypeGreaterThan(String value) {
            addCriterion("uptype >", value, "uptype");
            return (Criteria) this;
        }

        public Criteria andUptypeGreaterThanOrEqualTo(String value) {
            addCriterion("uptype >=", value, "uptype");
            return (Criteria) this;
        }

        public Criteria andUptypeLessThan(String value) {
            addCriterion("uptype <", value, "uptype");
            return (Criteria) this;
        }

        public Criteria andUptypeLessThanOrEqualTo(String value) {
            addCriterion("uptype <=", value, "uptype");
            return (Criteria) this;
        }

        public Criteria andUptypeLike(String value) {
            addCriterion("uptype like", value, "uptype");
            return (Criteria) this;
        }

        public Criteria andUptypeNotLike(String value) {
            addCriterion("uptype not like", value, "uptype");
            return (Criteria) this;
        }

        public Criteria andUptypeIn(List<String> values) {
            addCriterion("uptype in", values, "uptype");
            return (Criteria) this;
        }

        public Criteria andUptypeNotIn(List<String> values) {
            addCriterion("uptype not in", values, "uptype");
            return (Criteria) this;
        }

        public Criteria andUptypeBetween(String value1, String value2) {
            addCriterion("uptype between", value1, value2, "uptype");
            return (Criteria) this;
        }

        public Criteria andUptypeNotBetween(String value1, String value2) {
            addCriterion("uptype not between", value1, value2, "uptype");
            return (Criteria) this;
        }

        public Criteria andUpuseridIsNull() {
            addCriterion("upuserid is null");
            return (Criteria) this;
        }

        public Criteria andUpuseridIsNotNull() {
            addCriterion("upuserid is not null");
            return (Criteria) this;
        }

        public Criteria andUpuseridEqualTo(String value) {
            addCriterion("upuserid =", value, "upuserid");
            return (Criteria) this;
        }

        public Criteria andUpuseridNotEqualTo(String value) {
            addCriterion("upuserid <>", value, "upuserid");
            return (Criteria) this;
        }

        public Criteria andUpuseridGreaterThan(String value) {
            addCriterion("upuserid >", value, "upuserid");
            return (Criteria) this;
        }

        public Criteria andUpuseridGreaterThanOrEqualTo(String value) {
            addCriterion("upuserid >=", value, "upuserid");
            return (Criteria) this;
        }

        public Criteria andUpuseridLessThan(String value) {
            addCriterion("upuserid <", value, "upuserid");
            return (Criteria) this;
        }

        public Criteria andUpuseridLessThanOrEqualTo(String value) {
            addCriterion("upuserid <=", value, "upuserid");
            return (Criteria) this;
        }

        public Criteria andUpuseridLike(String value) {
            addCriterion("upuserid like", value, "upuserid");
            return (Criteria) this;
        }

        public Criteria andUpuseridNotLike(String value) {
            addCriterion("upuserid not like", value, "upuserid");
            return (Criteria) this;
        }

        public Criteria andUpuseridIn(List<String> values) {
            addCriterion("upuserid in", values, "upuserid");
            return (Criteria) this;
        }

        public Criteria andUpuseridNotIn(List<String> values) {
            addCriterion("upuserid not in", values, "upuserid");
            return (Criteria) this;
        }

        public Criteria andUpuseridBetween(String value1, String value2) {
            addCriterion("upuserid between", value1, value2, "upuserid");
            return (Criteria) this;
        }

        public Criteria andUpuseridNotBetween(String value1, String value2) {
            addCriterion("upuserid not between", value1, value2, "upuserid");
            return (Criteria) this;
        }

        public Criteria andUpuserIsNull() {
            addCriterion("upuser is null");
            return (Criteria) this;
        }

        public Criteria andUpuserIsNotNull() {
            addCriterion("upuser is not null");
            return (Criteria) this;
        }

        public Criteria andUpuserEqualTo(String value) {
            addCriterion("upuser =", value, "upuser");
            return (Criteria) this;
        }

        public Criteria andUpuserNotEqualTo(String value) {
            addCriterion("upuser <>", value, "upuser");
            return (Criteria) this;
        }

        public Criteria andUpuserGreaterThan(String value) {
            addCriterion("upuser >", value, "upuser");
            return (Criteria) this;
        }

        public Criteria andUpuserGreaterThanOrEqualTo(String value) {
            addCriterion("upuser >=", value, "upuser");
            return (Criteria) this;
        }

        public Criteria andUpuserLessThan(String value) {
            addCriterion("upuser <", value, "upuser");
            return (Criteria) this;
        }

        public Criteria andUpuserLessThanOrEqualTo(String value) {
            addCriterion("upuser <=", value, "upuser");
            return (Criteria) this;
        }

        public Criteria andUpuserLike(String value) {
            addCriterion("upuser like", value, "upuser");
            return (Criteria) this;
        }

        public Criteria andUpuserNotLike(String value) {
            addCriterion("upuser not like", value, "upuser");
            return (Criteria) this;
        }

        public Criteria andUpuserIn(List<String> values) {
            addCriterion("upuser in", values, "upuser");
            return (Criteria) this;
        }

        public Criteria andUpuserNotIn(List<String> values) {
            addCriterion("upuser not in", values, "upuser");
            return (Criteria) this;
        }

        public Criteria andUpuserBetween(String value1, String value2) {
            addCriterion("upuser between", value1, value2, "upuser");
            return (Criteria) this;
        }

        public Criteria andUpuserNotBetween(String value1, String value2) {
            addCriterion("upuser not between", value1, value2, "upuser");
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
     * This class corresponds to the database table fourfly_worc
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
     * This class corresponds to the database table fourfly_worc
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