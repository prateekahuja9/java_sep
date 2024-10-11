package sep28;

import java.util.Scanner;

public class CalculatorProb {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        char choice;

        do {
        System.out.println("***** Welcome to My Calculator *****");
        System.out.println("Press 1 for Addition");
        System.out.println("Press 2 for Subtraction");
        System.out.println("Press 3 for Multiplication");
        System.out.println("Press 4 for Division");
        System.out.println("Press 5 for Modulus");
        System.out.println("Enter your choice..");

        int i = obj.nextInt();
        System.out.println("Enter first number...");
        int num1 = obj.nextInt();

        System.out.println("Enter second number...");
        int num2 = obj.nextInt();

        if(i == 1){
            System.out.println("Sum of two numbers is : "+ (num1 + num2));
        }else if(i ==2){
            System.out.println("Difference of two numbers is : " + (num1 - num2));
        }else if(i ==3){
            System.out.println("Multiplication of two numbers is : " + (num1 * num2));
        }else if(i == 4){
            System.out.println("Division of two numbers is : "+ (num1 / num2));
        }else if(i == 5){
            System.out.println("Modulus of two numbers is : "+ (num1 % num2));
        }else{
            System.out.println("PLease enter a valid input..");
        }

        System.out.println("To exit the calculator press 'Y' or press 'N' to continue the operation...");
        choice = obj.next().charAt(0);
        if(choice == 'n' || choice == 'N' || choice == 'y' || choice == 'Y'){

        }else {
            System.out.println("Please enter a valid input...");
        }
        }while(choice == 'n' || choice == 'N');

        /*

        do {


        // input
        String s = scanner.next().charAt(0);

        s == "y"

        }while();



         */
    }
}
