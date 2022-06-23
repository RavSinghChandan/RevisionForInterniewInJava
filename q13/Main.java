package com.q13;

public class Main {
 public static void main(String[] args) {
	 int[] marks = {1,3,4,5,5};
//	 System.out.println(marks[0]);
//	 System.out.println(marks[1]);
//	 System.out.println(marks[2]);
//	 for(int i =0;i<marks.length;i++) {
//		 System.out.println(marks[i]);
//	 }
	  int sum =0;
	 for( int printMarks : marks) {
		 //System.out.println(printMarks);
		 sum = sum + printMarks;
	 }
	 int size = marks.length;
	 int avg = sum/size;
	 System.out.println(avg);
 }
}
