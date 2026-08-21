package Basics;

import java.util.Scanner;

public class PercentageCalculator5 {
    static void main() {
        System.out.println("PERCENTAGE CALCULATOR");

        System.out.println("Please Enter Your Marks out of 100 ");
        Scanner sc = new Scanner(System.in);

        System.out.println("Your marks in English: ");
        int english = sc.nextInt();

        System.out.println("Your marks in Hindi: ");
        int hindi = sc.nextInt();

        System.out.println("Your marks in Maths: ");
        int maths = sc.nextInt();

        System.out.println("Your marks in Science: ");
        int science = sc.nextInt();

        System.out.println("Your marks in Social Science: ");
        int social_science = sc.nextInt();

        System.out.println("Your marks in Sanskrit: ");
        int sanskrit = sc.nextInt();

        float sum = english + hindi + maths + science + social_science + sanskrit;
        float percentage = ((sum)/600)*100;

        System.out.println("Your Total Marks are: " + sum + " and the percentage is: " + percentage);


    }
}
