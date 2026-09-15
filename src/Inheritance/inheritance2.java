package Inheritance;
//we shall learn about the constructors in inheritance.

class Base1{
    public int x;

    Base1(){
        System.out.println("Mai ek constructor hun!");
    }
    Base1(int x){
        System.out.println("I am Base1 class's overloaded constructor with x as: " +x);
    }
}

class Derieved1 extends Base1{
    public int y;

    Derieved1(){
        System.out.println("Mai ek derieved class hu!!");
    }
    Derieved1(int x, int y){
        super(x);
        System.out.println("I am an overloaded constructor of Derieved1 class with value of y as: " +y);
    }
}

class childDerieved1 extends Derieved1{
    public int z;

    childDerieved1(){
        System.out.println("I am a child of Derived1 class!");
    }
    childDerieved1(int x, int y, int z){
        super(x,y);
        System.out.println("I am an overloaded constructor of childDerived1 class with value of z as: " +z);
    }
}
public class inheritance2 {
    static void main() {
        Base1 obj = new Base1();
        Derieved1 dbj = new Derieved1();
        Derieved1 d = new Derieved1(14,9);
        childDerieved1 c = new childDerieved1(4,5,2);
    }
}

//agar maine base class mei constructor bnaya hai, aur derieved class mei nhi bnaya hai.
//toh jab mai derieved class ka object invoke krunga toh base class ka constructor call ho jayega.

//agar derieved class mei bhi ek constructor hai, toh bhi phle base class ka constructor run hoga fir derieved class ka.
//firstly the base class constructor runs, after that the derieved class constructor runs.

//agar overloaded constructors hai, aur humein wo argument waala constructor use krne hai, togh we use super keyword with that value as arguments.
//if hum derieved class ka object bnaye theek, ab yeh kya krega, yeh invoke krega construtors ko.
//yeh object declaration ke time agar hum argumemts pass krr rhe, aur agar aisa koi constructor hai derieved class mei jo leta hai utte arguments , toh wo constructor inmvoke hoyega.
//but, base class ka default waala hi invoke ho jayega, bina parameter waala.
//toh we use super keyword, jo inn arguments ko carry krke upar waale class mei leke jaata hai and bolta hai ki woi waala constructor invoke kriye jisme yeh sab arguments hai/ parameters hai.

//when there are multiple costructors in a parent class, the constructor without any parameter is called from the child class.
//if we want to call the constructor with the parameters from the parent class, we can use the Super keyword.
//super(a,b) --> calls the constructor from the parent class which takes two variables.
//super use krke hum apne mann ka, apne choice ka constructor use krr sakte hai.



