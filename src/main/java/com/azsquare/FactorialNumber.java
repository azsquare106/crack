package com.azsquare;

public class FactorialNumber {

    public static void main(String[] args) {
        //factorial number
        int x = 5;

        int factorial=(x==0)?1:x;

        for (int i = x-1; i >=1; i--) {
            factorial = factorial*i;
        }
        System.out.println("The factorial of "+x+ " is: " +factorial);
    }
}
