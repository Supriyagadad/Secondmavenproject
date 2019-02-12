package javapracticse;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Collections {

	public static void main(String[] args) {

		int x= 90;
		int y= 60;
		int z= 40;
		int a= 20;
		
		//Array
		
		System.out.println(".........Array......");
		
		int num[]=new int[4];
		num[0]=90;
		num[1]=60;
		num[2]=40;
		num[3]=20;
;
			
		System.out.println(num.length);
		System.out.println(num[2]);
		
		
		//Collection
		
		System.out.println(".......Collection......");
        
		java.util.List<Integer> number=new ArrayList<Integer>();
		
    // java.util.List<Integer> number= new LinkedList<Integer>();
		
		
		
		number.add(90);
		number.add(60);
		number.add(40);
		number.add(20);
		
		System.out.println(number.size());
		System.out.println(number.get(2));
		
		number.add(80);
		System.out.println(number.get(4));
		
		
		System.out.println(".....For loop.....");
		
		 for (int i = 0; i < number.size(); i++) 
		 {
			 System.out.println(number.get(i));
		 }
			 
		System.out.println("......For each...");
		
		for (Integer my : number) {
			System.out.println(my);
		}
		
		
/// ...........Set.........
		
	System.out.println(".......Set......");	
	
		Set<Integer> setNumber= new HashSet<Integer>();
		//Set<Integer> setNumber =new LinkedHashSet<Integer>();
		//Set<Integer>setNumber=new TreeSet<Integer>();
		
		setNumber.add(40);
		setNumber.add(30);
		setNumber.add(80);
		setNumber.add(10);
		setNumber.add(40);
		setNumber.add(60);
		setNumber.add(30);
		
		System.out.println(setNumber);
		System.out.println(setNumber.size());
		
		for(Integer xyz: setNumber)
		{
			System.out.println(xyz);
		}
 		
											
		
	// Map....1.Hash Map 2.LinkedHashMap 3.Tree Map
		
		
		System.out.println(".....Map......");
		
		Map<Integer, String> mNum = new HashMap<>();
		//Map<Integer, String> mNum = new LinkedHashMap<>();
		//Map<Integer, String> mNum = new TreeMap<>();

		
		mNum.put(10, "Selenium");
		mNum.put(30, "Selenium");
		mNum.put(9, "Class");
		mNum.put(7, "Morning");
		mNum.put(60, "Evening");
		mNum.put(10, "Night");
		mNum.put(99, "Selenium");
		
		System.out.println(mNum);
		System.out.println(mNum.size());
		
		System.out.println(mNum.get(60));
		
		for(Integer xy : mNum.keySet())
		{
			System.out.println(mNum.get(xy));
		}
		
	
	
	}

	}


