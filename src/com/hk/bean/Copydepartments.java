package com.hk.bean;

public class Copydepartments {
    private Integer id;

    private String fdeptid;

    private String fdeptcode;

    private String fdeptname;

    private Integer fsendfileid;

    private String isdel;

    private String fdeptype;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFdeptid() {
        return fdeptid;
    }

    public void setFdeptid(String fdeptid) {
        this.fdeptid = fdeptid == null ? null : fdeptid.trim();
    }

    public String getFdeptcode() {
        return fdeptcode;
    }

    public void setFdeptcode(String fdeptcode) {
        this.fdeptcode = fdeptcode == null ? null : fdeptcode.trim();
    }

    public String getFdeptname() {
        return fdeptname;
    }

    public void setFdeptname(String fdeptname) {
        this.fdeptname = fdeptname == null ? null : fdeptname.trim();
    }

    public Integer getFsendfileid() {
        return fsendfileid;
    }

    public void setFsendfileid(Integer fsendfileid) {
        this.fsendfileid = fsendfileid;
    }

    public String getIsdel() {
        return isdel;
    }

    public void setIsdel(String isdel) {
        this.isdel = isdel == null ? null : isdel.trim();
    }

    public String getFdeptype() {
        return fdeptype;
    }

    public void setFdeptype(String fdeptype) {
        this.fdeptype = fdeptype == null ? null : fdeptype.trim();
    }
}