package com.fjwplearningapp.unity;

import java.util.Scanner;

import com.fjwp.learningapp.entity.Book;
import com.fjwp.learningapp.entity.Course;
import com.fjwp.learningapp.entity.Learner;
import com.fjwp.learningapp.entity.Test;
import com.fjwplearningapp.service.ServiceImpl;

public class CourseImpl {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Well come To Subha Da's Coaching");
		System.out.println("You are 1.Learner 2,Teacher \n Enter Option");
		int user = sc.nextInt();
		ServiceImpl service=new ServiceImpl();
		if (user == 1) {
			System.out.println("1.Get Course \n 2.Get Book \n 3.Get Test");
			int a = sc.nextInt();
			while (a > 0) {
				switch (a) {
				case 1:
					System.out.println("enter Course id");
					int course = sc.nextInt();
					service.getCourse(course);
					break;
				case 2:
					System.out.println("enter Book id");
					int book = sc.nextInt();
					service.getBook(book);
					break;
				case 3:
					System.out.println("enter Test id");
					int test = sc.nextInt();
					service.getTest(test);
				default:
					System.out.println("Invalid Option");
					break;
					

				}
				System.out.println("1.Get Course \n 2.Get Book \n 3.Get Test \n press 0 to Exit ");
				a = sc.nextInt();
			}

		}
		 else if (user == 2) {
			 System.out.println("1.Get course \n 2.Get Book \n 3.Update Book \n 4.Update Test \n 5.Insert Learner \n 6.Insert Course ");
			 int a = sc.nextInt();
			 while (a > 0) {
				 switch (a) {
				 case 1:
						System.out.println("enter Course id");
						int course = sc.nextInt();
						service.getCourse(course);
						break;
					case 2:
						System.out.println("enter Book id");
						int book = sc.nextInt();
						service.getBook(book);
						break;
					case 3:
						Book b=new Book();
						System.out.println("enter Book id");
						int book1 = sc.nextInt();
						b.setBookId(book1);
						System.out.println("enter Department name");
						String name = sc.next();
						b.setBookName(name);
						service.updateBook(b);
						break;
					case 4:
						Test t=new Test();
						System.out.println("enter Test id");
						int test = sc.nextInt();
						t.setTestId(test);
						System.out.println("enter Test name");
						String name1 = sc.next();
						t.setTestName(name1);
						System.out.println("enter Test Duration");
					    int duration = sc.nextInt();
						t.setDuration(duration);
						System.out.println("enter Total Marks");
					    int totalmarks = sc.nextInt();
						t.setTotalMarks(totalmarks);
						service.updateTest(t);
						break;
					case 5:
						Learner St=new Learner();
						System.out.println("Enter Learner id");
						int student=sc.nextInt();
						St.InsertLearner(student);
						System.out.println("Enter Learner Name");
						String name2=sc.next();
						St.InsertLearner(student);
						System.out.println("Enter PassWord");
						String password=sc.next();
						St.setPassword(password);
						service.insert(St);
						break;
					case 6:
						Course Co=new Course();
						System.out.println("Enter Course id");
						int course1=sc.nextInt();
						System.out.println("Enter Course Name");
						String course2=sc.next();
						service.insert(Co);
						break;
						
					default:
						System.out.println("Invalid Option");
						break;
				 }
				 System.out.println("1.Get course \n 2.Get Book \n 3.Update Book \n 4.Update Test \n 5.Insert Learner \n 6.Insert Course \n 7.press 0 for exit");
				 a = sc.nextInt();
			 }

		 }
	}

}
