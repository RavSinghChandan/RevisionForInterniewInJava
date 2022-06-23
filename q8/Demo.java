package com.q8;

public class Demo {
	static int i = 10;
	int y = 11000;
 Demo(){
	 System.out.println("Inside the constructor of demo class");
	 System.out.println(i);
	 System.out.println(y);
 }
 public static void main(String [] args) {
	 Demo d = new Demo();
	 System.out.println(d.y);
 
	 
 }
}
