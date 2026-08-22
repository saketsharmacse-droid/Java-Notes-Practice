package Strings.PracticeSet;

import java.util.Scanner;

//write a program to detect double and triple spaces in a string
public class program4 {
    static void main() {
        System.out.print("Please Enter a String: ");
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        System.out.println(str.indexOf("  ")); //double space
        System.out.println(str.indexOf("   "));//triple space

    }
}
