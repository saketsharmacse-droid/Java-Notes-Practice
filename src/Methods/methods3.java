package Methods;

public class methods3 {

    static void tellJoke(){
        System.out.println("Cheenti nei haathi se kaha: tumnein mere joote churaye hai!!");

        //iss method ka return type kya rhega?
        //iska declaration ke time kaise likhenge?:
        //jab humein method se kuch bhi return nhi krwana rhta hai toh hum void use krte hai.
    }

    static void change(int a){
        a = 98;
    }
    static void change2(int [] arr){
        arr[0] = 100;
    }
    static void main() {

//        tellJoke(); //yeh krne se call ho jayega method.
        int [] marks = {52,73,77,89,98,94};

//        case 1: changing the integer
//        int x = 45;
//        change(x);
//        System.out.println("X after change: "+ x); //45 hi rhega as x ki copy gyi thi.

//        case 2: changing the array
        change2(marks); //aray pass krr diye
        System.out.println("The value of array after change: " + marks[0]); //100 change ho jayega

        //Explaination:
        //jab bhi hum int[] marks = {...} likhte hai toh ek array object creare hota hai.
        //marks sirf ek reference hai, mtlab marks sirf iska address store krr rha hai.
        //marks ke pass sirf yeh information hai ki yeh cheex kaha pe hai.
        //jab hum change2(marks) kiye, toh hum method pe direct object pass kiye.
        //toh kya hoga, {...} iss object ka reference pass hoga, jo ki khud marks hai jo ki point krr rha hai abhi iss {...} object ke memory location pe hi.
        //hence, hum change kiye hai jo wo orignal mei change hua hai, since marks is not a copy, wo poora ek reference hai, actual object ko point krr rha hai na ki uske copy ko.
        //maine object ki copy bna ke pass nhi kiya hai, poora object pass nhi hoga, balki uske reference ki copy pass hogi/
        //same object change kyo hoga kyoki maine reference pass kiya hai, maine object ki copy bna ke pass nhi kiya hai.
        //kuch alag nhi hua hai, same jaise integer mei hua tha waisi hua hai, waha pe integer ki copy bnn gyi thi, yaha reference ki copy bni hai.
        //

    }
}

//pichhle example mei x and y ke andar a aur b copy ho gye thhe.
//x ko change krenge toh main method mei a aur b change nhi hoga.

//void return type:
//suppose mere pass ek method hai jo kuch kaam nhi krta sirf print krta hai, like prints a joke or a message.
//we use void if we do not want any returns from the method.
//static void method() {...}
//jab kuch cheex return nhi krna chahte toh we use void.
//when we dont want our method to return anything, we use void as the return type.

//program ka execution main method se hi start hoga humesha.

//Static Keyword:
//static keyword is used to associate a method of a given class with the class rather than the object. Static method in a class is shared by all the objects.
//static method hared method bnn jata hai.
//static method ko bina object bnaye call krr sakte hai, wrna object bnana padega.

//in case of arrays, the reference is passed, same is the case for object passing to methods.

