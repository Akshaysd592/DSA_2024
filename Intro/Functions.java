
import java.util.*;



public class Functions {
    public static int printVal(int value){
        System.out.println("Hello I am inside the Print function "+value);
        return 5;
    }
    public static void main(String arg[]){
        System.out.println("This is to check function");

       Scanner sc = new Scanner(System.in);
       int value = sc.nextInt();
       value = value>>1; // right shift
       int returnedVal = printVal(4);
       System.out.println(value+" "+returnedVal);

    }
}
