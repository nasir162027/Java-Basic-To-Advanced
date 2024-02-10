package Challenge;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Please enter a number to find sum of digits: ");
        System.out.println("Sum of given digits is: "+getSumOfDigits(scanner.nextInt()));
    }

    private static long getSumOfDigits(long num) {
        long sumOfDigits=0;
        while (num !=0){
            sumOfDigits=sumOfDigits+(num %10);
            num = num /10;
        }
        return sumOfDigits;
    }
}
