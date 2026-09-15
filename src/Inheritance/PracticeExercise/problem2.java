package Inheritance.PracticeExercise;

//create a class cylinder and use inheritance to create another class cylinder from it.

class Circle{
    public int radius;

    Circle(int r){
        System.out.println("I am Circle's parameterized constructor!");
        this.radius = r;
    }

    public double area(){
        return this.radius*this.radius*Math.PI;
    }

}
class Cylinder extends Circle{
    public int height;
    Cylinder(int r, int h){
        super(r);
        System.out.println("I am Cylinder's parameterized constructor!");
        this.height = h;
    }
    public double surfacearea(){
        return Math.PI*this.radius*this.radius*this.height;
    }
}
public class problem2 {
    static void main() {
        Circle c = new Circle(4);
        c.area();
        Cylinder cy = new Cylinder(6,14);
        System.out.println(cy.surfacearea());
    }
}
