package Methods;

public class methods2 {

    int logic(int x, int y){
        int z;
        if(x>y){
            z = x + y;
        }
        else{
            z = (x+y) * 5;
        }
        return z;

        //yaha pe public nhi likhe hai toh by default public access modifier lag gya hai method pe.
    }
    static void main() {
            int a = 5;
            int b = 7;
            int c;

            //method invocation using object creation.
            methods2 obj = new methods2(); //object creation
            c = obj.logic(a,b); //method call upon an object.

            int c1 = obj.logic(10,20);
    }
}

//calling a method:
//a method can be called by creating an object of the class in which the method exists followed by the method call.
//jaise scanner object bnaye thhe waise ek object bnayenge new keyword use krke.

//agar hum kisi method mei static laga dete hai, tab wo uss class ke liye bne hue object se associate na hoke directly uss class se hi associate ho jayega.
//jaise hostel mei common fridge hota hai jisko sab log access krte hai.

//agar non-static method hai mera, toh object bnana zaruri hai class ka , jiske pass apni apni copies rhengi.
//non-static method share nhi hora hai throughout the class, sabka apna apna hai, like sab student ka apna apna fridge.
//toh ab humein object bnana papdega to access this method.

//static methods ko directly call krr sakte hai class ke andar kahi bhi.
//non-static methods ko call krne ke liye we have to make the class ka object.

//agar hum log method ke andar x ki value change krr denge, toh wo a aur b mei reflect nhi hoga kyoki yeh sab toh sirf copy pe kaam krr rhe , references pe kaam krr rhe na ki actual value pe.
//primitive datas like int, float, char, boolean, etc jo bhi bheje hai hum, wo humare main method ke variables ko chage nhi krega, kyoki uski copy gyi hai method ki, wo nhi gya hai method pe.

//the values from the method call(x and y) are copied to the x and y of thr function, thus even if we modify the values x and y inside the method, the values in the main method will not get changed.
