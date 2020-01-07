package com.azsquare;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortMyList {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Glenn","Scott","Caleb","Ryan");
        List<String> sortNames =names.stream().sorted().collect(Collectors.toList());
        // alphabetical order.
        for (String name:sortNames) {
             System.out.println(name);
        }
    }
}
