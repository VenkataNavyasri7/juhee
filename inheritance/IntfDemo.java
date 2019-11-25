package com.hcl.intf;

interface ITtraining {
	void name();
	void email();
}
class Niharika implements ITtraining{

	@Override
	public void name() {
		System.out.println("Name is Niharika");
	}

	@Override
	public void email() {
		System.out.println("Email poorneshk6@gmail.comn");
		
	}
	
}

public class IntfDemo {
public static void main(String[] args) {
	ITtraining[] arrTraining={
			new Niharika()
	};
	for (ITtraining iTtraining : arrTraining) {
		iTtraining.name();
		iTtraining.email();
	}
}
}
