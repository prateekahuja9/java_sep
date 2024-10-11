package oct1;

public class Bank {

    double accNumber;
    String firstName;
    String lastName;
    String userName;
    double balance;

    public double getBalance(){
        balance = 1000 + 2700;
        return balance;
    }

    public double withdraw(){
        balance = 3700 - 288;
        return balance;
    }

    public double deposit(){
        balance = 3700 + 2880;
        return balance;
    }

}
