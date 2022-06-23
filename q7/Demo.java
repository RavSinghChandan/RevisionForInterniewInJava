package com.q7;

public class Demo {
 void method1(int i) {
	 System.out.println("Method1 of demo class int"+i);
 }
 void method1(byte i) {
	 System.out.println("Method1 of demo class byte "+i);
 }
 void method1(long i) {
	 System.out.println("Method1 of demo class long"+i);
 }
 void method1(short i) {
	 System.out.println("Method1 of demo class short"+i);
 }
 public static void main(String[] args) {
	 Demo d =new  Demo();
	 long  x = 10;
	 d.method1(x);
 }
}
