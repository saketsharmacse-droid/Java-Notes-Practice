package Methods;

public class recursion5 {

    static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        else{
            return n * factorial(n-1);
        }
    }
    static int fibonacci(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        else{
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
    static void main() {
        //factorial(n) = n * n-1 * ....1
        //factorial(n) = n * (n-1)!
        System.out.println("The value of factorial n is: " + factorial(4));

        for(int i = 0; i <=5; i++){
            System.out.print(fibonacci(i) + " ");
        }

    }
}

//a function calling itself is called as recursion.
