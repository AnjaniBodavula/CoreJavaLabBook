package com.cg.lb4.ex1;

public class Bank {
	

	public static void main(String[] args) {
		Account rahi=new Account(2000,"Rahi",32);
		Account sai=new Account(3000,"Sai",24);
		rahi.deposit(2000);
		sai.withdraw(2000);
		System.out.println("Balance in Rahi's account is Rs."+rahi.getBalance());
		System.out.println("Balance in Sai's account is Rs."+sai.getBalance());
		System.out.println(rahi.getAccNum());
		System.out.println(sai.getAccNum());
		

	}

}