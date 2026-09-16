package abstractClassesandInterfaces;

interface myCamera{
    void takeSnap();
    void recordVideo();
    private void greet(){
        System.out.println("Hello, from camera!");
    }
    default void recordVideo1(){
        greet();
        System.out.println("Recording....");
    }
}
interface myGPS{
    void gps();
}
interface mywifi{
    String[] getNetwork();
    void connectNetwork(String network);
}
class myCellPhone1{
    void callNumber(int phoneNumber){
        System.out.println("Calling " + phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting...");
    }
}
class mySmartphone1 extends myCellPhone1 implements myGPS, mywifi, myCamera{
    public void takeSnap(){
        System.out.println("Taking Snap!");
    }
    public void recordVideo(){
        System.out.println("Recordng Video!");
    }
    public void gps(){
        System.out.println("This is GPS!");
    }
    public String[] getNetwork(){
        System.out.println("Getting list of networks");
        String[] networkList = {"Saket", "Harry", "Love babbar", "Hitesh"};
        return networkList;
    }
    public void connectNetwork(String network){
        System.out.println("Connecting to " + network);
    }

    public void method1(){
        System.out.println("This is a method of class.");
    }//but cam1 se yeh bhi run nhi krwa sakte as its not a method of camera.
}
public class polymorphism {
    static void main() {
//        myCamera cam1 = new myCamera(); cannot be instantiated as abstract rhta hai
        myCamera cam1 = new mySmartphone1();
//        cam1.getNetwork(); this is not allowed
        cam1.recordVideo();
//        cam1.method1(); this is also not allowed.

        mySmartphone1 s = new mySmartphone1();
        s.getNetwork();
        s.takeSnap();
        s.callNumber(99772);

    }
}

//humare pass smartphone class hai, jiske implementations hai gps, camera aur mediaplayer interfaces.
//agar hum aisa kuch chahte hai ki yeh smartphone sirf camera use kre, toh hum: camers c = new SmartPhone();
//this is just like the dynamic method dispatch in inheritance
//hum interface ka instance bna rhe hai.
//ab humare pass reference camers ka hai, toh aur koi methods jo camera mei nhi hai wo nhi use krr sakte hai.

