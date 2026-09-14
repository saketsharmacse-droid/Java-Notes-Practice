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
}
public class constructors2 {
    static void main() {
        Employee saket = new Employee();
        saket.setName("Saket Sharma");
        saket.getName();
    }
}
