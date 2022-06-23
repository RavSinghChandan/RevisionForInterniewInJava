package com.q11;

public class A implements Runnable{
	int sum =0;
 @Override
 public void run() {
	 
	 for(int i=0;i<20;i++) {
		 sum  = sum +i;
	 }
 }
}
