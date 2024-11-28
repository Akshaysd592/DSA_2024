import java.util.*;

public class Arrays {
    public static void main(String arg[]) {

        Scanner sc = new Scanner(System.in); // scanner for taking input 

        // array declaration
        int[] tempArr = new int[10]; // by default null/0 as a value is stored
        // or
        int tempArr1[] = new int[10];
        // or
        int tempArr2[] = { 2, 3, 4, 5 };

        // taking input
        for (int i = 0; i < tempArr.length; i++) {
            tempArr[i] = sc.nextInt();
        }
        System.out.println("printing tempArr2");
        tempArr[0] = 23;
        for (int i = 0; i < 4; i++) {
            System.out.println(tempArr2[i]);
        }
    }
}
