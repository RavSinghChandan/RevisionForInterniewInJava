package com.q7;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadA a = new ThreadA();
		ThreadB b = new ThreadB();
		ThreadC c = new ThreadC();
		a.start();
		b.start();
		c.start();
		System.out.println("Inside the Main method");

	}

}
