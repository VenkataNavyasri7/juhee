package com.hcl.abst;

abstract class Student{
	int sno;
	String sname;
	double cgp;
	public Student(int sno, String sname, double cgp) {
		super();
		this.sno = sno;
		this.sname = sname;
		this.cgp = cgp;
	}
	@Override
	public String toString() {
		return "Student [sno=" + sno + ", sname=" + sname + ", cgp=" + cgp + "]";
	}
}
class sow extends Student{

	public sow(int sno, String sname, double cgp) {
		super(sno, sname, cgp);
		// TODO Auto-generated constructor stub
	}
	
}
class raj extends Student{

	public raj(int sno, String sname, double cgp) {
		super(sno, sname, cgp);
		// TODO Auto-generated constructor stub
	}
	
}
class bow extends Student{

	public bow(int sno, String sname, double cgp) {
		super(sno, sname, cgp);
		// TODO Auto-generated constructor stub
	}
	
}
public class Absstudent {
	public static void main(String[] args) {
		Student[] arrstud={
				new sow(1,"sow",9.8),
				new raj(2,"RAJ",10.8),
				new bow(3,"boiw",9.5)
		};
		for (Student student : arrstud) {
			System.out.println(student);
			
		}
	}

}
