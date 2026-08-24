package Methods.PracticeSet;

import java.util.Scanner;

//print the upward pattern using recursion.
public class problem8 {
    static void patternrec(int n){


        if( n > 0){

            patternrec(n-1);

            for(int i = 1; i <= n; i++){
                System.out.print("* ");
            }
            System.out.println();//newline
        }
    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the height of the pattern: ");
        int n = sc.nextInt();

        patternrec(n);
    }
}
//        Enter the height of the pattern: 5
//        *
//        * *
//        * * *
//        * * * *
//        * * * * *