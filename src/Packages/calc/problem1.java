package Packages.calc;

class calculator{
    public void calculate(int a, int b){
        System.out.println("The sum is " + ( a + b));
    }
}
class Sccalculator{
    public void calculate(int a, int b){
        System.out.println("The sum is " + Math.sin( a + b));
    }
}
class Hycalculator{
    public void calculate(int a, int b){
        System.out.println("Sum is " + (a + b));
        System.out.println("The sum is " + Math.sin( a + b));
    }
}
public class problem1 {
    static void main() {
        System.out.println("Hello, I am Problem Number 1!");
    }
}
