package OOPS;

class Employee{
    int id;
    String name;
    int salary;

    public void printDetails(){
        System.out.println("My id is "+ id);
        System.out.println("and my name is "+name);
    }

    public int getSalary(){
        return salary;
    }
}

public class customClass3 {
    static void main(String[] args) {
        Employee saket = new Employee();//instantiating a new employee object
        Employee john = new Employee(); //jitte chahe utte objects bna sakte hai.

        //setting attributes/properties for saket
        saket.id = 12;
        saket.salary = 12000;
        saket.name = "Saket Sharma";

        //setting attributes for john
        john.id = 23;
        john.salary = 10000;
        john.name = "John Abrahim";

        //printing the attributes
//        System.out.println(saket.id);
//        System.out.println(saket.name);

//        saket.printDetails();
//        john.printDetails();

        int salary = john.getSalary();
        System.out.println(salary);

        int salary1 = saket.getSalary();
        System.out.println(salary1);

    }
}

//writing our custom class
//we can create our user defined classes
//class Employee{ attributes and methods}

//class ke object ke pass attributes aur properties rhegi.

//ek java program mei sirf ek hi public class likhte hai, wrna error aata hai.
