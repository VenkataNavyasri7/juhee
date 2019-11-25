package com.hcl.map;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class MapDemo2 {
	public static void main(String[] args) {
		Map<String,Double> m=new Hashtable<String,Double>();
		m.put("kavya",34567.8);
		m.put("bhavya",24567.8);
		m.put("navya",84567.8);
		m.put("tavya",34567.8);
		String key;
		double sal;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter key");
		key=sc.nextLine();
		sal=m.getOrDefault(key, 0.0);
		System.out.println("salary is"+sal);
		
		
	}

}
