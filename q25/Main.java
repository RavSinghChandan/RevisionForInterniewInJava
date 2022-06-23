package com.q25;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Main {

	public static void main(String[] args) {
		 
			LocalDateTime oldDate = LocalDateTime.of(1982, 5, 31, 10, 20, 55);
			LocalDateTime newDate = LocalDateTime.of(2016, 9, 9, 10, 21, 56);
			 
			System.out.println(ChronoUnit.YEARS.between(oldDate, newDate) + " years");
			 
			}
			
			 

	

}
