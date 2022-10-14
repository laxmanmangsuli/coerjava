package com.braindata.bankmanagement.serviceImpl;

import com.braindata.bankmanagement.model.Account;
import java.util.*;
import com.braindata.bankmanagement.service.Rbi;
import java.util.Scanner;
public class Sbi implements Rbi {
	
	Scanner sc=new Scanner(System.in);
	Account a=new Account();
	
	@Override
	public void createAccount() {
		System.out.println("Enter your accout number");
		int q=sc.nextInt();
		a.setAccNo(q);
		System.out.println("Enter your name");
		String x=sc.next();
		a.setName(x);
		System.out.println("Enter your mobile number");
		String y=sc.next();
		a.setMbNo(y);
		System.out.println("Enter your addhar");
		String z=sc.next();
		a.setAdharNo(z);
		System.out.println("Enter your gender");
		String p=sc.next();
		a.setGender(p);
		System.out.println("Enter your age");
		int r=sc.nextInt();
		a.setAge(r);
		System.out.println("Enter your balance");
		double t=sc.nextDouble();
		a.setBalance(t);

	}

	@Override
	public void displayAllDetails() 
	{
		
		Random r=new Random();
		int otp=r.nextInt(99999);
		System.out.println("OTP ="+otp);
		System.out.println("Enter OTP");
		int x=sc.nextInt();
		
		if(otp==x)
		{
			System.out.println("Success");
		
	System.out.println("Account number is"+a.getAccNo());
	System.out.println("Name is"+a.getName());
	System.out.println("Mobile no="+a.getMbNo());
	System.out.println("Addhar number="+a.getAdharNo());
	System.out.println("Gender is="+a.getGender());
	System.out.println("Age is="+a.getAge());
	System.out.println("Balance is="+a.getBalance());
		
	}
		
	else
	{
		System.out.println("Enter correct OTP");
		
		}
	}


	@Override
	public void depositeMoney() {
		System.out.println("Enter diposit balance");
		double d=sc.nextDouble();
	    double b=a.getBalance();
	    double t=d+b;
	    a.setBalance(t);
	    System.out.println("Your new balance="+t);
	}

	@Override
	public void withdrawal() {
		double d=a.getBalance();
		System.out.println("Enter withdrai money");
		double e=sc.nextDouble();
		if(d>=e)
		{
			double s=d-e;
			a.setBalance(s);
			System.out.println("Your remaining balance="+a.getBalance());
            
		}
		else
		{
			System.out.println("Insuficient funds");
		}
		
	
		
	}

	@Override
	public void balanceCheck() {
		int b=a.getAccNo();
		System.out.println("Enter your account numbrt");
		int c=sc.nextInt();
		if(b==c)
		{
		System.out.println("your balance is="+a.getBalance());
		}
		else
		{
			System.out.println("Enter correct account number");
		}
		
	}

}
