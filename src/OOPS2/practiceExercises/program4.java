package OOPS2.practiceExercises;

//use constructors to solve the problem 2.
public class program4 {

    static class Cylinder{
        private int radius;
        private int height;

        public Cylinder(int radius, int height) {
            this.radius = radius;
            this.height = height;
        }

        public void setRadius(int radius){
            this.radius = radius;
        }
        public int getRadius(){
            return radius;
        }

        public void setHeight(int height){
            this.height = height;
        }
        public int getHeight(){
            return height;
        }
    }
    static void main() {
        Cylinder c = new Cylinder(12,24);
//        c.setHeight(12);
        int h = c.getHeight();
        System.out.println(h);

//        c.setRadius(9);
        int r = c.getRadius();
        System.out.println(r);
    }
}
