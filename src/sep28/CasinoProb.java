package sep28;

import java.util.Scanner;

public class CasinoProb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int luckyNumber = 22;
        int attempts =1;
        System.out.println("Please enter your lucky number..");

        do {
            int custLuckyNumber = sc.nextInt();
                if (custLuckyNumber == luckyNumber) {
                    System.out.println("Congratulations, You won the jackpot!!!!");
                    break;
                } else {
                    System.out.println("Sorry you didn't win, Please try again");
                }
                attempts++;
        }while(attempts <=3);
    }
}
