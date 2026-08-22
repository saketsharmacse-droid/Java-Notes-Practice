package Strings.PracticeSet;

import java.util.Scanner;

//write a program to replace spaces with underscores.
public class program2 {
    static void main() {
        System.out.println("Please enter a string with spaces: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        str = str.replace("", "_");
        //iska str ka reference new string pe chle jayega but th old memory location will stay intact, kyoki immutable.
        System.out.println(str);
    }
}
