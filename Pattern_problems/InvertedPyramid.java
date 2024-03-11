package Pattern_problems;

public class InvertedPyramid {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            //space printing
            for(int spc=1;spc<=n-i;spc++)
            System.err.print(" ");
            //star
            for(int j=1;j<=i;j++)
            System.err.print("*");
            
            System.err.println();

        }
    }
}
