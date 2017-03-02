package com.hk.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DeptsignlogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DeptsignlogExample() {
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

        public Criteria andFuseridIsNull() {
            addCriterion("FuserID is null");
            return (Criteria) this;
        }

        public Criteria andFuseridIsNotNull() {
            addCriterion("FuserID is not null");
            return (Criteria) this;
        }

        public Criteria andFuseridEqualTo(String value) {
            addCriterion("FuserID =", value, "fuserid");
            return (Criteria) this;
        }

        public Criteria andFuseridNotEqualTo(String value) {
            addCriterion("FuserID <>", value, "fuserid");
            return (Criteria) this;
        }

        public Criteria andFuseridGreaterThan(String value) {
            addCriterion("FuserID >", value, "fuserid");
            return (Criteria) this;
        }

        public Criteria andFuseridGreaterThanOrEqualTo(String value) {
            addCriterion("FuserID >=", value, "fuserid");
            return (Criteria) this;
        }

        public Criteria andFuseridLessThan(String value) {
            addCriterion("FuserID <", value, "fuserid");
            return (Criteria) this;
        }

        public Criteria andFuseridLessThanOrEqualTo(String value) {
            addCriterion("FuserID <=", value, "fuserid");
            return (Criteria) this;
        }

        public Criteria andFuseridLike(String value) {
            addCriterion("FuserID like", value, "fuserid");
            return (Criteria) this;
        }

        public Criteria andFuseridNotLike(String value) {
            addCriterion("FuserID not like", value, "fuserid");
            return (Criteria) this;
        }

        public Criteria andFuseridIn(List<String> values) {
            addCriterion("FuserID in", values, "fuserid");
            return (Criteria) this;
        }

        public Criteria andFuseridNotIn(List<String> values) {
            addCriterion("FuserID not in", values, "fuserid");
            return (Criteria) this;
        }

        public Criteria andFuseridBetween(String value1, String value2) {
            addCriterion("FuserID between", value1, value2, "fuserid");
            return (Criteria) this;
        }

        public Criteria andFuseridNotBetween(String value1, String value2) {
            addCriterion("FuserID not between", value1, value2, "fuserid");
            return (Criteria) this;
        }

        public Criteria andFusernameIsNull() {
            addCriterion("FuserName is null");
            return (Criteria) this;
        }

        public Criteria andFusernameIsNotNull() {
            addCriterion("FuserName is not null");
            return (Criteria) this;
        }

        public Criteria andFusernameEqualTo(String value) {
            addCriterion("FuserName =", value, "fusername");
            return (Criteria) this;
        }

        public Criteria andFusernameNotEqualTo(String value) {
            addCriterion("FuserName <>", value, "fusername");
            return (Criteria) this;
        }

        public Criteria andFusernameGreaterThan(String value) {
            addCriterion("FuserName >", value, "fusername");
            return (Criteria) this;
        }

        public Criteria andFusernameGreaterThanOrEqualTo(String value) {
            addCriterion("FuserName >=", value, "fusername");
            return (Criteria) this;
        }

        public Criteria andFusernameLessThan(String value) {
            addCriterion("FuserName <", value, "fusername");
            return (Criteria) this;
        }

        public Criteria andFusernameLessThanOrEqualTo(String value) {
            addCriterion("FuserName <=", value, "fusername");
            return (Criteria) this;
        }

        public Criteria andFusernameLike(String value) {
            addCriterion("FuserName like", value, "fusername");
            return (Criteria) this;
        }

        public Criteria andFusernameNotLike(String value) {
            addCriterion("FuserName not like", value, "fusername");
            return (Criteria) this;
        }

        public Criteria andFusernameIn(List<String> values) {
            addCriterion("FuserName in", values, "fusername");
            return (Criteria) this;
        }

        public Criteria andFusernameNotIn(List<String> values) {
            addCriterion("FuserName not in", values, "fusername");
            return (Criteria) this;
        }

        public Criteria andFusernameBetween(String value1, String value2) {
            addCriterion("FuserName between", value1, value2, "fusername");
            return (Criteria) this;
        }

        public Criteria andFusernameNotBetween(String value1, String value2) {
            addCriterion("FuserName not between", value1, value2, "fusername");
            return (Criteria) this;
        }

        public Criteria andFpositionidIsNull() {
            addCriterion("FpositionID is null");
            return (Criteria) this;
        }

        public Criteria andFpositionidIsNotNull() {
            addCriterion("FpositionID is not null");
            return (Criteria) this;
        }

        public Criteria andFpositionidEqualTo(String value) {
            addCriterion("FpositionID =", value, "fpositionid");
            return (Criteria) this;
        }

        public Criteria andFpositionidNotEqualTo(String value) {
            addCriterion("FpositionID <>", value, "fpositionid");
            return (Criteria) this;
        }

        public Criteria andFpositionidGreaterThan(String value) {
            addCriterion("FpositionID >", value, "fpositionid");
            return (Criteria) this;
        }

        public Criteria andFpositionidGreaterThanOrEqualTo(String value) {
            addCriterion("FpositionID >=", value, "fpositionid");
            return (Criteria) this;
        }

        public Criteria andFpositionidLessThan(String value) {
            addCriterion("FpositionID <", value, "fpositionid");
            return (Criteria) this;
        }

        public Criteria andFpositionidLessThanOrEqualTo(String value) {
            addCriterion("FpositionID <=", value, "fpositionid");
            return (Criteria) this;
        }

        public Criteria andFpositionidLike(String value) {
            addCriterion("FpositionID like", value, "fpositionid");
            return (Criteria) this;
        }

        public Criteria andFpositionidNotLike(String value) {
            addCriterion("FpositionID not like", value, "fpositionid");
            return (Criteria) this;
        }

        public Criteria andFpositionidIn(List<String> values) {
            addCriterion("FpositionID in", values, "fpositionid");
            return (Criteria) this;
        }

        public Criteria andFpositionidNotIn(List<String> values) {
            addCriterion("FpositionID not in", values, "fpositionid");
            return (Criteria) this;
        }

        public Criteria andFpositionidBetween(String value1, String value2) {
            addCriterion("FpositionID between", value1, value2, "fpositionid");
            return (Criteria) this;
        }

        public Criteria andFpositionidNotBetween(String value1, String value2) {
            addCriterion("FpositionID not between", value1, value2, "fpositionid");
            return (Criteria) this;
        }

        public Criteria andFpositionnameIsNull() {
            addCriterion("FpositionName is null");
            return (Criteria) this;
        }

        public Criteria andFpositionnameIsNotNull() {
            addCriterion("FpositionName is not null");
            return (Criteria) this;
        }

        public Criteria andFpositionnameEqualTo(String value) {
            addCriterion("FpositionName =", value, "fpositionname");
            return (Criteria) this;
        }

        public Criteria andFpositionnameNotEqualTo(String value) {
            addCriterion("FpositionName <>", value, "fpositionname");
            return (Criteria) this;
        }

        public Criteria andFpositionnameGreaterThan(String value) {
            addCriterion("FpositionName >", value, "fpositionname");
            return (Criteria) this;
        }

        public Criteria andFpositionnameGreaterThanOrEqualTo(String value) {
            addCriterion("FpositionName >=", value, "fpositionname");
            return (Criteria) this;
        }

        public Criteria andFpositionnameLessThan(String value) {
            addCriterion("FpositionName <", value, "fpositionname");
            return (Criteria) this;
        }

        public Criteria andFpositionnameLessThanOrEqualTo(String value) {
            addCriterion("FpositionName <=", value, "fpositionname");
            return (Criteria) this;
        }

        public Criteria andFpositionnameLike(String value) {
            addCriterion("FpositionName like", value, "fpositionname");
            return (Criteria) this;
        }

        public Criteria andFpositionnameNotLike(String value) {
            addCriterion("FpositionName not like", value, "fpositionname");
            return (Criteria) this;
        }

        public Criteria andFpositionnameIn(List<String> values) {
            addCriterion("FpositionName in", values, "fpositionname");
            return (Criteria) this;
        }

        public Criteria andFpositionnameNotIn(List<String> values) {
            addCriterion("FpositionName not in", values, "fpositionname");
            return (Criteria) this;
        }

        public Criteria andFpositionnameBetween(String value1, String value2) {
            addCriterion("FpositionName between", value1, value2, "fpositionname");
            return (Criteria) this;
        }

        public Criteria andFpositionnameNotBetween(String value1, String value2) {
            addCriterion("FpositionName not between", value1, value2, "fpositionname");
            return (Criteria) this;
        }

        public Criteria andFtextIsNull() {
            addCriterion("FText is null");
            return (Criteria) this;
        }

        public Criteria andFtextIsNotNull() {
            addCriterion("FText is not null");
            return (Criteria) this;
        }

        public Criteria andFtextEqualTo(String value) {
            addCriterion("FText =", value, "ftext");
            return (Criteria) this;
        }

        public Criteria andFtextNotEqualTo(String value) {
            addCriterion("FText <>", value, "ftext");
            return (Criteria) this;
        }

        public Criteria andFtextGreaterThan(String value) {
            addCriterion("FText >", value, "ftext");
            return (Criteria) this;
        }

        public Criteria andFtextGreaterThanOrEqualTo(String value) {
            addCriterion("FText >=", value, "ftext");
            return (Criteria) this;
        }

        public Criteria andFtextLessThan(String value) {
            addCriterion("FText <", value, "ftext");
            return (Criteria) this;
        }

        public Criteria andFtextLessThanOrEqualTo(String value) {
            addCriterion("FText <=", value, "ftext");
            return (Criteria) this;
        }

        public Criteria andFtextLike(String value) {
            addCriterion("FText like", value, "ftext");
            return (Criteria) this;
        }

        public Criteria andFtextNotLike(String value) {
            addCriterion("FText not like", value, "ftext");
            return (Criteria) this;
        }

        public Criteria andFtextIn(List<String> values) {
            addCriterion("FText in", values, "ftext");
            return (Criteria) this;
        }

        public Criteria andFtextNotIn(List<String> values) {
            addCriterion("FText not in", values, "ftext");
            return (Criteria) this;
        }

        public Criteria andFtextBetween(String value1, String value2) {
            addCriterion("FText between", value1, value2, "ftext");
            return (Criteria) this;
        }

        public Criteria andFtextNotBetween(String value1, String value2) {
            addCriterion("FText not between", value1, value2, "ftext");
            return (Criteria) this;
        }

        public Criteria andSigntimeIsNull() {
            addCriterion("SignTime is null");
            return (Criteria) this;
        }

        public Criteria andSigntimeIsNotNull() {
            addCriterion("SignTime is not null");
            return (Criteria) this;
        }

        public Criteria andSigntimeEqualTo(Date value) {
            addCriterion("SignTime =", value, "signtime");
            return (Criteria) this;
        }

        public Criteria andSigntimeNotEqualTo(Date value) {
            addCriterion("SignTime <>", value, "signtime");
            return (Criteria) this;
        }

        public Criteria andSigntimeGreaterThan(Date value) {
            addCriterion("SignTime >", value, "signtime");
            return (Criteria) this;
        }

        public Criteria andSigntimeGreaterThanOrEqualTo(Date value) {
            addCriterion("SignTime >=", value, "signtime");
            return (Criteria) this;
        }

        public Criteria andSigntimeLessThan(Date value) {
            addCriterion("SignTime <", value, "signtime");
            return (Criteria) this;
        }

        public Criteria andSigntimeLessThanOrEqualTo(Date value) {
            addCriterion("SignTime <=", value, "signtime");
            return (Criteria) this;
        }

        public Criteria andSigntimeIn(List<Date> values) {
            addCriterion("SignTime in", values, "signtime");
            return (Criteria) this;
        }

        public Criteria andSigntimeNotIn(List<Date> values) {
            addCriterion("SignTime not in", values, "signtime");
            return (Criteria) this;
        }

        public Criteria andSigntimeBetween(Date value1, Date value2) {
            addCriterion("SignTime between", value1, value2, "signtime");
            return (Criteria) this;
        }

        public Criteria andSigntimeNotBetween(Date value1, Date value2) {
            addCriterion("SignTime not between", value1, value2, "signtime");
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