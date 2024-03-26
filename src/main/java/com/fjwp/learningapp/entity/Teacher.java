package com.fjwp.learningapp.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Teacher {
	@Id
	private Integer teacherId;//primarry key
	private String teacherName;
	private String Qulification;
	private Integer Salary;
	
	@ManyToOne(targetEntity=Course.class)//one course have many teacher
	@JoinColumn(name="CourseId")
	private Course course;
	
	public Teacher(Integer teacherId, String teacherName, String qulification, Integer salary) {
		super();
		this.teacherId = teacherId;
		this.teacherName = teacherName;
		Qulification = qulification;
		Salary = salary;
	}
	//use geter and seter
	public Integer getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(Integer teacherId) {
		this.teacherId = teacherId;
	}
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	public String getQulification() {
		return Qulification;
	}
	public void setQulification(String qulification) {
		Qulification = qulification;
	}
	public Integer getSalary() {
		return Salary;
	}
	public void setSalary(Integer salary) {
		Salary = salary;
	}
	

}
