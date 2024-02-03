package OperatorsIfElseNumberSystem;

import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter Your Temp to Fahrenheit: ");
        float fah=scanner.nextFloat();

        System.out.println("Your temp Celsius: "+(fah-32)*5/9);
    }
}
