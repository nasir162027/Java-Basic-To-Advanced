package OperatorsIfElseNumberSystem;

import java.util.Scanner;

public class PerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter all 4 sides in cms: ");
        double a=scanner.nextDouble();
        double b=scanner.nextDouble();
        double c=scanner.nextDouble();
        double d=scanner.nextDouble();
        System.out.println("Perimeter of your Rectangle is: "+(a+b+c+d));
    }
}
