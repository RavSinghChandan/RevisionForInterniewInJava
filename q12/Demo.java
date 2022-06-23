package com.q12;

public class Demo {
 public static void main(String[]args) {
	 Student s1 = new Student();
	 s1.setMarks(111);
	 s1.setName("chandan");
	 s1.setRoll(1);
	 System.out.println("Student1 details");
	 s1.showDetails();
	 Student s2 = new Student(001,"Mangu",00);
	 s2.showDetails();
	 System.out.println("Student2 details");
 }
}
