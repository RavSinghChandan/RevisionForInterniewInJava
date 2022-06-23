package com.q1;

 public class Employee{
	 int empId;
	 String empName;
	 double salary;
	 static Address address;
	  public static void main(String [] args) {
		  Employee emp = new Employee();
		  emp.empId=1;
		  emp.empName="Chandan Kumar Singh";
		  emp.salary=1000;
		 // emp.address= new Address();
		 // Employee.address= new Address();
		  address= new Address();
		  emp.address.city="Pantna";
		  emp.address.pidCode="841311";
		  emp.address.state= "Bihar";
		  System.out.println("Employee ID is "+emp.empId);
		  System.out.println("Emplyee address is "+emp.address.city);
	  }
	 
 }
