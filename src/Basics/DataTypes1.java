package Basics;

public class DataTypes1 {

    static void main() {

        System.out.println("The sum of these numbers is: ");
        int num1 = 6;
        int num2 = 5;
        int num3 = 7;
        int sum = num1 + num2 + num3;
        System.out.print(sum);
    }
}

//NOTES:

//two types of data types are there in java:
//primitive data types(intrinsic)
//non-primitive data types(derived)

//java is a statically typed language , mtlab humein phle se data types btana padega, unlike python.

//there are eight 8 primitive data types supported by java:

//byte --> value ranges from -128 to 127
//takes i byte (1 byte mei 8 bits hote hai)
//-2^7 to 2^8 bits (-1 kyoki ek value 0 ki rhti hai toh)
//default value is 0

//short --> value ranges from -(2^16)/2 to (2^16)/2 -1
//takes 2 bytes.
//default value is 0

//int --> value ranges from -(2^32)/2 to (2^32)/2 -1
//takes 4 bytes
//default value is 0

//float --> value ranges from
//takes 4 bytes
//default value is 0.0f

//long --> value ranges from -(2^64)/2 to (2^64)/2-1
//takes 8 bytes
//default value is 0

//double --> value ranges from
//takes 8 bytes
//default value is 0.0d

//char --> value ranges from 0 to 65535 (2^16 - 1)
//takes 2 bytes : because it supports unicode
//default value is '\0 0000'

//boolean --> value can be true or false
//size depends on JVM
//default value is false.

//Primitive Data Types:
//Integral: byte short int long
//floats(decimal): float double
//Char
//Boolean