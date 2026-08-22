package Conditionals;

import java.util.Scanner;

public class elseif3 {
    static void main() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter your age: ");
        int age = sc.nextInt();
        if(age > 56){
            System.out.println("You are experienced!");
        }
        else if ( age > 46){
            System.out.println("You are semi-experienced!");
        }
        else if(age > 36){
            System.out.println("Your are semi-semi experienced!");
        }
        else{
            System.out.println("You are not experienced!");
        }
    }
}

//if-elseif ladder
