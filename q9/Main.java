package com.q9;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     RunThread thread1 = new RunThread();
     RunThread thread2 = new RunThread();
     
     Thread t1 = new Thread(thread1);
     Thread t2 = new Thread(thread2);
      
     t1.start();
     t2.start();
      t1.setName("Chandan Kumar");
     t2.setName("Ratan Sir!");
	}

}
