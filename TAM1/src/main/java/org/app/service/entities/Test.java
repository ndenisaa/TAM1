package org.app.service.entities;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;
@Entity 

public class Test {
	@Id
private Integer testId;
	@ManyToOne
private Job job;
private String title;
@OneToMany (mappedBy="test")
private List<Admin > admins=new ArrayList <Admin>();
@OneToMany (mappedBy="test")
private List<Question> questions=new ArrayList <Question>();
public Integer getTestId() {
	return testId;
}
public void setTestId(Integer testId) {
	this.testId = testId;
}
public Job getJob() {
	return job;
}
public void setJob(Job job) {
	this.job = job;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public List<Admin> getAdmins() {
	return admins;
}
public void setAdmins(List<Admin> admins) {
	this.admins = admins;
}
public List<Question> getQuestions() {
	return questions;
}
public void setQuestions(List<Question> questions) {
	this.questions = questions;
}
public Test(Integer testId, Job job, String title, List<Admin> admins, List<Question> questions) {
	super();
	this.testId = testId;
	this.job = job;
	this.title = title;
	this.admins = admins;
	this.questions = questions;
}
public Test() {
	super();
}

}
