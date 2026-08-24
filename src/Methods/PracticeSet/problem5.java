package Methods.PracticeSet;

import java.util.Scanner;

//print fibonacci series upto n.
public class problem5 {
    static int fibonacci(int n){
        //n is number of terms.
//        if(n==0){
//            return 0;
//        }
//        if(n == 1){
//            return 1;
//         }

        if( n==1 || n ==2){
            return n-1;
        }
        else{
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms in the series: ");
        int n = sc.nextInt();

        for(int i = 1; i<=n; i++){
            System.out.print(fibonacci(i) + " ");
        }
    }
}
