package Methods;

public class methods1 {

    static int logic(int x, int y){
        int z;
        if(x>y){
            z = x + y;
        }
        else{
            z = (x+y) * 5;
        }
//        System.out.println(z);
        return z;
    }

    static void main() {

//        int a = 5;
//        int b = 7;
//        int c = a + b * 5;
//        System.out.println(c);
//
//        int a = 5;
//        int b = 7;
//        int c = a + b * 5;
//        System.out.println(c);

//        int a = 5;
//        int b = 7;
//        int c;
//        if(a > b){
//            c = a + b;
//        }else{
//            c = (a+b) * 5;
//        }
//        System.out.println(c);
//
//        int a1 = 5;
//        int b1 = 7;
//        int c1;
//        if(a1 > b1){
//            c1 = a1 + b1;
//        }else{
//            c1 = (a1+b1) * 5;
//        }
//        System.out.println(c1);

        //if humein same logic bar baar apply krna pad rha, like same cheez ko multiple variables ke liye use krr rhe, toh we can use methods.
        int a = 5;
        int b = 7;
        int c = logic(a, b);
        System.out.println(c);

        int c1 = logic(15,23);
        System.out.println(c);

        //static method se static method hi call krr sakte hai apan.
        //non-static method cannot be referenced from a static method.
        //humein static lagana hi padega in that method, as the main method is static.

        //agar main method ke andar koi dusra waala  method call krr rhe , wo bhi bina object bnaye, toh apan static method hi call krr sakte hai.


    }
}

//methods are like functions.
//we have to follow the DRY principle: do not repeat yourself.
//toh hum main function ke bahar ek dusra function bna ke uske andar logic likhenge.

//generally people use function and methods as two same terms.
//lekin method is actually a function that reside inside a class.
//java is purely oop language, toh isme har cheez class ke andar hi aayegi, so we have to use methods only, not functions.

//Syntax of a method:
//Method is a function written inside a class
//datatype name () {
// ...method body
// }
//we pass parameters onto the methods arguent.



