package nov19;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class DataOutEx1 {
	public static void main(String[] args) {
		try {
			FileOutputStream fout=new FileOutputStream("C:/files/d1.txt");
		DataOutputStream dout=new java.io.DataOutputStream(fout);
			dout.writeInt(65);
			dout.writeInt(56);
			dout.close();
			fout.close();
			System.out.println("file created");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
		
	}

	
}
