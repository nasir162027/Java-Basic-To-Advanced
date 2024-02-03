package OperatorsIfElseNumberSystem;

import java.util.Scanner;
import java.util.logging.SocketHandler;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter your base in cms: ");
        double a=scanner.nextDouble();
        System.out.print("Enter your perpendicular height in cms:");
        double b=scanner.nextDouble();

        System.out.println("Area of a Triangle: "+(.5*a*b));
    }
}
