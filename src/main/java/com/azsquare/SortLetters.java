package com.azsquare;

import java.util.Arrays;

public class SortLetters {

    public static void main(String[] args) {

        char[] letters = new char[]{'b','a','g','h','c','d'};
        Arrays.sort(letters);

        // alphabetical order.
        for (int i=0; i < letters.length; i++){
            System.out.println(letters[i]);
        }

    }
}
