package Challenge;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Welcome to LCM");
        System.out.println("Please enter your number: ");
        System.out.println(" LCM of the two numbers is: "+lcm(scanner.nextInt(),scanner.nextInt()));
    }

    private static int lcm(int num1, int num2){
        int i=1;
        while (true){
            int factor=num1*i;
            if (factor%num2==0){
                return factor;
            }
            i++;
        }
    }
}
