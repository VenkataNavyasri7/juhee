package com.hcl.day4;

public class BoxEmploy {
	
	public void show(Object ob){
		String type=ob.getClass().getSimpleName();
		if(type.equals("Employ")){
			Employ e=(Employ)ob;
			System.out.println(e);
			
		}
	}

	public static void main(String[] args) {
		Employ employ = new Employ();
		employ.empno=1;
		employ.name="Sai";
		employ.basic=88524;
		Employ employ2 = new Employ();
		employ2.empno=1;
		employ2.name="Raj";
		employ2.basic=88524;
		System.out.println();
		new BoxEmploy().show(employ);
		new BoxEmploy().show(employ2);
	}

}
