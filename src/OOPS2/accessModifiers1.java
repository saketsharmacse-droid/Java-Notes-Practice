package OOPS2;

class Employee{
    int id;
    String name;
    private int id1;
    private String name1;

    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }

    public void setId(int i){
        id = i;
    }
    public int getId(){
        return id;
    }
}
public class accessModifiers1 {
    static void main() {

        Employee obj = new Employee();
        obj.id = 23;
        obj.name = "Saket Sharma";
        //id1 and name1 are private entities, so we cannot directly access them.
//        obj.id1 = 10; //this will give errors as we cannot access the private entities.
//        obj.name1 = "Saket";

        obj.setName("Saket Sharma is a good boy"); //yeh set krega name
        System.out.println(obj.getName()); //isse we can get the name


    //private entities ko bhi access krr sakte hai, but using methods, called getters and setters methods.

    }
}

//access modifiers
//private, default, protected, public
//these are made to control who can access or modify our methods.
//these specify where the property or method is accessible.

//private access modifier ko hum access nhi krr sakte.
//bnaya kyu gya: kyoki koi bhi aake humare entities ko change ya modify mat krr sake.

//we use getters and setters to make them use.
//getter --> returns the value: accessors
//setter --> sets the value: mutators


