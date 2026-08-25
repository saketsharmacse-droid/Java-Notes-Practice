package OOPS.PracticeSet;

//create a method cellphone with methods to print rining, vibrating...etc

class CellPhone{
    public void ringing(){
        System.out.println("Your Phone is ringing.");
    }
    public void vibrating(){
        System.out.println("Your Phone is vibrating.");
    }
    public void calling(){
        System.out.println("Your Phone is calling.");
    }
    public void clicking(){
        System.out.println("Your Phone is taking pictures.");
    }

}
public class problem2 {
    static void main() {
        CellPhone samsung = new CellPhone();
        samsung.calling();
        samsung.clicking();
        samsung.ringing();
        samsung.vibrating();

    }
}
