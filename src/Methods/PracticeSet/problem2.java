package Methods.PracticeSet;

import java.util.Scanner;

//wap to print the star right triangle pattern using methods
public class problem2 {

    static void pattern(int n){
        //n mtlab ki kitne rows renge.
        for(int i = 0; i < n; i++){
            String star = "";
            for(int j = 0; j<i+1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the height of the pattern: ");
        int n = sc.nextInt();

        pattern(n);
    }
}
//
//        Enter the height of the pattern: 8
//        *
//        * *
//        * * *
//        * * * *
//        * * * * *
//        * * * * * *
//        * * * * * * *
//        * * * * * * * *

