package com.hk.bean;

import java.util.ArrayList;
import java.util.List;

public class CountersignsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CountersignsExample() {
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
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andFcountersignsidIsNull() {
            addCriterion("FCountersignsID is null");
            return (Criteria) this;
        }

        public Criteria andFcountersignsidIsNotNull() {
            addCriterion("FCountersignsID is not null");
            return (Criteria) this;
        }

        public Criteria andFcountersignsidEqualTo(String value) {
            addCriterion("FCountersignsID =", value, "fcountersignsid");
            return (Criteria) this;
        }

        public Criteria andFcountersignsidNotEqualTo(String value) {
            addCriterion("FCountersignsID <>", value, "fcountersignsid");
            return (Criteria) this;
        }

        public Criteria andFcountersignsidGreaterThan(String value) {
            addCriterion("FCountersignsID >", value, "fcountersignsid");
            return (Criteria) this;
        }

        public Criteria andFcountersignsidGreaterThanOrEqualTo(String value) {
            addCriterion("FCountersignsID >=", value, "fcountersignsid");
            return (Criteria) this;
        }

        public Criteria andFcountersignsidLessThan(String value) {
            addCriterion("FCountersignsID <", value, "fcountersignsid");
            return (Criteria) this;
        }

        public Criteria andFcountersignsidLessThanOrEqualTo(String value) {
            addCriterion("FCountersignsID <=", value, "fcountersignsid");
            return (Criteria) this;
        }

        public Criteria andFcountersignsidLike(String value) {
            addCriterion("FCountersignsID like", value, "fcountersignsid");
            return (Criteria) this;
        }

        public Criteria andFcountersignsidNotLike(String value) {
            addCriterion("FCountersignsID not like", value, "fcountersignsid");
            return (Criteria) this;
        }

        public Criteria andFcountersignsidIn(List<String> values) {
            addCriterion("FCountersignsID in", values, "fcountersignsid");
            return (Criteria) this;
        }

        public Criteria andFcountersignsidNotIn(List<String> values) {
            addCriterion("FCountersignsID not in", values, "fcountersignsid");
            return (Criteria) this;
        }

        public Criteria andFcountersignsidBetween(String value1, String value2) {
            addCriterion("FCountersignsID between", value1, value2, "fcountersignsid");
            return (Criteria) this;
        }

        public Criteria andFcountersignsidNotBetween(String value1, String value2) {
            addCriterion("FCountersignsID not between", value1, value2, "fcountersignsid");
            return (Criteria) this;
        }

        public Criteria andFcountersignscodeIsNull() {
            addCriterion("FCountersignsCode is null");
            return (Criteria) this;
        }

        public Criteria andFcountersignscodeIsNotNull() {
            addCriterion("FCountersignsCode is not null");
            return (Criteria) this;
        }

        public Criteria andFcountersignscodeEqualTo(String value) {
            addCriterion("FCountersignsCode =", value, "fcountersignscode");
            return (Criteria) this;
        }

        public Criteria andFcountersignscodeNotEqualTo(String value) {
            addCriterion("FCountersignsCode <>", value, "fcountersignscode");
            return (Criteria) this;
        }

        public Criteria andFcountersignscodeGreaterThan(String value) {
            addCriterion("FCountersignsCode >", value, "fcountersignscode");
            return (Criteria) this;
        }

        public Criteria andFcountersignscodeGreaterThanOrEqualTo(String value) {
            addCriterion("FCountersignsCode >=", value, "fcountersignscode");
            return (Criteria) this;
        }

        public Criteria andFcountersignscodeLessThan(String value) {
            addCriterion("FCountersignsCode <", value, "fcountersignscode");
            return (Criteria) this;
        }

        public Criteria andFcountersignscodeLessThanOrEqualTo(String value) {
            addCriterion("FCountersignsCode <=", value, "fcountersignscode");
            return (Criteria) this;
        }

        public Criteria andFcountersignscodeLike(String value) {
            addCriterion("FCountersignsCode like", value, "fcountersignscode");
            return (Criteria) this;
        }

        public Criteria andFcountersignscodeNotLike(String value) {
            addCriterion("FCountersignsCode not like", value, "fcountersignscode");
            return (Criteria) this;
        }

        public Criteria andFcountersignscodeIn(List<String> values) {
            addCriterion("FCountersignsCode in", values, "fcountersignscode");
            return (Criteria) this;
        }

        public Criteria andFcountersignscodeNotIn(List<String> values) {
            addCriterion("FCountersignsCode not in", values, "fcountersignscode");
            return (Criteria) this;
        }

        public Criteria andFcountersignscodeBetween(String value1, String value2) {
            addCriterion("FCountersignsCode between", value1, value2, "fcountersignscode");
            return (Criteria) this;
        }

        public Criteria andFcountersignscodeNotBetween(String value1, String value2) {
            addCriterion("FCountersignsCode not between", value1, value2, "fcountersignscode");
            return (Criteria) this;
        }

        public Criteria andFcountersignsnameIsNull() {
            addCriterion("FCountersignsName is null");
            return (Criteria) this;
        }

        public Criteria andFcountersignsnameIsNotNull() {
            addCriterion("FCountersignsName is not null");
            return (Criteria) this;
        }

        public Criteria andFcountersignsnameEqualTo(String value) {
            addCriterion("FCountersignsName =", value, "fcountersignsname");
            return (Criteria) this;
        }

        public Criteria andFcountersignsnameNotEqualTo(String value) {
            addCriterion("FCountersignsName <>", value, "fcountersignsname");
            return (Criteria) this;
        }

        public Criteria andFcountersignsnameGreaterThan(String value) {
            addCriterion("FCountersignsName >", value, "fcountersignsname");
            return (Criteria) this;
        }

        public Criteria andFcountersignsnameGreaterThanOrEqualTo(String value) {
            addCriterion("FCountersignsName >=", value, "fcountersignsname");
            return (Criteria) this;
        }

        public Criteria andFcountersignsnameLessThan(String value) {
            addCriterion("FCountersignsName <", value, "fcountersignsname");
            return (Criteria) this;
        }

        public Criteria andFcountersignsnameLessThanOrEqualTo(String value) {
            addCriterion("FCountersignsName <=", value, "fcountersignsname");
            return (Criteria) this;
        }

        public Criteria andFcountersignsnameLike(String value) {
            addCriterion("FCountersignsName like", value, "fcountersignsname");
            return (Criteria) this;
        }

        public Criteria andFcountersignsnameNotLike(String value) {
            addCriterion("FCountersignsName not like", value, "fcountersignsname");
            return (Criteria) this;
        }

        public Criteria andFcountersignsnameIn(List<String> values) {
            addCriterion("FCountersignsName in", values, "fcountersignsname");
            return (Criteria) this;
        }

        public Criteria andFcountersignsnameNotIn(List<String> values) {
            addCriterion("FCountersignsName not in", values, "fcountersignsname");
            return (Criteria) this;
        }

        public Criteria andFcountersignsnameBetween(String value1, String value2) {
            addCriterion("FCountersignsName between", value1, value2, "fcountersignsname");
            return (Criteria) this;
        }

        public Criteria andFcountersignsnameNotBetween(String value1, String value2) {
            addCriterion("FCountersignsName not between", value1, value2, "fcountersignsname");
            return (Criteria) this;
        }

        public Criteria andFsendfileidIsNull() {
            addCriterion("FSendFileID is null");
            return (Criteria) this;
        }

        public Criteria andFsendfileidIsNotNull() {
            addCriterion("FSendFileID is not null");
            return (Criteria) this;
        }

        public Criteria andFsendfileidEqualTo(Integer value) {
            addCriterion("FSendFileID =", value, "fsendfileid");
            return (Criteria) this;
        }

        public Criteria andFsendfileidNotEqualTo(Integer value) {
            addCriterion("FSendFileID <>", value, "fsendfileid");
            return (Criteria) this;
        }

        public Criteria andFsendfileidGreaterThan(Integer value) {
            addCriterion("FSendFileID >", value, "fsendfileid");
            return (Criteria) this;
        }

        public Criteria andFsendfileidGreaterThanOrEqualTo(Integer value) {
            addCriterion("FSendFileID >=", value, "fsendfileid");
            return (Criteria) this;
        }

        public Criteria andFsendfileidLessThan(Integer value) {
            addCriterion("FSendFileID <", value, "fsendfileid");
            return (Criteria) this;
        }

        public Criteria andFsendfileidLessThanOrEqualTo(Integer value) {
            addCriterion("FSendFileID <=", value, "fsendfileid");
            return (Criteria) this;
        }

        public Criteria andFsendfileidIn(List<Integer> values) {
            addCriterion("FSendFileID in", values, "fsendfileid");
            return (Criteria) this;
        }

        public Criteria andFsendfileidNotIn(List<Integer> values) {
            addCriterion("FSendFileID not in", values, "fsendfileid");
            return (Criteria) this;
        }

        public Criteria andFsendfileidBetween(Integer value1, Integer value2) {
            addCriterion("FSendFileID between", value1, value2, "fsendfileid");
            return (Criteria) this;
        }

        public Criteria andFsendfileidNotBetween(Integer value1, Integer value2) {
            addCriterion("FSendFileID not between", value1, value2, "fsendfileid");
            return (Criteria) this;
        }

        public Criteria andFsuggestionIsNull() {
            addCriterion("FSuggestion is null");
            return (Criteria) this;
        }

        public Criteria andFsuggestionIsNotNull() {
            addCriterion("FSuggestion is not null");
            return (Criteria) this;
        }

        public Criteria andFsuggestionEqualTo(String value) {
            addCriterion("FSuggestion =", value, "fsuggestion");
            return (Criteria) this;
        }

        public Criteria andFsuggestionNotEqualTo(String value) {
            addCriterion("FSuggestion <>", value, "fsuggestion");
            return (Criteria) this;
        }

        public Criteria andFsuggestionGreaterThan(String value) {
            addCriterion("FSuggestion >", value, "fsuggestion");
            return (Criteria) this;
        }

        public Criteria andFsuggestionGreaterThanOrEqualTo(String value) {
            addCriterion("FSuggestion >=", value, "fsuggestion");
            return (Criteria) this;
        }

        public Criteria andFsuggestionLessThan(String value) {
            addCriterion("FSuggestion <", value, "fsuggestion");
            return (Criteria) this;
        }

        public Criteria andFsuggestionLessThanOrEqualTo(String value) {
            addCriterion("FSuggestion <=", value, "fsuggestion");
            return (Criteria) this;
        }

        public Criteria andFsuggestionLike(String value) {
            addCriterion("FSuggestion like", value, "fsuggestion");
            return (Criteria) this;
        }

        public Criteria andFsuggestionNotLike(String value) {
            addCriterion("FSuggestion not like", value, "fsuggestion");
            return (Criteria) this;
        }

        public Criteria andFsuggestionIn(List<String> values) {
            addCriterion("FSuggestion in", values, "fsuggestion");
            return (Criteria) this;
        }

        public Criteria andFsuggestionNotIn(List<String> values) {
            addCriterion("FSuggestion not in", values, "fsuggestion");
            return (Criteria) this;
        }

        public Criteria andFsuggestionBetween(String value1, String value2) {
            addCriterion("FSuggestion between", value1, value2, "fsuggestion");
            return (Criteria) this;
        }

        public Criteria andFsuggestionNotBetween(String value1, String value2) {
            addCriterion("FSuggestion not between", value1, value2, "fsuggestion");
            return (Criteria) this;
        }

        public Criteria andFisagreeIsNull() {
            addCriterion("FisAgree is null");
            return (Criteria) this;
        }

        public Criteria andFisagreeIsNotNull() {
            addCriterion("FisAgree is not null");
            return (Criteria) this;
        }

        public Criteria andFisagreeEqualTo(Integer value) {
            addCriterion("FisAgree =", value, "fisagree");
            return (Criteria) this;
        }

        public Criteria andFisagreeNotEqualTo(Integer value) {
            addCriterion("FisAgree <>", value, "fisagree");
            return (Criteria) this;
        }

        public Criteria andFisagreeGreaterThan(Integer value) {
            addCriterion("FisAgree >", value, "fisagree");
            return (Criteria) this;
        }

        public Criteria andFisagreeGreaterThanOrEqualTo(Integer value) {
            addCriterion("FisAgree >=", value, "fisagree");
            return (Criteria) this;
        }

        public Criteria andFisagreeLessThan(Integer value) {
            addCriterion("FisAgree <", value, "fisagree");
            return (Criteria) this;
        }

        public Criteria andFisagreeLessThanOrEqualTo(Integer value) {
            addCriterion("FisAgree <=", value, "fisagree");
            return (Criteria) this;
        }

        public Criteria andFisagreeIn(List<Integer> values) {
            addCriterion("FisAgree in", values, "fisagree");
            return (Criteria) this;
        }

        public Criteria andFisagreeNotIn(List<Integer> values) {
            addCriterion("FisAgree not in", values, "fisagree");
            return (Criteria) this;
        }

        public Criteria andFisagreeBetween(Integer value1, Integer value2) {
            addCriterion("FisAgree between", value1, value2, "fisagree");
            return (Criteria) this;
        }

        public Criteria andFisagreeNotBetween(Integer value1, Integer value2) {
            addCriterion("FisAgree not between", value1, value2, "fisagree");
            return (Criteria) this;
        }

        public Criteria andIsdelIsNull() {
            addCriterion("isDel is null");
            return (Criteria) this;
        }

        public Criteria andIsdelIsNotNull() {
            addCriterion("isDel is not null");
            return (Criteria) this;
        }

        public Criteria andIsdelEqualTo(String value) {
            addCriterion("isDel =", value, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelNotEqualTo(String value) {
            addCriterion("isDel <>", value, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelGreaterThan(String value) {
            addCriterion("isDel >", value, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelGreaterThanOrEqualTo(String value) {
            addCriterion("isDel >=", value, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelLessThan(String value) {
            addCriterion("isDel <", value, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelLessThanOrEqualTo(String value) {
            addCriterion("isDel <=", value, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelLike(String value) {
            addCriterion("isDel like", value, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelNotLike(String value) {
            addCriterion("isDel not like", value, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelIn(List<String> values) {
            addCriterion("isDel in", values, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelNotIn(List<String> values) {
            addCriterion("isDel not in", values, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelBetween(String value1, String value2) {
            addCriterion("isDel between", value1, value2, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelNotBetween(String value1, String value2) {
            addCriterion("isDel not between", value1, value2, "isdel");
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