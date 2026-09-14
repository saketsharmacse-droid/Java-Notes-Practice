//here we shall see the constructor overloading, which is just like the method overloading in java
package OOPS2;

class Employee1{
    private int id;
    private String name;

    public Employee1(){
        System.out.println("This is one instance of constructor, without argument!");
    }

    public Employee1(String myname, int myid){
        id = myid;
        name = myname;
        System.out.println(id);
        System.out.println(name);
    }

    //toh, hum overload krr krr ke constructors ke bahut saare forms bna sakte hai and use them with the object creation.
}
public class constructors3 {
    static void main() {
//        Employee1 obj = new Employee1();//this will invoke the constructor without the arguments waala.
        Employee1 obj = new Employee1("Saket", 12);//yeh dusre waale ko invioke krega
    }
}
