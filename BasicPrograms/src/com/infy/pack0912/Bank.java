package com.infy.pack0912;

public interface Bank {
	
	int x = 10;
	
	 void deposit();
	 void withdrawl();
	 void balanceEnquiry();
	 void moneyTransfer();
	

}
class HDFC implements Bank{

	@Override
	public void deposit() {
		System.out.println("i am from HDFC Deposit");
	}

	@Override
	public void withdrawl() {
		System.out.println("i am from HDFC withdrawl");
		
	}

	@Override
	public void balanceEnquiry() {
		System.out.println("i am from HDFC balanceEnquiry");
		
	}

	@Override
	public void moneyTransfer() {
		System.out.println("i am from HDFC moneyTransfer");
		
	}
	
	public void testmethod() {
		System.out.println("i am from HDFC moneyTransfer");
		
	}
	
	public static void main(String[] args) {
		
		
		
		
	}
	
}

class SBI implements Bank{

	@Override
	public void deposit() {
		System.out.println("i am from SBI Deposit");
	}

	@Override
	public void withdrawl() {
		System.out.println("i am from SBI withdrawl");
		
	}

	@Override
	public void balanceEnquiry() {
		System.out.println("i am from SBI balanceEnquiry");
		
	}

	@Override
	public void moneyTransfer() {
		System.out.println("i am from SBI moneyTransfer");
		
	}
	
	
	public static void main(String[] args) {
		
		
		Bank obj = new HDFC();
		obj.deposit();
		obj.withdrawl();
		obj.balanceEnquiry();
		obj.moneyTransfer();
		
	}
	
	
	
	
}
