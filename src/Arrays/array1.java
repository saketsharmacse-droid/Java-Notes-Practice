package Arrays;

public class array1 {
    static void main() {

        //Arrays:
        int [] marks = new int[5];
        //integer array hai toh sirf integer values store hongi.
        marks[0] = 100;
        marks[1] = 80;
        marks[2] = 70;
        marks[3] = 90;
        marks[4] = 56;

        System.out.println(marks[4]); //56

        //overwrite bhi kr sakta hu array items ko
        marks[4] = 88;
        System.out.println(marks[4]); //88

        //index 5 ko assign yaa access krne se error dega.

        //Ways to declare an array: there are following three ways:
        int [] currencies; //--> Declaration
        currencies = new int[5]; //--> Memory Allocation
        //new int[5] ek object hai jisko mai currencies se point krwa rha hu.

        int [] countries = new int[5]; //Declaration + memory allocation

        int [] marks1 = {100, 70, 80, 71, 98}; //Declaration + initialize
        //yaha pe size nhi dena padega as java will find out by itself.
    }
}

//mere pass hai a classroom of 500 students, and i have to store the marks.
//I have two options: create 500 variables or create an array

//Arrays:
//Arrays are a collection of similar kind of data.
//int [] marks = new int [5]

//in arrays, elements are stored in contiguous form, so accessing them becomes very fast.
//if size is 5, then an array will take 5 * 4 = 20 bytes of memory.
//new int[5] is called as memory allocation.
//marks is the reference of that array, uske first element ko point krega memory mei.

//Accessing array elements:
//marks [0]: will return the value stored at 0 index
//array ke andar kisi bhi value ko change bhi krr sakta hu.

//array indices start from 0 and goes till n-1 where n is the size of array.
