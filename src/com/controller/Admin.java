package com.controller;

import java.util.Scanner;

import com.service.*;

public class Admin {

	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		ATM atm=new ATM();
		
		int choice1;
		
		boolean  onkar=true;
		while(onkar) {
			
			
			
			System.out.println("*********welcome to ATM machine: ");
			
			System.out.println("press 1: ADD ACCOUNT: ");
			System.out.println("press 2: withdraw money: ");
			System.out.println("press 3: Depoiste money: ");
			System.out.println("press 4: view Account details: ");
			System.out.println("press 5: update Account details: ");
			
			int  choice=sc.nextInt();
		switch(choice){
			
		case 1:
			atm.AddAccount();
			break;
			
		case 2: atm.Withdrawmoney();
		break;
		case 3: atm.Depositemoney();
		break;
		
		case 4: atm.viewAccountDetails();
		break;
		
		case 5: atm.UpdateAccountDetails();
		break;
		
		case 6:
			
			System.exit(choice);
			System.out.println("default case: ");
			
		}}}}
