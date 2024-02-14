import java.util.Scanner;
public class Bitwise {
    public static void main(String [] args)
    {
        System.out.println("Enter two value");
        try (Scanner p = new Scanner(System.in)) {
            int a=p.nextInt();
            int b=p.nextInt();
            System.out.println("a OR b:"+(a|b));
            System.out.println("a AND b:"+(a&b));
            System.out.println("a XOR b:"+(a^b));
            System.out.println("Negation of a:"+(~a));
            System.out.println("Negation of b:"+(~b));
        }
    }
}
