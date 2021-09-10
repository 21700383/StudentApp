package com.studentapp;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Student> studlist = new ArrayList<Student>();
		studlist.add(new Student(1,"Hong",21)); // making 10 student information
		Student s1 = new Student(10,"Kim",23);
		studlist.add(s1);
		studlist.add(new Student(17,"Lee",22));
		studlist.add(new Student(24,"Brand",24));
		studlist.add(new Student(42,"Fivo",21));
		studlist.add(new Student(56,"Hexo",20));
		studlist.add(new Student(67,"Park",23));
		studlist.add(new Student(73,"Gwon",25));
		studlist.add(new Student(87,"Jang",22));
		studlist.add(new Student(98,"Byong",26));
		studlist.add(new Student(102,"Cha",22));
		
		System.out.println("Student list (ordered by name)");
		Collections.sort(studlist); // sort, print 10 names
		for (Student s: studlist) {
			System.out.println(s.toString());
		}
		
		System.out.println("Student list (reverse ordered by name)");
		Collections.sort(studlist, Collections.reverseOrder());
		for (Student s: studlist) {
			System.out.println(s.toString());
		}
	}

}