package org.app.service.entities;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

	@Entity 
	public class Job {
	@Id
	private Integer jobId;
	private String title;
	private String description;
	@OneToMany (mappedBy = "job")
	private List<JobApplication> jobApplications = new ArrayList <JobApplication> ();
	@OneToMany (mappedBy = "job")
	private List<Test> tests = new ArrayList <Test> ();
	@OneToMany(mappedBy="candidate")
	private List<JobInterview> jobInterview=new ArrayList <JobInterview>();
	public Integer getJobId() {
		return jobId;
	}
	public void setJobId(Integer jobId) {
		this.jobId = jobId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<JobApplication> getJobApplications() {
		return jobApplications;
	}
	public void setJobApplications(List<JobApplication> jobApplications) {
		this.jobApplications = jobApplications;
	}
	public List<Test> getTests() {
		return tests;
	}
	public void setTests(List<Test> tests) {
		this.tests = tests;
	}
	public List<JobInterview> getJobInterview() {
		return jobInterview;
	}
	public void setJobInterview(List<JobInterview> jobInterview) {
		this.jobInterview = jobInterview;
	}
	public Job(Integer jobId, String title, String description, List<JobApplication> jobApplications, List<Test> tests,
			List<JobInterview> jobInterview) {
		super();
		this.jobId = jobId;
		this.title = title;
		this.description = description;
		this.jobApplications = jobApplications;
		this.tests = tests;
		this.jobInterview = jobInterview;
	}
	public Job() {
		super();
	}


}
