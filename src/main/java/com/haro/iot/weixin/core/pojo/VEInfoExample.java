package com.haro.iot.weixin.core.pojo;

import java.util.ArrayList;
import java.util.List;

public class VEInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VEInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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
            addCriterion("Id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("Id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("Id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("Id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("Id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("Id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("Id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("Id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("Id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("Id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTxsnIsNull() {
            addCriterion("txsn is null");
            return (Criteria) this;
        }

        public Criteria andTxsnIsNotNull() {
            addCriterion("txsn is not null");
            return (Criteria) this;
        }

        public Criteria andTxsnEqualTo(String value) {
            addCriterion("txsn =", value, "txsn");
            return (Criteria) this;
        }

        public Criteria andTxsnNotEqualTo(String value) {
            addCriterion("txsn <>", value, "txsn");
            return (Criteria) this;
        }

        public Criteria andTxsnGreaterThan(String value) {
            addCriterion("txsn >", value, "txsn");
            return (Criteria) this;
        }

        public Criteria andTxsnGreaterThanOrEqualTo(String value) {
            addCriterion("txsn >=", value, "txsn");
            return (Criteria) this;
        }

        public Criteria andTxsnLessThan(String value) {
            addCriterion("txsn <", value, "txsn");
            return (Criteria) this;
        }

        public Criteria andTxsnLessThanOrEqualTo(String value) {
            addCriterion("txsn <=", value, "txsn");
            return (Criteria) this;
        }

        public Criteria andTxsnLike(String value) {
            addCriterion("txsn like", value, "txsn");
            return (Criteria) this;
        }

        public Criteria andTxsnNotLike(String value) {
            addCriterion("txsn not like", value, "txsn");
            return (Criteria) this;
        }

        public Criteria andTxsnIn(List<String> values) {
            addCriterion("txsn in", values, "txsn");
            return (Criteria) this;
        }

        public Criteria andTxsnNotIn(List<String> values) {
            addCriterion("txsn not in", values, "txsn");
            return (Criteria) this;
        }

        public Criteria andTxsnBetween(String value1, String value2) {
            addCriterion("txsn between", value1, value2, "txsn");
            return (Criteria) this;
        }

        public Criteria andTxsnNotBetween(String value1, String value2) {
            addCriterion("txsn not between", value1, value2, "txsn");
            return (Criteria) this;
        }

        public Criteria andZjcdIsNull() {
            addCriterion("zjcd is null");
            return (Criteria) this;
        }

        public Criteria andZjcdIsNotNull() {
            addCriterion("zjcd is not null");
            return (Criteria) this;
        }

        public Criteria andZjcdEqualTo(String value) {
            addCriterion("zjcd =", value, "zjcd");
            return (Criteria) this;
        }

        public Criteria andZjcdNotEqualTo(String value) {
            addCriterion("zjcd <>", value, "zjcd");
            return (Criteria) this;
        }

        public Criteria andZjcdGreaterThan(String value) {
            addCriterion("zjcd >", value, "zjcd");
            return (Criteria) this;
        }

        public Criteria andZjcdGreaterThanOrEqualTo(String value) {
            addCriterion("zjcd >=", value, "zjcd");
            return (Criteria) this;
        }

        public Criteria andZjcdLessThan(String value) {
            addCriterion("zjcd <", value, "zjcd");
            return (Criteria) this;
        }

        public Criteria andZjcdLessThanOrEqualTo(String value) {
            addCriterion("zjcd <=", value, "zjcd");
            return (Criteria) this;
        }

        public Criteria andZjcdLike(String value) {
            addCriterion("zjcd like", value, "zjcd");
            return (Criteria) this;
        }

        public Criteria andZjcdNotLike(String value) {
            addCriterion("zjcd not like", value, "zjcd");
            return (Criteria) this;
        }

        public Criteria andZjcdIn(List<String> values) {
            addCriterion("zjcd in", values, "zjcd");
            return (Criteria) this;
        }

        public Criteria andZjcdNotIn(List<String> values) {
            addCriterion("zjcd not in", values, "zjcd");
            return (Criteria) this;
        }

        public Criteria andZjcdBetween(String value1, String value2) {
            addCriterion("zjcd between", value1, value2, "zjcd");
            return (Criteria) this;
        }

        public Criteria andZjcdNotBetween(String value1, String value2) {
            addCriterion("zjcd not between", value1, value2, "zjcd");
            return (Criteria) this;
        }

        public Criteria andBjztIsNull() {
            addCriterion("bjzt is null");
            return (Criteria) this;
        }

        public Criteria andBjztIsNotNull() {
            addCriterion("bjzt is not null");
            return (Criteria) this;
        }

        public Criteria andBjztEqualTo(String value) {
            addCriterion("bjzt =", value, "bjzt");
            return (Criteria) this;
        }

        public Criteria andBjztNotEqualTo(String value) {
            addCriterion("bjzt <>", value, "bjzt");
            return (Criteria) this;
        }

        public Criteria andBjztGreaterThan(String value) {
            addCriterion("bjzt >", value, "bjzt");
            return (Criteria) this;
        }

        public Criteria andBjztGreaterThanOrEqualTo(String value) {
            addCriterion("bjzt >=", value, "bjzt");
            return (Criteria) this;
        }

        public Criteria andBjztLessThan(String value) {
            addCriterion("bjzt <", value, "bjzt");
            return (Criteria) this;
        }

        public Criteria andBjztLessThanOrEqualTo(String value) {
            addCriterion("bjzt <=", value, "bjzt");
            return (Criteria) this;
        }

        public Criteria andBjztLike(String value) {
            addCriterion("bjzt like", value, "bjzt");
            return (Criteria) this;
        }

        public Criteria andBjztNotLike(String value) {
            addCriterion("bjzt not like", value, "bjzt");
            return (Criteria) this;
        }

        public Criteria andBjztIn(List<String> values) {
            addCriterion("bjzt in", values, "bjzt");
            return (Criteria) this;
        }

        public Criteria andBjztNotIn(List<String> values) {
            addCriterion("bjzt not in", values, "bjzt");
            return (Criteria) this;
        }

        public Criteria andBjztBetween(String value1, String value2) {
            addCriterion("bjzt between", value1, value2, "bjzt");
            return (Criteria) this;
        }

        public Criteria andBjztNotBetween(String value1, String value2) {
            addCriterion("bjzt not between", value1, value2, "bjzt");
            return (Criteria) this;
        }

        public Criteria andWdztIsNull() {
            addCriterion("wdzt is null");
            return (Criteria) this;
        }

        public Criteria andWdztIsNotNull() {
            addCriterion("wdzt is not null");
            return (Criteria) this;
        }

        public Criteria andWdztEqualTo(String value) {
            addCriterion("wdzt =", value, "wdzt");
            return (Criteria) this;
        }

        public Criteria andWdztNotEqualTo(String value) {
            addCriterion("wdzt <>", value, "wdzt");
            return (Criteria) this;
        }

        public Criteria andWdztGreaterThan(String value) {
            addCriterion("wdzt >", value, "wdzt");
            return (Criteria) this;
        }

        public Criteria andWdztGreaterThanOrEqualTo(String value) {
            addCriterion("wdzt >=", value, "wdzt");
            return (Criteria) this;
        }

        public Criteria andWdztLessThan(String value) {
            addCriterion("wdzt <", value, "wdzt");
            return (Criteria) this;
        }

        public Criteria andWdztLessThanOrEqualTo(String value) {
            addCriterion("wdzt <=", value, "wdzt");
            return (Criteria) this;
        }

        public Criteria andWdztLike(String value) {
            addCriterion("wdzt like", value, "wdzt");
            return (Criteria) this;
        }

        public Criteria andWdztNotLike(String value) {
            addCriterion("wdzt not like", value, "wdzt");
            return (Criteria) this;
        }

        public Criteria andWdztIn(List<String> values) {
            addCriterion("wdzt in", values, "wdzt");
            return (Criteria) this;
        }

        public Criteria andWdztNotIn(List<String> values) {
            addCriterion("wdzt not in", values, "wdzt");
            return (Criteria) this;
        }

        public Criteria andWdztBetween(String value1, String value2) {
            addCriterion("wdzt between", value1, value2, "wdzt");
            return (Criteria) this;
        }

        public Criteria andWdztNotBetween(String value1, String value2) {
            addCriterion("wdzt not between", value1, value2, "wdzt");
            return (Criteria) this;
        }

        public Criteria andZcjlIsNull() {
            addCriterion("zcjl is null");
            return (Criteria) this;
        }

        public Criteria andZcjlIsNotNull() {
            addCriterion("zcjl is not null");
            return (Criteria) this;
        }

        public Criteria andZcjlEqualTo(String value) {
            addCriterion("zcjl =", value, "zcjl");
            return (Criteria) this;
        }

        public Criteria andZcjlNotEqualTo(String value) {
            addCriterion("zcjl <>", value, "zcjl");
            return (Criteria) this;
        }

        public Criteria andZcjlGreaterThan(String value) {
            addCriterion("zcjl >", value, "zcjl");
            return (Criteria) this;
        }

        public Criteria andZcjlGreaterThanOrEqualTo(String value) {
            addCriterion("zcjl >=", value, "zcjl");
            return (Criteria) this;
        }

        public Criteria andZcjlLessThan(String value) {
            addCriterion("zcjl <", value, "zcjl");
            return (Criteria) this;
        }

        public Criteria andZcjlLessThanOrEqualTo(String value) {
            addCriterion("zcjl <=", value, "zcjl");
            return (Criteria) this;
        }

        public Criteria andZcjlLike(String value) {
            addCriterion("zcjl like", value, "zcjl");
            return (Criteria) this;
        }

        public Criteria andZcjlNotLike(String value) {
            addCriterion("zcjl not like", value, "zcjl");
            return (Criteria) this;
        }

        public Criteria andZcjlIn(List<String> values) {
            addCriterion("zcjl in", values, "zcjl");
            return (Criteria) this;
        }

        public Criteria andZcjlNotIn(List<String> values) {
            addCriterion("zcjl not in", values, "zcjl");
            return (Criteria) this;
        }

        public Criteria andZcjlBetween(String value1, String value2) {
            addCriterion("zcjl between", value1, value2, "zcjl");
            return (Criteria) this;
        }

        public Criteria andZcjlNotBetween(String value1, String value2) {
            addCriterion("zcjl not between", value1, value2, "zcjl");
            return (Criteria) this;
        }

        public Criteria andJqwdIsNull() {
            addCriterion("jqwd is null");
            return (Criteria) this;
        }

        public Criteria andJqwdIsNotNull() {
            addCriterion("jqwd is not null");
            return (Criteria) this;
        }

        public Criteria andJqwdEqualTo(String value) {
            addCriterion("jqwd =", value, "jqwd");
            return (Criteria) this;
        }

        public Criteria andJqwdNotEqualTo(String value) {
            addCriterion("jqwd <>", value, "jqwd");
            return (Criteria) this;
        }

        public Criteria andJqwdGreaterThan(String value) {
            addCriterion("jqwd >", value, "jqwd");
            return (Criteria) this;
        }

        public Criteria andJqwdGreaterThanOrEqualTo(String value) {
            addCriterion("jqwd >=", value, "jqwd");
            return (Criteria) this;
        }

        public Criteria andJqwdLessThan(String value) {
            addCriterion("jqwd <", value, "jqwd");
            return (Criteria) this;
        }

        public Criteria andJqwdLessThanOrEqualTo(String value) {
            addCriterion("jqwd <=", value, "jqwd");
            return (Criteria) this;
        }

        public Criteria andJqwdLike(String value) {
            addCriterion("jqwd like", value, "jqwd");
            return (Criteria) this;
        }

        public Criteria andJqwdNotLike(String value) {
            addCriterion("jqwd not like", value, "jqwd");
            return (Criteria) this;
        }

        public Criteria andJqwdIn(List<String> values) {
            addCriterion("jqwd in", values, "jqwd");
            return (Criteria) this;
        }

        public Criteria andJqwdNotIn(List<String> values) {
            addCriterion("jqwd not in", values, "jqwd");
            return (Criteria) this;
        }

        public Criteria andJqwdBetween(String value1, String value2) {
            addCriterion("jqwd between", value1, value2, "jqwd");
            return (Criteria) this;
        }

        public Criteria andJqwdNotBetween(String value1, String value2) {
            addCriterion("jqwd not between", value1, value2, "jqwd");
            return (Criteria) this;
        }

        public Criteria andSlIsNull() {
            addCriterion("sl is null");
            return (Criteria) this;
        }

        public Criteria andSlIsNotNull() {
            addCriterion("sl is not null");
            return (Criteria) this;
        }

        public Criteria andSlEqualTo(String value) {
            addCriterion("sl =", value, "sl");
            return (Criteria) this;
        }

        public Criteria andSlNotEqualTo(String value) {
            addCriterion("sl <>", value, "sl");
            return (Criteria) this;
        }

        public Criteria andSlGreaterThan(String value) {
            addCriterion("sl >", value, "sl");
            return (Criteria) this;
        }

        public Criteria andSlGreaterThanOrEqualTo(String value) {
            addCriterion("sl >=", value, "sl");
            return (Criteria) this;
        }

        public Criteria andSlLessThan(String value) {
            addCriterion("sl <", value, "sl");
            return (Criteria) this;
        }

        public Criteria andSlLessThanOrEqualTo(String value) {
            addCriterion("sl <=", value, "sl");
            return (Criteria) this;
        }

        public Criteria andSlLike(String value) {
            addCriterion("sl like", value, "sl");
            return (Criteria) this;
        }

        public Criteria andSlNotLike(String value) {
            addCriterion("sl not like", value, "sl");
            return (Criteria) this;
        }

        public Criteria andSlIn(List<String> values) {
            addCriterion("sl in", values, "sl");
            return (Criteria) this;
        }

        public Criteria andSlNotIn(List<String> values) {
            addCriterion("sl not in", values, "sl");
            return (Criteria) this;
        }

        public Criteria andSlBetween(String value1, String value2) {
            addCriterion("sl between", value1, value2, "sl");
            return (Criteria) this;
        }

        public Criteria andSlNotBetween(String value1, String value2) {
            addCriterion("sl not between", value1, value2, "sl");
            return (Criteria) this;
        }

        public Criteria andSylIsNull() {
            addCriterion("syl is null");
            return (Criteria) this;
        }

        public Criteria andSylIsNotNull() {
            addCriterion("syl is not null");
            return (Criteria) this;
        }

        public Criteria andSylEqualTo(String value) {
            addCriterion("syl =", value, "syl");
            return (Criteria) this;
        }

        public Criteria andSylNotEqualTo(String value) {
            addCriterion("syl <>", value, "syl");
            return (Criteria) this;
        }

        public Criteria andSylGreaterThan(String value) {
            addCriterion("syl >", value, "syl");
            return (Criteria) this;
        }

        public Criteria andSylGreaterThanOrEqualTo(String value) {
            addCriterion("syl >=", value, "syl");
            return (Criteria) this;
        }

        public Criteria andSylLessThan(String value) {
            addCriterion("syl <", value, "syl");
            return (Criteria) this;
        }

        public Criteria andSylLessThanOrEqualTo(String value) {
            addCriterion("syl <=", value, "syl");
            return (Criteria) this;
        }

        public Criteria andSylLike(String value) {
            addCriterion("syl like", value, "syl");
            return (Criteria) this;
        }

        public Criteria andSylNotLike(String value) {
            addCriterion("syl not like", value, "syl");
            return (Criteria) this;
        }

        public Criteria andSylIn(List<String> values) {
            addCriterion("syl in", values, "syl");
            return (Criteria) this;
        }

        public Criteria andSylNotIn(List<String> values) {
            addCriterion("syl not in", values, "syl");
            return (Criteria) this;
        }

        public Criteria andSylBetween(String value1, String value2) {
            addCriterion("syl between", value1, value2, "syl");
            return (Criteria) this;
        }

        public Criteria andSylNotBetween(String value1, String value2) {
            addCriterion("syl not between", value1, value2, "syl");
            return (Criteria) this;
        }

        public Criteria andXjcjlIsNull() {
            addCriterion("xjcjl is null");
            return (Criteria) this;
        }

        public Criteria andXjcjlIsNotNull() {
            addCriterion("xjcjl is not null");
            return (Criteria) this;
        }

        public Criteria andXjcjlEqualTo(String value) {
            addCriterion("xjcjl =", value, "xjcjl");
            return (Criteria) this;
        }

        public Criteria andXjcjlNotEqualTo(String value) {
            addCriterion("xjcjl <>", value, "xjcjl");
            return (Criteria) this;
        }

        public Criteria andXjcjlGreaterThan(String value) {
            addCriterion("xjcjl >", value, "xjcjl");
            return (Criteria) this;
        }

        public Criteria andXjcjlGreaterThanOrEqualTo(String value) {
            addCriterion("xjcjl >=", value, "xjcjl");
            return (Criteria) this;
        }

        public Criteria andXjcjlLessThan(String value) {
            addCriterion("xjcjl <", value, "xjcjl");
            return (Criteria) this;
        }

        public Criteria andXjcjlLessThanOrEqualTo(String value) {
            addCriterion("xjcjl <=", value, "xjcjl");
            return (Criteria) this;
        }

        public Criteria andXjcjlLike(String value) {
            addCriterion("xjcjl like", value, "xjcjl");
            return (Criteria) this;
        }

        public Criteria andXjcjlNotLike(String value) {
            addCriterion("xjcjl not like", value, "xjcjl");
            return (Criteria) this;
        }

        public Criteria andXjcjlIn(List<String> values) {
            addCriterion("xjcjl in", values, "xjcjl");
            return (Criteria) this;
        }

        public Criteria andXjcjlNotIn(List<String> values) {
            addCriterion("xjcjl not in", values, "xjcjl");
            return (Criteria) this;
        }

        public Criteria andXjcjlBetween(String value1, String value2) {
            addCriterion("xjcjl between", value1, value2, "xjcjl");
            return (Criteria) this;
        }

        public Criteria andXjcjlNotBetween(String value1, String value2) {
            addCriterion("xjcjl not between", value1, value2, "xjcjl");
            return (Criteria) this;
        }

        public Criteria andPhIsNull() {
            addCriterion("ph is null");
            return (Criteria) this;
        }

        public Criteria andPhIsNotNull() {
            addCriterion("ph is not null");
            return (Criteria) this;
        }

        public Criteria andPhEqualTo(String value) {
            addCriterion("ph =", value, "ph");
            return (Criteria) this;
        }

        public Criteria andPhNotEqualTo(String value) {
            addCriterion("ph <>", value, "ph");
            return (Criteria) this;
        }

        public Criteria andPhGreaterThan(String value) {
            addCriterion("ph >", value, "ph");
            return (Criteria) this;
        }

        public Criteria andPhGreaterThanOrEqualTo(String value) {
            addCriterion("ph >=", value, "ph");
            return (Criteria) this;
        }

        public Criteria andPhLessThan(String value) {
            addCriterion("ph <", value, "ph");
            return (Criteria) this;
        }

        public Criteria andPhLessThanOrEqualTo(String value) {
            addCriterion("ph <=", value, "ph");
            return (Criteria) this;
        }

        public Criteria andPhLike(String value) {
            addCriterion("ph like", value, "ph");
            return (Criteria) this;
        }

        public Criteria andPhNotLike(String value) {
            addCriterion("ph not like", value, "ph");
            return (Criteria) this;
        }

        public Criteria andPhIn(List<String> values) {
            addCriterion("ph in", values, "ph");
            return (Criteria) this;
        }

        public Criteria andPhNotIn(List<String> values) {
            addCriterion("ph not in", values, "ph");
            return (Criteria) this;
        }

        public Criteria andPhBetween(String value1, String value2) {
            addCriterion("ph between", value1, value2, "ph");
            return (Criteria) this;
        }

        public Criteria andPhNotBetween(String value1, String value2) {
            addCriterion("ph not between", value1, value2, "ph");
            return (Criteria) this;
        }

        public Criteria andTbsIsNull() {
            addCriterion("tbs is null");
            return (Criteria) this;
        }

        public Criteria andTbsIsNotNull() {
            addCriterion("tbs is not null");
            return (Criteria) this;
        }

        public Criteria andTbsEqualTo(String value) {
            addCriterion("tbs =", value, "tbs");
            return (Criteria) this;
        }

        public Criteria andTbsNotEqualTo(String value) {
            addCriterion("tbs <>", value, "tbs");
            return (Criteria) this;
        }

        public Criteria andTbsGreaterThan(String value) {
            addCriterion("tbs >", value, "tbs");
            return (Criteria) this;
        }

        public Criteria andTbsGreaterThanOrEqualTo(String value) {
            addCriterion("tbs >=", value, "tbs");
            return (Criteria) this;
        }

        public Criteria andTbsLessThan(String value) {
            addCriterion("tbs <", value, "tbs");
            return (Criteria) this;
        }

        public Criteria andTbsLessThanOrEqualTo(String value) {
            addCriterion("tbs <=", value, "tbs");
            return (Criteria) this;
        }

        public Criteria andTbsLike(String value) {
            addCriterion("tbs like", value, "tbs");
            return (Criteria) this;
        }

        public Criteria andTbsNotLike(String value) {
            addCriterion("tbs not like", value, "tbs");
            return (Criteria) this;
        }

        public Criteria andTbsIn(List<String> values) {
            addCriterion("tbs in", values, "tbs");
            return (Criteria) this;
        }

        public Criteria andTbsNotIn(List<String> values) {
            addCriterion("tbs not in", values, "tbs");
            return (Criteria) this;
        }

        public Criteria andTbsBetween(String value1, String value2) {
            addCriterion("tbs between", value1, value2, "tbs");
            return (Criteria) this;
        }

        public Criteria andTbsNotBetween(String value1, String value2) {
            addCriterion("tbs not between", value1, value2, "tbs");
            return (Criteria) this;
        }

        public Criteria andYdzfsIsNull() {
            addCriterion("ydzfs is null");
            return (Criteria) this;
        }

        public Criteria andYdzfsIsNotNull() {
            addCriterion("ydzfs is not null");
            return (Criteria) this;
        }

        public Criteria andYdzfsEqualTo(String value) {
            addCriterion("ydzfs =", value, "ydzfs");
            return (Criteria) this;
        }

        public Criteria andYdzfsNotEqualTo(String value) {
            addCriterion("ydzfs <>", value, "ydzfs");
            return (Criteria) this;
        }

        public Criteria andYdzfsGreaterThan(String value) {
            addCriterion("ydzfs >", value, "ydzfs");
            return (Criteria) this;
        }

        public Criteria andYdzfsGreaterThanOrEqualTo(String value) {
            addCriterion("ydzfs >=", value, "ydzfs");
            return (Criteria) this;
        }

        public Criteria andYdzfsLessThan(String value) {
            addCriterion("ydzfs <", value, "ydzfs");
            return (Criteria) this;
        }

        public Criteria andYdzfsLessThanOrEqualTo(String value) {
            addCriterion("ydzfs <=", value, "ydzfs");
            return (Criteria) this;
        }

        public Criteria andYdzfsLike(String value) {
            addCriterion("ydzfs like", value, "ydzfs");
            return (Criteria) this;
        }

        public Criteria andYdzfsNotLike(String value) {
            addCriterion("ydzfs not like", value, "ydzfs");
            return (Criteria) this;
        }

        public Criteria andYdzfsIn(List<String> values) {
            addCriterion("ydzfs in", values, "ydzfs");
            return (Criteria) this;
        }

        public Criteria andYdzfsNotIn(List<String> values) {
            addCriterion("ydzfs not in", values, "ydzfs");
            return (Criteria) this;
        }

        public Criteria andYdzfsBetween(String value1, String value2) {
            addCriterion("ydzfs between", value1, value2, "ydzfs");
            return (Criteria) this;
        }

        public Criteria andYdzfsNotBetween(String value1, String value2) {
            addCriterion("ydzfs not between", value1, value2, "ydzfs");
            return (Criteria) this;
        }

        public Criteria andSksIsNull() {
            addCriterion("sks is null");
            return (Criteria) this;
        }

        public Criteria andSksIsNotNull() {
            addCriterion("sks is not null");
            return (Criteria) this;
        }

        public Criteria andSksEqualTo(String value) {
            addCriterion("sks =", value, "sks");
            return (Criteria) this;
        }

        public Criteria andSksNotEqualTo(String value) {
            addCriterion("sks <>", value, "sks");
            return (Criteria) this;
        }

        public Criteria andSksGreaterThan(String value) {
            addCriterion("sks >", value, "sks");
            return (Criteria) this;
        }

        public Criteria andSksGreaterThanOrEqualTo(String value) {
            addCriterion("sks >=", value, "sks");
            return (Criteria) this;
        }

        public Criteria andSksLessThan(String value) {
            addCriterion("sks <", value, "sks");
            return (Criteria) this;
        }

        public Criteria andSksLessThanOrEqualTo(String value) {
            addCriterion("sks <=", value, "sks");
            return (Criteria) this;
        }

        public Criteria andSksLike(String value) {
            addCriterion("sks like", value, "sks");
            return (Criteria) this;
        }

        public Criteria andSksNotLike(String value) {
            addCriterion("sks not like", value, "sks");
            return (Criteria) this;
        }

        public Criteria andSksIn(List<String> values) {
            addCriterion("sks in", values, "sks");
            return (Criteria) this;
        }

        public Criteria andSksNotIn(List<String> values) {
            addCriterion("sks not in", values, "sks");
            return (Criteria) this;
        }

        public Criteria andSksBetween(String value1, String value2) {
            addCriterion("sks between", value1, value2, "sks");
            return (Criteria) this;
        }

        public Criteria andSksNotBetween(String value1, String value2) {
            addCriterion("sks not between", value1, value2, "sks");
            return (Criteria) this;
        }

        public Criteria andSylxIsNull() {
            addCriterion("sylx is null");
            return (Criteria) this;
        }

        public Criteria andSylxIsNotNull() {
            addCriterion("sylx is not null");
            return (Criteria) this;
        }

        public Criteria andSylxEqualTo(String value) {
            addCriterion("sylx =", value, "sylx");
            return (Criteria) this;
        }

        public Criteria andSylxNotEqualTo(String value) {
            addCriterion("sylx <>", value, "sylx");
            return (Criteria) this;
        }

        public Criteria andSylxGreaterThan(String value) {
            addCriterion("sylx >", value, "sylx");
            return (Criteria) this;
        }

        public Criteria andSylxGreaterThanOrEqualTo(String value) {
            addCriterion("sylx >=", value, "sylx");
            return (Criteria) this;
        }

        public Criteria andSylxLessThan(String value) {
            addCriterion("sylx <", value, "sylx");
            return (Criteria) this;
        }

        public Criteria andSylxLessThanOrEqualTo(String value) {
            addCriterion("sylx <=", value, "sylx");
            return (Criteria) this;
        }

        public Criteria andSylxLike(String value) {
            addCriterion("sylx like", value, "sylx");
            return (Criteria) this;
        }

        public Criteria andSylxNotLike(String value) {
            addCriterion("sylx not like", value, "sylx");
            return (Criteria) this;
        }

        public Criteria andSylxIn(List<String> values) {
            addCriterion("sylx in", values, "sylx");
            return (Criteria) this;
        }

        public Criteria andSylxNotIn(List<String> values) {
            addCriterion("sylx not in", values, "sylx");
            return (Criteria) this;
        }

        public Criteria andSylxBetween(String value1, String value2) {
            addCriterion("sylx between", value1, value2, "sylx");
            return (Criteria) this;
        }

        public Criteria andSylxNotBetween(String value1, String value2) {
            addCriterion("sylx not between", value1, value2, "sylx");
            return (Criteria) this;
        }

        public Criteria andCpsnIsNull() {
            addCriterion("cpsn is null");
            return (Criteria) this;
        }

        public Criteria andCpsnIsNotNull() {
            addCriterion("cpsn is not null");
            return (Criteria) this;
        }

        public Criteria andCpsnEqualTo(String value) {
            addCriterion("cpsn =", value, "cpsn");
            return (Criteria) this;
        }

        public Criteria andCpsnNotEqualTo(String value) {
            addCriterion("cpsn <>", value, "cpsn");
            return (Criteria) this;
        }

        public Criteria andCpsnGreaterThan(String value) {
            addCriterion("cpsn >", value, "cpsn");
            return (Criteria) this;
        }

        public Criteria andCpsnGreaterThanOrEqualTo(String value) {
            addCriterion("cpsn >=", value, "cpsn");
            return (Criteria) this;
        }

        public Criteria andCpsnLessThan(String value) {
            addCriterion("cpsn <", value, "cpsn");
            return (Criteria) this;
        }

        public Criteria andCpsnLessThanOrEqualTo(String value) {
            addCriterion("cpsn <=", value, "cpsn");
            return (Criteria) this;
        }

        public Criteria andCpsnLike(String value) {
            addCriterion("cpsn like", value, "cpsn");
            return (Criteria) this;
        }

        public Criteria andCpsnNotLike(String value) {
            addCriterion("cpsn not like", value, "cpsn");
            return (Criteria) this;
        }

        public Criteria andCpsnIn(List<String> values) {
            addCriterion("cpsn in", values, "cpsn");
            return (Criteria) this;
        }

        public Criteria andCpsnNotIn(List<String> values) {
            addCriterion("cpsn not in", values, "cpsn");
            return (Criteria) this;
        }

        public Criteria andCpsnBetween(String value1, String value2) {
            addCriterion("cpsn between", value1, value2, "cpsn");
            return (Criteria) this;
        }

        public Criteria andCpsnNotBetween(String value1, String value2) {
            addCriterion("cpsn not between", value1, value2, "cpsn");
            return (Criteria) this;
        }

        public Criteria andJdIsNull() {
            addCriterion("jd is null");
            return (Criteria) this;
        }

        public Criteria andJdIsNotNull() {
            addCriterion("jd is not null");
            return (Criteria) this;
        }

        public Criteria andJdEqualTo(String value) {
            addCriterion("jd =", value, "jd");
            return (Criteria) this;
        }

        public Criteria andJdNotEqualTo(String value) {
            addCriterion("jd <>", value, "jd");
            return (Criteria) this;
        }

        public Criteria andJdGreaterThan(String value) {
            addCriterion("jd >", value, "jd");
            return (Criteria) this;
        }

        public Criteria andJdGreaterThanOrEqualTo(String value) {
            addCriterion("jd >=", value, "jd");
            return (Criteria) this;
        }

        public Criteria andJdLessThan(String value) {
            addCriterion("jd <", value, "jd");
            return (Criteria) this;
        }

        public Criteria andJdLessThanOrEqualTo(String value) {
            addCriterion("jd <=", value, "jd");
            return (Criteria) this;
        }

        public Criteria andJdLike(String value) {
            addCriterion("jd like", value, "jd");
            return (Criteria) this;
        }

        public Criteria andJdNotLike(String value) {
            addCriterion("jd not like", value, "jd");
            return (Criteria) this;
        }

        public Criteria andJdIn(List<String> values) {
            addCriterion("jd in", values, "jd");
            return (Criteria) this;
        }

        public Criteria andJdNotIn(List<String> values) {
            addCriterion("jd not in", values, "jd");
            return (Criteria) this;
        }

        public Criteria andJdBetween(String value1, String value2) {
            addCriterion("jd between", value1, value2, "jd");
            return (Criteria) this;
        }

        public Criteria andJdNotBetween(String value1, String value2) {
            addCriterion("jd not between", value1, value2, "jd");
            return (Criteria) this;
        }

        public Criteria andWdIsNull() {
            addCriterion("wd is null");
            return (Criteria) this;
        }

        public Criteria andWdIsNotNull() {
            addCriterion("wd is not null");
            return (Criteria) this;
        }

        public Criteria andWdEqualTo(String value) {
            addCriterion("wd =", value, "wd");
            return (Criteria) this;
        }

        public Criteria andWdNotEqualTo(String value) {
            addCriterion("wd <>", value, "wd");
            return (Criteria) this;
        }

        public Criteria andWdGreaterThan(String value) {
            addCriterion("wd >", value, "wd");
            return (Criteria) this;
        }

        public Criteria andWdGreaterThanOrEqualTo(String value) {
            addCriterion("wd >=", value, "wd");
            return (Criteria) this;
        }

        public Criteria andWdLessThan(String value) {
            addCriterion("wd <", value, "wd");
            return (Criteria) this;
        }

        public Criteria andWdLessThanOrEqualTo(String value) {
            addCriterion("wd <=", value, "wd");
            return (Criteria) this;
        }

        public Criteria andWdLike(String value) {
            addCriterion("wd like", value, "wd");
            return (Criteria) this;
        }

        public Criteria andWdNotLike(String value) {
            addCriterion("wd not like", value, "wd");
            return (Criteria) this;
        }

        public Criteria andWdIn(List<String> values) {
            addCriterion("wd in", values, "wd");
            return (Criteria) this;
        }

        public Criteria andWdNotIn(List<String> values) {
            addCriterion("wd not in", values, "wd");
            return (Criteria) this;
        }

        public Criteria andWdBetween(String value1, String value2) {
            addCriterion("wd between", value1, value2, "wd");
            return (Criteria) this;
        }

        public Criteria andWdNotBetween(String value1, String value2) {
            addCriterion("wd not between", value1, value2, "wd");
            return (Criteria) this;
        }

        public Criteria andZtIsNull() {
            addCriterion("zt is null");
            return (Criteria) this;
        }

        public Criteria andZtIsNotNull() {
            addCriterion("zt is not null");
            return (Criteria) this;
        }

        public Criteria andZtEqualTo(String value) {
            addCriterion("zt =", value, "zt");
            return (Criteria) this;
        }

        public Criteria andZtNotEqualTo(String value) {
            addCriterion("zt <>", value, "zt");
            return (Criteria) this;
        }

        public Criteria andZtGreaterThan(String value) {
            addCriterion("zt >", value, "zt");
            return (Criteria) this;
        }

        public Criteria andZtGreaterThanOrEqualTo(String value) {
            addCriterion("zt >=", value, "zt");
            return (Criteria) this;
        }

        public Criteria andZtLessThan(String value) {
            addCriterion("zt <", value, "zt");
            return (Criteria) this;
        }

        public Criteria andZtLessThanOrEqualTo(String value) {
            addCriterion("zt <=", value, "zt");
            return (Criteria) this;
        }

        public Criteria andZtLike(String value) {
            addCriterion("zt like", value, "zt");
            return (Criteria) this;
        }

        public Criteria andZtNotLike(String value) {
            addCriterion("zt not like", value, "zt");
            return (Criteria) this;
        }

        public Criteria andZtIn(List<String> values) {
            addCriterion("zt in", values, "zt");
            return (Criteria) this;
        }

        public Criteria andZtNotIn(List<String> values) {
            addCriterion("zt not in", values, "zt");
            return (Criteria) this;
        }

        public Criteria andZtBetween(String value1, String value2) {
            addCriterion("zt between", value1, value2, "zt");
            return (Criteria) this;
        }

        public Criteria andZtNotBetween(String value1, String value2) {
            addCriterion("zt not between", value1, value2, "zt");
            return (Criteria) this;
        }

        public Criteria andXhIsNull() {
            addCriterion("xh is null");
            return (Criteria) this;
        }

        public Criteria andXhIsNotNull() {
            addCriterion("xh is not null");
            return (Criteria) this;
        }

        public Criteria andXhEqualTo(String value) {
            addCriterion("xh =", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhNotEqualTo(String value) {
            addCriterion("xh <>", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhGreaterThan(String value) {
            addCriterion("xh >", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhGreaterThanOrEqualTo(String value) {
            addCriterion("xh >=", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhLessThan(String value) {
            addCriterion("xh <", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhLessThanOrEqualTo(String value) {
            addCriterion("xh <=", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhLike(String value) {
            addCriterion("xh like", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhNotLike(String value) {
            addCriterion("xh not like", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhIn(List<String> values) {
            addCriterion("xh in", values, "xh");
            return (Criteria) this;
        }

        public Criteria andXhNotIn(List<String> values) {
            addCriterion("xh not in", values, "xh");
            return (Criteria) this;
        }

        public Criteria andXhBetween(String value1, String value2) {
            addCriterion("xh between", value1, value2, "xh");
            return (Criteria) this;
        }

        public Criteria andXhNotBetween(String value1, String value2) {
            addCriterion("xh not between", value1, value2, "xh");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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