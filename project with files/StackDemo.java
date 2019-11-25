package com.hcl.jdk8;

import java.util.List;
import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		List<String> names=new Stack<String>();
		names.add("navya");
		names.add("kavya");
		names.add("sravya");
		names.add("bhavya");
		names.add("tavya");
		for (String string : names) {
			System.out.println(string);
			
		}
		
	}

}
