//we have to create a guess the number game for user inputs.
//we have to solve this using oops.
//game should have following methods:
//constructor to generate the random numbers.
//takeuserInput() to take the user input.
//iscorrectNumber() to detect the matching of number.
//use properties such as number of guesses(int) .
//getters and setters for the number of guesses.

package OOPS2.practiceExercises;
import com.sun.security.jgss.GSSUtil;

import java.util.Random;
import java.util.Scanner;

class Game{

    public int number;
    public int noOfGuess;
    public int inputNumber;

    public int getNoOfGuesses(){
        return noOfGuess;
    }
    public void setNoOfGuess(int noOfGuess){
        this.noOfGuess = noOfGuess;
    }


    public Game(){
        Random rand = new Random();
//        int num = rand.nextInt(100) + 1;
        this.number = rand.nextInt(100) + 1;

    }

    public void userInput(){
        System.out.println("Guess the number!!");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();

    }

    boolean isCorrect(){
        noOfGuess++;
        if(inputNumber == number){
            System.out.format("Yea! You Guessed Correctly!, it was %d attempts", noOfGuess);
            return true;
        }
        else if(inputNumber < number){
            System.out.println("Too Low!");
        }
        else if(inputNumber > number){
            System.out.println("Too High!!");
        }
            return false;
    }
}
public class program1 {
    static void main() {
        Game obj = new Game();
        boolean b = false;
        while(!b){
            obj.userInput();
            b = obj.isCorrect();
//            System.out.println(b);
        }


    }
}
