package sep24;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {

        int x = 1;
//        while(x<= 10){
//            System.out.println(x);
//            x++;
//        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number until which you want to print : ");
        int n = sc.nextInt();
//        while(x<= n){
//            System.out.println(x);
//            x++;
//        }

        int sum = 0;
        while(x<= n){
            sum += x;
            x++;
        }
        System.out.println("Sum of the numbers is :" + sum);
    }
}
