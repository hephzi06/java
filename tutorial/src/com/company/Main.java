package com.company;



import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);
        System.out.println("Enter a number");
        int value = myInput.nextInt();
//        int num = 1;

//        while (num <= 12) {
//            int result = num * value;
//                System.out.println( value + " * " + num +" = " + result );
//                num++;
//
//
//        }
        for (int num = 1; num <= 12; num ++){
            int result = num * value;
            System.out.println(value + " * " + num + " = " + result);

        }
    }
}
