package com.monst3r.Entity;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Author {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int authorId;
	
	private String authorName;
	
	private String authorLanguage;

	public Author(int authorId, String authorName, String authorLanguage) {
		super();
		this.authorId = authorId;
		this.authorName = authorName;
		this.authorLanguage = authorLanguage;
	}
	
	

	public Author() {
		super();
		// TODO Auto-generated constructor stub
	}



	public int getAuthorId() {
		return authorId;
	}

	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getAuthorLanguage() {
		return authorLanguage;
	}

	public void setAuthorLanguage(String authorLanguage) {
		this.authorLanguage = authorLanguage;
	}
	
	
	
	
}
