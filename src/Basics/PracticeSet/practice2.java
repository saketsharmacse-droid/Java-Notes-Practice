package Basics.PracticeSet;
//calculate the cgpa of three subject marks

import java.util.Scanner;

public class practice2 {
    static void main() {
        System.out.println("Enter the marks :");
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();

        float cgpa = (a + b + c)/30;
        System.out.println("CGPA is :" + cgpa);
    }
}
