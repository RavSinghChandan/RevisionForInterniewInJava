package com.q24;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
 public static void main(String [] args) {
	 Scanner sc = new Scanner(System.in);
	 System.err.println("Enter your DOB in dd-MM-yyyy formate");
	String dob =  sc.next();
	LocalDate date = LocalDate.parse(dob,DateTimeFormatter.ofPattern("dd-MM-yyyy"));
	LocalDate current = LocalDate.now();
	Period p = Period.between(date, current);
	if(p.getYears()>= 18) {
		System.err.println("You can vote !");
	}else {
		System.err.println("Better luck next year!");
	}
 }
}
