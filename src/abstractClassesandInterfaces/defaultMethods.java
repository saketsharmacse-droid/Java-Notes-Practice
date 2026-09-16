package abstractClassesandInterfaces;

interface camera{
    void takeSnap();
    void recordVideo();


    private void greet(){
        System.out.println("Good Morning Sir!");
    }
    //greet ko directly run nhi krr sakte hai, it throws an error.
    //this is a private method and cannot be implemented inside the class
    //lekin, agar default method bada hora hai, toh usko bahut saare chote chote private methods mei break krke fir unko default kr andar call krr sakte hai.

    default void record4kvideo(){
        System.out.println("Recording video in 4k....");
        greet();
    }
    //default use krke hum method ko yhi pe define krr sakte hai, humein need nhi hai implement krne ki aaghe ke class mei.
    //but, if we want , we can reimplement this and override this in our classes further.
    //ek baar maine override krr diya toh new waala kaam krega not yeh waala.
}
interface wifi{
    String[] getNetworks();
    void connectNetwork(String network);
}
class myCellphone{
    void callNumber(int phoneNumber){
        System.out.println("Calling " + phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting...");
    }

}
class mySmartphone extends myCellphone implements wifi, camera{
    public void takeSnap(){
        System.out.println("Taking Snap!");
    }
    public void recordVideo(){
        System.out.println("Recordng Video!");
    }
    public String[] getNetworks(){
        System.out.println("Getting list of networks");
        String[] networkList = {"Saket", "Harry", "Love babbar", "Hitesh"};
        return networkList;
    }
    public void connectNetwork(String network){
        System.out.println("Connecting to " + network);
    }
}
public class defaultMethods {
    static void main() {
        mySmartphone ms = new mySmartphone();
        ms.record4kvideo();
        String [] ar = ms.getNetworks();
        for( String item : ar){
            System.out.println(item);
        }

    }
}

//default methods
//an interface can have static and default methods.
//default methods enable us to add new functionality to existing interfaces.
//this feature was introduced in the java 8 to ensure backward compatibility while updaing an interface.
//classes implementing the interface need not implement the default methods.
//interfaces can also include private methods for default methods to use.
