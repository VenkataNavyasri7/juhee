package com.hcl.ex;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadEx {
	
	public static void main(String[] args) {
		File f1=new File("C:/java-HCL/Day3/Demoproject/src/com/hcl/ex/Custom.java");
		try {
			FileReader fr=new FileReader(f1);
			int ch;
			while((ch=fr.read())!=-1){
			System.out.print((char)ch);
				}
			fr.close();
			
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
			
		} catch(IOException e){
			
			e.printStackTrace();
		}
	}
}
