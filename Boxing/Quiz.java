package com.hcl.day4;

public class Quiz {

	public static void main(String[] args){
		Employ e1=new Employ();
		Employ e2=new Employ();
		System.out.println(e1==e2);
		e1.empno=1;
		e1.name="Sowmya";
		e1.basic=55456;
		e1.empno=3;
		e1.name="Poornesh";
		e1.basic=55456;
	
	}
}
