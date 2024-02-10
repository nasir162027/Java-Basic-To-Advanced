package Challenge;

import java.util.Map;
import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Welcome to armstrong");
        System.out.print("Please enter a number: ");
        System.out.println(findArmstrong( scanner.nextInt()));
    }

    private static String findArmstrong(int num){
        int orgianlNumber=num;
        int armstrong=0;
        int digits=numberOfDigits(num);

        while (num>0){
            armstrong= (int) (armstrong+Math.pow((num%10),digits));
            num=num/10;

        }
        if (orgianlNumber==armstrong){
          return  "The given number is Armstrong !!";
        }
        else {
           return "The given number is not Armstrong !!";
        }
    }

    public static int numberOfDigits(int num){
        int digits=0;
        while (num>0){
            digits++;
            num=num/10;
        }
        return digits;
    }
}
