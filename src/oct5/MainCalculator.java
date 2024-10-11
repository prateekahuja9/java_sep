package oct5;

import java.util.Scanner;

public class MainCalculator {
    public static void main(String[] args) {

        //Calculator calculator = new Calculator();
        Addition addition = new Addition();
        Subtraction subtraction = new Subtraction();
        Multiplication multiply = new Multiplication();
        Division division = new Division();

        Scanner obj = new Scanner(System.in);
        char choice;

        do {
            System.out.println("***** Welcome to My Calculator *****");
            System.out.println("Press 1 for Addition");
            System.out.println("Press 2 for Subtraction");
            System.out.println("Press 3 for Multiplication");
            System.out.println("Press 4 for Division");
            System.out.println("Enter your choice..");

            int i = obj.nextInt();
            System.out.println("Enter first number...");
            int num1 = obj.nextInt();

            System.out.println("Enter second number...");
            int num2 = obj.nextInt();

            if(i == 1){
                System.out.println("Sum of two numbers is : "+ addition.sum(num1, num2));
            }else if(i ==2){
                System.out.println("Difference of two numbers is : " + subtraction.subtraction(num1, num2));
            }else if(i ==3){
                System.out.println("Multiplication of two numbers is : " + multiply.multiplication(num1, num2));
            }else if(i == 4){
                System.out.println("Division of two numbers is : "+ division.division(num1, num2));
            } else{
                System.out.println("PLease enter a valid input..");
            }

            System.out.println("To exit the calculator press 'Y' or press 'N' to continue the operation...");
            choice = obj.next().charAt(0);
            if(choice == 'n' || choice == 'N' || choice == 'y' || choice == 'Y'){

            }else {
                System.out.println("Please enter a valid input...");
            }
        }while(choice == 'n' || choice == 'N');
    }
}
