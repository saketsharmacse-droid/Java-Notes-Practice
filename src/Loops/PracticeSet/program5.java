package Loops.PracticeSet;

import java.util.Scanner;

//wap to find the factorial of a number using for loop.
public class program5 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        int fact = 1;
        for(int i = 1; i <= n; i++){
            fact = fact * i;
        }
        System.out.println("The factorial of " + n + " is " + fact);
    }
}
