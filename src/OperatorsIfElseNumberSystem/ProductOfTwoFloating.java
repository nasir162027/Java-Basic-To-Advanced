package OperatorsIfElseNumberSystem;

import java.util.Scanner;

public class ProductOfTwoFloating {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter First Double Number: ");
        double a= scanner.nextDouble();
        System.out.print("Enter Second Double number: ");
        double b=scanner.nextDouble();

        System.out.println("Product of two number: " +(a*b));
    }
}
