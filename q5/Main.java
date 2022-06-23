package com.q5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		 
     List<Student> students = new ArrayList<>();
     students.add(new Student(1,"n1",1));
     students.add(new Student(2,"n1",2));
     students.add(new Student(3,"n1",3));
     students.add(new Student(4,"n1",4));
     
     Collections.sort(students,(s1,s2)->s1.getMarks()>s2.getMarks()?+1:-1);
     
     System.out.println(students);
	}

}
