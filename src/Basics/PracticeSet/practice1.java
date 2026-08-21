//program to sum three numbers in java
package Basics.PracticeSet;

import java.util.Scanner;

public class practice1 {
    static void main() {
        System.out.println("Sum of three numbers");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();
        System.out.println("Enter the third number: ");
        int c = sc.nextInt();

        int sum = a + b + c;

        System.out.println("The Sum of " + a + "," + b + "," + c + " is: " + sum);

    }
}
