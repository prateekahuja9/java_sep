package sep28;

import java.util.Scanner;

public class TableProblem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number...");
        int num1 = sc.nextInt();
        int num2 = 1;
        int res;
        do{
            res = num1 * num2;
            System.out.println( num1 + " * " + num2 + " = " + res );
            num2++;
        }while(num2 <= 10);
    }
}
