package Operators_Expressions;

public class Operators1 {
    static void main() {
        int a = 4;
        int b = 10 + a;
        System.out.println(b); // 14

        int c = 5;
        int d = 5 * 8;
        System.out.println(d); //40

        //Arithmetic operators cannot work with boolean.
        // % can work on floats and doubles.

        int e = 9;
        e += 3; //e = e + 3

        System.out.println( 63 > 5 || 67 < 8);
        System.out.println(43 > 8 && 44 != 0);


        System.out.println(34 < 78);

        System.out.println(11 & 10); //10

        System.out.println( 4.4 % 5.1); //returns decimal remainder always.

    }
}

//arithmetic operators --> + , - , * , / , % , ++, --
//assignment operators --> = , +=
//logical operators --> &&, ||, !
//bitwise operators --> & , |
//comparison operators --> ==, >=, <=
