package OperatorsIfElseNumberSystem;

import java.util.Scanner;

public class SimapleInterest {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter Your Principal Amount Taka: ");
        double principal=scanner.nextDouble();


        System.out.print("Tell me your rate of interest: ");
        float rate=scanner.nextFloat();

        System.out.print("Tell me how many years are you borrow:");
        float years=scanner.nextFloat();


        System.out.println("Your Simple interest is : "+(principal*rate*years)/100);

    }
}
