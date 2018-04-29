package com.file.upload.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.file.upload.model.MetaData;
import com.file.upload.repository.MetaDataRepository;
import com.file.upload.service.FileMetaDataService;
import com.file.upload.view.MetaDataView;

@Service
public class FileMetaDataServiceImpl implements FileMetaDataService{
	@Autowired
    private MetaDataRepository metaDataRepository;
	
	@Override
    public String save(MetaDataView view) {
        MetaData metaData = new MetaData(view);
        MetaData saved = metaDataRepository.saveAndFlush(metaData);
        if (saved != null) return saved.getId();
        return null;
    }
}
