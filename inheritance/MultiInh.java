package com.hcl.intf;

interface Ione{
	void name();
}
interface ITwo{
	void email();
}

class Demo implements Ione,ITwo{

	@Override
	public void email() {
		System.out.println("Email is hcl@gmail.com");		
	}

	@Override
	public void name() {
		System.out.println("Company HCL");
		
	}
	
}
public class MultiInh {
	public static void main(String[] args){
		Demo obj=new Demo();
		obj.email();
		obj.name();
	}
}
