package com.q21;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Main {
 public static void main(String [] args) {
	 LocalDate date = LocalDate.of(1996,9, 1);
	 System.out.println("Today's date is"+ date);
	  
	 System.err.println("Is it is leap year ? "+date.isLeapYear()); 
	 LocalTime time = LocalTime.now();
	 System.err.println("Present time is "+time);
	 LocalDateTime dt = LocalDateTime.now();
	 System.err.println("Present Date and time is "+dt);
}
}
