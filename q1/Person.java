package com.q1;

public class Person  {
  String name;
  String gender;
  Address add = new Address();
  
public Person(String name, String gender) {
	super();
	this.name = name;
	this.gender = gender;
}
public Person(int i, int j) {
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Person [name=" + name + ", gender=" + gender + "]";
}
  
  
}
