package Packages.SaketCoder;

public class Saket {
    static void main() {
        System.out.println("I am a class Saket main method! Hello user..!");
    }
}

//javac Saket.java --> yeh class file create krega.
//javac -d . Saket.java --> yeh packge bna ke saari files ka class file uss package mei move krr dega.
//javac -d . *.java --> yeh saari java ki files ko compile krke package mei move krr dega.

//agar java files ko packages mei organise krna rhta hai, toh hum javac -d . *.java use krke krr sakte hai.
//- javac -d abc *.java krne se ek folder abc ke andar saare class store hoyenge.