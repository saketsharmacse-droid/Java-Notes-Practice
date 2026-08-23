package Loops.PracticeSet;

import java.util.Scanner;

//repeat 5 using while loop.
public class program6 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        int i = 1;
        while(i <= n){
            System.out.println(5);
            i++;
        }
    }
}
