package Strings;

import java.util.Scanner;

//string ek class hoti hai java ke andar
public class string1 {
    static void main() {

        //string is instantiated as:
        String name;
        name = new String("Saket Sharma");

        //string is a class nut can be used as a data type:
        String name1 = "Saket Sharma";

        //another way to print:
        int a = 10;
        float b = 45.65674f;
        System.out.printf("The value of a is %d and b is %f \n", a, b);
        //%d and %f are the format specifiers.

        System.out.printf("The value of a is %d and b is %.2f ", a, b);
        //.2f krne se decimal ke baad sirf 2 digits print krega yeh.
        //%8.2f krne se yeh 8 spaces lega including the characteristics and mantisa.

        System.out.format("The value of a is %d and b is %f \n", a, b);
        //format works exactly the same way as printf.

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str1 = sc.next();//yeh sirf ek word read krega.
        System.out.println(str);
    }

}

//sequence of characters is called strings
//string is a class inside java
//string koi primitive data type nhi hoti hai, but java specially allows us to use string as a primitive data type, kyoki bahut zyada use hoti hai, toh novel data type jaise use krr sakte hai isko.

//Strings are immutable and cannot be changed.
//agar kuch change krna hai, toh same string change nhi krr sakte , uske copy bna ke bhle krrlo, but memory mei jaha pe original string hai wo change nhi krr sakte.

//Format Specifiers:
// %d: for integers
// %f: for floats
// %c: for characters
// %s: for strings

//print krne ke tareeke:
//System.out.print()
//System.out.printf()
//System.out.println()
//System.out.format()


