package com.q6;

public class Main {
  public   Main(String s) {
	  
	  System.out.println("Rav Chanda Kumar Singh");
  }
  public static void main(String [] args) {
	  
	  Inter i = Main::new;
	  
	  i.printName("anything!");
  }
}
