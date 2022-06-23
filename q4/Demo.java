package com.q4;

public class Demo {
 void functionDemo(A a1) {
	 System.out.println("I am the value of class A "+a1);
	 System.out.println("Inside the function of Demo class ");
	 a1.fuctionA();
 }



 public static void main(String[] args) {
	 Demo d1 = new Demo();
	 A a2 = new A();
	 d1.functionDemo(a2);
 }
}