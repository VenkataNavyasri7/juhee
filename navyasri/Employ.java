package com.hcl.collections;

public class Employ {
 int empno;
 String name;
 double basic;
public Employ(int empno, String name, double bas) {
	super();
	this.empno = empno;
	this.name = name;
	this.basic = bas;
}
@Override
public String toString() {
	return "Employ [empno=" + empno + ", name=" + name + ", basic=" + basic + "]";
}

 
}
