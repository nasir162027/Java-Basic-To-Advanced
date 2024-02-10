package Challenge;

import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner( System.in);
        System.out.println("Welcome to Fibonacci");
        System.out.print("Please enter a range to find fibonacci: ");
        findFibonacci(scanner.nextInt());

    }

    private static void findFibonacci(int num){
        int num1=0;
        int num2=1;

        System.out.print(" Fibonacci Series of given number are:  "+num1+" "+num2);
        int i=2;

        while (num2<=num){
            num2=num1+num2;
            num1=num2-num1;
            if (num2<num) {
                System.out.print( " " + num2 );
            }
        }

    }
}
