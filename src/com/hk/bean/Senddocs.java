package com.hk.bean;

import java.util.Date;

public class Senddocs {
    private Integer id;

    private String fdepartment;

    private String fdepartmentid;

    private Date ffiledate;

    private Integer fsecrecy;

    private String fno;

    private String ftitle;

    private String fuploadfile;

    private String fuploadname;

    private Integer fuploadnumer;

    private Integer fsecrecylevel;

    private String fcarrier;

    private String fcarrierid;

    private String fdraftpeople;

    private String fdraftpeopleid;

    private String fnucleardraft;

    private String fnucleardraftid;

    private String faudit;

    private String fauditid;

    private String fcountersign;

    private String fissuer;

    private String fissuerid;

    private String flazy;

    private String fremark;

    private Integer fmainbodyid;


    private String fdocumentstatus;

    private String fcopydepartments;
    private String fcopydepartmentsid;

    private String fmainsupplydep;
    private String fmainsupplydepid;

    private String isdel = "0";

    public String getFcopydepartmentsid() {
		return fcopydepartmentsid;
	}

	public void setFcopydepartmentsid(String fcopydepartmentsid) {
		this.fcopydepartmentsid = fcopydepartmentsid;
	}

	public String getFmainsupplydepid() {
		return fmainsupplydepid;
	}

	public void setFmainsupplydepid(String fmainsupplydepid) {
		this.fmainsupplydepid = fmainsupplydepid;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFdepartment() {
        return fdepartment;
    }

    public void setFdepartment(String fdepartment) {
        this.fdepartment = fdepartment == null ? null : fdepartment.trim();
    }

    public String getFdepartmentid() {
        return fdepartmentid;
    }

    public void setFdepartmentid(String fdepartmentid) {
        this.fdepartmentid = fdepartmentid == null ? null : fdepartmentid.trim();
    }

    public Date getFfiledate() {
        return ffiledate;
    }

    public void setFfiledate(Date ffiledate) {
        this.ffiledate = ffiledate;
    }

    public Integer getFsecrecy() {
        return fsecrecy;
    }

    public void setFsecrecy(Integer fsecrecy) {
        this.fsecrecy = fsecrecy;
    }

    public String getFno() {
        return fno;
    }

    public void setFno(String fno) {
        this.fno = fno == null ? null : fno.trim();
    }

    public String getFtitle() {
        return ftitle;
    }

    public void setFtitle(String ftitle) {
        this.ftitle = ftitle == null ? null : ftitle.trim();
    }

    public String getFuploadfile() {
        return fuploadfile;
    }

    public void setFuploadfile(String fuploadfile) {
        this.fuploadfile = fuploadfile == null ? null : fuploadfile.trim();
    }

    public String getFuploadname() {
        return fuploadname;
    }

    public void setFuploadname(String fuploadname) {
        this.fuploadname = fuploadname == null ? null : fuploadname.trim();
    }

    public Integer getFuploadnumer() {
        return fuploadnumer;
    }

    public void setFuploadnumer(Integer fuploadnumer) {
        this.fuploadnumer = fuploadnumer;
    }

    public Integer getFsecrecylevel() {
        return fsecrecylevel;
    }

    public void setFsecrecylevel(Integer fsecrecylevel) {
        this.fsecrecylevel = fsecrecylevel;
    }

    public String getFcarrier() {
        return fcarrier;
    }

    public void setFcarrier(String fcarrier) {
        this.fcarrier = fcarrier == null ? null : fcarrier.trim();
    }

    public String getFcarrierid() {
        return fcarrierid;
    }

    public void setFcarrierid(String fcarrierid) {
        this.fcarrierid = fcarrierid == null ? null : fcarrierid.trim();
    }

    public String getFdraftpeople() {
        return fdraftpeople;
    }

    public void setFdraftpeople(String fdraftpeople) {
        this.fdraftpeople = fdraftpeople == null ? null : fdraftpeople.trim();
    }

    public String getFdraftpeopleid() {
        return fdraftpeopleid;
    }

    public void setFdraftpeopleid(String fdraftpeopleid) {
        this.fdraftpeopleid = fdraftpeopleid == null ? null : fdraftpeopleid.trim();
    }

    public String getFnucleardraft() {
        return fnucleardraft;
    }

    public void setFnucleardraft(String fnucleardraft) {
        this.fnucleardraft = fnucleardraft == null ? null : fnucleardraft.trim();
    }

    public String getFnucleardraftid() {
        return fnucleardraftid;
    }

    public void setFnucleardraftid(String fnucleardraftid) {
        this.fnucleardraftid = fnucleardraftid == null ? null : fnucleardraftid.trim();
    }

    public String getFaudit() {
        return faudit;
    }

    public void setFaudit(String faudit) {
        this.faudit = faudit == null ? null : faudit.trim();
    }

    public String getFauditid() {
        return fauditid;
    }

    public void setFauditid(String fauditid) {
        this.fauditid = fauditid == null ? null : fauditid.trim();
    }

    public String getFcountersign() {
        return fcountersign;
    }

    public void setFcountersign(String fcountersign) {
        this.fcountersign = fcountersign == null ? null : fcountersign.trim();
    }

    public String getFissuer() {
        return fissuer;
    }

    public void setFissuer(String fissuer) {
        this.fissuer = fissuer == null ? null : fissuer.trim();
    }

    public String getFissuerid() {
        return fissuerid;
    }

    public void setFissuerid(String fissuerid) {
        this.fissuerid = fissuerid == null ? null : fissuerid.trim();
    }

    public String getFlazy() {
        return flazy;
    }

    public void setFlazy(String flazy) {
        this.flazy = flazy == null ? null : flazy.trim();
    }

    public String getFremark() {
        return fremark;
    }

    public void setFremark(String fremark) {
        this.fremark = fremark == null ? null : fremark.trim();
    }

    public Integer getFmainbodyid() {
        return fmainbodyid;
    }

    public void setFmainbodyid(Integer fmainbodyid) {
        this.fmainbodyid = fmainbodyid;
    }


    public String getFdocumentstatus() {
        return fdocumentstatus;
    }

    public void setFdocumentstatus(String fdocumentstatus) {
        this.fdocumentstatus = fdocumentstatus == null ? null : fdocumentstatus.trim();
    }

    public String getFcopydepartments() {
        return fcopydepartments;
    }

    public void setFcopydepartments(String fcopydepartments) {
        this.fcopydepartments = fcopydepartments == null ? null : fcopydepartments.trim();
    }

    public String getFmainsupplydep() {
        return fmainsupplydep;
    }

    public void setFmainsupplydep(String fmainsupplydep) {
        this.fmainsupplydep = fmainsupplydep == null ? null : fmainsupplydep.trim();
    }

    public String getIsdel() {
        return isdel;
    }

    public void setIsdel(String isdel) {
        this.isdel = isdel == null ? null : isdel.trim();
    }

}