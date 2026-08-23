package Loops.PracticeSet;

import java.util.Scanner;

//wap to find the sum of numbers occurring in the multiplication table of 8.
public class program7 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        int sum = 0;
        for( int i = 1; i <= 10; i++){
            System.out.printf("%d X %d = %d\n", n,i, i*n);
            sum += i*n;
        }

        System.out.println("The sum of all the multiples of " + n + " upto 10 ia " + sum);
    }
}
