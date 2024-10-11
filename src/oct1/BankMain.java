package oct1;

public class BankMain {
    public static void main(String[] args) {

        Bank bank = new Bank();

        double accBalanace = bank.getBalance();
        double withdrawalBalance = bank.withdraw();
        double depositBalance = bank.deposit();

        System.out.println("User account balance is : " + accBalanace);
        System.out.println("Account balance after withdrawal is : " + withdrawalBalance);
        System.out.println("Account balance after deposit is : " + depositBalance);
    }
}
