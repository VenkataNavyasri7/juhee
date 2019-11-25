package com.hcl.project;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.*;

public class CustomerDAO {

	static List<Customer> lstcustomer=null;
	static{
		lstcustomer=new ArrayList<Customer>();
	}
	
	//method to add the customers
	public String addCustomerDao(Customer customer){
		lstcustomer.add(customer);
		return "customer added successfully";
	}
	
	
	//method to show the customers list
    public List<Customer> showCustomerDao()
    {
	   return lstcustomer;
    }
    
    //method to search customers list
    public Customer searchCustomerDao(int cusid)
    {
    	Customer objcustomer=null;
    	for (Customer customer : lstcustomer) {
			if(customer.getCusid()==cusid){
				objcustomer=customer;
			}
		}
    	return objcustomer;
    }
    
    //method to delete the customer record
    public String deleteCustomerDao(int cusid){
    	String result="";
    	Customer customer= searchCustomerDao(cusid);
    	if(customer!=null)
    	{
    		lstcustomer.remove(customer);
    		result="customer record deleted successfully...";
    	}else{
    		result="customer  record not found...";
    		
    	}
    	return result;
    }
    
    //method to update the customer record 
    public String updateCustomerDao(Customer objcustomer)
    {
    	Customer customer = searchCustomerDao(objcustomer.getCusid());
    	String result="";
    	if(customer!=null){
    		for (Customer c : lstcustomer) {
				if(c.getCusid()==objcustomer.getCusid()){
					c.setCusname(objcustomer.getCusname());
					c.setAnnualpremiun(objcustomer.getAnnualpremiun());
					c.setModalpremium(objcustomer.getModalpremium());
					c.setPaymode(objcustomer.getPaymode());
				}
			}
    		result="customer record updated...";
    	}else{
    		result="customer record not found...";
    	}
    	return result;
    }

public void writeCustomerFileDao() {
	try {
		FileOutputStream fout=new FileOutputStream("c:/files/customer.txt");
		ObjectOutputStream objout=new ObjectOutputStream(fout);
		objout.writeObject(lstcustomer);
		objout.close();
		fout.close();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

public void readCustomerFileDao() {
	try {
		FileInputStream fin=new FileInputStream("c:/files/customer.txt");
		ObjectInputStream objin=new ObjectInputStream(fin);
		lstcustomer =(List<Customer>)objin.readObject();
		objin.close();
		fin.close();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}

}

