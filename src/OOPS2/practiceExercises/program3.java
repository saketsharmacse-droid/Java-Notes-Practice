package OOPS2.practiceExercises;

//use the program2 to find the volume and area of the cylinder.
public class program3 {

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

        public double surfaceArea(){
            return 2*Math.PI*radius * radius + 2*Math.PI*radius*height;
        }
        public double volume(){
            return Math.PI+radius+radius*height;
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
        System.out.println(c.surfaceArea());
        System.out.println(c.volume());
    }
}
