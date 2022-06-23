package com.q22;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
 public static void main(String [] args) {
	String dob = "01/09/1996";
	LocalDate date = LocalDate.now();
	System.err.println(date);
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	LocalDate ld = LocalDate.parse(dob,dtf);
	System.err.println("My birthday is on the "+ ld);
	
 }
}
