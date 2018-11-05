package org.app.service.entities;
import javax.persistence.*;
@Entity 

public class Admin {
	@Id
private Integer adminId;
	@ManyToOne
	private Test test;
	@ManyToOne
	private Job job;
	private String name;
	private String phone;
	private String email;
	private String address;
	public Integer getAdminId() {
		return adminId;
	}
	public void setAdminId(Integer adminId) {
		this.adminId = adminId;
	}
	public Test getTest() {
		return test;
	}
	public void setTest(Test test) {
		this.test = test;
	}
	public Job getJob() {
		return job;
	}
	public void setJob(Job job) {
		this.job = job;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Admin(Integer adminId, Test test, Job job, String name, String phone, String email, String address) {
		super();
		this.adminId = adminId;
		this.test = test;
		this.job = job;
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.address = address;
	}
	public Admin() {
		super();
	}

}
