package com.hcl.day4;

public class Stud1 {
public Stud1(int sno, String firstname, String lastname, double cgp) {
		super();
		this.sno = sno;
		this.firstname = firstname;
		this.lastname = lastname;
		this.cgp = cgp;
	}
int sno;
String firstname;
String lastname;
double cgp;
public Stud1(){
	sno=1;
	firstname="Poornesh";
	lastname="Kumar";
	cgp=9.8;
}
			
@Override
public String toString() {
	return "Stud1 [sno=" + sno + ", firstname=" + firstname + ", lastname=" + lastname + ", cgp=" + cgp + "]";
}
}
