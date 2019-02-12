package com.org.mavennew.Secondmavenproject;

public class Bbclass implements InterfaceC
{
	 public static void main(String[] args) {
		
		 Bbclass ref= new Bbclass();
		 ref.sleep();
		 ref.drive();
		 ref.talk();
		 ref.eat(); 
		 
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		
		System.out.println("sleep");
	}

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("drive");
		
	}

	@Override
	public void talk() {
		// TODO Auto-generated method stub
		System.out.println("talk");
		
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("eat");
		
	}

	
	
}
