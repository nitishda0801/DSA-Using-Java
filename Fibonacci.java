import java.util.Scanner;
public class Fibonacci {
    public static void main(String [] args)
    {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Enter the number");
            int n=s.nextInt();
            int i,a=0,b=1,c;
            System.out.print(a+" "+b+" ");
            for(i=2;i<n;i++)
            {
                c=a+b;
                System.out.print(c+" ");
                a=b;
                b=c;
                
            }
        }
    }
}
