package Strings.PracticeSet;

import java.util.Locale;
import java.util.Scanner;

//write a java program to convert a string to lower case.
public class Program1 {
    static void main() {
        System.out.println("Please Enter a String in all Upper Case: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        str = str.toLowerCase();
        System.out.println("The String in LowerCase is: " + str);
    }
}
