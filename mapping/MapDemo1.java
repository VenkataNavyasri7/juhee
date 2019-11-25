package com.hcl.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapDemo1 {
	public static void main(String[] args) {
		Map names=new HashMap();
		names.put(1, "navya");
		names.put(2, "kavya");
		names.put(3, "bhavya");
		names.put(4, "sravya");
		names.put(5, "ramya");
		String key,value;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter key");
		key=sc.nextLine();
		value=sc.nextLine();
		value=(String)names.getOrDefault(key, "not found");
		System.out.println(value);
	}

}
