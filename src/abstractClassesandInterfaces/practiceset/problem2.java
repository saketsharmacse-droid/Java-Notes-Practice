package abstractClassesandInterfaces.practiceset;

//create a class monkey with jump and bite methods.
//create a class human which inherits this monkey class and implements basicanimal interface with eat and sleep methods.

class monkey{
    void jump(){
        System.out.println("Monkey Jumps!");
    }
    void bite(){
        System.out.println("Monkey Bites!");
    }
}
interface basicAnimal{
    void eat();
    void sleep();
}
class human extends monkey implements basicAnimal{
    void speak(){
        System.out.println("Human Speaks!");
    }
    public void eat(){
        System.out.println("Eating");
    }
    public void sleep(){
        System.out.println("Sleeping!");
    }
}
public class problem2 {
    static void main() {
        human h = new human();
        h.sleep();
        h.eat();

        //polymorphism
        monkey m = new human();
        m.bite();
        m.jump();
//      m.speak(); error dega

        basicAnimal l = new human();
//      l.speak();
        l.eat();
        l.sleep();
    }
}
