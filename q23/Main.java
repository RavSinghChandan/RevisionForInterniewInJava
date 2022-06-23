package com.q23;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
 public static void main(String [] args) {
	 Scanner input = new Scanner(System.in);
	 System.err.println("Enter your DOB in DD-MM-YYYY formate");
	String dob=  input.next();
	DateTimeFormatter dtf =  DateTimeFormatter.ofPattern("dd-MM-yyyy");
	LocalDate date = LocalDate.parse(dob,dtf);
	 String  result = date.format(DateTimeFormatter.ofPattern("EEEE"));
	 System.err.println("Your DOB is on the Day"+" " +result);
	 
 }
}
