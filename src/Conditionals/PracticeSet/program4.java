package Conditionals.PracticeSet;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

//print numbers corresponding ti the days of the week.
public class program4 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();

        //enhanced switch case:
        switch(day){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Enter between 1 and 7");
        }
    }
}
