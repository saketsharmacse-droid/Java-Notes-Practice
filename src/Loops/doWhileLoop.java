package Loops;

public class doWhileLoop {
    static void main() {
        int b = 1;
        do {
            System.out.println(b);
            b++;
        } while(b < 5); //yaha pe semicolon rhega

        //phle code execute hoga fir condition check hogi.
    }
}
//do while loop is similar to while loop except it is expected to execute at least once before termination.

//agar loop ke andar nhi jaara hai control, mtlab agar condition false ho gya:
//fit bhi if loop ke andar waale body mei kuch syntax error hai toh nhi run hoga code humara, code tabhi run hoga jab poora sahi rhega.
//loop ka body is not unreachable code, even if condition wrong.