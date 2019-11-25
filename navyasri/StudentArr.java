package com.hcl.collections;

import java.util.ArrayList;
import java.util.List;

public class StudentArr {
	

	public static void main(String[] args)
	{
		List student=new ArrayList();
		
		student.add(new Student1(1,"navya",8.8));
		student.add(new Student1(2,"kavya",8.8));
		student.add(new Student1(3,"navya",8.8));
		student.add(new Student1(4,"ramvya",8.8));
		student.add(new Student1(5,"navya",8.8));
		for (Object ob : student) 
		{
			StudentArr s= (StudentArr)ob;
			System.out.println(s);
			
		}
	}

	public int cgp;

}
