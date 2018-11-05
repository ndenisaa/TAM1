package org.app.service.entities;
import java.util.Date;
import javax.persistence.*;
@Entity 

public class JobTest {
	@Id
	private Integer jobTestId;
	@ManyToOne
	private Candidate candidate;
	@ManyToOne
	private Test test;
	private Date testDate;
	private Integer marks;
	public Integer getJobTestId() {
		return jobTestId;
	}
	public void setJobTestId(Integer jobTestId) {
		this.jobTestId = jobTestId;
	}
	public Candidate getCandidate() {
		return candidate;
	}
	public void setCandidate(Candidate candidate) {
		this.candidate = candidate;
	}
	public Test getTest() {
		return test;
	}
	public void setTest(Test test) {
		this.test = test;
	}
	public Date getTestDate() {
		return testDate;
	}
	public void setTestDate(Date testDate) {
		this.testDate = testDate;
	}
	public Integer getMarks() {
		return marks;
	}
	public void setMarks(Integer marks) {
		this.marks = marks;
	}
	public JobTest(Integer jobTestId, Candidate candidate, Test test, Date testDate, Integer marks) {
		super();
		this.jobTestId = jobTestId;
		this.candidate = candidate;
		this.test = test;
		this.testDate = testDate;
		this.marks = marks;
	}
	public JobTest() {
		super();
	}

}
