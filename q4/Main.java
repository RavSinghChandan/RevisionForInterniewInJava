package com.q4;

import java.util.Scanner;

public class Main {
	public static void main(String[] args, int numberOfPassenger, int numberOfKms) {
		Scanner scanner = new Scanner(System.in);
		//Write logic to get numberOfPassenger and numberOfKms
		Ola myOla = new Ola();
		Object myCar = myOla.bookCar(numberOfPassenger, numberOfKms);
		int res = myOla.calculateBill(myCar);
		System.out.println("The total fare amount is"+ res);
		}

}
