package Challenge;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Welcome to Palindrome Number");
        System.out.print("Please enter a number: ");
        findPalindrome(scanner.nextInt());
    }

    private static void findPalindrome( int num){
        int reversalNumber=0;
        int orgianlNumber=num;
        while (num>0){
            reversalNumber=reversalNumber*10+(num%10);
            num=num/10;
        }
        if (orgianlNumber==reversalNumber){
            System.out.println("The Given Number is Palindrome");
        }else {
            System.out.println("The Given Number is not Palindrome");
        }
    }
}
