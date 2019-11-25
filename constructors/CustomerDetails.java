package com.hcl.day5;

import com.hcl.day4.Employ;

public class CustomerDetails {
			int custId;
			String name;
			String city;
			double premium;
			@Override
			public String toString() {
				return "CustomerDetails [custId=" + custId + ", name=" + name + ", city=" + city + ", premium="
						+ premium + "]";
			}
			public CustomerDetails(int custId, String name, String city, double premium) {
				super();
				this.custId = custId;
				this.name = name;
				this.city = city;
				this.premium = premium;
			}
			@Override
			public boolean equals(Object obj) {
				CustomerDetails cust=(CustomerDetails)obj;
				if(cust.city==city){
					return true;
				} else {
					return false;

				
			}
			}
		
			public static void main(String [] args){
				CustomerDetails cus =new CustomerDetails(100,"Poornesh","Nellore",78.4);
				CustomerDetails cus1=new CustomerDetails(200,"Kumar","Gudur",85.34);
				CustomerDetails cus2=new CustomerDetails(300,"r","r",8.34);
				CustomerDetails cus3=new CustomerDetails(400,"K","Gr",5.34);
				
			CustomerDetails[] arr={cus,cus1,cus2,cus3};
			for (CustomerDetails customer : arr) {
				System.out.println(customer);
				}System.out.println(cus2.equals(cus3));
			}
			
			
			
		
}
			
			
 
		
			

			
			
