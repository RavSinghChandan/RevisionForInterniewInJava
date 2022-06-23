package com.q27;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
 public static void main(String [] args) {
	 ArrayList<Student> students = new ArrayList<>();
	 Scanner sc = new Scanner(System.in);
	 int count =1;
	 while(true) {
		 System.out.println("Enter the student details"+(count++));
		 
		 System.out.println("Enter the roll number");
		 int roll = sc.nextInt();
		 
		 System.out.println("Enter the Name");
		 String name = sc.next(); 
		 
		 System.out.println("Enter the marks");
		 int marks = sc.nextInt(); 
		 
		  Student student = new Student(roll,name,marks);
		  
		  students.add(student);
		  System.out.println("Want more Y or N?"); 
		  
		  String choice =sc.next();
		  
		  if(choice.equalsIgnoreCase("N")) {
			  break; 
		  }
		 System.out.println("Printing the details of the students");
		 System.out.println("*************************************");
		 
		 
		 for(Student s :students) {
			 System.out.println("Roll number is"+student.getRoll());
			 System.out.println("Marks is"+student.getMarks());
			 System.out.println("Name is "+student.getName());
			 System.out.println("**********************************");
		 }
		  
	 } 
 }
}
