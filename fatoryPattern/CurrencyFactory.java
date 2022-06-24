package com.fatoryPattern;
 

public class CurrencyFactory {
	
 public static Object createCurrency(String country){
	 
	 if(country.equals("USA")) {
		 
		 return new USDCurrency();
		 
	 }else if(country.equals("India")) {
		 
		 return new INRCurrency();
		 
	 }else {
		 
		 throw new UnsupportedOperationException("Currency not supported");
	 }
 }
}
