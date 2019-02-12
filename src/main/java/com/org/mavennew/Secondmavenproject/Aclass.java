package com.org.mavennew.Secondmavenproject;

public class Aclass extends Bclass
{

	int x=90;
	
	public void evening()
	{
	 System.out.println("Good morning");
	}
	
	public static void main(String[] args) {
	
		Aclass ref= new Aclass();
		ref.evening();
		ref.morning();
		ref.night();
		
		
	}
}
