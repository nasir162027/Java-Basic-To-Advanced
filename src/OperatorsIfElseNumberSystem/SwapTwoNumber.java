package OperatorsIfElseNumberSystem;

import java.util.Scanner;

public class SwapTwoNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Welcome to Swapping Station");
        System.out.print("Enter Number of A: ");
        int a=scanner.nextInt();
        System.out.print("Enter Number of B: ");
        int b=scanner.nextInt();
        int c=a;
        a=b;
        b=c;
        System.out.println("Swapping done.......");

        System.out.println("Value of A is: "+a);
        System.out.println("Value of B is: "+b);
    }
}
