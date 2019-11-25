package com.hcl.inh;

public class inh {
public static void main(String[] args) {
	Parent s=new Parent();
	Child m=new Child();
	System.out.println(s instanceof Parent);
	System.out.println(m instanceof Parent);
	System.out.println(s.name);
	System.out.println(m.salary);
}
}
