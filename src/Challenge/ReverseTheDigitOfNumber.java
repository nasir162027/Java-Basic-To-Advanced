package Challenge;

import java.util.Scanner;

public class ReverseTheDigitOfNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Welcome to reverse digit of a number");
        System.out.print("Please enter a number: ");
        System.out.println("Reverse number: "+reverseDigit(scanner.nextInt()));
    }

    public static int reverseDigit(int num){
        int reverse=0;

        while (num>0){
            reverse=reverse*10+(num%10);
            num=num/10;
        }
        return reverse;
    }
}
