package com.hcl.day4;

public class EmployDemo {
	int empno;
	String name;
	double basic;
	
	public EmployDemo() {
	empno=5;
	name="Bharath";
	basic=88523;
	}

	public EmployDemo(int empno, String name, double basic) {
		super();
		this.empno = empno;
		this.name = name;
		this.basic = basic;
	}

	@Override
	public String toString() {
		return "EmployDemo [empno=" + empno + ", name=" + name + ", basic=" + basic + "]";
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
