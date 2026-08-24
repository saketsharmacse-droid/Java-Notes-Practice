package Methods.PracticeSet;

import java.util.Scanner;

//wap to find the average of set of numbers passed as arguments.
public class problem6 {

    //varargs se solve hoga
    static int average(int ...arr){
        int sum = 0;
        for(int elem: arr){
            sum += elem;
        }
        return sum/arr.length;
    }
    static void main() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();

        int[] numbers = new int[n];

        System.out.println("Enter the numbers:");

        for(int i = 0; i < n; i++){
            numbers[i] = sc.nextInt();
        }

        System.out.println("Average = " + average(numbers));
    }
}
