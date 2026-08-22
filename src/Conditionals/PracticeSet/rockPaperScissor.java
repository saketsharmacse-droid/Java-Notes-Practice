package Conditionals.PracticeSet;

import java.util.Scanner;

public class rockPaperScissor {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Rock Paper Scissor Game");
        System.out.println("Choices are: \t 1: Stone\n\t2: Paper\n\t3: Scissor");

        System.out.print("Enter the number of rounds: ");
        int game = sc.nextInt();




        int n = 0;

        while(n < game) {
            System.out.print("Enter Player 1 choice: ");
            int a = sc.nextInt();
            System.out.print("Enter Player 2 choice: ");
            int b = sc.nextInt();

            if (a == b && a >= 1 && a <= 3) {
                System.out.println("Match Draw!");
            } else if (a == 1 && b == 2) {
                System.out.println("Player 1 Wins!");
            } else if (a == 1 && b == 3) {
                System.out.println("Player 1 Wins!");
            } else if (a == 2 && b == 1) {
                System.out.println("Player 1 Wins!");
            } else if (a == 2 && b == 3) {
                System.out.println("Player 2 Wins!");
            } else if (a == 3 && b == 1) {
                System.out.println("Player 2 Wins!");
            } else if (a == 3 && b == 2) {
                System.out.println("Player 1 Wins!");
            } else {
                System.out.println("Enter a valid input!");
            }
            n += 1;

        }
    }
}
