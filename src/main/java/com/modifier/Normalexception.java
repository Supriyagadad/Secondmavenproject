package com.modifier;

public class Normalexception {

	public static void main(Myclass[] args) 
	{
       
		System.out.println("main");
		
		Normalexception ref =new Normalexception();
		ref.method();
		
	}
		
		public void method()
		{
			int balance=50000;
			int withdraw=18000;
			
			
			if (withdraw>20000) 
			{
				throw new MyBankingException("As per goverment you are not allowed to withdraw more than 20000");
				
			}
			else
			{
				if (balance>withdraw) 
				{
				System.out.println("Withdraw sucess");	
				}
				else if (balance<withdraw)
				{
					System.out.println("You dont have sufficent balnce");
				}
			
				else
				{
					System.out.println("No money");
				}
			
			}
		}
		
	}


