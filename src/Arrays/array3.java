package Arrays;

//multidimensional array
public class array3 {
    static void main() {

        int [] marks; //1-D Array

        int [][] flats; //2-D Array
        flats = new int [2][3]; //2d array of 2 rows and 3 columns.
        //Accessing its elements:
        flats [0][0] = 101;
        flats [0][1] = 102;
        flats [0][2] = 103;
        flats [1][0] = 201;
        flats [1][1] = 202;
        flats [1][2] = 203;

        System.out.println(flats.length); //2 i.e the number of rows

        //Displaying the 2-d array
        for(int i = 0; i < flats.length; i++){
            for(int j = 0; j < flats[i].length  ; j++){
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println(" ");
        }
        /*
            101 102 103
            201 202 203
        */



        //similarly 3-d arrays can be created as:
        String [][][] arr = new String[2][3][4];


    }
}

//multidimensional arrays means ki arrays of arrays.
//jaise ek normal array points to the reference where elements are stored.
//but if my memory reference is pointing to an array jiske pass dusre array ka reference hai ek ek box mei.
//iska koi limit nhi hai, we can have n-dimensional arrays.
//jaise hum ek array ko point krr rhe, jiske saare indexes are pointing to individual arrays, jo ki aur kisi dusre array ko point krr rhe.
//we can access tem as array[][][][]...