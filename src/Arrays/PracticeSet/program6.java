package Arrays.PracticeSet;

import java.util.Scanner;

//wap to find the maximum element in an array.
public class program6 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in array: ");
        int n = sc.nextInt();
        System.out.print("Enter the elements in the array: ");
        int [] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE; //this will work fine for negative integers as well.
//        for(int i = 0; i < n; i++){
//            if(arr[i] > max){
//                max = arr[i];
//            }
//        }
        for(int elem: arr){
            if( elem > max){
                max = elem;
            }
        }
        System.out.println("The maximum element in this array is: " + max);

    }
}
