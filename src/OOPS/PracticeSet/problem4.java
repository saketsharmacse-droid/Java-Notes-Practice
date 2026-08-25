package OOPS.PracticeSet;

import java.awt.*;
import java.util.Scanner;

//rectangle class to find the area and perimeter

class Rectangle{
    int a,b;

    public int area(int a, int b){
        return a*b;
    }
    public int perimeter(int a, int b){
        return 2*(a+b);
    }
    public float diagonal(int a , int b){
        return (float)Math.sqrt(a*a + b*b);
    }
}
public class problem4 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the length and breadth of your rectangle: ");
        int len = sc.nextInt();
        int bre = sc.nextInt();

        Rectangle obj = new Rectangle();

        System.out.println("The area of your rectangle is: " + obj.area(len, bre));
        System.out.println("The perimeter of your rectangle is: " + obj.perimeter(len, bre));
        System.out.println("The diagonal length of your rectangle is: " + obj.diagonal(len, bre));
    }
}
