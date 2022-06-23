package com.q2;

public class Chadan {

	public static void main(String[] args) {
		 Inter i = new Inter() {
			
			@Override
			public void printName(String name) {
				System.out.println("Rav Chandan Kumar Singh");
				
			}
		};
		i.printName(null);

	}

}
