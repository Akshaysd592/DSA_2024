import java.util.*;
public class StringBuilders {

    public static void main(String ar[]){
        StringBuilder str = new StringBuilder("Akshay"); //now can say that str is of type StringBuilder or like string also mutable we can now manipulate it 
          System.out.println(str);

          // char at
          System.out.println(str.charAt(0));

          // setchar  at specific index or replacement of char at that index 
          str.setCharAt(0,'L');
          System.out.println(str);

          // insert any character at specific index , it will not replace character at the index will shift the character forward
          str.insert(0, 'M');
          //Akshay => MAkshay
          System.out.println(str);


          // for deleting the characters at any index start to end 
          str.delete(0, 2) ; // end is excluded 
          System.out.println(str);

          // append 
          str.append("akshay");
          System.out.println(str);

          System.out.println(str.length());

    }
    
}
