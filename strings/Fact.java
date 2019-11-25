package com.hcl.day3;

public class Fact {
	public void num(int n){
		
	int i=1,fact=1;
		while (i<=n)
		{
			fact=fact*i;
			i++;
		}
		System.out.println("fact is " +fact);
	}

public static void main(String[] args) {

		Fact obj=new Fact();
		obj.num(5);
	}

}
