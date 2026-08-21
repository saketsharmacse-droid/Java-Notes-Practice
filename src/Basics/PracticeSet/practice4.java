package Basics.PracticeSet;

//convert kms to miles

import java.util.Scanner;

public class practice4 {
    static void main() {
        System.out.println("Converting Kilometers to Miles");
        System.out.println("Enter the distance in Kms: ");
        Scanner sc = new Scanner(System.in);
        float km = sc.nextFloat();

        float miles = km * 1.6f;

        System.out.println("The distance " + km + " kms in miles is " + miles);
    }
}
