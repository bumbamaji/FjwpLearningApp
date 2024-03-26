package com.fjwplearningapp.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;


import com.fjwp.learningapp.entity.Book;
import com.fjwp.learningapp.entity.Course;
import com.fjwp.learningapp.entity.Learner;
import com.fjwp.learningapp.entity.Teacher;
import com.fjwp.learningapp.entity.Test;


public  class ServiceImpl implements Service{
	StandardServiceRegistry stserreg=new StandardServiceRegistryBuilder().configure("Configuaration.xml").build();
    Metadata metadata=new MetadataSources(stserreg).getMetadataBuilder().build();
	
    //SessionFactory
    SessionFactory sfactory=metadata.buildSessionFactory();
    
    //Session
    Session session;
    
    //Transaction
    Transaction transaction;

	@Override
	public void getCourse(Integer Id) {
		session=sfactory.openSession();
		Course course=session.get(Course.class, Id);
		
		System.out.println(course.getCourseName());
		session.close();
	}

	@Override
	public void getBook(Integer Id) {
		session=sfactory.openSession();
		Book book=session.get(Book.class, Id);
		
		System.out.println(book.getBookName());
		session.close();
	}

	@Override
	public void getStudent(Integer Id) {
		session=sfactory.openSession();
		Learner student=session.get(Learner.class, Id);
		
		System.out.println(student.getStudentName()+" "+student.getPassword());
		session.close();
	}

	@Override
	public void getTeacher(Integer Id) {
		session=sfactory.openSession();
		Teacher teacher=session.get(Teacher.class, Id);
		
		System.out.println(teacher.getTeacherName()+" "+teacher.getQulification()+" "+teacher.getSalary());
		session.close();
	}

	@Override
	public void getTest(Integer Id) {
		session=sfactory.openSession();
		Test test=session.get(Test.class, Id);
		
		System.out.println(test.getTestName()+" "+test.getDuration()+" "+test.getTotalMarks());
		session.close();
	}

	

	@Override
	public void insert(Course course, Learner student, Teacher teacher, Book book, Test test) {
		try {
			session=sfactory.openSession();
			transaction=session.beginTransaction();
			session.save(course);
			session.save(student);
			session.save(teacher);
			session.save(book);
			session.save(test);
			transaction.commit();
			System.out.println("Records inserted");
			
			}finally {
				session.close();
			}
		
	}

	@Override
	public void updateLearner(Learner student) {
		try {
			session=sfactory.openSession();
			transaction=session.beginTransaction();
			session.update(student);
			transaction.commit();
			System.out.println("Records updated");
			}finally {
				session.close();
			}// TODO Auto-generated method stub
		
	}

	@Override
	public void updateTeacher(Teacher teacher) {
		try {
			session=sfactory.openSession();
			transaction=session.beginTransaction();
			session.update(teacher);
			transaction.commit();
			System.out.println("Records updated");
			}finally {
				session.close();
			}// TODO Auto-generated method stub
		
	}

	@Override
	public void updateTest(Test test) {
		try {
			session=sfactory.openSession();
			transaction=session.beginTransaction();
			session.update(test);
			transaction.commit();
			System.out.println("Records updated");
			}finally {
				session.close();
			}// TODO Auto-generated method stub
		
	}

	@Override
	public void updateBook(Book book) {
		try {
			session=sfactory.openSession();
			transaction=session.beginTransaction();
			session.update(book);
			transaction.commit();
			System.out.println("Records updated");
			}finally {
				session.close();
			}// TODO Auto-generated method stub
		
		
	}

	@Override
	public void updateCourse(Course course) {
		try {
			session=sfactory.openSession();
			transaction=session.beginTransaction();
			session.update(course);
			transaction.commit();
			System.out.println("Records updated");
			}finally {
				session.close();
			}// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteStudent(Learner student) {
		try {
			session=sfactory.openSession();
			transaction=session.beginTransaction();
			session.delete(student);
			transaction.commit();
			System.out.println("Records deleted");
			
			}finally {
				session.close();
			}
	}

	@Override
	public void deleteTeacher(Teacher teacher) {
		try {
			session=sfactory.openSession();
			transaction=session.beginTransaction();
			session.delete(teacher);
			transaction.commit();
			System.out.println("Records deleted");
			
			}finally {
				session.close();
			}
	}

	@Override
	public void deleteCourse(Course course) {
		try {
			session=sfactory.openSession();
			transaction=session.beginTransaction();
			session.delete(course);
			transaction.commit();
			System.out.println("Records deleted");
			
			}finally {
				session.close();
			}
	}

	@Override
	public void deleteBook(Book book) {
		try {
			session=sfactory.openSession();
			transaction=session.beginTransaction();
			session.delete(book);
			transaction.commit();
			System.out.println("Records deleted");
			
			}finally {
				session.close();
			}
	}

	@Override
	public void deleteTest(Test test) {
		try {
			session=sfactory.openSession();
			transaction=session.beginTransaction();
			session.delete(test);
			transaction.commit();
			System.out.println("Records deleted");
			
			}finally {
				session.close();
			}
	}

	@Override
	public void insert(Learner student) {
		try {
			session=sfactory.openSession();
			transaction=session.beginTransaction();
			session.save(student);
			transaction.commit();
			System.out.println("Records inserted");
			
			}finally {
				session.close();
			}
	}

	@Override
	public void insert(Course course) {
		try {
			session=sfactory.openSession();
			transaction=session.beginTransaction();
			session.save(course);
			transaction.commit();
			System.out.println("Records inserted");
			
			}finally {
				session.close();
			}
	}

}
