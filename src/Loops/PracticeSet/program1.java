package Loops.PracticeSet;

//WAP to print the downward right triangle pattern.
public class program1 {
    static void main() {

        for( int i = 5; i >= 1; i--){
            String star = "";
            for(int j = i; j>=1; j--){
//                System.out.println("* ");
                star += "* ";
            }
            System.out.println(star);
        }

//        //Second way:
//        for(int k = 5; k > 0; k--){
//            for(int l = 0; l <= k; l++){
//                System.out.print("* ");
//            }
//            System.out.println("\n");
//        }


    }
}

/*
 * * * * *
 * * * *
 * * *
 * *
 *

 */

