package com.fjwplearningapp.service;

import com.fjwp.learningapp.entity.Book;
import com.fjwp.learningapp.entity.Course;
import com.fjwp.learningapp.entity.Learner;
import com.fjwp.learningapp.entity.Teacher;
import com.fjwp.learningapp.entity.Test;

public interface Service {
	void getCourse(Integer Id);//get methord
	void getBook(Integer Id);
	void getStudent(Integer Id);
	void getTeacher(Integer Id);
	void getTest(Integer Id);
	
	void insert(Course course,Learner student,Teacher teacher,Book book,Test test);//insert operaion
	void updateLearner(Learner student);//update operation
	void updateTeacher(Teacher teacher);
	void updateTest(Test test);
	void updateBook(Book book);
	void updateCourse(Course course);
	void deleteStudent(Learner student);//delete opation
	void deleteTeacher(Teacher teacher);
	void deleteCourse(Course course);
	void deleteBook(Book book);
	void deleteTest(Test test);
	void insert(Learner student);
	void insert(Course course);
	
	
	

}
