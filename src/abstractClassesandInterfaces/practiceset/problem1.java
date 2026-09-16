package abstractClassesandInterfaces.practiceset;

//create an abstract pen with write and refill as abstract methods.

abstract class pen{
    abstract void refill();
    abstract void write();
}
class fountainPen extends pen{
    void write(){
        System.out.println("write");
    }
    void refill(){
        System.out.println("refill");
    }
    void changeNib(){
        System.out.println("Change Nib");
    }
}
public class problem1 {
    static void main() {
        fountainPen p = new fountainPen();
        p.changeNib();
        p.refill();
        p.write();
    }
}
