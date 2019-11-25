package com.hcl.day4;

public class Student {

	@Override
	public String toString() {
		return "Student [sno=" + sno + ", Firstname=" + Firstname + ", Lastname=" + Lastname + ", cgpa=" + cgpa + "]";
	}
	int sno;
	String Firstname;
	String Lastname;
	double cgpa;
	
	public Student(int sno, String firstname, String lastname, double cgpa) {
		super();
		this.sno = sno;
		Firstname = firstname;
		Lastname = lastname;
		this.cgpa = cgpa;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
