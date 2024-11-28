package newPackage;


// Access modifiers in java are of 4 types: for methods , class , properties
// 1.default => can be accessible in the current package only not outside, If not written any access specifier then it become by default 
// 2. public => publically avaible in same as well as where imported 
// 3. protected => only accessible here and in subclasses of other where imported 
// 4. private => accessible in that specific class only


//IMP => ------------------ declaration of class is also can be said as encapsulation which included both properties and methods 
//IMP => -------------  Data hiding is done with the help of access modifiers such as public , private , protected , default , Abstraction is little different 
 class Bank { // it used for support of LearnPackage here no not given public access modifier 
    String defaultProp;
    public String publicProp;
    protected String protecteProp;
    private String privateProp;

    // setter and getter for private properties 

    public String getPrivate (){
        setPrivate("akshay"); // since private function not accessible outside this Bank class 
        return this.privateProp;
    }
    private void  setPrivate(String privateProp){
        this.privateProp = privateProp;
    }



}

public class LearnPackage { // want ot access this class outside publically so public used 
    public static void main(String[] arg){ // main class should be always public 

         Bank b = new Bank();
         b.defaultProp = "ak";
         b.publicProp = "ar";
         b.protecteProp = "san";
        //  b.privateProp = "su"; // not accessible 
        // getters and setter 
        // b.setPrivate("aks");
       System.out.println(b.getPrivate());  // accessing private values 
    }

}
