package com.service;

import java.util.Scanner;

import com.model.*;

public class ATM {

	Scanner sc=new Scanner(System.in);
	
	Resistration res=new Resistration();

	
	public void AddAccount() {
		System.out.println("enter your id: ");
		int id=sc.nextInt(); 
		res.setId(id);
		 sc.nextInt();
		
		System.out.println("enetr your name: ");
		String name=sc.next();
		res.setName(name);
		sc.nextLine();
		 
		System.out.println("enetr your address: ");
		String address=sc.next();
		res.setAddress(address);
		sc.nextLine();
		
		System.out.println("enter your email: ");
		String email=sc.next();
		res.setEmail(email);
		sc.nextLine();
		System.out.println("*************congratulationssssss*************");
		
		System.out.println("you have sucessecfully created your account: ");
	}
     public void Withdrawmoney() {
	System.out.println("enter your id: ");
	int id2=sc.nextInt();
	res.setId(id2);
	sc.nextInt();
	if(id2==res.getId()) {
		System.out.println("enter your ammount you want to withdraw: ");
		int ammount=sc.nextInt();
	   res.setAmmount(res.getAmmount()  -ammount);
	   System.out.println("your ammount withdraw successfully: ");
	   System.out.println("your current balance is:"+res.getAmmount());
	   
	}else {
		System.out.println("firstly create your account: ");
	}
	
}
    public void Depositemoney() {
    	
    	System.out.println("enter your id no: ");
    	int id3=sc.nextInt();
    	res.setId(id3);
    	sc.nextInt();
    	if(id3==res.getId()) {
    	
    	
    	
	  System.out.println("enter your ammount you want to deposite: ");
	  int ammount1=sc.nextInt();
	  res.setAmmount(res.getAmmount() +ammount1);
	  System.out.println("your ammount deposite sucessesfully: ");
	  System.out.println("your current balance is: "+res.getAmmount());
	  
	System.out.println();  
	  
  }else {
	  System.out.println("firstly create your account: ");
  }
    }
     public void viewAccountDetails() {
	   System.out.println("enter your id: ");
	   int id=sc.nextInt();
	   res.setId(id);
	   sc.nextInt();
	   if(id==res.getId()) {
		   System.out.println("id no is right program pass: ");
		   System.out.println("your id no is:" +res.getId());
		   System.out.println("your your name is: "+res.getName());
		   System.out.println("your address is: "+res.getEmail());
		   System.out.println("your current balance is: "+res.getAmmount());
	   }
	   else {
		   System.out.println("firstly create your account: ");
	   }
   }
     public void UpdateAccountDetails() {
	   System.out.println("UpdateAccountDetails()");
    }
}