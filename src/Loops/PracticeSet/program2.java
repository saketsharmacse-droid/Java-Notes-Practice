package Loops.PracticeSet;

import java.util.Scanner;

//print the sum of first n even numbers using while loop
public class program2 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();

        int i =0, sum = 0;
        while(i <= n){
            sum = sum + 2*i;
            i++;

        }
        System.out.println("The sum of first " + n + " even numbers is " + sum);
    }
}
