package Methods;

public class methodOverloading4 {

    static void foo(){
        System.out.println("Good Morning foo!!");
    }
    static void foo(int a){
        System.out.println("Good Morning " + a + " bro!");
    }
    static void foo(int a, int b){
        System.out.println("Good Morning " + a + " bro!!");
        System.out.println("Good Morning " + b + " bro!!");
        //a aur b parameters hai, jinko kuch values milegi, abhi mili nhi hai.

    }
//    static int foo(int a, int b){
//        System.out.println("foo method with int return type.");
//        //yeh error dega ki foo toh phle se hi bnn chuka hai krke.
//    }
static int foo(int a, int b, int c){
    System.out.println("foo method with int return type and three parameters.");
    return 0;
    //yeh error nhi dega.
}
    static void main() {
        foo();
        foo(3000);
        foo(2000,3000);
        //2000, 3000 are the arguments, jo values de di gyi hai.
        //arguments are actual values!
    }
}

//method overloading:
//naam same same kaam alag alag.
//two or more methods can have the same name but different parameters, such methods are called overloaded methods.
//void foo()
//void foo(int a)
//void foo(int a , int b)
//yeh teeno methods same nhi hai, alag alag hai.
//method overloading cannot be performed by changing the return type of methods.

//parameters and arguments are different

