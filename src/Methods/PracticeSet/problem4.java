package Methods.PracticeSet;

import java.util.Scanner;

//write a function to print downward right triangle star pattern.
public class problem4 {

    static void star(int n){
        for(int i = n; i >=1; i--){
            for(int j = 0; j < i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows in pattern: ");
        int n = sc.nextInt();

        star(n);
    }
}

//        Enter the number of rows in pattern: 5
//        * * * * *
//        * * * *
//        * * *
//        * *
//        *
