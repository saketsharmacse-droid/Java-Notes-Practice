package OOPS2.practiceExercises;
//overload a constructor to initialize a rectangle of length 4 and breadth 5 for using custom parameters.

import org.w3c.dom.ls.LSOutput;

class Rectangle{
    private int length;
    private int breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth  = breadth;
    }

    public Rectangle(){
        this.length = 4;
        this.breadth = 5;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }
}
public class program5 {
    static void main() {
        Rectangle r = new Rectangle(45, 67);
//        Rectangle r = new Rectangle();

        System.out.println(r.getBreadth());
        System.out.println(r.getLength());
    }
}
