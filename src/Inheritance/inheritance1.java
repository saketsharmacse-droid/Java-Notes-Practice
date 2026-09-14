package Inheritance;

class Base{
    int x;
    public void setx(int x){
        System.out.println("This is base class setting the x");
        this.x = x;
    }
    public int getx(){
        return x;
    }
    Base(){
        System.out.println("This is a constructor!");
    }
    public void printMe(){
        System.out.println("This is Base Class!");
    }

}

class Derived extends Base{
    //base class ke nadar ki saari cheezein yaha pe aa jayengi
    //wo access hongi ki nhi this depends on the access modifiers.
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
public class inheritance1 {
    static void main() {
        //creating an object of base class
        Base b = new Base();
        b.setx(6);
        System.out.println(b.getx());

        //creating an object of derived class
        Derived d = new Derived();
        d.setx(7);
        System.out.println(d.getx());
        d.setY(43);
        System.out.println(d.getY());

        //kya base class se y access krr sakte hai jo derived class ka hai?
        //no, we cannot access the derieved class entities from the base class objects
    }
}


//Inheritance
//inheritance is used to borrow properties and methods from an existing class.
//inheritance ensures code reusabl=ility.

//instead of reinventing a wheel, make a vehicle.
//derieved class extends parent class
//subclass extends superclass

//

