package com.q1;

public class Main {
	public static void main(String[] args) {
		Person newStudent = generatePerson(new Student(1,"c1",1000));
		Person newInstructor = generatePerson(new Instructor(1,1));
		System.out.println(newStudent);
		System.out.println(newInstructor);
		}

	private static Person generatePerson(Student student) {
		// TODO Auto-generated method stub
		return new Person("n1","g1");
	}

	private static Person generatePerson(Instructor instructor) {
		// TODO Auto-generated method stub
		return new Person("Chandan","male");
	}
}
