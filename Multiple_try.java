import java.util.*;
public class Multiple_try {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
        }
       System .out.println("Enter an integer");
        try
        {
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
