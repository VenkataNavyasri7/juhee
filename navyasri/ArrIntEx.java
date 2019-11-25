package com.hcl.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrIntEx {
public static void main(String[] args) {
	List num=new ArrayList();
	num.add(new Integer(52));
	num.add(new Integer(25));
	num.add(new Integer(42));
	num.add(new Integer(41));
	num.add(new Integer(12));
	System.out.println("numbers are:");
	int sum=0;
	for (Object ob : num) 
    {
   	 sum=(Integer)ob;
   	 System.out.println(ob);
		
	}     
	
}
}
