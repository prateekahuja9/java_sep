package sep24;

import java.util.Scanner;

public class SwitchCaseDemo {
    public static void main(String[] args){

        /*
        1. Press for english
            1. Internet
                1. Billing
                2. Account Info
                3. Payment arrangement
                4. Technical support
                    1. Agent
                        1. wait time is 200 minutes
                    2. for AI
                 5. Go to main menu
             2. Mobile

         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Bell :");
        System.out.println("Press 1 for English");
        System.out.println("Press 2 for French");

        int selLanguage = sc.nextInt();

        if(selLanguage == 1){
            System.out.println("Press 1 for Internet");
            System.out.println("Press 2 for Mobile");
            int input1 = sc.nextInt();
            if(input1 == 1){
                System.out.println("Press 1 for Billing");
                System.out.println("Press 2 for Account Info");
                System.out.println("Press 3 for Payment arrangement");
                System.out.println("Press 4 for Technical support");
                System.out.println("Press 5 to go to the main menu");
                int input2 = sc.nextInt();
                switch(input2){
                    case 1:
                        System.out.println("Here are your billing details");
                        break;
                    case 2:
                        System.out.println("Here is your Account Info");
                        break;
                    case 3:
                        System.out.println("These are your Payment options");
                        break;
                    case 4:
                        System.out.println("Press 1 to talk to a Specialist");
                        System.out.println("Press 2 to chat with an AI");
                        int input3 = sc.nextInt();
                        if(input3 == 1){
                            System.out.println("We are connecting you to the next available specialist");
                            System.out.println("Your wait time is 200 minutes..");
                        }else if(input3 == 2){
                            System.out.println("You are connected to AI..");
                            System.out.println("Hi this Jack, how can I help you today?");
                        }else{
                            System.out.println("Invalid input");
                        }
                        break;
                    case 5:
                        System.out.println("Going back to main menu");
                        break;
                    default:
                        System.out.println("Invalid Input!!");
                        break;
                }

            }
        }

    }
}
