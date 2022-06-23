package com.q11;

public class Demo {
 public Demo() {
	 this(10);
	 System.out.println("Inside the zero argument constructor of Demo class");
	 
 }
 public Demo(int x) {
	 this(10,20);
	 System.out.println("Inside the zero argument constructor of Demo int x class");
	 
 }
 public Demo(int x ,int y) {
	 this("HelloChandan!");
	 System.out.println("Inside the zeroint x ,int y argument constructor of Demo class");
	 
 }
 public Demo( String s) {
	 //this( );
	 System.out.println("InsideString sString s the zero argument constructor of Demo class");
	 
 }
 public static void main(String [] args) {
	 Demo d = new Demo();
 }
}
