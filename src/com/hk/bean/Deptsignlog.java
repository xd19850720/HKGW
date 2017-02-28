package com.hk.bean;

import java.util.Date;

public class Deptsignlog {
    private Integer id;

    private Integer fsendfileid;

    private String fuserid;

    private String fusername;

    private String fpositionid;

    private String fpositionname;

    private String ftext;

    private Date signtime;

    private String isdel;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFsendfileid() {
        return fsendfileid;
    }

    public void setFsendfileid(Integer fsendfileid) {
        this.fsendfileid = fsendfileid;
    }

    public String getFuserid() {
        return fuserid;
    }

    public void setFuserid(String fuserid) {
        this.fuserid = fuserid == null ? null : fuserid.trim();
    }

    public String getFusername() {
        return fusername;
    }

    public void setFusername(String fusername) {
        this.fusername = fusername == null ? null : fusername.trim();
    }

    public String getFpositionid() {
        return fpositionid;
    }

    public void setFpositionid(String fpositionid) {
        this.fpositionid = fpositionid == null ? null : fpositionid.trim();
    }

    public String getFpositionname() {
        return fpositionname;
    }

    public void setFpositionname(String fpositionname) {
        this.fpositionname = fpositionname == null ? null : fpositionname.trim();
    }

    public String getFtext() {
        return ftext;
    }

    public void setFtext(String ftext) {
        this.ftext = ftext == null ? null : ftext.trim();
    }

    public Date getSigntime() {
        return signtime;
    }

    public void setSigntime(Date signtime) {
        this.signtime = signtime;
    }

    public String getIsdel() {
        return isdel;
    }

    public void setIsdel(String isdel) {
        this.isdel = isdel == null ? null : isdel.trim();
    }
}