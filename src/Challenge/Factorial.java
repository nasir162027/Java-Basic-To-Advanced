package Challenge;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Please enter a number to find factorial: ");

        int num=scanner.nextInt();
        System.out.println("Factorial number of "+num +" is:"+findFactorial(num));
    }

    private static int findFactorial(int num){
        int factorailNum=1;
        while (num>=1){
            factorailNum=factorailNum*num;
            num--;
        }
        return factorailNum;
    }
}
