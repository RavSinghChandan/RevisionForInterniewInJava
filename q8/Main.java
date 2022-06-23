package com.q8;

public class Main {
 public static void main(String []args) {
	 ThreadA ta = new ThreadA();
	 Thread t =new Thread(ta);
	 t.setName("Alladin!");
	 t.start();
	
 }
}
