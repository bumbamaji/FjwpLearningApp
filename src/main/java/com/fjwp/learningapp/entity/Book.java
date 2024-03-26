package com.fjwp.learningapp.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity //use anotation Entity
public class Book {
	@Id
	private Integer bookId;//primary key
	private String bookName;
	
	@ManyToOne(targetEntity=Course.class)//many learner enroll one course
	@JoinColumn(name="CourseId")
	private Course course;
	
	@ManyToMany(mappedBy="bookset")//many lerner access many book
	Set<Learner> customers=new HashSet<Learner>();
	
		//use constructer
	public Book(Integer bookId, String bookName) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
	}
	public Book() {
		
	}
	//use gatter and setter
	public Integer getBookId() {
		return bookId;
	}
	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	

}
