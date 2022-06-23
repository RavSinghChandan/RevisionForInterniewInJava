package com.q9;

public class RunThread implements Runnable {
 @Override
 public void run() {
	 System.out.println("Inside the RunThread Method");
	 String threadName = Thread.currentThread().getName();
	 System.out.println("The name of the thread wich is running is "+" "+ threadName);
 }
}
