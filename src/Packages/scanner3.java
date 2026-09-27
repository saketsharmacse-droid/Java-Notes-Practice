package Packages;

//import java.util.Scanner; //yeh ek tareeks hai scanner ko use krne ka

//lekin there is one more way to use scanner
//hum java util ki saari packages ko le aayenge phle
//import java.util.*;
//iska mtlab hai i java.util ke andar jitni bhi classes hai sab chahiye mujhe

//ek aur tareeks hai ki: mai directly scanner ki jagah java.util.scanner use krr sakta hu.

public class scanner3 {
    static void main() {
//        Scanner sc = new Scanner(System.in);

        java.util.Scanner sc = new java.util.Scanner(System.in); //aisa likhne se import krne ki need nhi scanner ko
        //isme hum kya krr rhe: hum scanner ka pta bta rhe.

        int a = sc.nextInt();
        System.out.println("My Scanner is taking " + a + " as input!");

    }


}

//hum yaha pe java util package ko import krke use krr rhe hai.

//import java.lang.* --> imports everything from java.lang
//import java.lang.String --> imports String from java.lang
//S = new java.lang.String("Saket") --> use without importing
