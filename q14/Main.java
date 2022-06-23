package com.q14;
import java.util.Scanner;

public class Main {
 public static void main(String [] args) {
	 try (Scanner input = new Scanner(System.in)) {
		System.out.println("Enter your name");
		 String name = input.next();
		 System.out.println("Your name is "+ name);
	}catch (Exception e) {
		System.out.println("I got exceptins man! plz enter the what is asked?");
}
}
}