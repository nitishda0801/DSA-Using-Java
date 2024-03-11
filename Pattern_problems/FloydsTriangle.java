package Pattern_problems;

public class FloydsTriangle {
    public static void main(String[] args) {
        int start=1;
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.err.print(start+" ");
                start++;
            }
            System.err.println();
        }
    }
}
