package com.hcl.ex;

import java.io.File;

public class FileDemo {
	public static void main(String[] args){
		File f1=new
				File("C:/java-HCL/Day3/Demoproject/src/com/hcl/ex/Custom.java");
		System.out.println("File Name "+f1.getName());
		System.out.println("Parent "+f1.getParent());
		System.out.println("Path "+f1.getPath());
	}
	

}
