package com.tpointprgrams;

public class Reversepyaramids {

	public static void main(String[] args) {

		/*
		 * for (int i = 4; i >=1; i--) { System.out.print("*"); }
		 * System.out.println("");
		 * 
		 * for (int j = 3; j>=1; j--) { System.out.print("*"); } System.out.println("");
		 * 
		 * for (int j = 2; j>=1; j--) { System.out.print("*"); } System.out.println("");
		 * 
		 * for (int k = 1; k>=1; k--) { System.out.print("*"); }
		 */

	 for (int j = 5; j >=1; j--)
	 {
		for (int i = j; i> 0; i--) 
		{
			System.out.print("*");
		}
	 System.out.println(""); 
	 }
	
	}
}