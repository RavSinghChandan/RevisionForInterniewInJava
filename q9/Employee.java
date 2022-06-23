package com.q9;

public class Employee {
 String empId;
 String empName;
 double salary;
 public Employee(){
	  empId = "1";
	  empName="chandan";
	  salary= 1000;
  }
  public Employee(String empId,String empName,double salary) {
	  this.empId=empId;
	  this.empName= empName;
	  this.salary= salary;
  }
   public void showDetails() {
	   System.out.println("============================");
	   System.out.println("Employee id is "+empId);
	   System.out.println("Employee Name is "+empName);
	   System.out.println("Employee salary is "+salary);
   }
}
