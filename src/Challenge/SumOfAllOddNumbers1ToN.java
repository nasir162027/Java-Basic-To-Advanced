package Challenge;

import java.util.Scanner;

public class SumOfAllOddNumbers1ToN {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a Number to sum of odd number: ");
        int num=scanner.nextInt();
        int sumOfOdd=0;
        int i=1;
            while (i<=num){
                sumOfOdd=sumOfOdd+i;
                i=i+2;
            }
        System.out.println("Sum of Odd number is : "+sumOfOdd);
    }
}
