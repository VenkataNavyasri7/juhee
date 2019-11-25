package com.hcl.map;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortStudent {
	public static void main(String[] args) {
		SortedSet<Student> students=new TreeSet<Student>();
		students.add(new Student(1,"navya sree","vizag",8.8));
		students.add(new Student(1,"kavya sree","vizianagaram",8.2));
		students.add(new Student(1,"bavya sree","garividi",8.5));
		students.add(new Student(1,"ramya sree","chennai",8.8));
		students.add(new Student(1,"divya sree","bangalore",8.8));
		for (Student student : students) {
			System.out.println(student);
			
		}
		
	}

}
