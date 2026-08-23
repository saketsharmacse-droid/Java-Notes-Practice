package Arrays.PracticeSet;

import java.util.Scanner;

//WAP to find whether an array is sorted or not.
public class program8 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in array: ");
        int n = sc.nextInt();
        System.out.print("Enter the elements in the array: ");
        int [] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        //checking the sorted or not:
        boolean isSorted = true;
        for(int i = 0; i < n-1; i++){ //i < n-1 tak chalaunga loop kyoki i+1 tak check ho rhe.
            if(arr[i] > arr[i+1]){
                isSorted = false;
                break;
            }

        }
        if(isSorted){
            System.out.println("The Array is Sorted.");
        }
        else{
            System.out.println("The Array is not Sorted.");
        }

    }
}
