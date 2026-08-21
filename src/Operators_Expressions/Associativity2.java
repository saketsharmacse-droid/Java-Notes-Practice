package Operators_Expressions;
//we'll see the associativity and precedance

public class Associativity2 {
    static void main() {
        
        //Precedance & Associativity
        
        int a = 6*5-34/2;
        /* 
        Heighest precedance goes to * and /, they are then evaluated on the basis of left to right associativity.
        =30-17
        =13
         */
        
        int b = 60/5-34*2;
        /*
        =12-68
        =-56
         */
        
        //quick quiz:
        int x = 0,y = 3;
        int k = (x - y)/2;
        int c = 6;
        int l = (b*b - 4*a*c)/2*a;
        
    }
}

//expression evaluation mei bodmas nhi, precedance and associativity chlti hai.
//* and / have left to right associativity and equal precedance.

// a = b = c = 10 : yeh right to left associate hoga.

//associativity:
// * / --> L to R
// + - --> L to R
// ++, = --> R to L

