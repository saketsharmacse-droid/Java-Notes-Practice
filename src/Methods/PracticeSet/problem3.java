package Methods.PracticeSet;

import java.util.Scanner;

//write a recursive function to find the sum of first n natural numbers.
public class problem3 {
    static int sum(int n){
        if(n==0){
            return 0;
        }
        else{
            return n + sum(n-1);
        }
    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number for sum: ");
        int n = sc.nextInt();

        System.out.println("The value of sum of first " + n + " natural numbers is " + sum(n));
    }
}
