package Arrays.PracticeSet;

import java.util.Scanner;

//wap to add two matrices of size 2X3.
public class program4 {
    static void main() {
        //2d array: int[][] mat1 = {{},{},};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of rows and columns: ");
        int row = sc.nextInt();
        int col = sc.nextInt();

        System.out.println("Enter the elements of Matrix 1: ");
        int [][] mat1 = new int[row][col];

        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                mat1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the elements of Matrix 2: ");
        int [][] mat2 = new int[row][col];

        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                mat2[i][j] = sc.nextInt();
            }
        }

        int [][] mat3 = new int[row][col];

        //matrix addition:
        for( int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                mat3[i][j] = mat1[i][j] + mat2[i][j];
            }
        }

        //displaying the result:
        System.out.println("The sum of matrix1 and matrix2 is: ");
        for(int[] rows: mat3){
            for(int elem: rows){
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }
}

//        Enter the Number of rows and columns: 2
//        3
//        Enter the elements of Matrix 1:
//        11
//        12
//        13
//        21
//        22
//        23
//        Enter the elements of Matrix 2:
//        10
//        10
//        10
//        20
//        20
//        20
//        The sum of matrix1 and matrix2 is:
//        21 22 23
//        41 42 43
