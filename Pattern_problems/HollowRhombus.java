package Pattern_problems;

public class HollowRhombus {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            System.err.print(" ");
            for(int j=1;j<=n;j++)
            {
                if(i==1 || i==n ||j==1 || j==n)
                System.err.print("*");
                else
                System.err.print(" ");
            }
            System.err.println();
        }
    }
}
