package src.dp;

public class UnboundedKnapsack {

    public static void main(String[] args) {
        int n = 5;
        int [] val = {15,14,10,45,30};
        int [] wt = {2,5,1,3,4};
        int W = 7;
        System.out.println(unboundedKnapSack(val,wt,n,W));
    }

    private static int unboundedKnapSack(int[] val, int[] wt, int n, int w) {

        int dp[][] = new int[n+1][w+1];

        for(int i=1;i<=n;i++){
            for(int j=1;j<=w;j++){
                if(wt[i-1]<=j){ //valid
                    dp[i][j] = Math.max(val[i-1]+ dp[i][j-wt[i-1]],dp[i-1][j]);
                }else{//invalid
                    dp[i][j] = dp[i-1][j];
                }
            }
        }

        return dp[n][w];
    }

}
