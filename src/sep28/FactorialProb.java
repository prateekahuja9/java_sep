package sep28;

import java.util.Scanner;

public class FactorialProb {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number..");
        int num1 = sc.nextInt();
        int result = 1;
        do{
            result = num1 * result;
            num1--;
        }while(num1 >=1);
        System.out.println("Factorial of the number is : " + result);
    }
}
