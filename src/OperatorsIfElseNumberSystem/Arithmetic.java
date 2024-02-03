package OperatorsIfElseNumberSystem;

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a=scanner.nextInt();
        System.out.print("Enter second number: ");
        int b=scanner.nextInt();

        System.out.println("Addition of a and b: "+ (a+b));
        System.out.println("subtraction of a and b: "+ (a-b));
        System.out.println("Multiplication of a and b: "+(a*b));
        System.out.println("Division of a and b: "+(a/b));
        System.out.println("Modulus of a and b: "+(a%b));
    }
}
