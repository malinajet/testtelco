package com.company;
import java.util.Scanner;

public class test3 {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int first,second,result;

        System.out.println("Enter first num:");
        first = num.nextInt();
        System.out.println("Enter second num:");
        second = num.nextInt();
        result =first+second;
        System.out.println("Result is - "+ result);
    }
}