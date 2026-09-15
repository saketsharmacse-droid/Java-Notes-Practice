package Inheritance.PracticeExercise;
//create a square class and inherit into cube class

class rectangle{
    public int length;
    public int breadth;
    rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }
    public double area(){
        return length*breadth;
    }
}
class cuboid extends rectangle{
    public int height;
    cuboid(int length, int breadth, int height){
        super(length, breadth);
        this.height = height;
    }
    public double volume(){
        return length*breadth*height;
    }
}
public class problem3 {
    static void main() {
        rectangle rec = new rectangle(4,6);
        cuboid cub = new cuboid(2,8,4);
        System.out.println(rec.area());
        System.out.println(cub.volume());

    }
}
