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
public class Course {
	@Id
	private Integer courseId;//primary key
	private String courseName;
	
	@OneToOne(targetEntity=Test.class,cascade=CascadeType.ALL)//one test for one course
	private Test test;
	
	@OneToMany(mappedBy="course",cascade=CascadeType.ALL)//one course for many larner
	List<Learner> student=new ArrayList<Learner>();
	private Learner learner;
	
	@OneToMany(mappedBy="course",cascade=CascadeType.ALL)//one course for many teacher
	List<Teacher> teach=new ArrayList<Teacher>();
	private Teacher teacher;
	
	@OneToMany(mappedBy="course",cascade=CascadeType.ALL)//one course for many book
	List<Book> book1=new ArrayList<Book>();
	private Book book;
	
	//use comutator
	public Course(Integer courseId, String courseName) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
	}
	public Course() {
		
	}
	//use seter and geter
	public Integer getCourseId() {
		return courseId;
	}
	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	
	
	
	

}
