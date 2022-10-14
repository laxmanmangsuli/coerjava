package com.braindata.bankmanagement.client;

import com.braindata.bankmanagement.service.Rbi;
import com.braindata.bankmanagement.serviceImpl.Sbi;
import java.util.Scanner;
public class Test {
	public static void main(String[] args) {
		Rbi bank=new Sbi();
		while(true)
		{
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter 1 for Account creation");
		System.out.println("Enter 2 for Display your details");
		System.out.println("Enterr 3 for deposit money");
		System.out.println("Enter 4 for Withdrawal");
		System.out.println("Enter 5 for balance check");
		System.out.println("Enter 0 for exit");
		System.out.println("Enter choice for opration");
		int x=sc.nextInt();
		switch(x)
		{
		case 1:
			bank.createAccount();
			break;
		case 2:
			bank.displayAllDetails();
			break;
		case 3:
			bank.depositeMoney();
			break;
		case 4:
			bank.withdrawal();
			break;
		case 5:
			bank.balanceCheck();
			break;
		case 0:
			System.out.println("Thank you Visit Again");
			System.exit(0);
		}
		
		
			
	}

}
}
