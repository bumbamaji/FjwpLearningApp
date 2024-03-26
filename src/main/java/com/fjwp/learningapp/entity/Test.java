package com.fjwp.learningapp.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Test {
	@Id
	private Integer testId;//primary key
	private String testName;
	private Integer Duration;
	private Integer TotalMarks;
	
	@OneToOne(targetEntity=Course.class,cascade=CascadeType.ALL)//one course have one test
	private Course course;
	
	@OneToMany(mappedBy="test",cascade=CascadeType.ALL)//many student attend same test
	List<Learner> student=new ArrayList<Learner>();
	private Learner Learn;
	
	public Test(Integer testId, String testName, Integer duration, Integer totalMarks) {
		super();
		this.testId = testId;
		this.testName = testName;
		Duration = duration;
		TotalMarks = totalMarks;
	}
	public Test() {
		
	}
	//use geter and seter
	public Integer getTestId() {
		return testId;
	}
	public void setTestId(Integer testId) {
		this.testId = testId;
	}
	public String getTestName() {
		return testName;
	}
	public void setTestName(String testName) {
		this.testName = testName;
	}
	public Integer getDuration() {
		return Duration;
	}
	public void setDuration(Integer duration) {
		Duration = duration;
	}
	public Integer getTotalMarks() {
		return TotalMarks;
	}
	public void setTotalMarks(Integer totalMarks) {
		TotalMarks = totalMarks;
	}
	
	
	
	

}
