package com.file.upload.model;

import java.util.Date;
import java.util.Map;
import java.util.UUID;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import com.file.upload.view.MetaDataView;

@Entity
public class MetaData {
    @Id
    private String Id;
    @NotNull
    private String fullPath;
    @NotNull
    private String name;
    @NotNull
    private Long size;
    @Temporal(TemporalType.TIMESTAMP)
    private Date timeCreated;
    @Temporal(TemporalType.TIMESTAMP)
    private Date updated;
    @NotNull
    private String md5Hash;
    private String cacheControl;
    @NotNull
    private String contentDisposition;
    private String contentEncoding;
    private String contentLanguage;
    @NotNull
    private String contentType;
    @ElementCollection
    private Map<String, String> customMetaData;

    public MetaData() {
        Id = UUID.randomUUID().toString();
        timeCreated = new Date();
        updated = timeCreated;
    }

    public MetaData(Long size, String md5Hash) {
        this();
        this.size = size;
        this.md5Hash = md5Hash;
    }

    public MetaData(String Id, Long size, String md5Hash) {
        this(size, md5Hash);
        if(Id != null) this.Id = Id;
    }

    public MetaData(MetaDataView view) {
        this(view.getId(), view.getSize(), view.getMd5Hash());
        if(view.getTimeCreated() != null) timeCreated = view.getTimeCreated();
        if(view.getUpdated() != null) updated = view.getUpdated();
        name = view.getName();
        cacheControl = view.getCacheControl();
        contentDisposition = view.getContentDisposition();
        contentEncoding = view.getContentEncoding();
        contentLanguage = view.getContentLanguage();
        contentType = view.getContentType();
        customMetaData = view.getCustomMetaData();
    }

    /** -- Getters and Setters -- */

    public String getId() {
        return Id;
    }

    public String getFullPath() {
        return fullPath;
    }

    public void setFullPath(String fullPath) {
        this.fullPath = fullPath;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getSize() {
        return size;
    }

    public Date getTimeCreated() {
        return timeCreated;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    public String getMd5Hash() {
        return md5Hash;
    }

    public String getCacheControl() {
        return cacheControl;
    }

    public void setCacheControl(String cacheControl) {
        this.cacheControl = cacheControl;
    }

    public String getContentDisposition() {
        return contentDisposition;
    }

    public void setContentDisposition(String contentDisposition) {
        this.contentDisposition = contentDisposition;
    }

    public String getContentEncoding() {
        return contentEncoding;
    }

    public void setContentEncoding(String contentEncoding) {
        this.contentEncoding = contentEncoding;
    }

    public String getContentLanguage() {
        return contentLanguage;
    }

    public void setContentLanguage(String contentLanguage) {
        this.contentLanguage = contentLanguage;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public Map<String, String> getCustomMetaData() {
        return customMetaData;
    }

    public void setCustomMetaData(Map<String, String> customMetaData) {
        this.customMetaData = customMetaData;
    }

}