package Pattern_problems;

public class Pyramid {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.err.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.err.print(i+" ");
            }
            System.err.println();
        }
    }
}
