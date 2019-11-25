package com.hcl.day5;

public class Payroll {
	
	static int totalsalary;

	public void addsalary(int salary){
		totalsalary+=salary;
	}
public static void main(String[] args){
	Payroll empBharath=new Payroll();
	Payroll emph=new Payroll();
	Payroll empBth=new Payroll();
	empBharath.addsalary(5000);
	emph.addsalary(6000);
	empBth.addsalary(10000);
System.out.println("totalsalary "+Payroll.totalsalary);
}
}
