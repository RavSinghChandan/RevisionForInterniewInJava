package com.q10;
class Main implements Runnable{
	@Override
	public void run() {
		System.out.println("Inside the Mian method");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("I am running after the thead wakeup! for 2 seconds");
	}
 

public static void main(String[] args) {
	Main job = new Main();
	Thread  t= new Thread(job);
	t.start();
	
 }
}