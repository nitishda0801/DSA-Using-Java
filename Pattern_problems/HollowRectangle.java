package Pattern_problems;

public class HollowRectangle {
    public static void main(String[] args) {
        int n=3,m=4;
        for(int i=1;i<=n;i++)
        {
                for(int j=1;j<=m;j++)
                {
                    if(i==1 || i==n || j==1 || j==m)
                    System.err.print("*");
                    else
                    System.err.print(" ");
                }
            System.err.println();
        }
    }
}
