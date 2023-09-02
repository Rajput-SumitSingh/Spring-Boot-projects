package com.monst3r.Help3r;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class FileHelper {
	
	public final String UPLOAD_FILE_URL = "C:\\Users\\SUJEET SINGH\\workspace-spring\\bootrestbook\\src\\main\\resources\\static\\images";
	
	public boolean uploadFile(MultipartFile f) {
		boolean s = false;
		
		try {
			
//			InputStream iStream = f.getInputStream();
//			
//			byte data[] = new byte[iStream.available()];
//			
//			iStream.read(data);
//			
//			FileOutputStream fos = new FileOutputStream(UPLOAD_FILE_URL+File.separator+f.getOriginalFilename()) ;
//			fos.flush();
//			fos.close();
			
			/*Alternate Method */
			
			Files.copy(f.getInputStream(), Paths.get(UPLOAD_FILE_URL+File.separator+f.getOriginalFilename()) , StandardCopyOption.REPLACE_EXISTING);
			
			s = true;
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
		return s;
	}
	
}
