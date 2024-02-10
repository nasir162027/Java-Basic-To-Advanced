package Challenge;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Welcome to GCD");
        System.out.print("Please enter two number to find gcd: ");
        System.out.println("LCM of the two numbers is: "+findGcd(scanner.nextInt(),scanner.nextInt()));
    }

    private static int findGcd(int num1,int num2){

        int gcd=1;
        int smallerNumber=findLeaseNumber(num1,num2);
        for (int i=1;i<=smallerNumber;i++){
            gcd=i;
        }
        return gcd;

    }

    private static int findLeaseNumber(int num1, int num2){
        if (num1<num2){
            return num1;
        }else {
            return num2;
        }
    }
}
