package com.xadmin.SpringBootCrud.bean;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
@Entity
@Table(name="crud",schema="schooldb")
@Data
public class Subject {
	@Id
	@Column(name="Id")
	
	
 private Long id;
	@Column(name="Name")
 private String name;
	@Column(name="Email")
 private String email;
	@Column(name="Mobile")
 private Long mobile;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getMobile() {
		return mobile;
	}
	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}
	
	
	
}
