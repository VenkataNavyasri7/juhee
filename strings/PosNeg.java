package com.hcl.day3;

public class PosNeg {

	public void check(int n)
	{
		if(n>0){
			System.out.println("Postive");
		}
		else {
			System.out.println("Negative");
		}
	}
	public static void main(String[] args) {
		int n=18;
		PosNeg obj=new PosNeg();
		obj.check(n);
		

	}

}
