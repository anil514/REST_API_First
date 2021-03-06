package com.api.data;


//this is POJO - Plain Old Java Object  (Marshaling) -> Java Object to JSON Object
public class UsersData {
	String name ;
	String job;
	String id; 
	String createdAt;
	
	public UsersData() {
		
	}
	
	public UsersData(String name, String job) {
		this.name = name;
		this.job = job;
	}

	
	//getter and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}
	
	

}
