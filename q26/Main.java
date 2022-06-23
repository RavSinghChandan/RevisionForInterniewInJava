package com.q26;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
 public static void main(String []args) {
	 ArrayList<Integer> a1 = new ArrayList<>();
	 a1.add(1);
	 a1.add(1);
	 a1.add(null);
	 a1.add(null);
 
//	Iterator<Integer> itr =  a1.iterator();
//	while(itr.hasNext()) {
//		Integer s =itr.next();
//		System.err.println(s);
//	}
	 for(Integer i : a1) {
		 System.err.println(i);
	 }
	  System.err.println(a1.contains(4));
 }
}
