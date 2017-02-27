package com.hk.bean;

import java.util.ArrayList;
import java.util.List;

public class TPrivilegeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TPrivilegeExample() {
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

        public Criteria andPrivilegeidIsNull() {
            addCriterion("privilegeId is null");
            return (Criteria) this;
        }

        public Criteria andPrivilegeidIsNotNull() {
            addCriterion("privilegeId is not null");
            return (Criteria) this;
        }

        public Criteria andPrivilegeidEqualTo(Integer value) {
            addCriterion("privilegeId =", value, "privilegeid");
            return (Criteria) this;
        }

        public Criteria andPrivilegeidNotEqualTo(Integer value) {
            addCriterion("privilegeId <>", value, "privilegeid");
            return (Criteria) this;
        }

        public Criteria andPrivilegeidGreaterThan(Integer value) {
            addCriterion("privilegeId >", value, "privilegeid");
            return (Criteria) this;
        }

        public Criteria andPrivilegeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("privilegeId >=", value, "privilegeid");
            return (Criteria) this;
        }

        public Criteria andPrivilegeidLessThan(Integer value) {
            addCriterion("privilegeId <", value, "privilegeid");
            return (Criteria) this;
        }

        public Criteria andPrivilegeidLessThanOrEqualTo(Integer value) {
            addCriterion("privilegeId <=", value, "privilegeid");
            return (Criteria) this;
        }

        public Criteria andPrivilegeidIn(List<Integer> values) {
            addCriterion("privilegeId in", values, "privilegeid");
            return (Criteria) this;
        }

        public Criteria andPrivilegeidNotIn(List<Integer> values) {
            addCriterion("privilegeId not in", values, "privilegeid");
            return (Criteria) this;
        }

        public Criteria andPrivilegeidBetween(Integer value1, Integer value2) {
            addCriterion("privilegeId between", value1, value2, "privilegeid");
            return (Criteria) this;
        }

        public Criteria andPrivilegeidNotBetween(Integer value1, Integer value2) {
            addCriterion("privilegeId not between", value1, value2, "privilegeid");
            return (Criteria) this;
        }

        public Criteria andPrivilegenameIsNull() {
            addCriterion("privilegeName is null");
            return (Criteria) this;
        }

        public Criteria andPrivilegenameIsNotNull() {
            addCriterion("privilegeName is not null");
            return (Criteria) this;
        }

        public Criteria andPrivilegenameEqualTo(String value) {
            addCriterion("privilegeName =", value, "privilegename");
            return (Criteria) this;
        }

        public Criteria andPrivilegenameNotEqualTo(String value) {
            addCriterion("privilegeName <>", value, "privilegename");
            return (Criteria) this;
        }

        public Criteria andPrivilegenameGreaterThan(String value) {
            addCriterion("privilegeName >", value, "privilegename");
            return (Criteria) this;
        }

        public Criteria andPrivilegenameGreaterThanOrEqualTo(String value) {
            addCriterion("privilegeName >=", value, "privilegename");
            return (Criteria) this;
        }

        public Criteria andPrivilegenameLessThan(String value) {
            addCriterion("privilegeName <", value, "privilegename");
            return (Criteria) this;
        }

        public Criteria andPrivilegenameLessThanOrEqualTo(String value) {
            addCriterion("privilegeName <=", value, "privilegename");
            return (Criteria) this;
        }

        public Criteria andPrivilegenameLike(String value) {
            addCriterion("privilegeName like", value, "privilegename");
            return (Criteria) this;
        }

        public Criteria andPrivilegenameNotLike(String value) {
            addCriterion("privilegeName not like", value, "privilegename");
            return (Criteria) this;
        }

        public Criteria andPrivilegenameIn(List<String> values) {
            addCriterion("privilegeName in", values, "privilegename");
            return (Criteria) this;
        }

        public Criteria andPrivilegenameNotIn(List<String> values) {
            addCriterion("privilegeName not in", values, "privilegename");
            return (Criteria) this;
        }

        public Criteria andPrivilegenameBetween(String value1, String value2) {
            addCriterion("privilegeName between", value1, value2, "privilegename");
            return (Criteria) this;
        }

        public Criteria andPrivilegenameNotBetween(String value1, String value2) {
            addCriterion("privilegeName not between", value1, value2, "privilegename");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
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