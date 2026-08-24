package Methods.PracticeSet;

import java.util.Scanner;

//wap to convert celsius to fahrenheit
public class problem9 {

    static float temp(float n){
        return ((n - 32)*5)/9;
    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the temperature in Fahrenheit: ");
        float n = sc.nextFloat();

        System.out.println("The temperatire in celsius is: " + temp(n));
    }
}
