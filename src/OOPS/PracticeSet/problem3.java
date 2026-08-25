package OOPS.PracticeSet;
//create a square class to find the area and the perimeter

import java.util.Scanner;

class Square{

    int side;

    public int area(int side){
        return side*side;
    }
    public int perimeter(int side){
        return 4*side;
    }
    public float diagonal(int side){
        return (float) (Math.sqrt(2)*side);
    }
}
public class problem3 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the side of your square: ");
        int side = sc.nextInt();

        Square obj = new Square();
        System.out.println("The area is: " + obj.area(side));
        System.out.println("The perimeter is: "+ obj.perimeter(side));
        System.out.println("The diagonal length is: " + obj.diagonal(side));
    }
}
