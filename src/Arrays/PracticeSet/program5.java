package Arrays.PracticeSet;

import java.util.Scanner;

//WAP in java to reverse an array
public class program5 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the size of the array: ");
        int n = sc.nextInt();

        System.out.println("Please Enter the Elements of the array: ");
        int [] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int [] rev = new int[n];
        for(int i = 0; i < n; i++){
            rev[i] = arr[n - 1 - i];
        }

        System.out.println("The Array in reverse order is: ");
        for(int elem : rev){
            System.out.print(elem + " ");
        }


        //second method to reverse an array

        for(int i = 0; i < n/2; i++){
            //agar isme <n tak hi loop chlana hai, toh arr[i] = arr[floor(n/2) - 1 - i} krenge.
            int temp = arr[i];
            arr[i] = arr[n-1-i];
            arr[n -1 - i] = temp;
        }

        System.out.println("The Array in reverse order is: ");
        for(int elem : arr){
            System.out.print(elem + " ");
        }
    }
}

//array swap krne ka logic: rev[i] = arr[ n - 1 - i]
