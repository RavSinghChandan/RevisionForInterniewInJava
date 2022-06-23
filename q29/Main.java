package com.q29;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Main {
 public static void main(String [] args) {
	 HashSet<String> hs = new  LinkedHashSet<>();
	 hs.add("Rav");
	 hs.add("Kumar");
	 hs.add("Singh");
	 hs.add(null);
	 hs.add(null);
	 System.out.println(hs);
	 for(String s:hs) {
		 System.out.println(s);
	 }
 }
}
