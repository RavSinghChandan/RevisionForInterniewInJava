package com.q12;

public class Student {
 private int roll ;
 private String name;
 private int marks;
 
  public Student(){
	  System.out.println("Zero argument constructor");
	  System.out.println("------------------------------");
  }
  
public Student(int roll, String name, int marks) {
	super();
	this.roll = roll;
	this.name = name;
	this.marks = marks;
	System.out.println("Parameterized constructor");
	System.out.println("========================");
}

public int getRoll() {
	return roll;
}
public void setRoll(int roll) {
	this.roll = roll;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getMarks() {
	return marks;
}
public void setMarks(int marks) {
	this.marks = marks;
}
 
 public void showDetails() {
	 System.out.println("Student roll is "+roll);
	 System.out.println("Student marks is "+marks);
	 System.out.println("Studetn Name is "+name);
 }
}
