import java.util.*;
public class Throwex {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int age;
            System.out.println("Enter age");
            age=s.nextInt();
            if(age<18)
            {
                try
                {
                    throw new ArithmeticException("Cann't allowed to vote");
                }
                catch(ArithmeticException ob)
                {
                    System.out.println(ob);
                }
            }
            else
            {
                System.out.println("Allowed to vote");
            }
        }
    }
}
