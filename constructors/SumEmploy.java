package com.hcl.day6;

class Hclemploy{
	String SAPID;
	String name;
	String gender;
	String Designation;
	public Hclemploy(String sAPID, String name, String gender, String designation) {
		super();
		SAPID = sAPID;
		this.name = name;
		this.gender = gender;
		Designation = designation;
	}
	@Override
	public String toString() {
		return "Hclemploy [SAPID=" + SAPID + ", name=" + name + ", gender=" + gender + ", Designation=" + Designation
				+ "]";
	}
	
	
}
class sandeep extends Hclemploy{

	public sandeep(String SAPID, String name, String gender, String designation) {
		super(SAPID, name, gender, designation);
		// TODO Auto-generated constructor stub
	}
}
	
	class Barath extends Hclemploy{

		public Barath(String SAPID, String name, String gender, String designation) {
			super(SAPID, name, gender, designation);
			// TODO Auto-generated constructor stub
		}
	}
		
		class poornesh extends Hclemploy{

			public poornesh(String SAPID, String name, String gender, String designation) {
				super(SAPID, name, gender, designation);
				// TODO Auto-generated constructor stub
			}
			
		}
	
public class SumEmploy {

	public static void main(String[] args) {
		Hclemploy sandy=new sandeep("51844701","Sandeep","male","Software engineer");
		Hclemploy baru=new Barath("51844702","Barath","male","Software engineer");
		Hclemploy punnu=new poornesh("51844712","Poornesh","male","Software engineer");
		Hclemploy [] arrHcl={sandy,baru,punnu};
		for (Hclemploy Hclemploy : arrHcl) {
			System.out.println(Hclemploy);
		}
	}

}
