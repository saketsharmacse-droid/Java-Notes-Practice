package Basics.PracticeSet;
//to detect the user has entered an integer or not

import java.util.Scanner;

public class practice5 {
    static void main() {
        System.out.println("Please enter the number/any field:");
        Scanner sc = new Scanner(System.in);

        boolean b = sc.hasNextInt();
        System.out.println("The Entered number is an integer: " + b);
    }
}
