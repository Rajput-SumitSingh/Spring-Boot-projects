package com.spring.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "xyzapplication")
public class UserEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private String name;

	private String city;

	private String status;

	public UserEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserEntity(String name, String city, String status) {
		super();
		this.name = name;
		this.city = city;
		this.status = status;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "UserEntity [name=" + name + ", city=" + city + ", status=" + status + "]";
	}

}
