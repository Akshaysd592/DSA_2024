
import java.util.*;

public class Patterns {
    public static void main(String arg[]) {
        System.out.println("Patterns");
        int row = 5;
        int col = 5;
        // pattern 1
        // for (int i = 1; i <= row; i++) {

        // for (int j = 1; j <col+1-i; j++) {

        // System.out.print("* ");
        // }
        // System.out.println();

        // }

        // pattern 2
        // for (int i = 1; i <= row; i++) {

        // for (int j = 0; j <i; j++) {

        // System.out.print("* ");
        // }
        // System.out.println();

        // }

        // pattern 3
        // for (int i = 1; i <= row; i++) {

        // for (int j = 1; j <= col-i; j++) {
        // System.out.print(" ");
        // }
        // for(int k =0 ;k<i;k++){
        // System.out.print("* ");
        // }
        // System.out.println();

        // }

        // pattern 4
        // for (int i = row; i > 0; i--) {

        // for (int j = 1; j <=i; j++) {

        // System.out.print(j+ " ");
        // }
        // System.out.println();

        // }

        // pattern 5
        int count = 1;

        for (int i = 1; i <= row; i++) {

            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }

            System.out.println();

        }

    }

}
