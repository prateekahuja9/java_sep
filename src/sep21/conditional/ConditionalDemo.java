package sep21.conditional;

public class ConditionalDemo {
    public static void main(String[] args){

        int x = 10;
        int y = 23;
        int z = 20;
        int year = 2004;
        int age = 19;

        if(x%2 == 0){
            System.out.println("The number is even");
        } else{
            System.out.println("The number is odd");
        }

        if(y >= 0){
            System.out.println("The number is positive");
        } else{
            System.out.println("The number is negative");
        }

        if(year%4 == 0){
            System.out.println("The year is a leap year");
        } else{
            System.out.println("The year is not a leap year");
        }

        if(age >= 18){
            System.out.println("Eligible to drive");
        } else{
            System.out.println("Not eligible to drive");
        }



        int marks = 87;

        if(marks >= 90){
            System.out.println("Grade is A");
        }else if(marks >=80){
            System.out.println("Grade is B");
        }else if(marks >= 70){
            System.out.println("Grade is C");
        }else if(marks >= 60){
            System.out.println("Grade is D");
        }else{
            System.out.println("The student is fail");
        }


        if(age < 13){
            System.out.println("It's a child");
        }else if(age <=19){
            System.out.println("The person is a teenager");
        }else if(age <=59){
            System.out.println("The person is an adult");
        }else{
            System.out.println("The person is a senior");
        }



        String day = "Wednesday";

        if(day == "Saturday"){
            System.out.println("Price of the ticket is $15");
        }else if(day == "Sunday"){
            System.out.println("Price of the ticket is $12");
        }else{
            System.out.println("Price of the ticket is $10");
        }

        //largest of 3 numbers
        if(x > y && x > z){
            System.out.println("x is greater...");
        }else if(y > x && y > z){
            System.out.println("y is greater...");
        }else{
            System.out.println("z is greater...");
        }
    }
}
