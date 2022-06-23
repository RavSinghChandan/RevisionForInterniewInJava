package com.q2;

public class Employee {
 int empId ;
 String empName ;
 double salary ;
 
 void showEmployeeDetails() {
	 System.out.println("Employee ID is"+empId);
	 System.out.println("Employee Name is "+empName);
	 System.out.println("Employee Salary is "+salary);
	 
 }
 public static void main(String[] args) {
	 Address emp1 = new Address();
	 emp1.city= "Patna";
	 emp1.pinCode="841311";
	 emp1.state= "Bihar";
	 emp1.printAddress();
	  Employee emp2 = new Employee();
	 System.out.println("==========================================");
	  emp2.empId = 1;
	  emp2.empName= "Rav Chandan Kumar Singh";
	  emp2.salary=100000;
	  emp2.showEmployeeDetails();
 }
}
