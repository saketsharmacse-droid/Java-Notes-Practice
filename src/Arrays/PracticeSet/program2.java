package Arrays.PracticeSet;

import java.util.Scanner;

//wap to find out whether a given integer is present in an array or nor.
public class program2 {
    static void main() {
        System.out.print("Enter the size of array: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int [] arr = new int [n];

        System.out.println("Enter the " + n + " elements of the array: ");

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
//        for(int elem : arr){
//            System.out.println(elem);
//        }

        System.out.println("Enter the number to find: ");
        int num = sc.nextInt();
        boolean isPresent = false;
        //checking if the given number is in the array
        for(int elem: arr){
            if(num == elem){
                //System.out.println("Yes, this element " + num + " is present.");
                //break;
                isPresent = true;
                break;
            }
            else {
                isPresent = false;

            }

        }
        if(isPresent){
            System.out.println("Yes, this element " + num + " is present.");
        }
        else{
            System.out.println("No, this element " + num + " is not present.");
        }
    }
}
