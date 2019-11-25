package com.hcl.day3;

public class VarArgs {
public void show(String...name){
	for(String string : name){
	System.out.print(string +"   ");
	}
	System.out.println();
	}
	public static void main(String[] args) {
	VarArgs obj=new VarArgs();
	obj.show();
	obj.show("Ram");
	obj.show("sowmya","sneha","sai","teja");
	obj.show("sneha","kamakshi","gayatri");
	
	}
}
