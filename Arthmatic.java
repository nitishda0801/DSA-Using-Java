//Arithmatic exception..
import java.util.*;
public class Arthmatic {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System .out.println("Enter an integer");
                try{
                    int c[]=new int[2];
                    c[3]=55;//out of bond exception;
                   /// System .out.println("The result is :"+b);
                }
                    catch(ArithmeticException ae)
                    {
                        System.out.println("exception occured"+ae);
                    }
                    catch(ArrayIndexOutOfBoundsException ai)
                    {
                        System.out.println("exception occured is :"+ai);
                    }
        }

        
    }
}
