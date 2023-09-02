package com.monst3r.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.monst3r.Help3r.FileHelper;

@RestController
public class FileUploaderController {

	@Autowired
	private FileHelper fileHelper;

	@PostMapping("/upload-file")
	public ResponseEntity<String> fileUpload(@RequestParam("file") MultipartFile multipartFile) {

		System.out.println(multipartFile.getName());
		System.out.println(multipartFile.getSize());
		System.out.println(multipartFile.isEmpty());
		System.out.println(multipartFile.getOriginalFilename());

		if (multipartFile.isEmpty()) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Internal Server Error ");
		}

		if (!multipartFile.getContentType().equals("images/jpeg")) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Only Image files are supported .... ");
		}

		// If both are ok >>>>>>>>>>>>>

		boolean t = fileHelper.uploadFile(multipartFile);
		if (t) {
			ResponseEntity.ok().body("File Uploaded Successfully ");
		}

		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("SomeThing went wrong plz try Again .... ");
	}

}