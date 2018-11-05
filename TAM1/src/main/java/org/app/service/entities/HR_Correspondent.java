package org.app.service.entities;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity 

public class HR_Correspondent {
	@Id
	private Integer hrId;
	private String name;
	private String phone;
	private String email;
	private String address;
	@OneToMany(mappedBy="hrCorrespondent", cascade = CascadeType.ALL)
	private List<JobInterview> jobInterviews= new ArrayList<JobInterview>();
	public Integer getHrId() {
		return hrId;
	}
	public void setHrId(Integer hrId) {
		this.hrId = hrId;
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
	public List<JobInterview> getJobInterviews() {
		return jobInterviews;
	}
	public void setJobInterviews(List<JobInterview> jobInterviews) {
		this.jobInterviews = jobInterviews;
	}
	public HR_Correspondent(Integer hrId, String name, String phone, String email, String address,
			List<JobInterview> jobInterviews) {
		super();
		this.hrId = hrId;
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.address = address;
		this.jobInterviews = jobInterviews;
	}
	public HR_Correspondent() {
		super();
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((hrId == null) ? 0 : hrId.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HR_Correspondent other = (HR_Correspondent) obj;
		if (hrId == null) {
			if (other.hrId != null)
				return false;
		} else if (!hrId.equals(other.hrId))
			return false;
		return true;
	}
	}


