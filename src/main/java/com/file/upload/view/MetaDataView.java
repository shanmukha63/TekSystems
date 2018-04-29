package com.file.upload.view;

import java.util.Date;
import java.util.Map;

import com.file.upload.model.MetaData;

public class MetaDataView {

    private String Id;
    private String name;
    private Long size;
    private Date timeCreated;
    private Date updated;
    private String md5Hash;
    private String cacheControl;
    private String contentDisposition;
    private String contentEncoding;
    private String contentLanguage;
    private String contentType;
    private Map<String, String> customMetaData;

    MetaDataView() {}

    public MetaDataView(MetaData metaData) {
        Id = metaData.getId();
        name = metaData.getName();
        size = metaData.getSize();
        timeCreated = metaData.getTimeCreated();
        updated = metaData.getUpdated();
        md5Hash = metaData.getMd5Hash();
        cacheControl = metaData.getCacheControl();
        contentDisposition = metaData.getContentDisposition();
        contentEncoding = metaData.getContentEncoding();
        contentLanguage = metaData.getContentLanguage();
        contentType = metaData.getContentType();
        customMetaData = metaData.getCustomMetaData();
    }

    public String getId() {
        return Id;
    }

    public String getName() {
        return name;
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

    public String getMd5Hash() {
        return md5Hash;
    }

    public String getCacheControl() {
        return cacheControl;
    }

    public String getContentDisposition() {
        return contentDisposition;
    }

    public String getContentEncoding() {
        return contentEncoding;
    }

    public String getContentLanguage() {
        return contentLanguage;
    }

    public String getContentType() {
        return contentType;
    }

    public Map<String, String> getCustomMetaData() {
        return customMetaData;
    }
}