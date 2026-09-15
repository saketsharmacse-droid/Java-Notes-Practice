package Inheritance;

class EkClass{
    int a;
    public void returnOne(int a){
        a = a;
        System.out.println(a);
    }
    //constructor
    EkClass(int x){
        a = x;
        //humara constructor is behaving as a setter only.
        //b, agar hum object bna ke EkClass e = new EkClass(5); aise krenge.
        //bina this use kiye bhi 5 print hoyega.
        //this use krenge toh bhi 5 print hoyega.
        //this.a = v;
        //this aur bina this dono se kaam ho rha hai.

        //actually, this ek reference hai
    }

    public int getA() {
        return a;
    }
}
public class this3 {
    static void main() {
        EkClass e = new EkClass(55);
        System.out.println(e.getA());//we will get 5 without any error.
        e.returnOne(88);
    }
}
//jis tarike se e ek reference hai, object hai jo iss class ko point krr rha hai
//waise hi this is a reference pointing to the class, and yeh class ke andar hi hai.
//this ek aisa reference hai jo class ke andar hi hai aur usko refer krr rha, if humein uss method ko refer krna hai jo ki iss class se chal rha hai tph we shall use this.
//humein methods ko this pass krke dena padta hai in certain scenarios like: func(this).

//this ia a way for us to reference an object of the class which is being created/referenced.

//meri observations:
//agar conbstructor ko invoke krr rhe, with parameters wale constructor ko.
//jaise EkClass(int x), ab iske andar agar a = x; krenge, toh set ho jayega a, getter se a lenge toh mil jayega a ki value.
//but agar, EkClass(int a) , aur iske andar a = a; krenge, toh set nhi hoga, error aayega.
//toh hum aise krenge, EkClass(int a ) aur iske andar this.a = a; tab aayega value.

//lekin, agar humare pass normal method hao, returnOne krke.
//isko toh call krenge obj.returnOne(88) aise krke
//ab , agar returnOne(int x) aur a = x; toh humain 88 mil jayega
//but, interestingly, agar hum returnOne(int a ) aur a = a; bhi krenge toh bhi value mil rha yaha

//but aise humesha hoga yeh zaruri nhi, toh we use this keyowrd to refer to the current instance class.
