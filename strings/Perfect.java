package com.hcl.day3;

public class Perfect {
public void show(int n){
	int sum=0;
	for(int i=0;i<=n;i++){
		if(n%i==0){
			sum=sum+i;
		}
	}
	if(sum==n)
	{
		System.out.println(" is a PERFECT NUMBER");
	}
	else 
	{
		System.out.println("is not a Perfet number");
	}
}
	public static void main(String[] args) {
		
	}

}
