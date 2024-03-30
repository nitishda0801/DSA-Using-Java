package Pattern_problems;

public class Butterfly {
    public static void butterflypattern(int n)
    {
        for(int i=1;i<=n;i++)
        {
            //star
            for(int j=1;j<=i;j++)
            {
                System.err.print("*");
            }
            for(int j=1;j<=2*(n-i);j++)
            {
                System.err.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.err.print("*");
            }
            System.err.println();
        }

        for(int i=n;i>0;i--)
        {
            //star
            for(int j=1;j<=i;j++)
            {
                System.err.print("*");
            }
            for(int j=1;j<=2*(n-i);j++)
            {
                System.err.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.err.print("*");
            }
            System.err.println();
        }
    }
    public static void main(String[] args) {
        int n=5;
       // butterflypattern(5);
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(j<=i)
                System.err.print("*");
                else
                System.err.print(" ");
            }
            for(int j=1;j<=n;j++)
            {
                if(j<=n-i)
                System.err.print(" ");
                else
                System.err.print("*");
            }
            
            System.err.println();
        }

        for(int i=n;i>0;i--)
        {
            for(int j=1;j<=n;j++)
            {
                if(j<=i)
                System.err.print("*");
                else
                System.err.print(" ");
            }
            for(int j=1;j<=n;j++)
            {
                if(j<=n-i)
                System.err.print(" ");
                else
                System.err.print("*");
            }
            System.err.println();
        }

    }
}
