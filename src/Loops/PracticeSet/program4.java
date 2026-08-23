package Loops.PracticeSet;

import java.util.Scanner;

//wap to print the multiplication table of n in reverse order.
public class program4 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        for( int i = 10; i >= 1; i--){
            System.out.printf("%d X %d = %d\n", n,i, i*n);
        }
    }
}

//        Enter the value of n: 4
//        4 X 10 = 40
//        4 X 9 = 36
//        4 X 8 = 32
//        4 X 7 = 28
//        4 X 6 = 24
//        4 X 5 = 20
//        4 X 4 = 16
//        4 X 3 = 12
//        4 X 2 = 8
//        4 X 1 = 4
