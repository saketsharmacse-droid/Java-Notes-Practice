package Inheritance;


class A{
    public int Saket(){
        return 4;
    }
    public void meth(){
        System.out.println("I am a method of class A!");
    }
}
class B extends A{
    public void meth1(){
        System.out.println("I am a method of class B!");
    }
    @override //its is word that shows us we have overridden.
    //yeh override notation nhi likhenge toh nhi koi problem nhi aayega.
    //but we should write this annotation as yeh error deta hai agar hum upar kuch change krenge toh, toh humein pta chlega ki actual mei override hora hai ki nhi hora.
    //suppose kuch changes kiye, and override nhi hora ab, fir bhi humein lag rha ki override hora hai krke, toh this annotation will tell us ki nhi hora krke.
    public void meth(){
        System.out.println("I am meth of class B!");
        super.meth();
    }
}
public class methodOverriding5 {
    static void main() {
        A a = new A();
        a.meth();
        B b = new B();
        b.meth1();
        b.meth();


    }
}

//if a child class implements the same method present in the parent class again, then it is known as method ovrriding.
//redefining method of superclass in subclass is overriding.
//when an object of subclass is created and the overrided method is called, the method which has been implemented in the subclass is called and its code is executed.
//isliye hum super keyword use krke super.meth() krke parent class ka bhi use krr sakte hai.

//overriding krte time, subclass mei uska access ko change nhi krr sakte, error dega.
//hum static method ko override nhi krr sakte hai.
//final method ko override nhi krr sakte hai.
