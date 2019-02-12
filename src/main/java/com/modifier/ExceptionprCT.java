package com.modifier;

public class ExceptionprCT {

	public static void main(Myclass[] args) {
		
		ExceptionprCT ref =new ExceptionprCT();
		ref.method();
		
	}
	
	
				public void method()
		{
			try 
			{
				System.out.println(10/10);
				String name = null;
				System.out.println(name.length());
			} 
			catch(ArithmeticException | NullPointerException e) {
				System.out.println(e);
				System.out.println(e.getMessage());
				System.out.println(e.toString());
			}
			
			finally 
			{
			System.out.println("false");	
			}
		}
		
		
		
		
		
		
		
		
		
		
		
	

}
