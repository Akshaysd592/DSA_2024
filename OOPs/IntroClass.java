
class Pen { // class name starts with capital letter in Java
    String brand;
    String type;

    public void writing() { // by convention method name starts with small letter
        System.out.println("I can write");
    }

    // default constructors also exist

    // constructor
    Pen() { // non parametarised constructor need to be provided since user defined
            // constructors are created
        System.out.println("This is constructor non parametarised");
    }

    Pen(String brand, String type) { // non parametarised constructor
        System.out.println("This is constructor parametarised");
        this.brand = brand;
        this.type = type;
    }

    Pen(Pen s2) { // copy constructor
        this.brand = s2.brand;

        this.type = s2.type;
        System.out.println("This is copy constructor");

    }
    // ----------------------------------------------------------------

    // Polymorphism
    // function overloading (compile time polymorphism / static polymorphism )
    // function with same name but different datatyped parameters/numbers of
    // parameters

    public void printbrand() {
        System.out.println("this is normal function");
    }

    public void printbrand(String brand, int value) {
        System.out.println(this.brand + " brand");
    }

    public void printbrand(int value, String brand) {
        System.out.println(value);

    }

}

public class IntroClass {
    public static void main(String arg[]) {
        // Pen pen1 = new Pen(); // here Pen() is a constructor same that of cpp , no
        // return type , called when object created
        // pen1.brand = "key";
        // pen1.type = "ballpen";
        // System.out.println(pen1.brand+" " + pen1.type);

        // parameterised constructor
        Pen pen1 = new Pen("cello", "gel");

        // copy constructor
        Pen pen2 = new Pen(pen1);

        // IMP in Java automatic destructor are available which is done by garbage
        // collection automatically

        pen1.writing();
        pen1.printbrand();

        pen1.printbrand(pen1.brand, 32);
        pen1.printbrand(32, pen1.brand);

    }

}
