package com.hk.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SenddocsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SenddocsExample() {
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

        public Criteria andFdepartmentIsNull() {
            addCriterion("Fdepartment is null");
            return (Criteria) this;
        }

        public Criteria andFdepartmentIsNotNull() {
            addCriterion("Fdepartment is not null");
            return (Criteria) this;
        }

        public Criteria andFdepartmentEqualTo(String value) {
            addCriterion("Fdepartment =", value, "fdepartment");
            return (Criteria) this;
        }

        public Criteria andFdepartmentNotEqualTo(String value) {
            addCriterion("Fdepartment <>", value, "fdepartment");
            return (Criteria) this;
        }

        public Criteria andFdepartmentGreaterThan(String value) {
            addCriterion("Fdepartment >", value, "fdepartment");
            return (Criteria) this;
        }

        public Criteria andFdepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("Fdepartment >=", value, "fdepartment");
            return (Criteria) this;
        }

        public Criteria andFdepartmentLessThan(String value) {
            addCriterion("Fdepartment <", value, "fdepartment");
            return (Criteria) this;
        }

        public Criteria andFdepartmentLessThanOrEqualTo(String value) {
            addCriterion("Fdepartment <=", value, "fdepartment");
            return (Criteria) this;
        }

        public Criteria andFdepartmentLike(String value) {
            addCriterion("Fdepartment like", value, "fdepartment");
            return (Criteria) this;
        }

        public Criteria andFdepartmentNotLike(String value) {
            addCriterion("Fdepartment not like", value, "fdepartment");
            return (Criteria) this;
        }

        public Criteria andFdepartmentIn(List<String> values) {
            addCriterion("Fdepartment in", values, "fdepartment");
            return (Criteria) this;
        }

        public Criteria andFdepartmentNotIn(List<String> values) {
            addCriterion("Fdepartment not in", values, "fdepartment");
            return (Criteria) this;
        }

        public Criteria andFdepartmentBetween(String value1, String value2) {
            addCriterion("Fdepartment between", value1, value2, "fdepartment");
            return (Criteria) this;
        }

        public Criteria andFdepartmentNotBetween(String value1, String value2) {
            addCriterion("Fdepartment not between", value1, value2, "fdepartment");
            return (Criteria) this;
        }

        public Criteria andFdepartmentidIsNull() {
            addCriterion("FdepartmentID is null");
            return (Criteria) this;
        }

        public Criteria andFdepartmentidIsNotNull() {
            addCriterion("FdepartmentID is not null");
            return (Criteria) this;
        }

        public Criteria andFdepartmentidEqualTo(String value) {
            addCriterion("FdepartmentID =", value, "fdepartmentid");
            return (Criteria) this;
        }

        public Criteria andFdepartmentidNotEqualTo(String value) {
            addCriterion("FdepartmentID <>", value, "fdepartmentid");
            return (Criteria) this;
        }

        public Criteria andFdepartmentidGreaterThan(String value) {
            addCriterion("FdepartmentID >", value, "fdepartmentid");
            return (Criteria) this;
        }

        public Criteria andFdepartmentidGreaterThanOrEqualTo(String value) {
            addCriterion("FdepartmentID >=", value, "fdepartmentid");
            return (Criteria) this;
        }

        public Criteria andFdepartmentidLessThan(String value) {
            addCriterion("FdepartmentID <", value, "fdepartmentid");
            return (Criteria) this;
        }

        public Criteria andFdepartmentidLessThanOrEqualTo(String value) {
            addCriterion("FdepartmentID <=", value, "fdepartmentid");
            return (Criteria) this;
        }

        public Criteria andFdepartmentidLike(String value) {
            addCriterion("FdepartmentID like", value, "fdepartmentid");
            return (Criteria) this;
        }

        public Criteria andFdepartmentidNotLike(String value) {
            addCriterion("FdepartmentID not like", value, "fdepartmentid");
            return (Criteria) this;
        }

        public Criteria andFdepartmentidIn(List<String> values) {
            addCriterion("FdepartmentID in", values, "fdepartmentid");
            return (Criteria) this;
        }

        public Criteria andFdepartmentidNotIn(List<String> values) {
            addCriterion("FdepartmentID not in", values, "fdepartmentid");
            return (Criteria) this;
        }

        public Criteria andFdepartmentidBetween(String value1, String value2) {
            addCriterion("FdepartmentID between", value1, value2, "fdepartmentid");
            return (Criteria) this;
        }

        public Criteria andFdepartmentidNotBetween(String value1, String value2) {
            addCriterion("FdepartmentID not between", value1, value2, "fdepartmentid");
            return (Criteria) this;
        }

        public Criteria andFfiledateIsNull() {
            addCriterion("FFiledate is null");
            return (Criteria) this;
        }

        public Criteria andFfiledateIsNotNull() {
            addCriterion("FFiledate is not null");
            return (Criteria) this;
        }

        public Criteria andFfiledateEqualTo(Date value) {
            addCriterion("FFiledate =", value, "ffiledate");
            return (Criteria) this;
        }

        public Criteria andFfiledateNotEqualTo(Date value) {
            addCriterion("FFiledate <>", value, "ffiledate");
            return (Criteria) this;
        }

        public Criteria andFfiledateGreaterThan(Date value) {
            addCriterion("FFiledate >", value, "ffiledate");
            return (Criteria) this;
        }

        public Criteria andFfiledateGreaterThanOrEqualTo(Date value) {
            addCriterion("FFiledate >=", value, "ffiledate");
            return (Criteria) this;
        }

        public Criteria andFfiledateLessThan(Date value) {
            addCriterion("FFiledate <", value, "ffiledate");
            return (Criteria) this;
        }

        public Criteria andFfiledateLessThanOrEqualTo(Date value) {
            addCriterion("FFiledate <=", value, "ffiledate");
            return (Criteria) this;
        }

        public Criteria andFfiledateIn(List<Date> values) {
            addCriterion("FFiledate in", values, "ffiledate");
            return (Criteria) this;
        }

        public Criteria andFfiledateNotIn(List<Date> values) {
            addCriterion("FFiledate not in", values, "ffiledate");
            return (Criteria) this;
        }

        public Criteria andFfiledateBetween(Date value1, Date value2) {
            addCriterion("FFiledate between", value1, value2, "ffiledate");
            return (Criteria) this;
        }

        public Criteria andFfiledateNotBetween(Date value1, Date value2) {
            addCriterion("FFiledate not between", value1, value2, "ffiledate");
            return (Criteria) this;
        }

        public Criteria andFsecrecyIsNull() {
            addCriterion("FSecrecy is null");
            return (Criteria) this;
        }

        public Criteria andFsecrecyIsNotNull() {
            addCriterion("FSecrecy is not null");
            return (Criteria) this;
        }

        public Criteria andFsecrecyEqualTo(Integer value) {
            addCriterion("FSecrecy =", value, "fsecrecy");
            return (Criteria) this;
        }

        public Criteria andFsecrecyNotEqualTo(Integer value) {
            addCriterion("FSecrecy <>", value, "fsecrecy");
            return (Criteria) this;
        }

        public Criteria andFsecrecyGreaterThan(Integer value) {
            addCriterion("FSecrecy >", value, "fsecrecy");
            return (Criteria) this;
        }

        public Criteria andFsecrecyGreaterThanOrEqualTo(Integer value) {
            addCriterion("FSecrecy >=", value, "fsecrecy");
            return (Criteria) this;
        }

        public Criteria andFsecrecyLessThan(Integer value) {
            addCriterion("FSecrecy <", value, "fsecrecy");
            return (Criteria) this;
        }

        public Criteria andFsecrecyLessThanOrEqualTo(Integer value) {
            addCriterion("FSecrecy <=", value, "fsecrecy");
            return (Criteria) this;
        }

        public Criteria andFsecrecyIn(List<Integer> values) {
            addCriterion("FSecrecy in", values, "fsecrecy");
            return (Criteria) this;
        }

        public Criteria andFsecrecyNotIn(List<Integer> values) {
            addCriterion("FSecrecy not in", values, "fsecrecy");
            return (Criteria) this;
        }

        public Criteria andFsecrecyBetween(Integer value1, Integer value2) {
            addCriterion("FSecrecy between", value1, value2, "fsecrecy");
            return (Criteria) this;
        }

        public Criteria andFsecrecyNotBetween(Integer value1, Integer value2) {
            addCriterion("FSecrecy not between", value1, value2, "fsecrecy");
            return (Criteria) this;
        }

        public Criteria andFnoIsNull() {
            addCriterion("FNo is null");
            return (Criteria) this;
        }

        public Criteria andFnoIsNotNull() {
            addCriterion("FNo is not null");
            return (Criteria) this;
        }

        public Criteria andFnoEqualTo(String value) {
            addCriterion("FNo =", value, "fno");
            return (Criteria) this;
        }

        public Criteria andFnoNotEqualTo(String value) {
            addCriterion("FNo <>", value, "fno");
            return (Criteria) this;
        }

        public Criteria andFnoGreaterThan(String value) {
            addCriterion("FNo >", value, "fno");
            return (Criteria) this;
        }

        public Criteria andFnoGreaterThanOrEqualTo(String value) {
            addCriterion("FNo >=", value, "fno");
            return (Criteria) this;
        }

        public Criteria andFnoLessThan(String value) {
            addCriterion("FNo <", value, "fno");
            return (Criteria) this;
        }

        public Criteria andFnoLessThanOrEqualTo(String value) {
            addCriterion("FNo <=", value, "fno");
            return (Criteria) this;
        }

        public Criteria andFnoLike(String value) {
            addCriterion("FNo like", value, "fno");
            return (Criteria) this;
        }

        public Criteria andFnoNotLike(String value) {
            addCriterion("FNo not like", value, "fno");
            return (Criteria) this;
        }

        public Criteria andFnoIn(List<String> values) {
            addCriterion("FNo in", values, "fno");
            return (Criteria) this;
        }

        public Criteria andFnoNotIn(List<String> values) {
            addCriterion("FNo not in", values, "fno");
            return (Criteria) this;
        }

        public Criteria andFnoBetween(String value1, String value2) {
            addCriterion("FNo between", value1, value2, "fno");
            return (Criteria) this;
        }

        public Criteria andFnoNotBetween(String value1, String value2) {
            addCriterion("FNo not between", value1, value2, "fno");
            return (Criteria) this;
        }

        public Criteria andFtitleIsNull() {
            addCriterion("Ftitle is null");
            return (Criteria) this;
        }

        public Criteria andFtitleIsNotNull() {
            addCriterion("Ftitle is not null");
            return (Criteria) this;
        }

        public Criteria andFtitleEqualTo(String value) {
            addCriterion("Ftitle =", value, "ftitle");
            return (Criteria) this;
        }

        public Criteria andFtitleNotEqualTo(String value) {
            addCriterion("Ftitle <>", value, "ftitle");
            return (Criteria) this;
        }

        public Criteria andFtitleGreaterThan(String value) {
            addCriterion("Ftitle >", value, "ftitle");
            return (Criteria) this;
        }

        public Criteria andFtitleGreaterThanOrEqualTo(String value) {
            addCriterion("Ftitle >=", value, "ftitle");
            return (Criteria) this;
        }

        public Criteria andFtitleLessThan(String value) {
            addCriterion("Ftitle <", value, "ftitle");
            return (Criteria) this;
        }

        public Criteria andFtitleLessThanOrEqualTo(String value) {
            addCriterion("Ftitle <=", value, "ftitle");
            return (Criteria) this;
        }

        public Criteria andFtitleLike(String value) {
            addCriterion("Ftitle like", value, "ftitle");
            return (Criteria) this;
        }

        public Criteria andFtitleNotLike(String value) {
            addCriterion("Ftitle not like", value, "ftitle");
            return (Criteria) this;
        }

        public Criteria andFtitleIn(List<String> values) {
            addCriterion("Ftitle in", values, "ftitle");
            return (Criteria) this;
        }

        public Criteria andFtitleNotIn(List<String> values) {
            addCriterion("Ftitle not in", values, "ftitle");
            return (Criteria) this;
        }

        public Criteria andFtitleBetween(String value1, String value2) {
            addCriterion("Ftitle between", value1, value2, "ftitle");
            return (Criteria) this;
        }

        public Criteria andFtitleNotBetween(String value1, String value2) {
            addCriterion("Ftitle not between", value1, value2, "ftitle");
            return (Criteria) this;
        }

        public Criteria andFuploadfileIsNull() {
            addCriterion("FUploadFile is null");
            return (Criteria) this;
        }

        public Criteria andFuploadfileIsNotNull() {
            addCriterion("FUploadFile is not null");
            return (Criteria) this;
        }

        public Criteria andFuploadfileEqualTo(String value) {
            addCriterion("FUploadFile =", value, "fuploadfile");
            return (Criteria) this;
        }

        public Criteria andFuploadfileNotEqualTo(String value) {
            addCriterion("FUploadFile <>", value, "fuploadfile");
            return (Criteria) this;
        }

        public Criteria andFuploadfileGreaterThan(String value) {
            addCriterion("FUploadFile >", value, "fuploadfile");
            return (Criteria) this;
        }

        public Criteria andFuploadfileGreaterThanOrEqualTo(String value) {
            addCriterion("FUploadFile >=", value, "fuploadfile");
            return (Criteria) this;
        }

        public Criteria andFuploadfileLessThan(String value) {
            addCriterion("FUploadFile <", value, "fuploadfile");
            return (Criteria) this;
        }

        public Criteria andFuploadfileLessThanOrEqualTo(String value) {
            addCriterion("FUploadFile <=", value, "fuploadfile");
            return (Criteria) this;
        }

        public Criteria andFuploadfileLike(String value) {
            addCriterion("FUploadFile like", value, "fuploadfile");
            return (Criteria) this;
        }

        public Criteria andFuploadfileNotLike(String value) {
            addCriterion("FUploadFile not like", value, "fuploadfile");
            return (Criteria) this;
        }

        public Criteria andFuploadfileIn(List<String> values) {
            addCriterion("FUploadFile in", values, "fuploadfile");
            return (Criteria) this;
        }

        public Criteria andFuploadfileNotIn(List<String> values) {
            addCriterion("FUploadFile not in", values, "fuploadfile");
            return (Criteria) this;
        }

        public Criteria andFuploadfileBetween(String value1, String value2) {
            addCriterion("FUploadFile between", value1, value2, "fuploadfile");
            return (Criteria) this;
        }

        public Criteria andFuploadfileNotBetween(String value1, String value2) {
            addCriterion("FUploadFile not between", value1, value2, "fuploadfile");
            return (Criteria) this;
        }

        public Criteria andFuploadnameIsNull() {
            addCriterion("FuploadName is null");
            return (Criteria) this;
        }

        public Criteria andFuploadnameIsNotNull() {
            addCriterion("FuploadName is not null");
            return (Criteria) this;
        }

        public Criteria andFuploadnameEqualTo(String value) {
            addCriterion("FuploadName =", value, "fuploadname");
            return (Criteria) this;
        }

        public Criteria andFuploadnameNotEqualTo(String value) {
            addCriterion("FuploadName <>", value, "fuploadname");
            return (Criteria) this;
        }

        public Criteria andFuploadnameGreaterThan(String value) {
            addCriterion("FuploadName >", value, "fuploadname");
            return (Criteria) this;
        }

        public Criteria andFuploadnameGreaterThanOrEqualTo(String value) {
            addCriterion("FuploadName >=", value, "fuploadname");
            return (Criteria) this;
        }

        public Criteria andFuploadnameLessThan(String value) {
            addCriterion("FuploadName <", value, "fuploadname");
            return (Criteria) this;
        }

        public Criteria andFuploadnameLessThanOrEqualTo(String value) {
            addCriterion("FuploadName <=", value, "fuploadname");
            return (Criteria) this;
        }

        public Criteria andFuploadnameLike(String value) {
            addCriterion("FuploadName like", value, "fuploadname");
            return (Criteria) this;
        }

        public Criteria andFuploadnameNotLike(String value) {
            addCriterion("FuploadName not like", value, "fuploadname");
            return (Criteria) this;
        }

        public Criteria andFuploadnameIn(List<String> values) {
            addCriterion("FuploadName in", values, "fuploadname");
            return (Criteria) this;
        }

        public Criteria andFuploadnameNotIn(List<String> values) {
            addCriterion("FuploadName not in", values, "fuploadname");
            return (Criteria) this;
        }

        public Criteria andFuploadnameBetween(String value1, String value2) {
            addCriterion("FuploadName between", value1, value2, "fuploadname");
            return (Criteria) this;
        }

        public Criteria andFuploadnameNotBetween(String value1, String value2) {
            addCriterion("FuploadName not between", value1, value2, "fuploadname");
            return (Criteria) this;
        }

        public Criteria andFuploadnumerIsNull() {
            addCriterion("FuploadNumer is null");
            return (Criteria) this;
        }

        public Criteria andFuploadnumerIsNotNull() {
            addCriterion("FuploadNumer is not null");
            return (Criteria) this;
        }

        public Criteria andFuploadnumerEqualTo(Integer value) {
            addCriterion("FuploadNumer =", value, "fuploadnumer");
            return (Criteria) this;
        }

        public Criteria andFuploadnumerNotEqualTo(Integer value) {
            addCriterion("FuploadNumer <>", value, "fuploadnumer");
            return (Criteria) this;
        }

        public Criteria andFuploadnumerGreaterThan(Integer value) {
            addCriterion("FuploadNumer >", value, "fuploadnumer");
            return (Criteria) this;
        }

        public Criteria andFuploadnumerGreaterThanOrEqualTo(Integer value) {
            addCriterion("FuploadNumer >=", value, "fuploadnumer");
            return (Criteria) this;
        }

        public Criteria andFuploadnumerLessThan(Integer value) {
            addCriterion("FuploadNumer <", value, "fuploadnumer");
            return (Criteria) this;
        }

        public Criteria andFuploadnumerLessThanOrEqualTo(Integer value) {
            addCriterion("FuploadNumer <=", value, "fuploadnumer");
            return (Criteria) this;
        }

        public Criteria andFuploadnumerIn(List<Integer> values) {
            addCriterion("FuploadNumer in", values, "fuploadnumer");
            return (Criteria) this;
        }

        public Criteria andFuploadnumerNotIn(List<Integer> values) {
            addCriterion("FuploadNumer not in", values, "fuploadnumer");
            return (Criteria) this;
        }

        public Criteria andFuploadnumerBetween(Integer value1, Integer value2) {
            addCriterion("FuploadNumer between", value1, value2, "fuploadnumer");
            return (Criteria) this;
        }

        public Criteria andFuploadnumerNotBetween(Integer value1, Integer value2) {
            addCriterion("FuploadNumer not between", value1, value2, "fuploadnumer");
            return (Criteria) this;
        }

        public Criteria andFsecrecylevelIsNull() {
            addCriterion("FSecrecyLevel is null");
            return (Criteria) this;
        }

        public Criteria andFsecrecylevelIsNotNull() {
            addCriterion("FSecrecyLevel is not null");
            return (Criteria) this;
        }

        public Criteria andFsecrecylevelEqualTo(Integer value) {
            addCriterion("FSecrecyLevel =", value, "fsecrecylevel");
            return (Criteria) this;
        }

        public Criteria andFsecrecylevelNotEqualTo(Integer value) {
            addCriterion("FSecrecyLevel <>", value, "fsecrecylevel");
            return (Criteria) this;
        }

        public Criteria andFsecrecylevelGreaterThan(Integer value) {
            addCriterion("FSecrecyLevel >", value, "fsecrecylevel");
            return (Criteria) this;
        }

        public Criteria andFsecrecylevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("FSecrecyLevel >=", value, "fsecrecylevel");
            return (Criteria) this;
        }

        public Criteria andFsecrecylevelLessThan(Integer value) {
            addCriterion("FSecrecyLevel <", value, "fsecrecylevel");
            return (Criteria) this;
        }

        public Criteria andFsecrecylevelLessThanOrEqualTo(Integer value) {
            addCriterion("FSecrecyLevel <=", value, "fsecrecylevel");
            return (Criteria) this;
        }

        public Criteria andFsecrecylevelIn(List<Integer> values) {
            addCriterion("FSecrecyLevel in", values, "fsecrecylevel");
            return (Criteria) this;
        }

        public Criteria andFsecrecylevelNotIn(List<Integer> values) {
            addCriterion("FSecrecyLevel not in", values, "fsecrecylevel");
            return (Criteria) this;
        }

        public Criteria andFsecrecylevelBetween(Integer value1, Integer value2) {
            addCriterion("FSecrecyLevel between", value1, value2, "fsecrecylevel");
            return (Criteria) this;
        }

        public Criteria andFsecrecylevelNotBetween(Integer value1, Integer value2) {
            addCriterion("FSecrecyLevel not between", value1, value2, "fsecrecylevel");
            return (Criteria) this;
        }

        public Criteria andFcarrierIsNull() {
            addCriterion("Fcarrier is null");
            return (Criteria) this;
        }

        public Criteria andFcarrierIsNotNull() {
            addCriterion("Fcarrier is not null");
            return (Criteria) this;
        }

        public Criteria andFcarrierEqualTo(String value) {
            addCriterion("Fcarrier =", value, "fcarrier");
            return (Criteria) this;
        }

        public Criteria andFcarrierNotEqualTo(String value) {
            addCriterion("Fcarrier <>", value, "fcarrier");
            return (Criteria) this;
        }

        public Criteria andFcarrierGreaterThan(String value) {
            addCriterion("Fcarrier >", value, "fcarrier");
            return (Criteria) this;
        }

        public Criteria andFcarrierGreaterThanOrEqualTo(String value) {
            addCriterion("Fcarrier >=", value, "fcarrier");
            return (Criteria) this;
        }

        public Criteria andFcarrierLessThan(String value) {
            addCriterion("Fcarrier <", value, "fcarrier");
            return (Criteria) this;
        }

        public Criteria andFcarrierLessThanOrEqualTo(String value) {
            addCriterion("Fcarrier <=", value, "fcarrier");
            return (Criteria) this;
        }

        public Criteria andFcarrierLike(String value) {
            addCriterion("Fcarrier like", value, "fcarrier");
            return (Criteria) this;
        }

        public Criteria andFcarrierNotLike(String value) {
            addCriterion("Fcarrier not like", value, "fcarrier");
            return (Criteria) this;
        }

        public Criteria andFcarrierIn(List<String> values) {
            addCriterion("Fcarrier in", values, "fcarrier");
            return (Criteria) this;
        }

        public Criteria andFcarrierNotIn(List<String> values) {
            addCriterion("Fcarrier not in", values, "fcarrier");
            return (Criteria) this;
        }

        public Criteria andFcarrierBetween(String value1, String value2) {
            addCriterion("Fcarrier between", value1, value2, "fcarrier");
            return (Criteria) this;
        }

        public Criteria andFcarrierNotBetween(String value1, String value2) {
            addCriterion("Fcarrier not between", value1, value2, "fcarrier");
            return (Criteria) this;
        }

        public Criteria andFcarrieridIsNull() {
            addCriterion("FcarrierID is null");
            return (Criteria) this;
        }

        public Criteria andFcarrieridIsNotNull() {
            addCriterion("FcarrierID is not null");
            return (Criteria) this;
        }

        public Criteria andFcarrieridEqualTo(String value) {
            addCriterion("FcarrierID =", value, "fcarrierid");
            return (Criteria) this;
        }

        public Criteria andFcarrieridNotEqualTo(String value) {
            addCriterion("FcarrierID <>", value, "fcarrierid");
            return (Criteria) this;
        }

        public Criteria andFcarrieridGreaterThan(String value) {
            addCriterion("FcarrierID >", value, "fcarrierid");
            return (Criteria) this;
        }

        public Criteria andFcarrieridGreaterThanOrEqualTo(String value) {
            addCriterion("FcarrierID >=", value, "fcarrierid");
            return (Criteria) this;
        }

        public Criteria andFcarrieridLessThan(String value) {
            addCriterion("FcarrierID <", value, "fcarrierid");
            return (Criteria) this;
        }

        public Criteria andFcarrieridLessThanOrEqualTo(String value) {
            addCriterion("FcarrierID <=", value, "fcarrierid");
            return (Criteria) this;
        }

        public Criteria andFcarrieridLike(String value) {
            addCriterion("FcarrierID like", value, "fcarrierid");
            return (Criteria) this;
        }

        public Criteria andFcarrieridNotLike(String value) {
            addCriterion("FcarrierID not like", value, "fcarrierid");
            return (Criteria) this;
        }

        public Criteria andFcarrieridIn(List<String> values) {
            addCriterion("FcarrierID in", values, "fcarrierid");
            return (Criteria) this;
        }

        public Criteria andFcarrieridNotIn(List<String> values) {
            addCriterion("FcarrierID not in", values, "fcarrierid");
            return (Criteria) this;
        }

        public Criteria andFcarrieridBetween(String value1, String value2) {
            addCriterion("FcarrierID between", value1, value2, "fcarrierid");
            return (Criteria) this;
        }

        public Criteria andFcarrieridNotBetween(String value1, String value2) {
            addCriterion("FcarrierID not between", value1, value2, "fcarrierid");
            return (Criteria) this;
        }

        public Criteria andFdraftpeopleIsNull() {
            addCriterion("FDraftPeople is null");
            return (Criteria) this;
        }

        public Criteria andFdraftpeopleIsNotNull() {
            addCriterion("FDraftPeople is not null");
            return (Criteria) this;
        }

        public Criteria andFdraftpeopleEqualTo(String value) {
            addCriterion("FDraftPeople =", value, "fdraftpeople");
            return (Criteria) this;
        }

        public Criteria andFdraftpeopleNotEqualTo(String value) {
            addCriterion("FDraftPeople <>", value, "fdraftpeople");
            return (Criteria) this;
        }

        public Criteria andFdraftpeopleGreaterThan(String value) {
            addCriterion("FDraftPeople >", value, "fdraftpeople");
            return (Criteria) this;
        }

        public Criteria andFdraftpeopleGreaterThanOrEqualTo(String value) {
            addCriterion("FDraftPeople >=", value, "fdraftpeople");
            return (Criteria) this;
        }

        public Criteria andFdraftpeopleLessThan(String value) {
            addCriterion("FDraftPeople <", value, "fdraftpeople");
            return (Criteria) this;
        }

        public Criteria andFdraftpeopleLessThanOrEqualTo(String value) {
            addCriterion("FDraftPeople <=", value, "fdraftpeople");
            return (Criteria) this;
        }

        public Criteria andFdraftpeopleLike(String value) {
            addCriterion("FDraftPeople like", value, "fdraftpeople");
            return (Criteria) this;
        }

        public Criteria andFdraftpeopleNotLike(String value) {
            addCriterion("FDraftPeople not like", value, "fdraftpeople");
            return (Criteria) this;
        }

        public Criteria andFdraftpeopleIn(List<String> values) {
            addCriterion("FDraftPeople in", values, "fdraftpeople");
            return (Criteria) this;
        }

        public Criteria andFdraftpeopleNotIn(List<String> values) {
            addCriterion("FDraftPeople not in", values, "fdraftpeople");
            return (Criteria) this;
        }

        public Criteria andFdraftpeopleBetween(String value1, String value2) {
            addCriterion("FDraftPeople between", value1, value2, "fdraftpeople");
            return (Criteria) this;
        }

        public Criteria andFdraftpeopleNotBetween(String value1, String value2) {
            addCriterion("FDraftPeople not between", value1, value2, "fdraftpeople");
            return (Criteria) this;
        }

        public Criteria andFdraftpeopleidIsNull() {
            addCriterion("FDraftPeopleID is null");
            return (Criteria) this;
        }

        public Criteria andFdraftpeopleidIsNotNull() {
            addCriterion("FDraftPeopleID is not null");
            return (Criteria) this;
        }

        public Criteria andFdraftpeopleidEqualTo(String value) {
            addCriterion("FDraftPeopleID =", value, "fdraftpeopleid");
            return (Criteria) this;
        }

        public Criteria andFdraftpeopleidNotEqualTo(String value) {
            addCriterion("FDraftPeopleID <>", value, "fdraftpeopleid");
            return (Criteria) this;
        }

        public Criteria andFdraftpeopleidGreaterThan(String value) {
            addCriterion("FDraftPeopleID >", value, "fdraftpeopleid");
            return (Criteria) this;
        }

        public Criteria andFdraftpeopleidGreaterThanOrEqualTo(String value) {
            addCriterion("FDraftPeopleID >=", value, "fdraftpeopleid");
            return (Criteria) this;
        }

        public Criteria andFdraftpeopleidLessThan(String value) {
            addCriterion("FDraftPeopleID <", value, "fdraftpeopleid");
            return (Criteria) this;
        }

        public Criteria andFdraftpeopleidLessThanOrEqualTo(String value) {
            addCriterion("FDraftPeopleID <=", value, "fdraftpeopleid");
            return (Criteria) this;
        }

        public Criteria andFdraftpeopleidLike(String value) {
            addCriterion("FDraftPeopleID like", value, "fdraftpeopleid");
            return (Criteria) this;
        }

        public Criteria andFdraftpeopleidNotLike(String value) {
            addCriterion("FDraftPeopleID not like", value, "fdraftpeopleid");
            return (Criteria) this;
        }

        public Criteria andFdraftpeopleidIn(List<String> values) {
            addCriterion("FDraftPeopleID in", values, "fdraftpeopleid");
            return (Criteria) this;
        }

        public Criteria andFdraftpeopleidNotIn(List<String> values) {
            addCriterion("FDraftPeopleID not in", values, "fdraftpeopleid");
            return (Criteria) this;
        }

        public Criteria andFdraftpeopleidBetween(String value1, String value2) {
            addCriterion("FDraftPeopleID between", value1, value2, "fdraftpeopleid");
            return (Criteria) this;
        }

        public Criteria andFdraftpeopleidNotBetween(String value1, String value2) {
            addCriterion("FDraftPeopleID not between", value1, value2, "fdraftpeopleid");
            return (Criteria) this;
        }

        public Criteria andFnucleardraftIsNull() {
            addCriterion("FNuclearDraft is null");
            return (Criteria) this;
        }

        public Criteria andFnucleardraftIsNotNull() {
            addCriterion("FNuclearDraft is not null");
            return (Criteria) this;
        }

        public Criteria andFnucleardraftEqualTo(String value) {
            addCriterion("FNuclearDraft =", value, "fnucleardraft");
            return (Criteria) this;
        }

        public Criteria andFnucleardraftNotEqualTo(String value) {
            addCriterion("FNuclearDraft <>", value, "fnucleardraft");
            return (Criteria) this;
        }

        public Criteria andFnucleardraftGreaterThan(String value) {
            addCriterion("FNuclearDraft >", value, "fnucleardraft");
            return (Criteria) this;
        }

        public Criteria andFnucleardraftGreaterThanOrEqualTo(String value) {
            addCriterion("FNuclearDraft >=", value, "fnucleardraft");
            return (Criteria) this;
        }

        public Criteria andFnucleardraftLessThan(String value) {
            addCriterion("FNuclearDraft <", value, "fnucleardraft");
            return (Criteria) this;
        }

        public Criteria andFnucleardraftLessThanOrEqualTo(String value) {
            addCriterion("FNuclearDraft <=", value, "fnucleardraft");
            return (Criteria) this;
        }

        public Criteria andFnucleardraftLike(String value) {
            addCriterion("FNuclearDraft like", value, "fnucleardraft");
            return (Criteria) this;
        }

        public Criteria andFnucleardraftNotLike(String value) {
            addCriterion("FNuclearDraft not like", value, "fnucleardraft");
            return (Criteria) this;
        }

        public Criteria andFnucleardraftIn(List<String> values) {
            addCriterion("FNuclearDraft in", values, "fnucleardraft");
            return (Criteria) this;
        }

        public Criteria andFnucleardraftNotIn(List<String> values) {
            addCriterion("FNuclearDraft not in", values, "fnucleardraft");
            return (Criteria) this;
        }

        public Criteria andFnucleardraftBetween(String value1, String value2) {
            addCriterion("FNuclearDraft between", value1, value2, "fnucleardraft");
            return (Criteria) this;
        }

        public Criteria andFnucleardraftNotBetween(String value1, String value2) {
            addCriterion("FNuclearDraft not between", value1, value2, "fnucleardraft");
            return (Criteria) this;
        }

        public Criteria andFnucleardraftidIsNull() {
            addCriterion("FNuclearDraftID is null");
            return (Criteria) this;
        }

        public Criteria andFnucleardraftidIsNotNull() {
            addCriterion("FNuclearDraftID is not null");
            return (Criteria) this;
        }

        public Criteria andFnucleardraftidEqualTo(String value) {
            addCriterion("FNuclearDraftID =", value, "fnucleardraftid");
            return (Criteria) this;
        }

        public Criteria andFnucleardraftidNotEqualTo(String value) {
            addCriterion("FNuclearDraftID <>", value, "fnucleardraftid");
            return (Criteria) this;
        }

        public Criteria andFnucleardraftidGreaterThan(String value) {
            addCriterion("FNuclearDraftID >", value, "fnucleardraftid");
            return (Criteria) this;
        }

        public Criteria andFnucleardraftidGreaterThanOrEqualTo(String value) {
            addCriterion("FNuclearDraftID >=", value, "fnucleardraftid");
            return (Criteria) this;
        }

        public Criteria andFnucleardraftidLessThan(String value) {
            addCriterion("FNuclearDraftID <", value, "fnucleardraftid");
            return (Criteria) this;
        }

        public Criteria andFnucleardraftidLessThanOrEqualTo(String value) {
            addCriterion("FNuclearDraftID <=", value, "fnucleardraftid");
            return (Criteria) this;
        }

        public Criteria andFnucleardraftidLike(String value) {
            addCriterion("FNuclearDraftID like", value, "fnucleardraftid");
            return (Criteria) this;
        }

        public Criteria andFnucleardraftidNotLike(String value) {
            addCriterion("FNuclearDraftID not like", value, "fnucleardraftid");
            return (Criteria) this;
        }

        public Criteria andFnucleardraftidIn(List<String> values) {
            addCriterion("FNuclearDraftID in", values, "fnucleardraftid");
            return (Criteria) this;
        }

        public Criteria andFnucleardraftidNotIn(List<String> values) {
            addCriterion("FNuclearDraftID not in", values, "fnucleardraftid");
            return (Criteria) this;
        }

        public Criteria andFnucleardraftidBetween(String value1, String value2) {
            addCriterion("FNuclearDraftID between", value1, value2, "fnucleardraftid");
            return (Criteria) this;
        }

        public Criteria andFnucleardraftidNotBetween(String value1, String value2) {
            addCriterion("FNuclearDraftID not between", value1, value2, "fnucleardraftid");
            return (Criteria) this;
        }

        public Criteria andFauditIsNull() {
            addCriterion("Faudit is null");
            return (Criteria) this;
        }

        public Criteria andFauditIsNotNull() {
            addCriterion("Faudit is not null");
            return (Criteria) this;
        }

        public Criteria andFauditEqualTo(String value) {
            addCriterion("Faudit =", value, "faudit");
            return (Criteria) this;
        }

        public Criteria andFauditNotEqualTo(String value) {
            addCriterion("Faudit <>", value, "faudit");
            return (Criteria) this;
        }

        public Criteria andFauditGreaterThan(String value) {
            addCriterion("Faudit >", value, "faudit");
            return (Criteria) this;
        }

        public Criteria andFauditGreaterThanOrEqualTo(String value) {
            addCriterion("Faudit >=", value, "faudit");
            return (Criteria) this;
        }

        public Criteria andFauditLessThan(String value) {
            addCriterion("Faudit <", value, "faudit");
            return (Criteria) this;
        }

        public Criteria andFauditLessThanOrEqualTo(String value) {
            addCriterion("Faudit <=", value, "faudit");
            return (Criteria) this;
        }

        public Criteria andFauditLike(String value) {
            addCriterion("Faudit like", value, "faudit");
            return (Criteria) this;
        }

        public Criteria andFauditNotLike(String value) {
            addCriterion("Faudit not like", value, "faudit");
            return (Criteria) this;
        }

        public Criteria andFauditIn(List<String> values) {
            addCriterion("Faudit in", values, "faudit");
            return (Criteria) this;
        }

        public Criteria andFauditNotIn(List<String> values) {
            addCriterion("Faudit not in", values, "faudit");
            return (Criteria) this;
        }

        public Criteria andFauditBetween(String value1, String value2) {
            addCriterion("Faudit between", value1, value2, "faudit");
            return (Criteria) this;
        }

        public Criteria andFauditNotBetween(String value1, String value2) {
            addCriterion("Faudit not between", value1, value2, "faudit");
            return (Criteria) this;
        }

        public Criteria andFauditidIsNull() {
            addCriterion("FauditID is null");
            return (Criteria) this;
        }

        public Criteria andFauditidIsNotNull() {
            addCriterion("FauditID is not null");
            return (Criteria) this;
        }

        public Criteria andFauditidEqualTo(String value) {
            addCriterion("FauditID =", value, "fauditid");
            return (Criteria) this;
        }

        public Criteria andFauditidNotEqualTo(String value) {
            addCriterion("FauditID <>", value, "fauditid");
            return (Criteria) this;
        }

        public Criteria andFauditidGreaterThan(String value) {
            addCriterion("FauditID >", value, "fauditid");
            return (Criteria) this;
        }

        public Criteria andFauditidGreaterThanOrEqualTo(String value) {
            addCriterion("FauditID >=", value, "fauditid");
            return (Criteria) this;
        }

        public Criteria andFauditidLessThan(String value) {
            addCriterion("FauditID <", value, "fauditid");
            return (Criteria) this;
        }

        public Criteria andFauditidLessThanOrEqualTo(String value) {
            addCriterion("FauditID <=", value, "fauditid");
            return (Criteria) this;
        }

        public Criteria andFauditidLike(String value) {
            addCriterion("FauditID like", value, "fauditid");
            return (Criteria) this;
        }

        public Criteria andFauditidNotLike(String value) {
            addCriterion("FauditID not like", value, "fauditid");
            return (Criteria) this;
        }

        public Criteria andFauditidIn(List<String> values) {
            addCriterion("FauditID in", values, "fauditid");
            return (Criteria) this;
        }

        public Criteria andFauditidNotIn(List<String> values) {
            addCriterion("FauditID not in", values, "fauditid");
            return (Criteria) this;
        }

        public Criteria andFauditidBetween(String value1, String value2) {
            addCriterion("FauditID between", value1, value2, "fauditid");
            return (Criteria) this;
        }

        public Criteria andFauditidNotBetween(String value1, String value2) {
            addCriterion("FauditID not between", value1, value2, "fauditid");
            return (Criteria) this;
        }

        public Criteria andFcountersignIsNull() {
            addCriterion("Fcountersign is null");
            return (Criteria) this;
        }

        public Criteria andFcountersignIsNotNull() {
            addCriterion("Fcountersign is not null");
            return (Criteria) this;
        }

        public Criteria andFcountersignEqualTo(String value) {
            addCriterion("Fcountersign =", value, "fcountersign");
            return (Criteria) this;
        }

        public Criteria andFcountersignNotEqualTo(String value) {
            addCriterion("Fcountersign <>", value, "fcountersign");
            return (Criteria) this;
        }

        public Criteria andFcountersignGreaterThan(String value) {
            addCriterion("Fcountersign >", value, "fcountersign");
            return (Criteria) this;
        }

        public Criteria andFcountersignGreaterThanOrEqualTo(String value) {
            addCriterion("Fcountersign >=", value, "fcountersign");
            return (Criteria) this;
        }

        public Criteria andFcountersignLessThan(String value) {
            addCriterion("Fcountersign <", value, "fcountersign");
            return (Criteria) this;
        }

        public Criteria andFcountersignLessThanOrEqualTo(String value) {
            addCriterion("Fcountersign <=", value, "fcountersign");
            return (Criteria) this;
        }

        public Criteria andFcountersignLike(String value) {
            addCriterion("Fcountersign like", value, "fcountersign");
            return (Criteria) this;
        }

        public Criteria andFcountersignNotLike(String value) {
            addCriterion("Fcountersign not like", value, "fcountersign");
            return (Criteria) this;
        }

        public Criteria andFcountersignIn(List<String> values) {
            addCriterion("Fcountersign in", values, "fcountersign");
            return (Criteria) this;
        }

        public Criteria andFcountersignNotIn(List<String> values) {
            addCriterion("Fcountersign not in", values, "fcountersign");
            return (Criteria) this;
        }

        public Criteria andFcountersignBetween(String value1, String value2) {
            addCriterion("Fcountersign between", value1, value2, "fcountersign");
            return (Criteria) this;
        }

        public Criteria andFcountersignNotBetween(String value1, String value2) {
            addCriterion("Fcountersign not between", value1, value2, "fcountersign");
            return (Criteria) this;
        }

        public Criteria andFissuerIsNull() {
            addCriterion("FIssuer is null");
            return (Criteria) this;
        }

        public Criteria andFissuerIsNotNull() {
            addCriterion("FIssuer is not null");
            return (Criteria) this;
        }

        public Criteria andFissuerEqualTo(String value) {
            addCriterion("FIssuer =", value, "fissuer");
            return (Criteria) this;
        }

        public Criteria andFissuerNotEqualTo(String value) {
            addCriterion("FIssuer <>", value, "fissuer");
            return (Criteria) this;
        }

        public Criteria andFissuerGreaterThan(String value) {
            addCriterion("FIssuer >", value, "fissuer");
            return (Criteria) this;
        }

        public Criteria andFissuerGreaterThanOrEqualTo(String value) {
            addCriterion("FIssuer >=", value, "fissuer");
            return (Criteria) this;
        }

        public Criteria andFissuerLessThan(String value) {
            addCriterion("FIssuer <", value, "fissuer");
            return (Criteria) this;
        }

        public Criteria andFissuerLessThanOrEqualTo(String value) {
            addCriterion("FIssuer <=", value, "fissuer");
            return (Criteria) this;
        }

        public Criteria andFissuerLike(String value) {
            addCriterion("FIssuer like", value, "fissuer");
            return (Criteria) this;
        }

        public Criteria andFissuerNotLike(String value) {
            addCriterion("FIssuer not like", value, "fissuer");
            return (Criteria) this;
        }

        public Criteria andFissuerIn(List<String> values) {
            addCriterion("FIssuer in", values, "fissuer");
            return (Criteria) this;
        }

        public Criteria andFissuerNotIn(List<String> values) {
            addCriterion("FIssuer not in", values, "fissuer");
            return (Criteria) this;
        }

        public Criteria andFissuerBetween(String value1, String value2) {
            addCriterion("FIssuer between", value1, value2, "fissuer");
            return (Criteria) this;
        }

        public Criteria andFissuerNotBetween(String value1, String value2) {
            addCriterion("FIssuer not between", value1, value2, "fissuer");
            return (Criteria) this;
        }

        public Criteria andFissueridIsNull() {
            addCriterion("FIssuerID is null");
            return (Criteria) this;
        }

        public Criteria andFissueridIsNotNull() {
            addCriterion("FIssuerID is not null");
            return (Criteria) this;
        }

        public Criteria andFissueridEqualTo(String value) {
            addCriterion("FIssuerID =", value, "fissuerid");
            return (Criteria) this;
        }

        public Criteria andFissueridNotEqualTo(String value) {
            addCriterion("FIssuerID <>", value, "fissuerid");
            return (Criteria) this;
        }

        public Criteria andFissueridGreaterThan(String value) {
            addCriterion("FIssuerID >", value, "fissuerid");
            return (Criteria) this;
        }

        public Criteria andFissueridGreaterThanOrEqualTo(String value) {
            addCriterion("FIssuerID >=", value, "fissuerid");
            return (Criteria) this;
        }

        public Criteria andFissueridLessThan(String value) {
            addCriterion("FIssuerID <", value, "fissuerid");
            return (Criteria) this;
        }

        public Criteria andFissueridLessThanOrEqualTo(String value) {
            addCriterion("FIssuerID <=", value, "fissuerid");
            return (Criteria) this;
        }

        public Criteria andFissueridLike(String value) {
            addCriterion("FIssuerID like", value, "fissuerid");
            return (Criteria) this;
        }

        public Criteria andFissueridNotLike(String value) {
            addCriterion("FIssuerID not like", value, "fissuerid");
            return (Criteria) this;
        }

        public Criteria andFissueridIn(List<String> values) {
            addCriterion("FIssuerID in", values, "fissuerid");
            return (Criteria) this;
        }

        public Criteria andFissueridNotIn(List<String> values) {
            addCriterion("FIssuerID not in", values, "fissuerid");
            return (Criteria) this;
        }

        public Criteria andFissueridBetween(String value1, String value2) {
            addCriterion("FIssuerID between", value1, value2, "fissuerid");
            return (Criteria) this;
        }

        public Criteria andFissueridNotBetween(String value1, String value2) {
            addCriterion("FIssuerID not between", value1, value2, "fissuerid");
            return (Criteria) this;
        }

        public Criteria andFlazyIsNull() {
            addCriterion("FLazy is null");
            return (Criteria) this;
        }

        public Criteria andFlazyIsNotNull() {
            addCriterion("FLazy is not null");
            return (Criteria) this;
        }

        public Criteria andFlazyEqualTo(String value) {
            addCriterion("FLazy =", value, "flazy");
            return (Criteria) this;
        }

        public Criteria andFlazyNotEqualTo(String value) {
            addCriterion("FLazy <>", value, "flazy");
            return (Criteria) this;
        }

        public Criteria andFlazyGreaterThan(String value) {
            addCriterion("FLazy >", value, "flazy");
            return (Criteria) this;
        }

        public Criteria andFlazyGreaterThanOrEqualTo(String value) {
            addCriterion("FLazy >=", value, "flazy");
            return (Criteria) this;
        }

        public Criteria andFlazyLessThan(String value) {
            addCriterion("FLazy <", value, "flazy");
            return (Criteria) this;
        }

        public Criteria andFlazyLessThanOrEqualTo(String value) {
            addCriterion("FLazy <=", value, "flazy");
            return (Criteria) this;
        }

        public Criteria andFlazyLike(String value) {
            addCriterion("FLazy like", value, "flazy");
            return (Criteria) this;
        }

        public Criteria andFlazyNotLike(String value) {
            addCriterion("FLazy not like", value, "flazy");
            return (Criteria) this;
        }

        public Criteria andFlazyIn(List<String> values) {
            addCriterion("FLazy in", values, "flazy");
            return (Criteria) this;
        }

        public Criteria andFlazyNotIn(List<String> values) {
            addCriterion("FLazy not in", values, "flazy");
            return (Criteria) this;
        }

        public Criteria andFlazyBetween(String value1, String value2) {
            addCriterion("FLazy between", value1, value2, "flazy");
            return (Criteria) this;
        }

        public Criteria andFlazyNotBetween(String value1, String value2) {
            addCriterion("FLazy not between", value1, value2, "flazy");
            return (Criteria) this;
        }

        public Criteria andFremarkIsNull() {
            addCriterion("FRemark is null");
            return (Criteria) this;
        }

        public Criteria andFremarkIsNotNull() {
            addCriterion("FRemark is not null");
            return (Criteria) this;
        }

        public Criteria andFremarkEqualTo(String value) {
            addCriterion("FRemark =", value, "fremark");
            return (Criteria) this;
        }

        public Criteria andFremarkNotEqualTo(String value) {
            addCriterion("FRemark <>", value, "fremark");
            return (Criteria) this;
        }

        public Criteria andFremarkGreaterThan(String value) {
            addCriterion("FRemark >", value, "fremark");
            return (Criteria) this;
        }

        public Criteria andFremarkGreaterThanOrEqualTo(String value) {
            addCriterion("FRemark >=", value, "fremark");
            return (Criteria) this;
        }

        public Criteria andFremarkLessThan(String value) {
            addCriterion("FRemark <", value, "fremark");
            return (Criteria) this;
        }

        public Criteria andFremarkLessThanOrEqualTo(String value) {
            addCriterion("FRemark <=", value, "fremark");
            return (Criteria) this;
        }

        public Criteria andFremarkLike(String value) {
            addCriterion("FRemark like", value, "fremark");
            return (Criteria) this;
        }

        public Criteria andFremarkNotLike(String value) {
            addCriterion("FRemark not like", value, "fremark");
            return (Criteria) this;
        }

        public Criteria andFremarkIn(List<String> values) {
            addCriterion("FRemark in", values, "fremark");
            return (Criteria) this;
        }

        public Criteria andFremarkNotIn(List<String> values) {
            addCriterion("FRemark not in", values, "fremark");
            return (Criteria) this;
        }

        public Criteria andFremarkBetween(String value1, String value2) {
            addCriterion("FRemark between", value1, value2, "fremark");
            return (Criteria) this;
        }

        public Criteria andFremarkNotBetween(String value1, String value2) {
            addCriterion("FRemark not between", value1, value2, "fremark");
            return (Criteria) this;
        }

        public Criteria andFmainbodyidIsNull() {
            addCriterion("FMainBodyId is null");
            return (Criteria) this;
        }

        public Criteria andFmainbodyidIsNotNull() {
            addCriterion("FMainBodyId is not null");
            return (Criteria) this;
        }

        public Criteria andFmainbodyidEqualTo(Integer value) {
            addCriterion("FMainBodyId =", value, "fmainbodyid");
            return (Criteria) this;
        }

        public Criteria andFmainbodyidNotEqualTo(Integer value) {
            addCriterion("FMainBodyId <>", value, "fmainbodyid");
            return (Criteria) this;
        }

        public Criteria andFmainbodyidGreaterThan(Integer value) {
            addCriterion("FMainBodyId >", value, "fmainbodyid");
            return (Criteria) this;
        }

        public Criteria andFmainbodyidGreaterThanOrEqualTo(Integer value) {
            addCriterion("FMainBodyId >=", value, "fmainbodyid");
            return (Criteria) this;
        }

        public Criteria andFmainbodyidLessThan(Integer value) {
            addCriterion("FMainBodyId <", value, "fmainbodyid");
            return (Criteria) this;
        }

        public Criteria andFmainbodyidLessThanOrEqualTo(Integer value) {
            addCriterion("FMainBodyId <=", value, "fmainbodyid");
            return (Criteria) this;
        }

        public Criteria andFmainbodyidIn(List<Integer> values) {
            addCriterion("FMainBodyId in", values, "fmainbodyid");
            return (Criteria) this;
        }

        public Criteria andFmainbodyidNotIn(List<Integer> values) {
            addCriterion("FMainBodyId not in", values, "fmainbodyid");
            return (Criteria) this;
        }

        public Criteria andFmainbodyidBetween(Integer value1, Integer value2) {
            addCriterion("FMainBodyId between", value1, value2, "fmainbodyid");
            return (Criteria) this;
        }

        public Criteria andFmainbodyidNotBetween(Integer value1, Integer value2) {
            addCriterion("FMainBodyId not between", value1, value2, "fmainbodyid");
            return (Criteria) this;
        }

        public Criteria andFmodelidIsNull() {
            addCriterion("FModelId is null");
            return (Criteria) this;
        }

        public Criteria andFmodelidIsNotNull() {
            addCriterion("FModelId is not null");
            return (Criteria) this;
        }

        public Criteria andFmodelidEqualTo(Integer value) {
            addCriterion("FModelId =", value, "fmodelid");
            return (Criteria) this;
        }

        public Criteria andFmodelidNotEqualTo(Integer value) {
            addCriterion("FModelId <>", value, "fmodelid");
            return (Criteria) this;
        }

        public Criteria andFmodelidGreaterThan(Integer value) {
            addCriterion("FModelId >", value, "fmodelid");
            return (Criteria) this;
        }

        public Criteria andFmodelidGreaterThanOrEqualTo(Integer value) {
            addCriterion("FModelId >=", value, "fmodelid");
            return (Criteria) this;
        }

        public Criteria andFmodelidLessThan(Integer value) {
            addCriterion("FModelId <", value, "fmodelid");
            return (Criteria) this;
        }

        public Criteria andFmodelidLessThanOrEqualTo(Integer value) {
            addCriterion("FModelId <=", value, "fmodelid");
            return (Criteria) this;
        }

        public Criteria andFmodelidIn(List<Integer> values) {
            addCriterion("FModelId in", values, "fmodelid");
            return (Criteria) this;
        }

        public Criteria andFmodelidNotIn(List<Integer> values) {
            addCriterion("FModelId not in", values, "fmodelid");
            return (Criteria) this;
        }

        public Criteria andFmodelidBetween(Integer value1, Integer value2) {
            addCriterion("FModelId between", value1, value2, "fmodelid");
            return (Criteria) this;
        }

        public Criteria andFmodelidNotBetween(Integer value1, Integer value2) {
            addCriterion("FModelId not between", value1, value2, "fmodelid");
            return (Criteria) this;
        }

        public Criteria andFdocumentstatusIsNull() {
            addCriterion("FDocumentStatus is null");
            return (Criteria) this;
        }

        public Criteria andFdocumentstatusIsNotNull() {
            addCriterion("FDocumentStatus is not null");
            return (Criteria) this;
        }

        public Criteria andFdocumentstatusEqualTo(String value) {
            addCriterion("FDocumentStatus =", value, "fdocumentstatus");
            return (Criteria) this;
        }

        public Criteria andFdocumentstatusNotEqualTo(String value) {
            addCriterion("FDocumentStatus <>", value, "fdocumentstatus");
            return (Criteria) this;
        }

        public Criteria andFdocumentstatusGreaterThan(String value) {
            addCriterion("FDocumentStatus >", value, "fdocumentstatus");
            return (Criteria) this;
        }

        public Criteria andFdocumentstatusGreaterThanOrEqualTo(String value) {
            addCriterion("FDocumentStatus >=", value, "fdocumentstatus");
            return (Criteria) this;
        }

        public Criteria andFdocumentstatusLessThan(String value) {
            addCriterion("FDocumentStatus <", value, "fdocumentstatus");
            return (Criteria) this;
        }

        public Criteria andFdocumentstatusLessThanOrEqualTo(String value) {
            addCriterion("FDocumentStatus <=", value, "fdocumentstatus");
            return (Criteria) this;
        }

        public Criteria andFdocumentstatusLike(String value) {
            addCriterion("FDocumentStatus like", value, "fdocumentstatus");
            return (Criteria) this;
        }

        public Criteria andFdocumentstatusNotLike(String value) {
            addCriterion("FDocumentStatus not like", value, "fdocumentstatus");
            return (Criteria) this;
        }

        public Criteria andFdocumentstatusIn(List<String> values) {
            addCriterion("FDocumentStatus in", values, "fdocumentstatus");
            return (Criteria) this;
        }

        public Criteria andFdocumentstatusNotIn(List<String> values) {
            addCriterion("FDocumentStatus not in", values, "fdocumentstatus");
            return (Criteria) this;
        }

        public Criteria andFdocumentstatusBetween(String value1, String value2) {
            addCriterion("FDocumentStatus between", value1, value2, "fdocumentstatus");
            return (Criteria) this;
        }

        public Criteria andFdocumentstatusNotBetween(String value1, String value2) {
            addCriterion("FDocumentStatus not between", value1, value2, "fdocumentstatus");
            return (Criteria) this;
        }

        public Criteria andFcopydepartmentsIsNull() {
            addCriterion("FCopyDepartments is null");
            return (Criteria) this;
        }

        public Criteria andFcopydepartmentsIsNotNull() {
            addCriterion("FCopyDepartments is not null");
            return (Criteria) this;
        }

        public Criteria andFcopydepartmentsEqualTo(String value) {
            addCriterion("FCopyDepartments =", value, "fcopydepartments");
            return (Criteria) this;
        }

        public Criteria andFcopydepartmentsNotEqualTo(String value) {
            addCriterion("FCopyDepartments <>", value, "fcopydepartments");
            return (Criteria) this;
        }

        public Criteria andFcopydepartmentsGreaterThan(String value) {
            addCriterion("FCopyDepartments >", value, "fcopydepartments");
            return (Criteria) this;
        }

        public Criteria andFcopydepartmentsGreaterThanOrEqualTo(String value) {
            addCriterion("FCopyDepartments >=", value, "fcopydepartments");
            return (Criteria) this;
        }

        public Criteria andFcopydepartmentsLessThan(String value) {
            addCriterion("FCopyDepartments <", value, "fcopydepartments");
            return (Criteria) this;
        }

        public Criteria andFcopydepartmentsLessThanOrEqualTo(String value) {
            addCriterion("FCopyDepartments <=", value, "fcopydepartments");
            return (Criteria) this;
        }

        public Criteria andFcopydepartmentsLike(String value) {
            addCriterion("FCopyDepartments like", value, "fcopydepartments");
            return (Criteria) this;
        }

        public Criteria andFcopydepartmentsNotLike(String value) {
            addCriterion("FCopyDepartments not like", value, "fcopydepartments");
            return (Criteria) this;
        }

        public Criteria andFcopydepartmentsIn(List<String> values) {
            addCriterion("FCopyDepartments in", values, "fcopydepartments");
            return (Criteria) this;
        }

        public Criteria andFcopydepartmentsNotIn(List<String> values) {
            addCriterion("FCopyDepartments not in", values, "fcopydepartments");
            return (Criteria) this;
        }

        public Criteria andFcopydepartmentsBetween(String value1, String value2) {
            addCriterion("FCopyDepartments between", value1, value2, "fcopydepartments");
            return (Criteria) this;
        }

        public Criteria andFcopydepartmentsNotBetween(String value1, String value2) {
            addCriterion("FCopyDepartments not between", value1, value2, "fcopydepartments");
            return (Criteria) this;
        }

        public Criteria andFmainsupplydepIsNull() {
            addCriterion("FMainSupplyDep is null");
            return (Criteria) this;
        }

        public Criteria andFmainsupplydepIsNotNull() {
            addCriterion("FMainSupplyDep is not null");
            return (Criteria) this;
        }

        public Criteria andFmainsupplydepEqualTo(String value) {
            addCriterion("FMainSupplyDep =", value, "fmainsupplydep");
            return (Criteria) this;
        }

        public Criteria andFmainsupplydepNotEqualTo(String value) {
            addCriterion("FMainSupplyDep <>", value, "fmainsupplydep");
            return (Criteria) this;
        }

        public Criteria andFmainsupplydepGreaterThan(String value) {
            addCriterion("FMainSupplyDep >", value, "fmainsupplydep");
            return (Criteria) this;
        }

        public Criteria andFmainsupplydepGreaterThanOrEqualTo(String value) {
            addCriterion("FMainSupplyDep >=", value, "fmainsupplydep");
            return (Criteria) this;
        }

        public Criteria andFmainsupplydepLessThan(String value) {
            addCriterion("FMainSupplyDep <", value, "fmainsupplydep");
            return (Criteria) this;
        }

        public Criteria andFmainsupplydepLessThanOrEqualTo(String value) {
            addCriterion("FMainSupplyDep <=", value, "fmainsupplydep");
            return (Criteria) this;
        }

        public Criteria andFmainsupplydepLike(String value) {
            addCriterion("FMainSupplyDep like", value, "fmainsupplydep");
            return (Criteria) this;
        }

        public Criteria andFmainsupplydepNotLike(String value) {
            addCriterion("FMainSupplyDep not like", value, "fmainsupplydep");
            return (Criteria) this;
        }

        public Criteria andFmainsupplydepIn(List<String> values) {
            addCriterion("FMainSupplyDep in", values, "fmainsupplydep");
            return (Criteria) this;
        }

        public Criteria andFmainsupplydepNotIn(List<String> values) {
            addCriterion("FMainSupplyDep not in", values, "fmainsupplydep");
            return (Criteria) this;
        }

        public Criteria andFmainsupplydepBetween(String value1, String value2) {
            addCriterion("FMainSupplyDep between", value1, value2, "fmainsupplydep");
            return (Criteria) this;
        }

        public Criteria andFmainsupplydepNotBetween(String value1, String value2) {
            addCriterion("FMainSupplyDep not between", value1, value2, "fmainsupplydep");
            return (Criteria) this;
        }

        public Criteria andIsdelIsNull() {
            addCriterion("isdel is null");
            return (Criteria) this;
        }

        public Criteria andIsdelIsNotNull() {
            addCriterion("isdel is not null");
            return (Criteria) this;
        }

        public Criteria andIsdelEqualTo(String value) {
            addCriterion("isdel =", value, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelNotEqualTo(String value) {
            addCriterion("isdel <>", value, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelGreaterThan(String value) {
            addCriterion("isdel >", value, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelGreaterThanOrEqualTo(String value) {
            addCriterion("isdel >=", value, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelLessThan(String value) {
            addCriterion("isdel <", value, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelLessThanOrEqualTo(String value) {
            addCriterion("isdel <=", value, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelLike(String value) {
            addCriterion("isdel like", value, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelNotLike(String value) {
            addCriterion("isdel not like", value, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelIn(List<String> values) {
            addCriterion("isdel in", values, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelNotIn(List<String> values) {
            addCriterion("isdel not in", values, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelBetween(String value1, String value2) {
            addCriterion("isdel between", value1, value2, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelNotBetween(String value1, String value2) {
            addCriterion("isdel not between", value1, value2, "isdel");
            return (Criteria) this;
        }

        public Criteria andFkeywordIsNull() {
            addCriterion("FkeyWord is null");
            return (Criteria) this;
        }

        public Criteria andFkeywordIsNotNull() {
            addCriterion("FkeyWord is not null");
            return (Criteria) this;
        }

        public Criteria andFkeywordEqualTo(String value) {
            addCriterion("FkeyWord =", value, "fkeyword");
            return (Criteria) this;
        }

        public Criteria andFkeywordNotEqualTo(String value) {
            addCriterion("FkeyWord <>", value, "fkeyword");
            return (Criteria) this;
        }

        public Criteria andFkeywordGreaterThan(String value) {
            addCriterion("FkeyWord >", value, "fkeyword");
            return (Criteria) this;
        }

        public Criteria andFkeywordGreaterThanOrEqualTo(String value) {
            addCriterion("FkeyWord >=", value, "fkeyword");
            return (Criteria) this;
        }

        public Criteria andFkeywordLessThan(String value) {
            addCriterion("FkeyWord <", value, "fkeyword");
            return (Criteria) this;
        }

        public Criteria andFkeywordLessThanOrEqualTo(String value) {
            addCriterion("FkeyWord <=", value, "fkeyword");
            return (Criteria) this;
        }

        public Criteria andFkeywordLike(String value) {
            addCriterion("FkeyWord like", value, "fkeyword");
            return (Criteria) this;
        }

        public Criteria andFkeywordNotLike(String value) {
            addCriterion("FkeyWord not like", value, "fkeyword");
            return (Criteria) this;
        }

        public Criteria andFkeywordIn(List<String> values) {
            addCriterion("FkeyWord in", values, "fkeyword");
            return (Criteria) this;
        }

        public Criteria andFkeywordNotIn(List<String> values) {
            addCriterion("FkeyWord not in", values, "fkeyword");
            return (Criteria) this;
        }

        public Criteria andFkeywordBetween(String value1, String value2) {
            addCriterion("FkeyWord between", value1, value2, "fkeyword");
            return (Criteria) this;
        }

        public Criteria andFkeywordNotBetween(String value1, String value2) {
            addCriterion("FkeyWord not between", value1, value2, "fkeyword");
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