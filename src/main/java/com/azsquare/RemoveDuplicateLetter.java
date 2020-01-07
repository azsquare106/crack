package com.azsquare;

import java.util.HashMap;
import java.util.Map;


public class RemoveDuplicateLetter {

    public static void main(String[] args) {

        String msg = "Welcome to AZ square 106";

        // Remove duplicate letters, this is letter e and o
        char[] arrayLetters = msg.toCharArray();
        HashMap<Character,Integer> map = new HashMap<>();

        for(int i =0; i< arrayLetters.length; i++){
             if(map.containsKey(arrayLetters[i])){
                 map.put(arrayLetters[i],map.get(arrayLetters[i])+1);
             }else{
                 map.put(arrayLetters[i],1);
             }
        }

        StringBuilder str = new StringBuilder();
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            if(entry.getValue()==1){
                str.append(entry.getKey());
            }
        }

        System.out.println(str);

    }
}
