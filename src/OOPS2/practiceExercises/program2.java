package OOPS2.practiceExercises;

//create a class Cylinder and use getters and setters to set its radius and height.
public class program2 {

    static class Cylinder{
        private int radius;
        private int height;

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
        Cylinder c = new Cylinder();
        c.setHeight(12);
        int h = c.getHeight();
        System.out.println(h);

        c.setRadius(9);
        int r = c.getRadius();
        System.out.println(r);
    }
}
