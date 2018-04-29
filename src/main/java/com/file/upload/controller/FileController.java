package com.file.upload.controller;

import static org.springframework.web.bind.annotation.RequestMethod.POST;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.file.upload.service.FileMetaDataService;
import com.file.upload.view.MetaDataView;

@RestController
@RequestMapping("/api/v1/file")
public class FileController {
	
	@Autowired
	private FileMetaDataService fileMetaDataService;

    @RequestMapping(value = "/upload", method = POST)
    public ResponseEntity<String> upload(@RequestBody MetaDataView metaData) {
        String Id = fileMetaDataService.save(metaData);
        if(Id != null) return ResponseEntity.ok(Id);
        return ResponseEntity.badRequest().body("There is a problem! Please, try again later.");
    }
}
