package com.hcl.project;

import java.util.*;

public class CustomerMain {


	public static void main(String[] args) {
		int choice;
		Scanner sc = new Scanner(System.in);
		do{
			System.out.println("options");
			System.out.println("--------");
			System.out.println("1.Add customers");
			System.out.println("2.Show customers");
			System.out.println("3.Search customers");
			System.out.println("4.update customers");
			System.out.println("5.delete customers");
			System.out.println("6.Exit");
			System.out.println("Enter the choice  ");
			choice = sc.nextInt();
			switch(choice) {
			case 1:
				addCustomer();
				break;
			case 2:
				showCustomer();
				break;
			case 3:
				searchCustomer();
				break;
			case 4:
				updateCustomer();
				break;
			case 5:
			    deleteCustomer();
			    break;
			case 6:
				return;
					default :
						System.out.println("invalid input");
			}
		}while(choice!=6);
	}
	
	public static void updateCustomer()
	{
		Customer objcustomer = new Customer();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the customer no.");
		objcustomer.setCusid(Integer.parseInt(sc.nextLine()));
		System.out.println("enter customer name");
		objcustomer.setCusname(sc.nextLine());
		System.out.println("enter customer annual premium");
		objcustomer.setAnnualpremiun(Double.parseDouble(sc.nextLine()));
		System.out.println("enter modal premium");
		objcustomer.setModalpremium(Double.parseDouble(sc.nextLine()));
		System.out.println("enter the payment mode");
		objcustomer.setPaymode(Integer.parseInt(sc.nextLine()));
		CustomerBAL obj=new CustomerBAL();
		System.out.println(obj.updateCustomerBal(objcustomer));
	}
	public static void deleteCustomer()
	{
		int cusid;
		System.out.println("enter the cusid");
		Scanner sc = new Scanner(System.in);
		cusid=sc.nextInt();
		CustomerBAL obj=new CustomerBAL();
		System.out.println(obj.deleteCustomerBal(cusid));
		
	}
	public static void writeStudentFile() {
		new CustomerBAL().writeCustomerFileBal();
	}
	
	public static void readCustomerFile() {
		new CustomerBAL().readCustomerFileBal();
	}
	
	
	public static void searchCustomer()
	{
		int cusid;
		System.out.println("enter customer id");
		Scanner sc=new Scanner(System.in);
		cusid=sc.nextInt();
		CustomerBAL obj = new CustomerBAL();
		Customer customer=obj.serachCustomerBal(cusid);
		if(customer==null){
			System.out.println("customer record not found...");
		}else{
			System.out.println(customer);
		}
		
	}
	
	public static void showCustomer()
	{
		CustomerBAL obj=new CustomerBAL();
		List<Customer> customers=obj.showCustomerBal();
		for (Customer customer : customers) {
			System.out.println(customer);
		}
	}

	public static void addCustomer(){
		Customer objcustomer = new Customer();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the customer no.");
		objcustomer.setCusid(Integer.parseInt(sc.nextLine()));
		System.out.println("enter customer name");
		objcustomer.setCusname(sc.nextLine());
		System.out.println("enter customer annual premium");
		objcustomer.setAnnualpremiun(Double.parseDouble(sc.nextLine()));
		System.out.println("enter modal premium");
		objcustomer.setModalpremium(Double.parseDouble(sc.nextLine()));
		System.out.println("enter the payment mode");
		objcustomer.setPaymode(Integer.parseInt(sc.nextLine()));
		CustomerBAL obj=new CustomerBAL();
		try {
			boolean res=obj.addCustomerBal(objcustomer);
			if(res==true){
				System.out.println("customer added successfully...");
			}
		} catch (CustomerException e) {
		System.out.println(e.getMessage());
		}
		
		
	}
}
