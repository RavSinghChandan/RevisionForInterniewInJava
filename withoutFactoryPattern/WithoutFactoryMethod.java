package com.withoutFactoryPattern;

public class WithoutFactoryMethod {
 public static void main(String[]args) {
//	 String countryName="USA";

     Currency currency=receptionist("India");
     System.out.println(currency);
 }
 public static Currency  receptionist(String countryName){
     if(countryName.equals("USA"))
         return new USDCurrency();
     if(countryName.equals("India"))
         return new INRCurrency();
     else
         return  null;
 }
}
