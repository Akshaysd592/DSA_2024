
import java.util.*;

public class TwoDArray {
    public static void main(String ar[]) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();

        // declaring 2d array
        int[][] tempTwoD = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                tempTwoD[i][j] = sc.nextInt();
            }
        }
        System.out.println("Printing values ");
        for (int i = 0; i < tempTwoD.length; i++) {
            for (int j = 0; j < tempTwoD[0].length; j++) {
                System.out.print(tempTwoD[i][j]);
            }
            System.out.println();
        }

    }
}
