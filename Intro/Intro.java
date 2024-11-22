
import java.util.*;

public class Intro {
    public static void main(String[] args) {
        int a = 5;
        System.out.println("hello Akshay" + a);
        System.out.println("hello");

        // taking input
        Scanner sc = new Scanner(System.in); // Sustem.in same that of System.out 

       
        //  exectes one after other next() then  nextLine();
        String InputedLine = sc.nextLine(); // for getting whole line as a input untill enter not pressed 
        String Inputed = sc.next(); // single string at once 

          // nextFloat() => to get float as input
          // nextInt() => to get int as input ... similarly for other datatypes

          // IMP => If putted next() then nextLine() then it will use single line for input ex: "akshay is good " then next() will take akshay 
          // rest of the line "is good" will be take by nextLine not work one after another , so use nextLine() then next() for taking input in new lines one after another  

        System.out.println(Inputed);
        System.out.println(InputedLine);
        // sc.close(); // the scanner object need to be closed 



        // to get two variables as input and print sum
        Scanner newsc = new Scanner(System.in);
        int ak = newsc.nextInt();
        float b = newsc.nextFloat();
        float result = ak+b;
        System.out.println(result);
    }

}