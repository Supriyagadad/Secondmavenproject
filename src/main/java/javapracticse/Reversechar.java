package javapracticse;

import java.util.HashMap;

public class Reversechar {

	public static void main(String[] args) {
		
		inputString("I live in pune and I like it.");
		
	}

	static void inputString(String inputString)
	{
		HashMap<Character, Integer> inputch = new HashMap<>(); 
		
		char[] strArray =inputString.toCharArray(); //convert string=char array	
		
		for (char c : strArray) // check each char of array
		{ 
            if (inputch.containsKey(c))
            { 
             	inputch.put(c, inputch.get(c) + 1); 
            } 
            else 
            { 
              	inputch.put(c, 1); 
            } 
           
		}
		System.out.println(inputch);
      }
	 
}