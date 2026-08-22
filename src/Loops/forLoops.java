package Loops;

public class forLoops {
    static void main() {

//        for(int i = 0; i <=10; i++){
//            System.out.println(i);
//        }

        for(int j = 1; j <= 30; j++){
            if(j%2 != 0){
                System.out.println(j);
            }
        }

        for(int k = 0; k <= 5; k++){
            System.out.println(2*k+1);
        }

        //decrementing for loop
        //incrementing for loop

        for(int n = 5; n > 0;n--){
            System.out.println(n);
        }
    }
}

//2n = even numbers: 0,2,4,6,8, ...
//2n+1 = odd numbers: 1,3,5,7,9, ...
