package com.azsquare;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateWord {

    public static void main(String[] args) {

        List<String> word = Arrays.asList("Phoenix","Dallas","Miami","New York","Dallas");
        //Remove duplicate word (Dallas)
        Set<String> setWord = new HashSet<>(word);
        for (String names:setWord) {
            System.out.println(names);
        }
    }
}
