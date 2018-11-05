package org.app.service.entities;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity 

public class Candidate {

	@Id 
	private Integer candidateId;
	private String name;
	private String cv;
	private String phone;
	private String email;
	private String address;
	private Date dateOfBirth;
	@OneToMany(mappedBy="candidate")
	private List<JobApplication> jobApplications=new ArrayList <JobApplication>();
	@OneToMany(mappedBy="candidate")
	private List<JobInterview> jobInterview=new ArrayList <JobInterview>();
	public Integer getCandidateId() {
		return candidateId;
	}
	public void setCandidateId(Integer candidateId) {
		this.candidateId = candidateId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCv() {
		return cv;
	}
	public void setCv(String cv) {
		this.cv = cv;
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
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public List<JobApplication> getJobApplications() {
		return jobApplications;
	}
	public void setJobApplications(List<JobApplication> jobApplications) {
		this.jobApplications = jobApplications;
	}
	public List<JobInterview> getJobInterview() {
		return jobInterview;
	}
	public void setJobInterview(List<JobInterview> jobInterview) {
		this.jobInterview = jobInterview;
	}
	public Candidate(Integer candidateId, String name, String cv, String phone, String email, String address,
			Date dateOfBirth, List<JobApplication> jobApplications, List<JobInterview> jobInterview) {
		super();
		this.candidateId = candidateId;
		this.name = name;
		this.cv = cv;
		this.phone = phone;
		this.email = email;
		this.address = address;
		this.dateOfBirth = dateOfBirth;
		this.jobApplications = jobApplications;
		this.jobInterview = jobInterview;
	}
	public Candidate() {
		super();
	}


	}


