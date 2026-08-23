package Loops.PracticeSet;

import java.util.Scanner;

//wap to print the multiplication table of a number n.
public class program3 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        for( int i = 1; i <= 10; i++){
            System.out.printf("%d X %d = %d\n", n,i, i*n);
        }
    }
}

//        Enter the value of n: 18
//        18 X 1 = 18
//        18 X 2 = 36
//        18 X 3 = 54
//        18 X 4 = 72
//        18 X 5 = 90
//        18 X 6 = 108
//        18 X 7 = 126
//        18 X 8 = 144
//        18 X 9 = 162
//        18 X 10 = 180