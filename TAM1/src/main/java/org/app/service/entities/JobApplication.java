package org.app.service.entities;
import java.util.Date;

import javax.persistence.*;
@Entity 

public class JobApplication {
	@Id
	private Integer appId;
	private Date appDate;
	private String status;
	private Integer candidateId;
	private Integer jobId;
	@ManyToOne
	private Candidate candidate;
	@ManyToOne
	private Job job;
	public Integer getAppId() {
		return appId;
	}
	public void setAppId(Integer appId) {
		this.appId = appId;
	}
	public Date getAppDate() {
		return appDate;
	}
	public void setAppDate(Date appDate) {
		this.appDate = appDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Integer getCandidateId() {
		return candidateId;
	}
	public void setCandidateId(Integer candidateId) {
		this.candidateId = candidateId;
	}
	public Integer getJobId() {
		return jobId;
	}
	public void setJobId(Integer jobId) {
		this.jobId = jobId;
	}
	public Candidate getCandidate() {
		return candidate;
	}
	public void setCandidate(Candidate candidate) {
		this.candidate = candidate;
	}
	public Job getJob() {
		return job;
	}
	public void setJob(Job job) {
		this.job = job;
	}
	public JobApplication(Integer appId, Date appDate, String status, Integer candidateId, Integer jobId,
			Candidate candidate, Job job) {
		super();
		this.appId = appId;
		this.appDate = appDate;
		this.status = status;
		this.candidateId = candidateId;
		this.jobId = jobId;
		this.candidate = candidate;
		this.job = job;
	}
	public JobApplication() {
		super();
	}

}
