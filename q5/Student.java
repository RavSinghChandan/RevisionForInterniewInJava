package com.q5;

public class Student {
 private int roll;
 private String name;
 private int marks;
 Student(){
	 System.out.println("Zero argument constructor");
 }
public Student(int roll, String name, int marks) {
	super();
	this.roll = roll;
	this.name = name;
	this.marks = marks;
	System.out.println("parametrizes constructor");
}
@Override
public String toString() {
	System.out.println("toString method");
	return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + "]";
}
/**
 * @return the roll
 */
public int getRoll() {
	return roll;
}
/**
 * @param roll the roll to set
 */
public void setRoll(int roll) {
	this.roll = roll;
}
/**
 * @return the name
 */
public String getName() {
	System.out.println("getname method");
	return name;
	
}
/**
 * @param name the name to set
 */
public void setName(String name) {
	System.out.println("setName method");
	this.name = name;
}
/**
 * @return the marks
 */
public int getMarks() {
	return marks;
}
/**
 * @param marks the marks to set
 */
public void setMarks(int marks) {
	this.marks = marks;
}
 
}
