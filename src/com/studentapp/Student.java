package com.studentapp;

public class Student implements Comparable<Student> {
	private int no; // number
	private String name; // name
	private int age; // age
	
	public Student(int no, String name, int age) {
		this.no = no;
		this.name = name;
		this.age = age;
	}

	public String toString() {
		// TODO Auto-generated method stub
		return "Student [no=" + no + ", name=" + name + ", " + age + "]";
	}
	
	@Override
	public int compareTo(Student o) {
		return name.compareTo(o.name);
	}

}