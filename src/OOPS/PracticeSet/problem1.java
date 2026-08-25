package OOPS.PracticeSet;

//create a class employee with properties: salary, getSalary, name, getName, setName

class Employee{
    int salary;
    String name;

    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String str){
        name = str;

    }

}
public class problem1 {
    static void main() {
        Employee saket = new Employee();

        saket.salary = 20000;
        saket.setName("Saket Sharma");
        System.out.println(saket.getName() + " " + saket.salary);
    }
}
