package com.q30;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> students = new  ArrayList<>();
		students.add(new Student(1,"name1",1));
		students.add(new Student(2,"name2",2));
		students.add(new Student(5,"name5",5));
		students.add(new Student(6,"name6",6));
		students.add(new Student(4,"name4",4));
		
		Collections. sort(students,new StudentMarksComp());
		
		for(Student student: students) {
			System.out.println("Roll is"+ student.getRoll());
			System.out.println("Name is"+student.getName());
			System.out.println("Marks is"+student.getMarks());
			System.out.println("====================================");
		}

	}

}
