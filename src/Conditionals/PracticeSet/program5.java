package Conditionals.PracticeSet;

import java.util.Scanner;

//find whether a year entered is a leap year or not
public class program5 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = sc.nextInt();

        if( year%400 == 0 || (year%4 == 0 && year%100 != 0)){
            System.out.println("Entered year is a leap year");
        }
        else{
            System.out.println("Entered year is not a leap year");
        }


    }
}
