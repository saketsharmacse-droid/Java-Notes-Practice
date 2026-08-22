package Conditionals.PracticeSet;
import java.util.Scanner;

//clculate the income tax slab based on income
public class program3 {
    static void main() {
        System.out.print("Enter your annual income in Rs: ");
        Scanner sc = new Scanner(System.in);
        float tax = 0f;

        int income = sc.nextInt();
        if(income <= 250000){
            System.out.println("No Tax on you");
        }
        else if(income <= 500000){
            tax = 0.05f * income;
            System.out.println("Your Tax is: " + tax);
        }
        else if(income <= 1200000){
            tax = 01f * income;
            System.out.println("Your Tax is: " + tax);
        }
        else {
            tax = 0.15f *income;
            System.out.println("Your Tax is: " + tax);
        }
    }
}
//this is not a progressive tax system, wrna previous slab se minus krenge.
