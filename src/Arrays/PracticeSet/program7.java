package Arrays.PracticeSet;

import java.util.Scanner;

//WAP to find the minimum element in an array.
public class program7 {
    static void main() {

//        System.out.println(Integer.MIN_VALUE);
//        System.out.println(Integer.MAX_VALUE);
//        //yeh dono se java mei int ki minimum aur maximum values aayengi

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in array: ");
        int n = sc.nextInt();
        System.out.print("Enter the elements in the array: ");
        int [] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int min = Integer.MAX_VALUE;
        for(int elem: arr){
            if(elem < min){
                min = elem;
            }
        }
        System.out.println("The minimum element in this array is: " + min);

    }
}
