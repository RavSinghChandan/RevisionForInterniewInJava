package com.q8;

 class ThreadA implements Runnable{
	 @Override
  public void run() {
	  System.out.println("Inside the ThreadA");
	String  threaA =Thread.currentThread().getName();
	System.out.println("The ThreadA name is"+threaA);
  }
}
