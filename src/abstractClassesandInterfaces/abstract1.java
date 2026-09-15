package abstractClassesandInterfaces;

abstract class base{
    public base(){
        System.out.println("Mai Base ka constructor hu!");
    }
    public void sayHello(){
        System.out.println("Hello ji!!");
    }
    abstract public void greet();
    //iske derieved classes apne hisab se override krke iss method ko apne hisab se use krr sakte hai.
}
class derieved1 extends base{
    //we have to either declare this class as abstract or define the method greet.
    public void greet(){
        System.out.println("Hello ji from derieved1");
    }
}
abstract class derieved2 extends base{
    //yaa toh method ko override krrlo, yaa iss class ko abstract krr lo.
    public void th(){
        System.out.println("I am good boy!");

        //abstract class ek aisi class hai jiski sahayata leke aur class bnengi.
        //it is a standard class jiski help se hum aaghe ke methods implement krr sakte hai.
        //a class can have any number of abstract methods.
        //abstrct class ka object nhi bnn sakta.
        //class Base is a way for derieved to help him create a concrete class.
        //iska, iss standard ka use krke ek aur class bna lo jo actual mei exist krti hai.
        //hum ek abstract class ko use krke aur bhi abstraxt classes bna sakte hai ya ek normal class bna sakte hai that defines all its methods.
        //jab tak saare abstract methods ko implement nhi krte tab tal ek concrete class nhi bnegi.
        //jab tak concrete class nhi bnegi tab tak uska object nhi bnega.
    }
}
public class abstract1 {
    static void main() {

    }
}

//in english, abstract means existing in thought, or as an idea without concrete evidence.

//abstract method: a method that is declared without an implementation.
//abstract void moveTo(double x, double y)
//function has not been defined.

//abstract class: ek aisi class jisme abstract method ho.
//ek abstract method poori class ko abstract bna deta hai.
//if a class includes abstract methods, then the class itself myst be declared abstract.

//important:
//it is possible to create reference of an abstract class
//it is not possible to create an object of an abstract class
//toh fir ska reference = derieved class ka object, aise krke we can create and use its reference.



