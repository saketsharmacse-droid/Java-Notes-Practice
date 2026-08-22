package Conditionals;
import java.util.Scanner;

public class ifElse1 {
    static void main() {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        if(age > 18){
            System.out.println("Yes, you can drive legally!");
        }
        else{
            System.out.println("No, you cannot drive legally!");
        }

        //checking ke liye various conditionals are used:
        // ==, !=, >, <, >=, <=
    }
}
