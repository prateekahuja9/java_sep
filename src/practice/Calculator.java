package practice;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter first number...");
        int num1 = obj.nextInt();

        System.out.println("Enter second number...");
        int num2 = obj.nextInt();

        System.out.println("Welcome to My Calculator :");
        System.out.println("Press 1 for Addition");
        System.out.println("Press 2 for Subtraction");
        System.out.println("Press 3 for Multiplication");
        System.out.println("Press 4 for Division");
        System.out.println("Press 5 for Modulus");
        System.out.println("Or press 0 to exit..");
        System.out.println("Enter your choice..");

        int i = obj.nextInt();

        if(i == 1){
            System.out.println("Sum of two numbers is : "+ (num1 + num2));
        }else if(i ==2){
            System.out.println("Difference of two numbers is : " + (num1 - num2));
        }else if(i ==3){
            System.out.println("Multiplication of two numbers is : " + (num1 * num2));
        }else if(i == 4){
            System.out.println("Division of two numbers is : "+ (num1/num2));
        }else if(i == 5){
            System.out.println("Modulus of two numbers is : "+ (num1%num2));
        }else if(i == 0) {
            System.out.println("Exiting the calculator..");
        }else{
            System.out.println("PLease enter a valid input..");
        }


    }
}
