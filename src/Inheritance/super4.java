package Inheritance;

class EkClass1 {
    int a;

    public void returnOne(int a) {
        a = a;
        System.out.println(a);
    }

    //constructor
    EkClass1(int x) {
        a = x;

    }

    public int getA() {
        return a;
    }

    public void display(){
        System.out.println("Yeh parent class ka method hai!");
    }

}

class DoClass extends EkClass1{
    //constructor
    DoClass(int c){
        super(c);//super nhi use krenge toh error dega ki parent class mei default constructor nhi hai krke.
        //default constructor mtlab bina argument waala constructor, jo ki invoke automatically ho jata hai.
        System.out.println("Mai DoCLass ka constructor hu!" + c);
    }

    public void display(){
        super.display();
        System.out.println("Yeh child class ka method hai!");

        //position: super jaha pe likhenge, jaise neeche likhenge line 37 ke toh neeche wrna upar.

        //this way super is used to invoke the parent's class methods
        //kyoki yaha pe cgild class has overridden the method of parent, toh automatically run krne se child class ka method run hoga, parent ka nhi.
        //if we want parent's method to execute as well, we shall use super.
    }
}
public class super4 {
    static void main() {
        EkClass1 e = new EkClass1(65);
        DoClass d = new DoClass(55);
        System.out.println(e.getA());

        d.display();

    }
}

//super
//super is a reference variable used to refer to the immediate parent class object
//can be used to refer immediate parent class instance variable.
//can be used to invoke the parent class methods.
//can be used to invoke parent class constructors.
