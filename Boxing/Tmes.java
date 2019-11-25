package com.hcl.day4;

public class Tmes {
	public static void main(String [] args){
		Timezone time=new Timezone();
		
		Timezone t1=new Timezone(5,45);
		Timezone t2=new Timezone(5,45);
		Timezone t3=new Timezone().addtime(t1,t2);
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
		
		
	}

}
