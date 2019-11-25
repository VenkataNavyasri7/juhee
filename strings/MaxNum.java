package com.hcl.day3;

public class MaxNum {
	public void Num(int a,int b,int c){
		if (a>b && a>c){
			System.out.println(" "+a);
		}
		else if (a<b && b>c){
			System.out.println(""+b);
		}
		else {
			System.out.println(""+c);
		}
	}
	public static void main(String[] args) {
	MaxNum obj=new MaxNum();
	obj.Num(5,6,7);

	}

}
