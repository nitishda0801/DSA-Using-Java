package Pattern_problems;

public class Diamond {
    public static void main(String[] args) {
        int n=4;
    for(int i=1;i<=n;i++)
    {
        for(int j=1;j<=n-i;j++)
        System.err.print(" ");
        for(int j=1;j<=2*i-1;j++)
        System.err.print("*");
        System.err.println();
    }
    for(int i=n;i>0;i--)
    {
        for(int j=1;j<=n-i;j++)
        System.err.print(" ");
        for(int j=1;j<=2*i-1;j++)
        System.err.print("*");
        System.err.println();
    }
    }
}
