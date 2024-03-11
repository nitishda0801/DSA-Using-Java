package Pattern_problems;

public class ZeroOneTraingle {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if((i+j)%2==1)
                {
                    System.err.print("0");
                }
                else
                System.err.print("1");
                
            }
            System.err.println();
        }

    }
}
