package com.hk.bean;

import java.util.Date;

public class Uploadfile {
    private Integer id;

    private Integer attachcode;

    private String attachname;

    private String attachfilepath;

    private String creatorname;

    private String creatorid;

    private String description;

    private Date gettime;

    private String generatedname;

    private Integer documentid;

    private Integer receivedocid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAttachcode() {
        return attachcode;
    }

    public void setAttachcode(Integer attachcode) {
        this.attachcode = attachcode;
    }

    public String getAttachname() {
        return attachname;
    }

    public void setAttachname(String attachname) {
        this.attachname = attachname == null ? null : attachname.trim();
    }

    public String getAttachfilepath() {
        return attachfilepath;
    }

    public void setAttachfilepath(String attachfilepath) {
        this.attachfilepath = attachfilepath == null ? null : attachfilepath.trim();
    }

    public String getCreatorname() {
        return creatorname;
    }

    public void setCreatorname(String creatorname) {
        this.creatorname = creatorname == null ? null : creatorname.trim();
    }

    public String getCreatorid() {
        return creatorid;
    }

    public void setCreatorid(String creatorid) {
        this.creatorid = creatorid == null ? null : creatorid.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Date getGettime() {
        return gettime;
    }

    public void setGettime(Date gettime) {
        this.gettime = gettime;
    }

    public String getGeneratedname() {
        return generatedname;
    }

    public void setGeneratedname(String generatedname) {
        this.generatedname = generatedname == null ? null : generatedname.trim();
    }

    public Integer getDocumentid() {
        return documentid;
    }

    public void setDocumentid(Integer documentid) {
        this.documentid = documentid;
    }

    public Integer getReceivedocid() {
        return receivedocid;
    }

    public void setReceivedocid(Integer receivedocid) {
        this.receivedocid = receivedocid;
    }
}