package Methods;

//varArgs is variable arguments.
public class varArgs5 {

    static int sum(int a, int b){
        return a+b;
    }
    static int sum(int a, int b, int c){
        return a+b+c;
    }
    static int sum(int a, int b, int c, int d){
        return a+b+c+d;
    }

    static int sum1(int ...arr){
        //mujhe jitne bhi integer arguments milenge sab ko ek array mei bundle krr dunga arr array mei.
        //array mei pack krke de diya jayega.
        //available as an integer array: int [] arr;
        int sum = 0;
        for(int a : arr){
            sum += a;
        }
        return sum;
    }

    //agar humein compulsarily ek argument chahiye hi chahiye:
    static int sum2(int x, int ...array){
        int sum = 0;
        for(int a : array){
            sum += a;
        }
        return sum;
    }
    static void main() {
        System.out.println("Welcome to India!");
        System.out.println("The sum of 4 and 5 is: "+ sum(4,5)); //this will work fine
        System.out.println("The sum of 2, 3 and 4 is: " + sum(2,3,4));
        System.out.println("The sum of 2,3,4 and 5 is: " + sum(2,3,4,5));
        //aise kab tak overloading krte rhenge, so we use varargs.

        System.out.println("The varargs sum is: " + sum1(4,5)); //4,5 array ke form mei bheja gya.
        System.out.println("sum of no numbers is: " + sum1()); //0 aayega, as arr empty rhega
        //iss way mei any number of arguments pass krr sakte hai.

    }
}

//a function accepting variable arguments can be represented as:
//static int foo(int ...arr)
//we can also create lke: static void bar(int a, int ...arr): min ek parameter dena hi padega.

//default access modifier is public.


