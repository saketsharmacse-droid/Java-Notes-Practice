package Loops;

public class breakContinue {
    static void main() {

//        for(int i = 0; i <= 8; i++){
//            System.out.println(i);
//            System.out.println("Java is Great!");
//            if(i==3){
//                System.out.println("Ending the Loop!");
//                break; //yeh statement control ko loop se bahar leke aayega.
//            }
//        }

//        int i = 0;
//        while(i<5){
//            System.out.println(i);
//            System.out.println("Java is Great!");
//            if(i==3){
//                System.out.println("Exiting the loop!");
//                break;
//            }
//            i++;
//        }

//        int i = 0;
//        do{
//            System.out.println(i);
//            System.out.println("Java is Great!");
//            if(i == 3){
//                System.out.println("Exiting the loop!");
//                break;
//            }
//            i++;
//        }while(i<=5);

        for(int i = 0; i <= 6; i++){
            if(i == 2){
                System.out.println("Skipping the execution!");
                continue;

            }
            System.out.println(i);
            System.out.println("Java is Great!");
        }


    }
}

//break statement is used to exit the loop, whenever break is encountered, the control is sent outside the loop immediately.
//jaise hi continue dikhta hai, it skips the current iteration.
//mtlab current iteration mei jaha bhi continue milega, uske neeche ke saare codes ko skip krke turant wapis se control upar loop mai jayega aur next iteration hoga.

//break statement completely exits the loop.
//continue next statement execute nhi krega.
