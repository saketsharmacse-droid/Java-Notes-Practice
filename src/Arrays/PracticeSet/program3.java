package Arrays.PracticeSet;

import java.util.Scanner;

//calculate the average marks of all students in physics using for each loop
public class program3 {
    static void main() {
        System.out.print("Enter the number of students: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.print("Enter the Physics scores of " + n + " students: ");
        float [] marks = new float [n];
        for( int i = 0; i < marks.length ; i++){
            marks[i] = sc.nextFloat();
        }

        float sum = 0.0f;
        for(float elem : marks){
            sum += elem;
        }
        System.out.println("The Average marks of " + n + " students in Physics is: " + sum/n);
    }
}

//for-each loop use krke input nhi le sakte as it has just the copy of the array, not the original array.
