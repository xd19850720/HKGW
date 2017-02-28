package com.hk.bean;

public class Mainbody {
    private Integer id;

    private Integer fcode;

    private String ffilename;

    private String ffilepath;

    private String isdel;

    private String ffilenameview;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFcode() {
        return fcode;
    }

    public void setFcode(Integer fcode) {
        this.fcode = fcode;
    }

    public String getFfilename() {
        return ffilename;
    }

    public void setFfilename(String ffilename) {
        this.ffilename = ffilename == null ? null : ffilename.trim();
    }

    public String getFfilepath() {
        return ffilepath;
    }

    public void setFfilepath(String ffilepath) {
        this.ffilepath = ffilepath == null ? null : ffilepath.trim();
    }

    public String getIsdel() {
        return isdel;
    }

    public void setIsdel(String isdel) {
        this.isdel = isdel == null ? null : isdel.trim();
    }

    public String getFfilenameview() {
        return ffilenameview;
    }

    public void setFfilenameview(String ffilenameview) {
        this.ffilenameview = ffilenameview == null ? null : ffilenameview.trim();
    }
}