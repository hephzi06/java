package com.company;

import java.util.Scanner;

public class Main {
        static void verify(){
            String daily_50mb = "#50 for 40mb";
            String daily_100mb = "#100 for 100mb";
            String daily_200mb = "#200 for 200mb";
            String daily_1gb = "#300 for 1gb";
            
            System.out.println("1. Auto-renew \n" +
                    "2. One-off");
            Scanner myInput = new Scanner(System.in);
            byte select = myInput.nextByte();
            if (select == 1){
                System.out.println("You have successfully activated auto-renewal plan of #50 for 40mb");
            }else if (select == 2){
                System.out.println("You have successfully activated one-off plan of #50 for 40mb");
            }else{
                System.out.println("invalid option");
            }
        }

    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);
        System.out.println("Hello world");
        System.out.println("Enter USSD code");
        String code = myInput.nextLine();

        if (code.equals("*131#")) {
            System.out.println("Select from our rich data bundle \n " +
                    "1. Daily bundle \n " +
                    "2. Weekly bundle \n " +
                    "3. Monthly bundle \n " +
                    "4. Mega bundle");
            byte option = myInput.nextByte();
            if (option == 1) {
                System.out.println("Select a Plan from Daily bundle\n" +
                        "1. #50 for 40mb \n" +
                        "2. #100 for 100mb \n" +
                        "3. #200 for 200mb \n" +
                        "4. #300 for 1gb ");
                byte daily = myInput.nextByte();
                if (daily == 1){
                    System.out.println("1. Auto-renew \n" +
                            "2. One-off");
                    byte select = myInput.nextByte();
                    if (select == 1){
                        System.out.println("You have successfully activated auto-renewal plan of #50 for 40mb");
                    }else if (select == 2){
                        System.out.println("You have successfully activated one-off plan of #50 for 40mb");
                    }else{
                        System.out.println("invalid option");
                    }
                }else if (daily == 2){
                    System.out.println("1. Auto-renew \n" +
                            "2. One-off");
                    byte select = myInput.nextByte();
                    if (select == 1){
                        System.out.println("You have successfully activated auto-renewal plan of #100 for 100mb");
                    }else if (select == 2){
                        System.out.println("You have successfully activated one-off plan of #100 for 100mb");
                    }else{
                        System.out.println("invalid option");
                    }
                }else if (daily == 3){
                    System.out.println("1. Auto-renew \n" +
                            "2. One-off");
                    byte select = myInput.nextByte();
                    if (select == 1){
                        System.out.println("You have successfully activated auto-renewal plan of #200 for 200mb");
                    }else if (select == 2){
                        System.out.println("You have successfully activated one-off plan of #200 for 200mb");
                    }else{
                        System.out.println("invalid option");
                    }
                }else if (daily == 4){
                    System.out.println("1. Auto-renew \n" +
                            "2. One-off");
                    byte select = myInput.nextByte();
                    if (select == 1){
                        System.out.println("You have successfully activated auto-renewal plan of #300 for 1gb");
                    }else if (select == 2){
                        System.out.println("You have successfully activated one-off plan of #300 for 1gb");
                    }else{
                        System.out.println("invalid option");
                    }
                }else{
                    System.out.println("wrong input");
                }
            } else if (option == 2) {
                System.out.println("Select a Plan from Weekly bundle\n" +
                        "1. #200 for 100mb for 3days \n" +
                        "2. #300 for 350mb for 7days \n" +
                        "3. #500 for 500mb for 7days \n" +
                        "4. #1000 for 750mb for 7days ");
                byte weekly = myInput.nextByte();
                if (weekly == 1){
                    System.out.println("1. Auto-renew \n" +
                            "2. One-off");
                    byte select = myInput.nextByte();
                    if (select == 1){
                        System.out.println("You have successfully activated auto-renewal plan of #200 for 100mb for 3days");
                    }else if (select == 2){
                        System.out.println("You have successfully activated one-off plan of #200 for 100mb for 3days");
                    }else{
                        System.out.println("invalid option");
                    }
                }else if (weekly == 2){
                    System.out.println("1. Auto-renew \n" +
                            "2. One-off");
                    byte select = myInput.nextByte();
                    if (select == 1){
                        System.out.println("You have successfully activated auto-renewal plan of #300 for 350mb for 7days");
                    }else if (select == 2){
                        System.out.println("You have successfully activated one-off plan of #300 for 350mb for 7days");
                    }else{
                        System.out.println("invalid option");
                    }
                }else if (weekly == 3){
                    System.out.println("1. Auto-renew \n" +
                            "2. One-off");
                    byte select = myInput.nextByte();
                    if (select == 1){
                        System.out.println("You have successfully activated auto-renewal plan of #500 for 500mb for 7days");
                    }else if (select == 2){
                        System.out.println("You have successfully activated one-off plan of #500 for 500mb for 7days");
                    }else{
                        System.out.println("invalid option");
                    }
                }else if (weekly == 4){
                    System.out.println("1. Auto-renew \n" +
                            "2. One-off");
                    byte select = myInput.nextByte();
                    if (select == 1){
                        System.out.println("You have successfully activated auto-renewal plan of #1000 for 750mb for 7days");
                    }else if (select == 2){
                        System.out.println("You have successfully activated one-off plan of #1000 for 750mb for 7days");
                    }else{
                        System.out.println("invalid option");
                    }
                }else{
                    System.out.println("wrong input");
                }
            } else if (option == 3) {
                System.out.println("Select a Plan from Monthly bundle\n" +
                        "1. #700 for 500mb for 21days \n" +
                        "2. #1000 for 1bg for 1mon \n" +
                        "3. #2000 for 1.5gb for 1mon \n" +
                        "4. #5000 for 3gb for 2mon ");
                byte monthly = myInput.nextByte();
                if (monthly == 1){
                    System.out.println("1. Auto-renew \n" +
                            "2. One-off");
                    byte select = myInput.nextByte();
                    if (select == 1){
                        System.out.println("You have successfully activated auto-renewal plan of #700 for 500mb for 21days");
                    }else if (select == 2){
                        System.out.println("You have successfully activated one-off plan of #700 for 500mb for 21days");
                    }else{
                        System.out.println("invalid option");
                    }
                }else if (monthly == 2){
                    System.out.println("1. Auto-renew \n" +
                            "2. One-off");
                    byte select = myInput.nextByte();
                    if (select == 1){
                        System.out.println("You have successfully activated auto-renewal plan of #1000 for 1bg for 1mon");
                    }else if (select == 2){
                        System.out.println("You have successfully activated one-off plan of #1000 for 1bg for 1mon");
                    }else{
                        System.out.println("invalid option");
                    }
                }else if (monthly == 3){
                    System.out.println("1. Auto-renew \n" +
                            "2. One-off");
                    byte select = myInput.nextByte();
                    if (select == 1){
                        System.out.println("You have successfully activated auto-renewal plan of #2000 for 1.5gb for 1mon");
                    }else if (select == 2){
                        System.out.println("You have successfully activated one-off plan of #2000 for 1.5gb for 1mon");
                    }else{
                        System.out.println("invalid option");
                    }
                }else if (monthly == 4){
                    System.out.println("1. Auto-renew \n" +
                            "2. One-off");
                    byte select = myInput.nextByte();
                    if (select == 1){
                        System.out.println("You have successfully activated auto-renewal plan of ##5000 for 3gb for 2mon");
                    }else if (select == 2){
                        System.out.println("You have successfully activated one-off plan of ##5000 for 3gb for 2mon");
                    }else{
                        System.out.println("invalid option");
                    }
                }else{
                    System.out.println("wrong input");
                }
            } else if (option == 4) {

                System.out.println("Select a Plan from Mega bundle\n" +
                        "1. #2000 for 5gb for  14days \n" +
                        "2. #5000 for 10gb for 21days \n" +
                        "3. #7000 for 15gb for 1mon \n" +
                        "4. #10,000 for 20gb for 40days ");
                byte mega = myInput.nextByte();
                if (mega == 1){
                    System.out.println("1. Auto-renew \n" +
                            "2. One-off");
                    byte select = myInput.nextByte();
                    if (select == 1){
                        System.out.println("You have successfully activated auto-renewal plan of #2000 for 5gb for 14days");
                    }else if (select == 2){
                        System.out.println("You have successfully activated one-off plan of #2000 for 5gb for 14days");
                    }else{
                        System.out.println("invalid option");
                    }
                }else if (mega == 2){
                    System.out.println("1. Auto-renew \n" +
                            "2. One-off");
                    byte select = myInput.nextByte();
                    if (select == 1){
                        System.out.println("You have successfully activated auto-renewal plan of #5000 for 10gb for 21days");
                    }else if (select == 2){
                        System.out.println("You have successfully activated one-off plan of #5000 for 10gb for 21days");
                    }else{
                        System.out.println("invalid option");
                    }
                }else if (mega == 3){
                    System.out.println("1. Auto-renew \n" +
                            "2. One-off");
                    byte select = myInput.nextByte();
                    if (select == 1){
                        System.out.println("You have successfully activated auto-renewal plan of #7000 for 15gb for 1mon");
                    }else if (select == 2){
                        System.out.println("You have successfully activated one-off plan of #7000 for 15gb for 1mon");
                    }else{
                        System.out.println("invalid option");
                    }
                }else if (mega == 4){
                    System.out.println("1. Auto-renew \n" +
                            "2. One-off");
                    byte select = myInput.nextByte();
                    if (select == 1){
                        System.out.println("You have successfully activated auto-renewal plan of #10,000 for 20gb for 40days");
                    }else if (select == 2){
                        System.out.println("You have successfully activated one-off plan of #10,000 for 20gb for 40days");
                    }else{
                        System.out.println("invalid option");
                    }
                }else{
                    System.out.println("wrong input");
                }
            } else {
                System.out.println("Invalid option");
            }

        }

    }
}
