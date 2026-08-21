package Basics.PracticeSet;

import java.util.Scanner;

//take string name input and greet the user

public class practice3 {
    static void main() {
        System.out.println("Enter your Name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Hello, " + name + " ,have a great day ahead...!");
    }
}
