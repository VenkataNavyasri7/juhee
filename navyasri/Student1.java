package com.hcl.collections;


public class Student1 {
	int sno;
	String sname;
	double cgp;
	
	public Student1(int sno, String sname, double cgp) {
		super();
		this.sno = sno;
		this.sname = sname;
		this.cgp = cgp;
	}

	@Override
	public String toString() {
		return "ArrStudent [sno=" + sno + ", sname=" + sname + ", cgp=" + cgp + "]";
	}
	

}

