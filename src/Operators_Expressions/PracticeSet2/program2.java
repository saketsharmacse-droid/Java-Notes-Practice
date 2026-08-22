package Operators_Expressions.PracticeSet2;

//write a java program to encrypt a grade by adding 8 to it, decrypt it to show the correct grade.

public class program2 {
    static void main() {
        char grade = 'B';
//        grade = grade + 8;//integer aayega isme.
        grade = (char)(grade + 8); //typecasting kiye
        System.out.println(grade);//J

        //decrypting the grade
        grade = (char)(grade - 8);
        System.out.println(grade);//B
    }
}
