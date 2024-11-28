
import java.util.*;
public class Strings {
    public static void main(String ar[]){
        Scanner sc = new Scanner(System.in);
        // to get whole line string as a input
        String strValue = "aksh";
        String strValue2 = "bksh";
        // for single string sc.next()
        System.out.println(strValue);


        // for string length with ()
        System.out.println(strValue.length());

        // for concatenation
        System.out.println(strValue+" Ak ");

        // chatAt()
        System.out.println(strValue.charAt(1));

        // compareTo
        System.out.println(strValue.compareToIgnoreCase(strValue2)); // will return negative value since strValue2 is greater than strValue

        // substring
        System.out.println(strValue.substring(2,strValue.length()));// endindex is excluded 
    }
}
