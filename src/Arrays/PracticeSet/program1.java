package Arrays.PracticeSet;

//create an array of 5 floats and claculate their sums.
public class program1 {
    static void main() {

        //float array
        float [] array = {45.7f, 67.8f, 33.67f, 69.96f,76.5f};
        float sum = 0.0f;

        for(float element : array){
            sum = sum + element;
        }
        System.out.println("The sum is: " + sum);
    }
}
