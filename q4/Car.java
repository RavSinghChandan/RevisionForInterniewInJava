package com.q4;

public class Car {
	private int numberOfPassenger ; 
	private int numberOfKms;
	
	@Override
	public String toString() {
		return "Car [numberOfPassenger=" + numberOfPassenger + ", numberOfKms=" + numberOfKms + "]";
	}
	public Car(int numberOfPassenger, int numberOfKms) {
		super();
		this.numberOfPassenger = numberOfPassenger;
		this.numberOfKms = numberOfKms;
	}
	public Car() {
		// TODO Auto-generated constructor stub
	}
	public int getNumberOfPassenger() {
		return numberOfPassenger;
	}
	public void setNumberOfPassenger(int numberOfPassenger) {
		this.numberOfPassenger = numberOfPassenger;
	}
	public int getNumberOfKms() {
		return numberOfKms;
	}
	public void setNumberOfKms(int numberOfKms) {
		this.numberOfKms = numberOfKms;
	} 
	
}
