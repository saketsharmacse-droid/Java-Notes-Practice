package OOPS2;

class Employees{
    private int id;
    private String name;

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

    //constructors
//    public Employees(){
//        id = 45;
//        name = "your_name";
//    }
    //iss function ki koi return value nhi hai
    //isko humein explicitly invoke nhi krna pada.
    //saket.Employees krke isko call/invoke nhi krna pada
    //ais aisliye kyoki yeh ek constructor hai.
    //jaise hi maine iss class ka object bnaya, java will search for a same name method.
    //ab agar same name ka method hai toh usko automatically invoke krr dega, bina user ke invoke kiye.

    //hum constructors mei arguments bhi dete hai
    public Employees(String myname, int myid){
//        id = 110;
        id = myid;
        name = myname;
    }
}
public class constructors2 {
     static void main() {

//         Employees saket = new Employees();
         Employees saket = new Employees("Saket Sharma SPL1", 12);
//        saket.setName("Saket Sharma");
//        saket.getName();
//        saket.setId(108);
//        saket.getId();
         //kya mai har ek property ke liye ek getter aur setter bnaunga?
         //kya mai bbaar baar yeh saare methods bna ke fir unko objects se aise pass krke fir run krte rhunga?
         //we can do this in one line using construtors.

         System.out.println(saket.getId());
         System.out.println(saket.getName());
//         we get: 108 Saket Sharma
         //now we get 45 your_name
     }

}


//agar hum kisi entity ko private krr diye, toh we cannot access then using dot operator.
//but we can access them using the methids, isliye hum getters and setters use krte hai.

//constructors:
//A member function used to initialize an object while creating it.
/*Employee saket = new Employee();
saket.setName("Saket Sharma"); */
//in order to write our own constructor, we define a method with the same name as class name:
//public Employee(){
//name = "your name";
//}

//constructors are automatically invoked as soon as the object is created
//jaise hi hum new object bnate hai, waise hi ek method jo ki same name ka hai as the class wo waala method invoke ho jaata hai

