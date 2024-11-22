import java.util.*;

public class ConditionandLoop {
    // conditions and loop
    public static void main(String args[]) {
        System.out.println("Conditional Statement");

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int input2 = sc.nextInt();
        String str = sc.next();

        if (input > input2) {
            System.out.println(input + " is greater than" + input2);

        } else if (input < input2) {
            System.out.println(input2 + " is greater than" + input);
        } else {
            System.out.println(input + " is equal to " + input2);
        }

        switch (str) { // also integer values works for switch case
            case "a":
                System.out.println("This is 1");
                break;
            case "b": {
                System.out.println("This is 2");
            }
                break;
            case "c":
                System.out.println("This is 3");
                break;
            default:
                System.out.println("This is default");
        }

        // Loops
        // for
        for (int i = 0; i <= 20; i++) {
            System.out.println("This is loop " + i);
        }

        // while
        int j = 10;
        while (j > 0) {
            System.out.print(" " + j);
            j--;
        }

        System.out.println();

        // do while
        do {
            System.out.println("This is do while loop");
        } while (3 > 4);

        sc.close();
    }
}
