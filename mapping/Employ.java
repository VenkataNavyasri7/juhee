package com.hcl.map;



public class Employ implements Comparable<Employ>{
	int empno;
	String name;
	String dept;
	String desig;
	double salary;
	
	public Employ(int empno, String name, String dept, String desig, double salary) {
		super();
		this.empno = empno;
		this.name = name;
		this.dept = dept;
		this.desig = desig;
		this.salary = salary;
	}

	public Employ() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Employ [empno=" + empno + ", name=" + name + ", dept=" + dept + ", desig=" + desig + ", salary="
				+ salary + "]";
	}

	@Override
	public int compareTo(Employ e) {
		return this.name.compareTo(e.name);
	}
	
	

}
