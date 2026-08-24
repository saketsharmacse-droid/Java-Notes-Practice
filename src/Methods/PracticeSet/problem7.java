package Methods.PracticeSet;

import java.util.Scanner;

//print the downward star pattern using recursion
public class problem7 {

    static void patternrec(int n){

        if( n > 0){
            for(int i = 1; i <= n; i++){
                System.out.print("* ");
            }
            System.out.println();//newline
            patternrec(n-1);
        }
    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the height of the pattern: ");
        int n = sc.nextInt();

        patternrec(n);
    }
}
//        Enter the height of the pattern: 8
//        * * * * * * * *
//        * * * * * * *
//        * * * * * *
//        * * * * *
//        * * * *
//        * * *
//        * *
//        *
