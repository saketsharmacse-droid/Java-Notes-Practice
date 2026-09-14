package OOPS2.practiceExercises;
//overload a constructor to initialize a rectangle of length 4 and breadth 5 for using custom parameters.

import org.w3c.dom.ls.LSOutput;

class Sphere{
    private int radius;

    public Sphere(int radius) {
        this.radius = radius;

    }

    public Sphere(){
        this.radius = 4;

    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double surfaceArea(){
        return 4*Math.PI*radius*radius;
    }

    public double volume(){
        return (4/3)*Math.PI*radius*radius*radius;
    }


}
public class program6 {
    static void main() {
        Sphere r = new Sphere(45);
//        Sphere r = new Sphere();

        System.out.println(r.getRadius());
        System.out.println(r.surfaceArea());
        System.out.println(r.volume());
    }
}
