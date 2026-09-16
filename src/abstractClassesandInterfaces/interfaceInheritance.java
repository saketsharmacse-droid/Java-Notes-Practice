package abstractClassesandInterfaces;

interface sample1{
    void meth1();
    void meth2();
}
interface sampleChild extends sample1{
    void meth3();
    void meth4();
//    void meth1();
//    void meth2();
    //ek interface ko extend krke dusra bna sakte hai to keep following the DRY.

}
class sampleChild1 implements sampleChild{
    public void meth3() {
        System.out.println("Hello, this is meth3");
    }
    public void meth4() {
        System.out.println("Hello, this is meth4");
    }
    public void meth1() {
        System.out.println("Hello, this is meth1");
    }
    public void meth2() {
        System.out.println("Hello, this is meth2");
    }
    //aise bhi implement krr sakte hai class mei
    //interface cannot implement other interface, only classes can do that.

}
public class interfaceInheritance {
    static void main() {
        sampleChild obj = new sampleChild1();
        obj.meth3();
        obj.meth4();
        obj.meth1();
        obj.meth2();
    }
}

//inheritance in interfaces

