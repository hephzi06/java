import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);
        System.out.println("Enter USSD code \n");
        String ussd = myInput.nextLine();

        switch (ussd){
            case "*131#":
                System.out.println("Select from our rich data bundles \n" +
                        "1. Daily bundles \n" +
                        "2. Weekly bundles \n" +
                        "3. Monthly bundles \n" +
                        "4. Mega bundles");
                byte option = myInput.nextByte();
                switch (option){
                    case 1:
                        System.out.println("Select from our Daily bundles \n" +
                                "1. #50 for 40mb \n" +
                                "2. #100 for 100mb \n" +
                                "3. #200 for 200mb \n" +
                                "4. #300 for 1gb");
                        byte daily = myInput.nextByte();
                        switch (daily){
                            case 1:
                                System.out.println("1. Auto-renew \n" +
                                        "2. One-off");
                                byte daily_select1 = myInput.nextByte();
                                switch (daily_select1){
                                    case 1:
                                        System.out.println("You have successfully activated auto-renewal plan of #50 for 40mb");
                                        break;
                                    case 2:
                                        System.out.println("You have successfully activated one-off plan of #50 for 40mb");
                                        break;
                                    default:
                                        System.out.println("invalid choice");
                                }
                                break;
                            case 2:
                                System.out.println("1. Auto-renew \n" +
                                        "2. One-off");
                                byte daily_select2 =  myInput.nextByte();
                                switch (daily_select2) {
                                    case 1:
                                        System.out.println("You have successfully activated auto-renewal plan of #100 for 100mb");
                                        break;
                                    case 2:
                                        System.out.println("You have successfully activated one-off plan of #100 for 100mb");
                                        break;
                                    default:
                                        System.out.println("invalid choice");
                                }

                                break;
                            case 3:
                                System.out.println("1.Auto-renew \n" +
                                        "2. One-off");
                                byte daily_select3 =  myInput.nextByte();
                                switch (daily_select3) {
                                    case 1:
                                        System.out.println("You have successfully activated auto-renewal plan of #200 for 200mb");
                                        break;
                                    case 2:
                                        System.out.println("You have successfully activated one-off plan of #200 for 200mb");
                                        break;
                                    default:
                                        System.out.println("invalid choice");
                                }
                                break;
                            case 4:
                                System.out.println("1.Auto-renew \n" +
                                        "2. One-off");
                                byte daily_select4 =  myInput.nextByte();
                                switch (daily_select4) {
                                    case 1:
                                        System.out.println("You have successfully activated auto-renewal plan of #300 for 1gb");
                                        break;
                                    case 2:
                                        System.out.println("You have successfully activated one-off plan of #300 for 1gb");
                                        break;
                                    default:
                                        System.out.println("invalid choice");
                                }
                                break;
                            default:
                                System.out.println("Choose wisely");


                        }
                        break;
                    case 2:
                        System.out.println("Select a Plan from Weekly bundle\n" +
                                "1. #200 for 100mb for 3days \n" +
                                "2. #300 for 350mb for 7days \n" +
                                "3. #500 for 500mb for 7days \n" +
                                "4. #1000 for 750mb for 7days ");
                        byte weekly = myInput.nextByte();
                        switch (weekly){
                            case 1:
                                System.out.println("1.Auto-renew \n" +
                                        "2. One-off");
                                byte weekly_select1 =  myInput.nextByte();
                                switch (weekly_select1) {
                                    case 1:
                                        System.out.println("You have successfully activated auto-renewal plan of #200 for 100mb for 3days");
                                        break;
                                    case 2:
                                        System.out.println("You have successfully activated one-off plan of #200 for 100mb for 3days");
                                        break;
                                    default:
                                        System.out.println("invalid choice");
                                }
                                break;
                            case 2:
                                System.out.println("1.Auto-renew \n" +
                                        "2. One-off");
                                byte weekly_select2 =  myInput.nextByte();
                                switch (weekly_select2) {
                                    case 1:
                                        System.out.println("You have successfully activated auto-renewal plan of #300 for 350mb for 7days");
                                        break;
                                    case 2:
                                        System.out.println("You have successfully activated one-off plan of #300 for 350mb for 7days");
                                        break;
                                    default:
                                        System.out.println("invalid choice");
                                }
                                break;
                            case 3:
                                System.out.println("1.Auto-renew \n" +
                                        "2. One-off");
                                byte weekly_select3 =  myInput.nextByte();
                                switch (weekly_select3) {
                                    case 1:
                                        System.out.println("You have successfully activated auto-renewal plan of #500 for 500mb for 7days");
                                        break;
                                    case 2:
                                        System.out.println("You have successfully activated one-off plan of #500 for 500mb for 7days");
                                        break;
                                    default:
                                        System.out.println("invalid choice");
                                }
                                break;
                            case 4:
                                System.out.println("1.Auto-renew \n" +
                                        "2. One-off");
                                byte weekly_select4 =  myInput.nextByte();
                                switch (weekly_select4) {
                                    case 1:
                                        System.out.println("You have successfully activated auto-renewal plan of #1000 for 750mb for 7days");
                                        break;
                                    case 2:
                                        System.out.println("You have successfully activated one-off plan of #1000 for 750mb for 7days");
                                        break;
                                    default:
                                        System.out.println("invalid choice");
                                }
                                break;
                            default:
                                System.out.println("Choose wisely");
                        }

                        break;
                    case 3:
                        System.out.println("Select a Plan from Monthly bundle\n" +
                                "1. #700 for 500mb for 21days \n" +
                                "2. #1000 for 1bg for 1mon \n" +
                                "3. #2000 for 1.5gb for 1mon \n" +
                                "4. #5000 for 3gb for 2mon ");
                        byte monthly = myInput.nextByte();
                        switch (monthly){
                            case 1:
                                System.out.println("1.Auto-renew \n" +
                                        "2. One-off");
                                byte monthly_select1 =  myInput.nextByte();
                                switch (monthly_select1) {
                                    case 1:
                                        System.out.println("You have successfully activated auto-renewal plan of #700 for 500mb for 21days");
                                        break;
                                    case 2:
                                        System.out.println("You have successfully activated one-off plan of #700 for 500mb for 21days");
                                        break;
                                    default:
                                        System.out.println("invalid choice");
                                }
                                break;
                            case 2:
                                System.out.println("1.Auto-renew \n" +
                                        "2. One-off");
                                byte monthly_select2 =  myInput.nextByte();
                                switch (monthly_select2) {
                                    case 1:
                                        System.out.println("You have successfully activated auto-renewal plan of #1000 for 1bg for 1mon");
                                        break;
                                    case 2:
                                        System.out.println("You have successfully activated one-off plan of #1000 for 1bg for 1mon");
                                        break;
                                    default:
                                        System.out.println("invalid choice");
                                }
                                 break;
                            case 3:
                                System.out.println("1.Auto-renew \n" +
                                        "2. One-off");
                                byte monthly_select3 =  myInput.nextByte();
                                switch (monthly_select3) {
                                    case 1:
                                        System.out.println("You have successfully activated auto-renewal plan of #2000 for 1.5gb for 1mon");
                                        break;
                                    case 2:
                                        System.out.println("You have successfully activated one-off plan of #2000 for 1.5gb for 1mon");
                                        break;
                                    default:
                                        System.out.println("invalid choice");
                                }
                                break;
                            case 4:
                                System.out.println("1.Auto-renew \n" +
                                        "2. One-off");
                                byte monthly_select4 =  myInput.nextByte();
                                switch (monthly_select4) {
                                    case 1:
                                        System.out.println("You have successfully activated auto-renewal plan of #5000 for 3gb for 2mon");
                                        break;
                                    case 2:
                                        System.out.println("You have successfully activated one-off plan of #5000 for 3gb for 2mon");
                                        break;
                                    default:
                                        System.out.println("invalid choice");
                                }
                                break;
                            default:
                                System.out.println("Wrong choice");
                        }
                        break;
                    case 4:
                        System.out.println("Select a Plan from Mega bundle\n" +
                                "1. #2000 for 5gb for  14days \n" +
                                "2. #5000 for 10gb for 21days \n" +
                                "3. #7000 for 15gb for 1mon \n" +
                                "4. #10,000 for 20gb for 40days ");

                        byte mega = myInput.nextByte();
                        switch (mega){
                            case 1:
                                System.out.println("1.Auto-renew \n" +
                                        "2. One-off");
                                byte mega_select1 =  myInput.nextByte();
                                switch (mega_select1) {
                                    case 1:
                                        System.out.println("You have successfully activated auto-renewal plan of #2000 for 5gb for  14days");
                                        break;
                                    case 2:
                                        System.out.println("You have successfully activated one-off plan of #2000 for 5gb for  14days");
                                        break;
                                    default:
                                        System.out.println("invalid choice");
                                }
                                break;
                            case 2:
                                System.out.println("1.Auto-renew \n" +
                                        "2. One-off");
                                byte mega_select2 =  myInput.nextByte();
                                switch (mega_select2) {
                                    case 1:
                                        System.out.println("You have successfully activated auto-renewal plan of #5000 for 10gb for 21days");
                                        break;
                                    case 2:
                                        System.out.println("You have successfully activated one-off plan of #5000 for 10gb for 21days");
                                        break;
                                    default:
                                        System.out.println("invalid choice");
                                }
                                break;
                            case 3:
                                System.out.println("1.Auto-renew \n" +
                                        "2. One-off");
                                byte mega_select3 =  myInput.nextByte();
                                switch (mega_select3) {
                                    case 1:
                                        System.out.println("You have successfully activated auto-renewal plan of #7000 for 15gb for 1mon");
                                        break;
                                    case 2:
                                        System.out.println("You have successfully activated one-off plan of #7000 for 15gb for 1mon");
                                        break;
                                    default:
                                        System.out.println("invalid choice");
                                }
                                break;
                            case 4:
                                System.out.println("1.Auto-renew \n" +
                                        "2. One-off");
                                byte mega_select4 =  myInput.nextByte();
                                switch (mega_select4) {
                                    case 1:
                                        System.out.println("You have successfully activated auto-renewal plan of #10,000 for 20gb for 40days");
                                        break;
                                    case 2:
                                        System.out.println("You have successfully activated one-off plan of #10,000 for 20gb for 40days");
                                        break;
                                    default:
                                        System.out.println("invalid choice");
                                }
                                break;
                            default:
                                System.out.println("Wrong choice");
                        }
                        break;
                    default:
                        System.out.println("Invalid option");

                }
                break;
            default:
                System.out.println("Wrong input");

        }
    }
}