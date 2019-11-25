package com.hcl.day3;

public class EveorOd {
	public void checkNum(int n){
		if(n%2==0){
			System.out.println("Even");
		}
		else {
			System.out.println("odd");
		}
	}
public static void main(String[] args){
	EveorOd obj=new EveorOd();
	obj.checkNum(5);
}
}
