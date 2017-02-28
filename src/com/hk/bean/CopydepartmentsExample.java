package com.hk.bean;

import java.util.ArrayList;
import java.util.List;

public class CopydepartmentsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CopydepartmentsExample() {
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

        public Criteria andFdeptidIsNull() {
            addCriterion("FDeptID is null");
            return (Criteria) this;
        }

        public Criteria andFdeptidIsNotNull() {
            addCriterion("FDeptID is not null");
            return (Criteria) this;
        }

        public Criteria andFdeptidEqualTo(String value) {
            addCriterion("FDeptID =", value, "fdeptid");
            return (Criteria) this;
        }

        public Criteria andFdeptidNotEqualTo(String value) {
            addCriterion("FDeptID <>", value, "fdeptid");
            return (Criteria) this;
        }

        public Criteria andFdeptidGreaterThan(String value) {
            addCriterion("FDeptID >", value, "fdeptid");
            return (Criteria) this;
        }

        public Criteria andFdeptidGreaterThanOrEqualTo(String value) {
            addCriterion("FDeptID >=", value, "fdeptid");
            return (Criteria) this;
        }

        public Criteria andFdeptidLessThan(String value) {
            addCriterion("FDeptID <", value, "fdeptid");
            return (Criteria) this;
        }

        public Criteria andFdeptidLessThanOrEqualTo(String value) {
            addCriterion("FDeptID <=", value, "fdeptid");
            return (Criteria) this;
        }

        public Criteria andFdeptidLike(String value) {
            addCriterion("FDeptID like", value, "fdeptid");
            return (Criteria) this;
        }

        public Criteria andFdeptidNotLike(String value) {
            addCriterion("FDeptID not like", value, "fdeptid");
            return (Criteria) this;
        }

        public Criteria andFdeptidIn(List<String> values) {
            addCriterion("FDeptID in", values, "fdeptid");
            return (Criteria) this;
        }

        public Criteria andFdeptidNotIn(List<String> values) {
            addCriterion("FDeptID not in", values, "fdeptid");
            return (Criteria) this;
        }

        public Criteria andFdeptidBetween(String value1, String value2) {
            addCriterion("FDeptID between", value1, value2, "fdeptid");
            return (Criteria) this;
        }

        public Criteria andFdeptidNotBetween(String value1, String value2) {
            addCriterion("FDeptID not between", value1, value2, "fdeptid");
            return (Criteria) this;
        }

        public Criteria andFdeptcodeIsNull() {
            addCriterion("FDeptCode is null");
            return (Criteria) this;
        }

        public Criteria andFdeptcodeIsNotNull() {
            addCriterion("FDeptCode is not null");
            return (Criteria) this;
        }

        public Criteria andFdeptcodeEqualTo(String value) {
            addCriterion("FDeptCode =", value, "fdeptcode");
            return (Criteria) this;
        }

        public Criteria andFdeptcodeNotEqualTo(String value) {
            addCriterion("FDeptCode <>", value, "fdeptcode");
            return (Criteria) this;
        }

        public Criteria andFdeptcodeGreaterThan(String value) {
            addCriterion("FDeptCode >", value, "fdeptcode");
            return (Criteria) this;
        }

        public Criteria andFdeptcodeGreaterThanOrEqualTo(String value) {
            addCriterion("FDeptCode >=", value, "fdeptcode");
            return (Criteria) this;
        }

        public Criteria andFdeptcodeLessThan(String value) {
            addCriterion("FDeptCode <", value, "fdeptcode");
            return (Criteria) this;
        }

        public Criteria andFdeptcodeLessThanOrEqualTo(String value) {
            addCriterion("FDeptCode <=", value, "fdeptcode");
            return (Criteria) this;
        }

        public Criteria andFdeptcodeLike(String value) {
            addCriterion("FDeptCode like", value, "fdeptcode");
            return (Criteria) this;
        }

        public Criteria andFdeptcodeNotLike(String value) {
            addCriterion("FDeptCode not like", value, "fdeptcode");
            return (Criteria) this;
        }

        public Criteria andFdeptcodeIn(List<String> values) {
            addCriterion("FDeptCode in", values, "fdeptcode");
            return (Criteria) this;
        }

        public Criteria andFdeptcodeNotIn(List<String> values) {
            addCriterion("FDeptCode not in", values, "fdeptcode");
            return (Criteria) this;
        }

        public Criteria andFdeptcodeBetween(String value1, String value2) {
            addCriterion("FDeptCode between", value1, value2, "fdeptcode");
            return (Criteria) this;
        }

        public Criteria andFdeptcodeNotBetween(String value1, String value2) {
            addCriterion("FDeptCode not between", value1, value2, "fdeptcode");
            return (Criteria) this;
        }

        public Criteria andFdeptnameIsNull() {
            addCriterion("FDeptName is null");
            return (Criteria) this;
        }

        public Criteria andFdeptnameIsNotNull() {
            addCriterion("FDeptName is not null");
            return (Criteria) this;
        }

        public Criteria andFdeptnameEqualTo(String value) {
            addCriterion("FDeptName =", value, "fdeptname");
            return (Criteria) this;
        }

        public Criteria andFdeptnameNotEqualTo(String value) {
            addCriterion("FDeptName <>", value, "fdeptname");
            return (Criteria) this;
        }

        public Criteria andFdeptnameGreaterThan(String value) {
            addCriterion("FDeptName >", value, "fdeptname");
            return (Criteria) this;
        }

        public Criteria andFdeptnameGreaterThanOrEqualTo(String value) {
            addCriterion("FDeptName >=", value, "fdeptname");
            return (Criteria) this;
        }

        public Criteria andFdeptnameLessThan(String value) {
            addCriterion("FDeptName <", value, "fdeptname");
            return (Criteria) this;
        }

        public Criteria andFdeptnameLessThanOrEqualTo(String value) {
            addCriterion("FDeptName <=", value, "fdeptname");
            return (Criteria) this;
        }

        public Criteria andFdeptnameLike(String value) {
            addCriterion("FDeptName like", value, "fdeptname");
            return (Criteria) this;
        }

        public Criteria andFdeptnameNotLike(String value) {
            addCriterion("FDeptName not like", value, "fdeptname");
            return (Criteria) this;
        }

        public Criteria andFdeptnameIn(List<String> values) {
            addCriterion("FDeptName in", values, "fdeptname");
            return (Criteria) this;
        }

        public Criteria andFdeptnameNotIn(List<String> values) {
            addCriterion("FDeptName not in", values, "fdeptname");
            return (Criteria) this;
        }

        public Criteria andFdeptnameBetween(String value1, String value2) {
            addCriterion("FDeptName between", value1, value2, "fdeptname");
            return (Criteria) this;
        }

        public Criteria andFdeptnameNotBetween(String value1, String value2) {
            addCriterion("FDeptName not between", value1, value2, "fdeptname");
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

        public Criteria andFdeptypeIsNull() {
            addCriterion("FDepType is null");
            return (Criteria) this;
        }

        public Criteria andFdeptypeIsNotNull() {
            addCriterion("FDepType is not null");
            return (Criteria) this;
        }

        public Criteria andFdeptypeEqualTo(String value) {
            addCriterion("FDepType =", value, "fdeptype");
            return (Criteria) this;
        }

        public Criteria andFdeptypeNotEqualTo(String value) {
            addCriterion("FDepType <>", value, "fdeptype");
            return (Criteria) this;
        }

        public Criteria andFdeptypeGreaterThan(String value) {
            addCriterion("FDepType >", value, "fdeptype");
            return (Criteria) this;
        }

        public Criteria andFdeptypeGreaterThanOrEqualTo(String value) {
            addCriterion("FDepType >=", value, "fdeptype");
            return (Criteria) this;
        }

        public Criteria andFdeptypeLessThan(String value) {
            addCriterion("FDepType <", value, "fdeptype");
            return (Criteria) this;
        }

        public Criteria andFdeptypeLessThanOrEqualTo(String value) {
            addCriterion("FDepType <=", value, "fdeptype");
            return (Criteria) this;
        }

        public Criteria andFdeptypeLike(String value) {
            addCriterion("FDepType like", value, "fdeptype");
            return (Criteria) this;
        }

        public Criteria andFdeptypeNotLike(String value) {
            addCriterion("FDepType not like", value, "fdeptype");
            return (Criteria) this;
        }

        public Criteria andFdeptypeIn(List<String> values) {
            addCriterion("FDepType in", values, "fdeptype");
            return (Criteria) this;
        }

        public Criteria andFdeptypeNotIn(List<String> values) {
            addCriterion("FDepType not in", values, "fdeptype");
            return (Criteria) this;
        }

        public Criteria andFdeptypeBetween(String value1, String value2) {
            addCriterion("FDepType between", value1, value2, "fdeptype");
            return (Criteria) this;
        }

        public Criteria andFdeptypeNotBetween(String value1, String value2) {
            addCriterion("FDepType not between", value1, value2, "fdeptype");
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