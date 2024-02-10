package Challenge;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.print("Please enter a number for Multiplication Table: ");
        int num=scanner.nextInt();
        int i=1;
        while (i<=10){
            System.out.println(num+"X"+i +" = "+(num*i));
            i++;
        }
    }
}
