package com.hcl.day4;

public class BoxStudent {

	public void show(Object ob){
		String type=ob.getClass().getSimpleName();
		if(type.equals("Student")){
			Student e=(Student)ob;
			System.out.println(e);
			
		}
	}

	public static void main(String[] args) {
		Student Student = new Student();
		Student.sno=1;
		Student.Firstname="Sai";
		Student.Lastname="Teja";
		Student.cgpa=7.8;
		new BoxStudent().show(Student);
	}

}

