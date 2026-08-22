package Conditionals;

import java.util.Scanner;

public class logicalOperators2 {
    static void main() {

        //AND operator
        System.out.print("Enter two boolean values for AND operation: ");
        Scanner sc = new Scanner(System.in);
        boolean a = sc.nextBoolean();
        boolean b = sc.nextBoolean();

        if ( a && b){
            System.out.println("Y");
        }
        else{
            System.out.println("N");
        }

        //OR operator
        System.out.print("Enter two boolean values for OR operation: ");
        Scanner sc1 = new Scanner(System.in);
        boolean a1 = sc.nextBoolean();
        boolean b1 = sc.nextBoolean();

        if ( a1 || b1){
            System.out.println("Y");
        }
        else{
            System.out.println("N");
        }

        //NOT operator
        System.out.print("Enter a boolean value for NOT operation: ");
        Scanner sc2 = new Scanner(System.in);
        boolean a2 = sc.nextBoolean();

        System.out.println(!a2);

    }
}

//logical operators:
// && || !
