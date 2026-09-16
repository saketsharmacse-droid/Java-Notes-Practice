package abstractClassesandInterfaces;

public class multipleInheritance {
}

//this will tell us naother reason why we use interfaces

//Is Muliple inheritance allowed in java?
//multiple inheritance means ek se zyada parent class use krke child class bna sakte hai
//like if we have 4 classes, we can make all of them as parents of a fifth class.

//multiple inheritance is not allowed in java.
//multiple inheritance faces problems when there exists methods with same signature in both the super classes.
//dono parent class mei agar same methods hai toh yeh ambiguity rhegi ki konse method ko use krenge.
//this has a solution, cpp krta hai usko use, but java has a better way to deal with this.
//java doesnot support multiple inheritance directly, but the similar concept can be achieved using interfaces.
//a class can implement multiple interfaces and extend a class at the same time.

//interfaces in java is a bit like class with a significant difference.
//an interface can only have method signatures, fields and default methods.
//a class implementing an interface needs to define the methods, we can overrite the properties inside the class, mtlab agar x = 45, inside class this can be x = 90
//you can create a reference of interfaces but not the object.
//interfaces methds are public by default.

