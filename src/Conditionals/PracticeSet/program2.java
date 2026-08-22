package Conditionals.PracticeSet;

//a student is passed if average is above 40 abd each subject is above 33.
import java.sql.SQLOutput;
import java.util.Scanner;

public class program2 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Mathematics marks: ");
        int m = sc.nextInt();

        System.out.println("Enter Physics marks: ");
        int p = sc.nextInt();

        System.out.println("Enter Chemistry marks: ");
        int c = sc.nextInt();

        float avg = (m + p + c)/3.0f;
        if( avg >= 40 && m>= 33 && p>=33 && c>=33){
            System.out.println("Congratulations, you have been promoted!");
        }
        else{
            System.out.println("You have failed!");
        }
    }
}
