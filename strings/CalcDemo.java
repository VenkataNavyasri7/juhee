package com.hcl.day3;

public class CalcDemo {
	public void sum(int a,int b){
		int c=a+b;
		System.out.println("Sum is "+c);
	}

	public static void main(String[] args) {
		int a,b;
		a=Integer.parseInt(args[0]);
		b=Integer.parseInt(args[1]);
		CalcDemo obj=new CalcDemo();
		obj.sum(a, b);

	}

}
