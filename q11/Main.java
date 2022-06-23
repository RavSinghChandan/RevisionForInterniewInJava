package com.q11;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
			A a = new A();
			Thread t = new Thread(a);
			t.start();
			t.join();
			int answer = a.sum;
			System.out.println("The sum is "+ " "+ answer);
				}

}
