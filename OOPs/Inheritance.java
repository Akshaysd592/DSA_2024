import newPackage.LearnPackage;

// Inheritance types is java 4 only 
// 1. single => one to another
// 2. multilevel  => one to  another level to another
//3. hierarchical  => one parent to two child
// 4. hybrid => combination of two 

// No multiple inheritance in java, It uses interface for this multiple inheritance 

abstract class Shape { // abstract keyword means it is a concept , it will be not used for object
                       // creation , used for class creation
    abstract void area(); // area defination can be declared in class where this is used

}

class Triangle extends Shape {
    public void area() {
        System.out.println("This is a triagle ");
    }
}

class Circle extends Shape {
    public void area() {
        System.out.println("This is a circle class ");
    }
}

public class Inheritance {
    public static void main(String[] arg) {
        // LearnPackage l1 = new LearnPackage();

        Triangle tg = new Triangle();

    }
}
