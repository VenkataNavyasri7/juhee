package com.hcl.foreach;


import java.util.ArrayList;
import java.util.List;

public class ForEachDemo {
	public static void main(String[] args) {
		List<String> names=new ArrayList<String>();
		names.add("sowmya");
		names.add("navya");
		names.add("kavya");
		names.add("divya");
		names.forEach(n ->{
			System.out.println(n);
			
		});
		List<Integer> num=new ArrayList<Integer>();
		num.add(new Integer(67));
		num.add(new Integer(11));
		num.add(new Integer(52));
		num.add(new Integer(35));
	    num.forEach(p ->{
	    	if(p >50){
	    		System.out.println(p);
	    	}
	    	
	    });
		
		
	}

}
