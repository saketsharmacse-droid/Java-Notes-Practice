package abstractClassesandInterfaces;

interface bicycle{
    int a = 45;
    //final int a = 45; aise bhi likh sakte hai but by default yeh final rhta hai
    //interfaces ke properties final rhte hai.
    void applyBrake(int decrement);
    void speedUp(int increment);
    //yeh interface force krr rha hai unn classes ko jo isko use krengi ki inn methods ko implement kro.
    //if a class is implementing this interface, they need to define its methods.
}

interface hornBicycle{
    int b = 78;
    void blowHorn1();
    void blowHorn2();
}

class AvonCycle implements bicycle, hornBicycle{
    //Class 'AvonCycle' must either be declared abstract or implement abstract method 'applyBrake(int)' in 'bicycle'
    void blowHorn(){
        System.out.println("pee pee poo poo!");
    }
    public void applyBrake(int decrement){
        System.out.println("Applying Brake!");
    }
    public void speedUp(int increment){
        System.out.println("Applying Speedup!");
    }
    //jab hum iterface ke methods ko implement krte hai toh humein inko public bnana padega.


    //hum ek class mei do interfaces ko implement krr sakte hai
    public void blowHorn1(){
        System.out.println("India and Russia!");
    }
    public void blowHorn2(){
        System.out.println("India and Japan!");
    }


}
public class interfaces2 {
    static void main() {
        AvonCycle cycle = new AvonCycle();
        cycle.applyBrake(1);
        System.out.println(cycle.a);//45
        //you can create the properties in interfaces

        //you cannot modify the properties in the interfaces as they are "final".
//        cycle.a = 54; error aayega as hum ek final property ko change krne ka try krr rhe.

        cycle.blowHorn1();
        cycle.blowHorn2();
    }
}

//interfaces in english refer to a point where two systems meet and interact.
//in java, interfaces is a group of related methods with empty bodies.
//kisi bhi class nei agar isko implement kiya toh unn saare ke saare methods ko define krna padega.

//difference between abstract class and interface
//class se kewal ek hi child bnega, mtlab extends word ko hum sirf ek baar use krr sakte hau
//but, implements keyword ko bahut baar use krr sakte hai.
//ek interface ko bahut saare classes mei implement krwaya jaa sakta hai.
//but abstract class ko sirf ek dusre class mei krwa sakte hai extend.
//can also do: class AvonCycle extends cycle implements Bicycle
//interface is like a template that can be used accordingly.
