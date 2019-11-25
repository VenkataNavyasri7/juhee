package com.hcl.map;

public class Student implements Comparable<Student> {
	int sno;
	String name;
	String city;
	double cgp;
	public Student(int sno, String name, String city, double cgp) {
		super();
		this.sno = sno;
		this.name = name;
		this.city = city;
		this.cgp = cgp;
	}
	public Student(){
		super();
	}
	@Override
	public String toString() {
		return "Student [sno=" + sno + ", name=" + name + ", city=" + city + ", cgp=" + cgp + "]";
	}
	@Override
	public int compareTo(Student s) {
		return this.name.compareTo(s.name);
		// TODO Auto-generated method stub
	
	}
	

}
