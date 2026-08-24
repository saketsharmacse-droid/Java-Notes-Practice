package Methods.PracticeSet;

import java.util.Scanner;

//wap for java method to print the multiplication table of a number n.
public class problem1 {

    static void multiplication(int n){
        for(int i = 0; i <= 10; i++){
            System.out.printf("%d X %d = %d\n", n, i, n*i);
        }
    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number whose multiplication table is desired: ");
        int n = sc.nextInt();

        multiplication(n);
    }
}
