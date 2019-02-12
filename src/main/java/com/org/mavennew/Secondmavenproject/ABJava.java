package com.org.mavennew.Secondmavenproject;

public class ABJava {

	public static void main(String[] args) {

		
		
		Aclass ref =new Aclass();
		ref.evening();
		System.out.println(ref.x);
		System.out.println(".....");
		
		
		
		Bclass aref= new Bclass();
		aref.morning();
		aref.night();
		aref.evening();
		System.out.println(aref.x);

		System.out.println(".....");
		
		Bclass abref= new Aclass();
		abref.morning();
		abref.night();
		abref.evening();
		System.out.println(aref.x);
		
		
		
		
		
		
	}

}
