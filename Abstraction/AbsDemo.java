package com.hcl.abst;

abstract class HclTraining{
	abstract void loginTime();
	abstract void employname();
	abstract void logoutTime();	
}

class Harika extends HclTraining{

	@Override
	void loginTime() {
		System.out.println("came at 9.00");		
	}

	@Override
	void employname() {
		System.out.println("y name is Harika");
		
	}

	@Override
	void logoutTime() {
		System.out.println("logout at 9.30");
		
	}
	
}
class Tej extends HclTraining{

	@Override
	void loginTime() {
		System.out.println("came at 9.00AM");		
		
	}

	@Override
	void employname() {
		System.out.println("Tej");		
		
	}

	@Override
	void logoutTime() {
		System.out.println("logout at 9.00pm");		
		
	}
	
}
public class AbsDemo {
	public static void main(String[] args){
		HclTraining[] arrhcltraining ={
				new Harika(),
				new Tej()
		};
		for (HclTraining hclTraining : arrhcltraining) {
			hclTraining.employname();
			hclTraining.loginTime();
			hclTraining.logoutTime();
		}
	}

}
