package Strings.PracticeSet;

import java.util.Scanner;

//write this: letter = "Dear name thanks a lot"
public class program3 {
    static void main() {
        System.out.print("Enter your Name: ");
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        System.out.println("Letter = \" Dear " + str + " thanks a lot\"");
    }
}
