package Inheritance;

class One{
    public void name(){
        System.out.println("I am java in class One");
    }
    public void greet(){
        System.out.println("Good Morning from One!");
    }
}
class Two extends One{
    public void name(){
        System.out.println("I am java in class Two");
//        super.name();
    }
    public void swaagat(){
        System.out.println("Swaagat hai ji, from Two!");
    }
}
public class dynamicMethodDispatch6 {
    static void main() {
//        One obj = new One();
//        Two obj1 = new Two();
        //yeh jo objects bnti hai wo runtime mei bnti hai.

        One obj3 = new Two();
        //yeh bhi allowed hai.
        //reference: One obj3
        //object: new Two()
        //agar humara reference super class ka hai aur object subclass ka hai, toh yeh allowed hai.

//        Two obj4 = new One(); this is not allowed.
        //super class ka reference subclass ke object ke barabar ho sakta hai
        //subclass ka reference superclass ke object ke barabar nhi ho sakta.

        obj3.greet();

        obj3.name();
        //name has been overridden, toh yeh second waala subclass ka run hoga.
        //object ka run hoga, ayr reference ka method run nhi hoga.
        //yaha pe subclass ka object hai toh isliye subclass ka run hoga.

        //isi ko bolte hai dynamic method dispatch

        //runtime polymorphism
        //new likhne ka mtlab hai ki object ka creation runtime pe hoga.
        //dynamic method dispatch as runtime pe decide hoga ki konsa method run hona hai.


    }
}

//super: meth1, meth2
//sub: meth2(ovrr), meth3

//scenario1: superclass obj = new subclass() //allowed
//           obj.meth2() // 2 is called(method of object)
//           obj.meth3() //not allowed

//scenario2: subclass obj = new superclass() //not allowed
