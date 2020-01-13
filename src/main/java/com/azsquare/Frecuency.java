package com.azsquare;

import java.util.HashMap;
import java.util.Map;

/**
 * Frequency of Character
 *
 */
public class Frecuency {
	
	public static void main(String[] args) {
	
      String str = "Welcome to Dallas";
      
      HashMap<Character,Integer> map = new HashMap<Character, Integer>();
      char[] arrayStr = str.toCharArray();
      
      for (int i = 0; i < arrayStr.length; i++) {
		   char c = arrayStr[i];
		   if(map.containsKey(c)) {
			   map.put(c, map.get(c)+1);
		   }else {
			   map.put(c,1);
		   }
		
  	   }
      
       for(Map.Entry<Character, Integer> entry: map.entrySet()) {
    	   System.out.println(entry.getKey()+": "+entry.getValue());
    	   
       }
      
	}

}
