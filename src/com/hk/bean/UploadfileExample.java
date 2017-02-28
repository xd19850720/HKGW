package com.hk.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UploadfileExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UploadfileExample() {
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

        public Criteria andAttachcodeIsNull() {
            addCriterion("attachCode is null");
            return (Criteria) this;
        }

        public Criteria andAttachcodeIsNotNull() {
            addCriterion("attachCode is not null");
            return (Criteria) this;
        }

        public Criteria andAttachcodeEqualTo(Integer value) {
            addCriterion("attachCode =", value, "attachcode");
            return (Criteria) this;
        }

        public Criteria andAttachcodeNotEqualTo(Integer value) {
            addCriterion("attachCode <>", value, "attachcode");
            return (Criteria) this;
        }

        public Criteria andAttachcodeGreaterThan(Integer value) {
            addCriterion("attachCode >", value, "attachcode");
            return (Criteria) this;
        }

        public Criteria andAttachcodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("attachCode >=", value, "attachcode");
            return (Criteria) this;
        }

        public Criteria andAttachcodeLessThan(Integer value) {
            addCriterion("attachCode <", value, "attachcode");
            return (Criteria) this;
        }

        public Criteria andAttachcodeLessThanOrEqualTo(Integer value) {
            addCriterion("attachCode <=", value, "attachcode");
            return (Criteria) this;
        }

        public Criteria andAttachcodeIn(List<Integer> values) {
            addCriterion("attachCode in", values, "attachcode");
            return (Criteria) this;
        }

        public Criteria andAttachcodeNotIn(List<Integer> values) {
            addCriterion("attachCode not in", values, "attachcode");
            return (Criteria) this;
        }

        public Criteria andAttachcodeBetween(Integer value1, Integer value2) {
            addCriterion("attachCode between", value1, value2, "attachcode");
            return (Criteria) this;
        }

        public Criteria andAttachcodeNotBetween(Integer value1, Integer value2) {
            addCriterion("attachCode not between", value1, value2, "attachcode");
            return (Criteria) this;
        }

        public Criteria andAttachnameIsNull() {
            addCriterion("attachName is null");
            return (Criteria) this;
        }

        public Criteria andAttachnameIsNotNull() {
            addCriterion("attachName is not null");
            return (Criteria) this;
        }

        public Criteria andAttachnameEqualTo(String value) {
            addCriterion("attachName =", value, "attachname");
            return (Criteria) this;
        }

        public Criteria andAttachnameNotEqualTo(String value) {
            addCriterion("attachName <>", value, "attachname");
            return (Criteria) this;
        }

        public Criteria andAttachnameGreaterThan(String value) {
            addCriterion("attachName >", value, "attachname");
            return (Criteria) this;
        }

        public Criteria andAttachnameGreaterThanOrEqualTo(String value) {
            addCriterion("attachName >=", value, "attachname");
            return (Criteria) this;
        }

        public Criteria andAttachnameLessThan(String value) {
            addCriterion("attachName <", value, "attachname");
            return (Criteria) this;
        }

        public Criteria andAttachnameLessThanOrEqualTo(String value) {
            addCriterion("attachName <=", value, "attachname");
            return (Criteria) this;
        }

        public Criteria andAttachnameLike(String value) {
            addCriterion("attachName like", value, "attachname");
            return (Criteria) this;
        }

        public Criteria andAttachnameNotLike(String value) {
            addCriterion("attachName not like", value, "attachname");
            return (Criteria) this;
        }

        public Criteria andAttachnameIn(List<String> values) {
            addCriterion("attachName in", values, "attachname");
            return (Criteria) this;
        }

        public Criteria andAttachnameNotIn(List<String> values) {
            addCriterion("attachName not in", values, "attachname");
            return (Criteria) this;
        }

        public Criteria andAttachnameBetween(String value1, String value2) {
            addCriterion("attachName between", value1, value2, "attachname");
            return (Criteria) this;
        }

        public Criteria andAttachnameNotBetween(String value1, String value2) {
            addCriterion("attachName not between", value1, value2, "attachname");
            return (Criteria) this;
        }

        public Criteria andAttachfilepathIsNull() {
            addCriterion("attachFilePath is null");
            return (Criteria) this;
        }

        public Criteria andAttachfilepathIsNotNull() {
            addCriterion("attachFilePath is not null");
            return (Criteria) this;
        }

        public Criteria andAttachfilepathEqualTo(String value) {
            addCriterion("attachFilePath =", value, "attachfilepath");
            return (Criteria) this;
        }

        public Criteria andAttachfilepathNotEqualTo(String value) {
            addCriterion("attachFilePath <>", value, "attachfilepath");
            return (Criteria) this;
        }

        public Criteria andAttachfilepathGreaterThan(String value) {
            addCriterion("attachFilePath >", value, "attachfilepath");
            return (Criteria) this;
        }

        public Criteria andAttachfilepathGreaterThanOrEqualTo(String value) {
            addCriterion("attachFilePath >=", value, "attachfilepath");
            return (Criteria) this;
        }

        public Criteria andAttachfilepathLessThan(String value) {
            addCriterion("attachFilePath <", value, "attachfilepath");
            return (Criteria) this;
        }

        public Criteria andAttachfilepathLessThanOrEqualTo(String value) {
            addCriterion("attachFilePath <=", value, "attachfilepath");
            return (Criteria) this;
        }

        public Criteria andAttachfilepathLike(String value) {
            addCriterion("attachFilePath like", value, "attachfilepath");
            return (Criteria) this;
        }

        public Criteria andAttachfilepathNotLike(String value) {
            addCriterion("attachFilePath not like", value, "attachfilepath");
            return (Criteria) this;
        }

        public Criteria andAttachfilepathIn(List<String> values) {
            addCriterion("attachFilePath in", values, "attachfilepath");
            return (Criteria) this;
        }

        public Criteria andAttachfilepathNotIn(List<String> values) {
            addCriterion("attachFilePath not in", values, "attachfilepath");
            return (Criteria) this;
        }

        public Criteria andAttachfilepathBetween(String value1, String value2) {
            addCriterion("attachFilePath between", value1, value2, "attachfilepath");
            return (Criteria) this;
        }

        public Criteria andAttachfilepathNotBetween(String value1, String value2) {
            addCriterion("attachFilePath not between", value1, value2, "attachfilepath");
            return (Criteria) this;
        }

        public Criteria andCreatornameIsNull() {
            addCriterion("creatorName is null");
            return (Criteria) this;
        }

        public Criteria andCreatornameIsNotNull() {
            addCriterion("creatorName is not null");
            return (Criteria) this;
        }

        public Criteria andCreatornameEqualTo(String value) {
            addCriterion("creatorName =", value, "creatorname");
            return (Criteria) this;
        }

        public Criteria andCreatornameNotEqualTo(String value) {
            addCriterion("creatorName <>", value, "creatorname");
            return (Criteria) this;
        }

        public Criteria andCreatornameGreaterThan(String value) {
            addCriterion("creatorName >", value, "creatorname");
            return (Criteria) this;
        }

        public Criteria andCreatornameGreaterThanOrEqualTo(String value) {
            addCriterion("creatorName >=", value, "creatorname");
            return (Criteria) this;
        }

        public Criteria andCreatornameLessThan(String value) {
            addCriterion("creatorName <", value, "creatorname");
            return (Criteria) this;
        }

        public Criteria andCreatornameLessThanOrEqualTo(String value) {
            addCriterion("creatorName <=", value, "creatorname");
            return (Criteria) this;
        }

        public Criteria andCreatornameLike(String value) {
            addCriterion("creatorName like", value, "creatorname");
            return (Criteria) this;
        }

        public Criteria andCreatornameNotLike(String value) {
            addCriterion("creatorName not like", value, "creatorname");
            return (Criteria) this;
        }

        public Criteria andCreatornameIn(List<String> values) {
            addCriterion("creatorName in", values, "creatorname");
            return (Criteria) this;
        }

        public Criteria andCreatornameNotIn(List<String> values) {
            addCriterion("creatorName not in", values, "creatorname");
            return (Criteria) this;
        }

        public Criteria andCreatornameBetween(String value1, String value2) {
            addCriterion("creatorName between", value1, value2, "creatorname");
            return (Criteria) this;
        }

        public Criteria andCreatornameNotBetween(String value1, String value2) {
            addCriterion("creatorName not between", value1, value2, "creatorname");
            return (Criteria) this;
        }

        public Criteria andCreatoridIsNull() {
            addCriterion("creatorID is null");
            return (Criteria) this;
        }

        public Criteria andCreatoridIsNotNull() {
            addCriterion("creatorID is not null");
            return (Criteria) this;
        }

        public Criteria andCreatoridEqualTo(String value) {
            addCriterion("creatorID =", value, "creatorid");
            return (Criteria) this;
        }

        public Criteria andCreatoridNotEqualTo(String value) {
            addCriterion("creatorID <>", value, "creatorid");
            return (Criteria) this;
        }

        public Criteria andCreatoridGreaterThan(String value) {
            addCriterion("creatorID >", value, "creatorid");
            return (Criteria) this;
        }

        public Criteria andCreatoridGreaterThanOrEqualTo(String value) {
            addCriterion("creatorID >=", value, "creatorid");
            return (Criteria) this;
        }

        public Criteria andCreatoridLessThan(String value) {
            addCriterion("creatorID <", value, "creatorid");
            return (Criteria) this;
        }

        public Criteria andCreatoridLessThanOrEqualTo(String value) {
            addCriterion("creatorID <=", value, "creatorid");
            return (Criteria) this;
        }

        public Criteria andCreatoridLike(String value) {
            addCriterion("creatorID like", value, "creatorid");
            return (Criteria) this;
        }

        public Criteria andCreatoridNotLike(String value) {
            addCriterion("creatorID not like", value, "creatorid");
            return (Criteria) this;
        }

        public Criteria andCreatoridIn(List<String> values) {
            addCriterion("creatorID in", values, "creatorid");
            return (Criteria) this;
        }

        public Criteria andCreatoridNotIn(List<String> values) {
            addCriterion("creatorID not in", values, "creatorid");
            return (Criteria) this;
        }

        public Criteria andCreatoridBetween(String value1, String value2) {
            addCriterion("creatorID between", value1, value2, "creatorid");
            return (Criteria) this;
        }

        public Criteria andCreatoridNotBetween(String value1, String value2) {
            addCriterion("creatorID not between", value1, value2, "creatorid");
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

        public Criteria andGettimeIsNull() {
            addCriterion("getTime is null");
            return (Criteria) this;
        }

        public Criteria andGettimeIsNotNull() {
            addCriterion("getTime is not null");
            return (Criteria) this;
        }

        public Criteria andGettimeEqualTo(Date value) {
            addCriterion("getTime =", value, "gettime");
            return (Criteria) this;
        }

        public Criteria andGettimeNotEqualTo(Date value) {
            addCriterion("getTime <>", value, "gettime");
            return (Criteria) this;
        }

        public Criteria andGettimeGreaterThan(Date value) {
            addCriterion("getTime >", value, "gettime");
            return (Criteria) this;
        }

        public Criteria andGettimeGreaterThanOrEqualTo(Date value) {
            addCriterion("getTime >=", value, "gettime");
            return (Criteria) this;
        }

        public Criteria andGettimeLessThan(Date value) {
            addCriterion("getTime <", value, "gettime");
            return (Criteria) this;
        }

        public Criteria andGettimeLessThanOrEqualTo(Date value) {
            addCriterion("getTime <=", value, "gettime");
            return (Criteria) this;
        }

        public Criteria andGettimeIn(List<Date> values) {
            addCriterion("getTime in", values, "gettime");
            return (Criteria) this;
        }

        public Criteria andGettimeNotIn(List<Date> values) {
            addCriterion("getTime not in", values, "gettime");
            return (Criteria) this;
        }

        public Criteria andGettimeBetween(Date value1, Date value2) {
            addCriterion("getTime between", value1, value2, "gettime");
            return (Criteria) this;
        }

        public Criteria andGettimeNotBetween(Date value1, Date value2) {
            addCriterion("getTime not between", value1, value2, "gettime");
            return (Criteria) this;
        }

        public Criteria andGeneratednameIsNull() {
            addCriterion("generatedName is null");
            return (Criteria) this;
        }

        public Criteria andGeneratednameIsNotNull() {
            addCriterion("generatedName is not null");
            return (Criteria) this;
        }

        public Criteria andGeneratednameEqualTo(String value) {
            addCriterion("generatedName =", value, "generatedname");
            return (Criteria) this;
        }

        public Criteria andGeneratednameNotEqualTo(String value) {
            addCriterion("generatedName <>", value, "generatedname");
            return (Criteria) this;
        }

        public Criteria andGeneratednameGreaterThan(String value) {
            addCriterion("generatedName >", value, "generatedname");
            return (Criteria) this;
        }

        public Criteria andGeneratednameGreaterThanOrEqualTo(String value) {
            addCriterion("generatedName >=", value, "generatedname");
            return (Criteria) this;
        }

        public Criteria andGeneratednameLessThan(String value) {
            addCriterion("generatedName <", value, "generatedname");
            return (Criteria) this;
        }

        public Criteria andGeneratednameLessThanOrEqualTo(String value) {
            addCriterion("generatedName <=", value, "generatedname");
            return (Criteria) this;
        }

        public Criteria andGeneratednameLike(String value) {
            addCriterion("generatedName like", value, "generatedname");
            return (Criteria) this;
        }

        public Criteria andGeneratednameNotLike(String value) {
            addCriterion("generatedName not like", value, "generatedname");
            return (Criteria) this;
        }

        public Criteria andGeneratednameIn(List<String> values) {
            addCriterion("generatedName in", values, "generatedname");
            return (Criteria) this;
        }

        public Criteria andGeneratednameNotIn(List<String> values) {
            addCriterion("generatedName not in", values, "generatedname");
            return (Criteria) this;
        }

        public Criteria andGeneratednameBetween(String value1, String value2) {
            addCriterion("generatedName between", value1, value2, "generatedname");
            return (Criteria) this;
        }

        public Criteria andGeneratednameNotBetween(String value1, String value2) {
            addCriterion("generatedName not between", value1, value2, "generatedname");
            return (Criteria) this;
        }

        public Criteria andDocumentidIsNull() {
            addCriterion("documentId is null");
            return (Criteria) this;
        }

        public Criteria andDocumentidIsNotNull() {
            addCriterion("documentId is not null");
            return (Criteria) this;
        }

        public Criteria andDocumentidEqualTo(Integer value) {
            addCriterion("documentId =", value, "documentid");
            return (Criteria) this;
        }

        public Criteria andDocumentidNotEqualTo(Integer value) {
            addCriterion("documentId <>", value, "documentid");
            return (Criteria) this;
        }

        public Criteria andDocumentidGreaterThan(Integer value) {
            addCriterion("documentId >", value, "documentid");
            return (Criteria) this;
        }

        public Criteria andDocumentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("documentId >=", value, "documentid");
            return (Criteria) this;
        }

        public Criteria andDocumentidLessThan(Integer value) {
            addCriterion("documentId <", value, "documentid");
            return (Criteria) this;
        }

        public Criteria andDocumentidLessThanOrEqualTo(Integer value) {
            addCriterion("documentId <=", value, "documentid");
            return (Criteria) this;
        }

        public Criteria andDocumentidIn(List<Integer> values) {
            addCriterion("documentId in", values, "documentid");
            return (Criteria) this;
        }

        public Criteria andDocumentidNotIn(List<Integer> values) {
            addCriterion("documentId not in", values, "documentid");
            return (Criteria) this;
        }

        public Criteria andDocumentidBetween(Integer value1, Integer value2) {
            addCriterion("documentId between", value1, value2, "documentid");
            return (Criteria) this;
        }

        public Criteria andDocumentidNotBetween(Integer value1, Integer value2) {
            addCriterion("documentId not between", value1, value2, "documentid");
            return (Criteria) this;
        }

        public Criteria andReceivedocidIsNull() {
            addCriterion("receiveDocId is null");
            return (Criteria) this;
        }

        public Criteria andReceivedocidIsNotNull() {
            addCriterion("receiveDocId is not null");
            return (Criteria) this;
        }

        public Criteria andReceivedocidEqualTo(Integer value) {
            addCriterion("receiveDocId =", value, "receivedocid");
            return (Criteria) this;
        }

        public Criteria andReceivedocidNotEqualTo(Integer value) {
            addCriterion("receiveDocId <>", value, "receivedocid");
            return (Criteria) this;
        }

        public Criteria andReceivedocidGreaterThan(Integer value) {
            addCriterion("receiveDocId >", value, "receivedocid");
            return (Criteria) this;
        }

        public Criteria andReceivedocidGreaterThanOrEqualTo(Integer value) {
            addCriterion("receiveDocId >=", value, "receivedocid");
            return (Criteria) this;
        }

        public Criteria andReceivedocidLessThan(Integer value) {
            addCriterion("receiveDocId <", value, "receivedocid");
            return (Criteria) this;
        }

        public Criteria andReceivedocidLessThanOrEqualTo(Integer value) {
            addCriterion("receiveDocId <=", value, "receivedocid");
            return (Criteria) this;
        }

        public Criteria andReceivedocidIn(List<Integer> values) {
            addCriterion("receiveDocId in", values, "receivedocid");
            return (Criteria) this;
        }

        public Criteria andReceivedocidNotIn(List<Integer> values) {
            addCriterion("receiveDocId not in", values, "receivedocid");
            return (Criteria) this;
        }

        public Criteria andReceivedocidBetween(Integer value1, Integer value2) {
            addCriterion("receiveDocId between", value1, value2, "receivedocid");
            return (Criteria) this;
        }

        public Criteria andReceivedocidNotBetween(Integer value1, Integer value2) {
            addCriterion("receiveDocId not between", value1, value2, "receivedocid");
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