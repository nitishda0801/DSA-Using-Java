public class TilingProblem {//Microsoft problem
    public static int noOfWays(int n)// 2*n tiles 
    {
        if(n==0 || n==1)//{n=0->1,n=1->1,n=2->2,n=3->3,n=4->5....}
        {
            return 1;
        }
        
         int fnm1=noOfWays(n-1);// for vertical way;
         int fnm2=noOfWays(n-2); // for horizontal choice;

         int totalway=fnm1+fnm2;
         return totalway;
    }
    public static void main(String[] args) {
        System.err.println(noOfWays(4)); // tiles length is 2*1; et may be 4*1 or 6*1.....
    }
}
