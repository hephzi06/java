package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Scanner sololearn = new Scanner(System.in);
//        System.out.println("Enter an amount ");
//        int amount = sololearn.nextInt();
//        for (int i = 1; i  <= 3; i++ ){
//            int payback = amount * 10 / 100;
//            amount = amount - payback;
//            System.out.println(amount);

//        int array[ ][ ]=  {{3, 5, 8}, {7, 54, 1, 12, 4}, {2, 5, 7}};
//        System.out.println(array[3][1][]);


        /** second code */
//        Scanner scanner = new Scanner(System.in);
//        int amount = scanner.nextInt();
//
//        //your code goes here
//        int pay;
//        for(int i=1; i<=3;i++)
//        {
//            pay = (amount *10)/100;
//            amount = amount - pay;
//            System.out.println(amount);
//        }
       /** What is the output of this code?**/
//        int result = 0;
//        for (int i = 0; i <= 4; i++) {
//            if (i == 3) {
//                result += 10;
//            } else {
//                result += i;
//            }
//        }
//        System.out.println(result);
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        char[] arr = text.toCharArray();

        //your code goes here
//
        String  str = "";
        //your code goes here
        for(int i= arr.length -1;  i >= 0; i--){
            str = str + arr[i];
            System.out.println(str);
        }




    }
}
