package sep28;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args){

//        int x = 0;
//
//        do{
//            System.out.println(x);
//            x++;
//        }while(x<10);

        /*sum of n natural numbers
        100   1, 2, 3......100

        print product of table of 5 or any number
        5 * 1 = 5
        5 * 2 = 10
        5 * 3 = 15


        factorial of 5! = 5 * 4 * 3 * 2 * 1
         */


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number..");
        int num1 = sc.nextInt();
        int sum = 0;
        int y = 0;
        do{
           sum = sum + y;
           y++;
        }while(y <= num1);
        System.out.println("Sum of the numbers are : "+ sum);

    }
}
