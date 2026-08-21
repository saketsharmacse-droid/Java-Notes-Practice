package Basics;
import java.util.Scanner; //humein scanner slass import krna padega.

public class Input4 {
    static void main() {
        System.out.println("Taking input from the user");

        Scanner sc = new Scanner(System.in); //new use krke hum new object bna rhe hai
        //System.in is used to take the keyboard inputs

        System.out.println("Enter your inputs: ");
//        int num1 = sc.nextInt();
//        int num2 = sc.nextInt();
//        int sum = num1 + num2;
//        System.out.println("The sum is: " + sum);

        //nextInt() tells us ki jo agla input rhega wo integer rhega

//        float num3 = sc.nextFloat();
//        float num5 = sc.nextFloat();
//        float sum = num3 + num5;
//        System.out.println("The sum is: " + sum);

        //there is a method called hasNextInt() which checks that the input is int or not.

//        boolean b1 = sc.hasNextInt();
//        System.out.println(b1); //true or false based on input

//        String str = sc.next();
        //yeh sirf ek word read krega, blank spaces dekh ke usse aaghe ka read nhi krega.

        String str1 = sc.nextLine();
        //this will read the entire sentence.
        System.out.println(str1);



    }
}

//NOTES:

//in order to read the data from keyboard, java has a scanner class.
//scanner class has lots of methods to read the data from the keyboard.
// Scanner s = new Scanner(System.in)