package com.azsquare;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquareNumber {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,3,4,5,6,8);
        List<Integer> squareList =list.stream().map(x ->x*x).collect(Collectors.toList());

        for (Integer squareNumber:squareList) {
            System.out.println(squareNumber);
        }
    }
}
