package com.fjwp.learningapp.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Learner {
	@Id
	private Integer studentId;//primary key
	private String studentName;
	private String password;
	
	@ManyToOne
	@JoinColumn(name="courseId")//many student enroll one course
	private Course course;
	
	@ManyToOne
	@JoinColumn(name="testId")//many student attend same test
	private Test test;
	
	
	@ManyToMany
	@JoinTable(name="Learner_Book",joinColumns=@JoinColumn(name="studentId"),//many student access many book
	inverseJoinColumns=@JoinColumn(name="bookId"))
	Set<Book> bookset=new HashSet<Book>();

	
	public Learner(Integer studentId, String studentName, String password) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.password = password;
	}
	public Learner() {
		// TODO Auto-generated constructor stub
	}
	//use geter and seter
	public Integer getStudentId() {
		return studentId;
	}
	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void InsertLearner(int student) {
		
	}
	

}
