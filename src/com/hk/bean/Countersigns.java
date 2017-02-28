package com.hk.bean;

public class Countersigns {
    private Integer id;

    private String fcountersignsid;

    private String fcountersignscode;

    private String fcountersignsname;

    private Integer fsendfileid;

    private String fsuggestion;

    private Integer fisagree;

    private String isdel;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFcountersignsid() {
        return fcountersignsid;
    }

    public void setFcountersignsid(String fcountersignsid) {
        this.fcountersignsid = fcountersignsid == null ? null : fcountersignsid.trim();
    }

    public String getFcountersignscode() {
        return fcountersignscode;
    }

    public void setFcountersignscode(String fcountersignscode) {
        this.fcountersignscode = fcountersignscode == null ? null : fcountersignscode.trim();
    }

    public String getFcountersignsname() {
        return fcountersignsname;
    }

    public void setFcountersignsname(String fcountersignsname) {
        this.fcountersignsname = fcountersignsname == null ? null : fcountersignsname.trim();
    }

    public Integer getFsendfileid() {
        return fsendfileid;
    }

    public void setFsendfileid(Integer fsendfileid) {
        this.fsendfileid = fsendfileid;
    }

    public String getFsuggestion() {
        return fsuggestion;
    }

    public void setFsuggestion(String fsuggestion) {
        this.fsuggestion = fsuggestion == null ? null : fsuggestion.trim();
    }

    public Integer getFisagree() {
        return fisagree;
    }

    public void setFisagree(Integer fisagree) {
        this.fisagree = fisagree;
    }

    public String getIsdel() {
        return isdel;
    }

    public void setIsdel(String isdel) {
        this.isdel = isdel == null ? null : isdel.trim();
    }
}