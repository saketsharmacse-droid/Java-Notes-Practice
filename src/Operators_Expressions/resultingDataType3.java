package Operators_Expressions;

public class resultingDataType3 {
    static void main() {
        //hum yaha pe dekhenge ki operation evaluation ke baad result mei kya data type aayega.

        int a = 45 + 4;
        float b = 6.55f + 6;

        byte x = 5;
        int y = 6;
        short z = 8;
        int a1 = y + z;
        float d = 45.87f + x;

        //increment and decrement operators
        int i = 56;
        System.out.println(i++);//56
        System.out.println(i);//57

        System.out.println(i++);
        System.out.println(i);

        //b = i++ --> first b is assigned to i then i is incremented.(phle use hoga fir assign hoga)
        //c = ++i --> phle i is incremented then is assigned to c. (phle assign hoga fir use hoga)

        //int y = 7;
        //int x = ++y * 8;
        //64

        //characters:
        //char c = 'a';
        //sout(++c) //'b'


    }
}

//Result: c:character, s:short, l:long, b:byte, d:double,f:float, i:int
/*

    b + s : int
    s + i : int
    l + f : float
    i + f : float
    c + i : int
    c + s : int
    l + d : double
    f + d : double

 */