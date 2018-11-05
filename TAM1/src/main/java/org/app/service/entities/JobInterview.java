package org.app.service.entities;
import javax.persistence.*;
import java.util.Date;
@Entity 

public class JobInterview {
	@Id
	private Integer jobInterviewId;
	@ManyToOne
	private Candidate candidate;
	@ManyToOne 
	private Job job;
	@ManyToOne
	private HR_Correspondent hrCorrespondent;
	private Date interviewDate;
	private Integer marks;
	public Integer getJobInterviewId() {
		return jobInterviewId;
	}
	public void setJobInterviewId(Integer jobInterviewId) {
		this.jobInterviewId = jobInterviewId;
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
	public HR_Correspondent getHrCorrespondent() {
		return hrCorrespondent;
	}
	public void setHrCorrespondent(HR_Correspondent hrCorrespondent) {
		this.hrCorrespondent = hrCorrespondent;
	}
	public Date getInterviewDate() {
		return interviewDate;
	}
	public void setInterviewDate(Date interviewDate) {
		this.interviewDate = interviewDate;
	}
	public Integer getMarks() {
		return marks;
	}
	public void setMarks(Integer marks) {
		this.marks = marks;
	}
	public JobInterview(Integer jobInterviewId, Candidate candidate, Job job, HR_Correspondent hrCorrespondent,
			Date interviewDate, Integer marks) {
		super();
		this.jobInterviewId = jobInterviewId;
		this.candidate = candidate;
		this.job = job;
		this.hrCorrespondent = hrCorrespondent;
		this.interviewDate = interviewDate;
		this.marks = marks;
	}
	public JobInterview() {
		super();
	}
	
	}


