package Pattern_problems;

public class Palindromic {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.err.print("  ");
            }
            for(int j=i;j>=1;j--)
            System.err.print(j+" ");
            for(int j=2;j<=i;j++)
            {
                System.err.print(j+" ");
            }
            System.err.println();
        }
    }
}
