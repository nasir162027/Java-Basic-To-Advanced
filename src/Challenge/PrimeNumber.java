package Challenge;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Welcome to check number prime");
        System.out.print("Please enter a number: ");
        if (checkPrime(scanner.nextInt())){
            System.out.println("Number is prime");
        }else {
            System.out.println("Number is not prime!!");
        }
    }

    private static boolean checkPrime(int num){
        for (int i=2;i<=num/2;i++){
            if (num%i==0){
                return false;
            }
        }
        return true;
    }
}
