package Conditionals;

import java.util.Scanner;

public class switchCase4 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        switch (age) {
            case 18:
                System.out.println("You are going to become an adult!");
                break;
            case 23:
                System.out.println("You are going to join an job!");
                break;
            case 60:
                System.out.println("You are going to get retired!");
            default:
                System.out.println("Enjoy Your life!");
        }
        System.out.println("Thanks for using my java code");




        String var = "Suyash";

        switch (var) {
            case "Shubham":
                System.out.println("You are going to become an adult!");
                break;
            case "Saket":
                System.out.println("You are going to join an job!");
                break;
            case "Suyash":
                System.out.println("You are going to get retired!");
            default:
                System.out.println("Enjoy Your life!");
        }

        //enhanced switch
        //isme break ki need nhi
//        switch (var) {
//            case "Shubham"--> System.out.println("You are going to become an adult!");
//            case "Saket"--> System.out.println("You are going to join an job!");
//            case "Suyash"--> System.out.println("You are going to get retired!");
//            default--> System.out.println("Enjoy Your life!");
//        }
//


    }
}
