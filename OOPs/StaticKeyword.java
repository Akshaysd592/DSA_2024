class Student{
    static String school;
    public static void changeSchool() {
        school = "ak"; // to change school name to "ak " for all class object with School class
    }
}


public class StaticKeyword {
    public static void main(String[] args) {
         Student.school = "model";
         Student ak =  new Student();
         System.out.println(ak.school);// this school is belong to Student class not specific object means will be same for all the objects created 
    }
}
