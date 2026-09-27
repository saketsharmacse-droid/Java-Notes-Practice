package Packages;

class c1{
    public int x = 5;
    protected int y = 45;
    int z = 6;
    private int a = 34;

    public void meth1(){
        System.out.println("Hello from meth1");
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
    }

    //same class ke andar chaaro access modifiers use krr sakte hai without any issue.
}

    public class accessModifiers {
    static void main() {
        System.out.println("Access Modifiers!");
        c1 obj = new c1();
        obj.meth1();
    }
}
//output:
//Access Modifiers!
//Hello from meth1
//        5
//        45
//        6
//        34

//access modifiers determine whether other classes can use a particular field or invoke a particular method.
//they can be public, private, protected or default.

//same class ke andar public private, protected, default sab use krr sakte hai.
//modifier       class      package     subclass    world
//Public            Y           Y           Y         Y
//Protected         Y           Y           Y         N
//Default           Y           Y           N         N       (default --> no modifier)
//Private           Y           N           N         N

//subclass: dusre package ke class se inherit krna
//same package ke different files bhi saare access modifiers acccess krr sakte hai, but not in the private mode.




