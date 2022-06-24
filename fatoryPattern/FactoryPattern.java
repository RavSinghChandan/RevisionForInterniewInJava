package com.fatoryPattern;

public class FactoryPattern {
	
  public static void main(String[] args) {
	  
	  System.out.println(CurrencyFactory.createCurrency("India").getClass());
  }
}
