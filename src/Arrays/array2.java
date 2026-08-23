package Arrays;

public class array2 {
    static void main() {
        //floating array:
//        float [] array = {98, 67, 45, 78, 69};
//        System.out.println(array[0]); //98.0
//        System.out.println(array.length); //5

//        float [] marks = {98.1f, 88.5f, 90.3f, 67.4f, 73.21f};
//        System.out.println(marks[4]); //73.21

        //String array:
//        String [] students = {"Saket", "Rohan", "Sohan", "Mohan", "Rakesh"};
//        System.out.println(students.length);//5
//        students[5] = "Ramesh";
//        System.out.println(students[5]); //error aayega

        int[] marks = {98, 78, 88, 65, 45, 39};
        //Displaying the array elements:
        //Naive way:
        System.out.println("Displaying using Naive way");
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);
        System.out.println(marks[5]);

        //using For Loop:
        System.out.println("Displaying using for loop");
        for(int i = 0; i < marks.length; i++){
            System.out.println(marks[i]);
        }
        //i <= marks.length krne se index out of bound ka exception aayega.

        //This will print the array elements in reverse order.
        System.out.println("Displaying using loop in reverse order");
        for(int j = marks.length - 1; j >= 0; j++){
            System.out.println(marks[j]);
        }

        //For Each Loop:
        //this was introduced in the newer versions of java
        System.out.println("Printing the elements using for-each loop.");
        for(int element: marks){
            System.out.println(element);
        }
        //element ke jagah koi dusra bhi variable e sakte hai.




    }
}

//properties of arrays

//Array Length: .length will return the total length of an array
//array.length will return the length of that array.

//Displaying the array:
//Naive way is ki ek ek elements ko display krte jaao sout krr krr ke.
//second way is to use for loop: Array traversal
//we can use other types of loop as well.

