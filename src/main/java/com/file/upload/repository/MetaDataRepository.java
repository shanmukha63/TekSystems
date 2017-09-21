package com.file.upload.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.file.upload.model.MetaData;

@Repository
public interface MetaDataRepository extends JpaRepository<MetaData, String>{

}