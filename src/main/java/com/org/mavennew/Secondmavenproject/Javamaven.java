package com.org.mavennew.Secondmavenproject;

public class Javamaven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Javamaven ref= new Javamaven();
				ref.add();
					   
				ref.add(10);
				
				int h=ref.add(20, 30, 40);
				System.out.println(h);
				
				String d= ref.add("Supriya");
				System.out.println(d);
				
		
	}

	
	public  void add()
	{
		 System.out.println(10+20);
	}
	
	
	public void add(int x)
	{
		System.out.println(20+x);
	}
	
	public int add(int x, int y, int z)
	{
		int w= x+y+z;
		return w;
		
	}
	
	public String add(String zx)
	{
		//String s= "supriya";
		return zx;
		
	}
}
