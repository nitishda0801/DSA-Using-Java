package src.dp;

import java.util.Arrays;

public class Knapsack { // 0-1 Knapsack Problem
    public static void main(String[] args) {
        int n = 5;
        int [] val = {15,14,10,45,30};
        int [] wt = {2,5,1,3,4};
        int w = 7;
        //memoization
        int[][] memoization = new int[n+1][w+1];
        for(int[] wts:memoization){
            Arrays.fill(wts,-1);
        }




        //recursion
        int ans = knapSack(val,wt,w,n,0);
        System.out.println("Recursion Answer: "+ans);

        //memoization
        int ans1 = knapSackMemoization(val,wt,w,n,0,memoization);
        System.out.println("Memoization Answer: "+ans1);

        //tabulation
        int ans2 = knapSackTabulation(val,wt,w,n,0);
        System.out.println("Tabulation Answer: "+ans1);

    }
    public static void printDp(int dp[][]){
        System.out.println("DP for tabulation: ");
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                System.out.print(dp[i][j] +" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static int knapSackTabulation(int[] val, int[] wt, int w,int n, int total){
        //tabulation
        int[][] dp = new int[n+1][w+1];

        for(int i=0;i<dp.length;i++){
            dp[i][0]=0;
        }
        for(int j=0;j<dp[0].length;j++){
            dp[0][j]=0;
        }

        for(int i=1;i<=n;i++){
            for(int j=1;j<=w;j++){
                int v = val[i-1]; // i-th item val
                int weight = wt[i-1]; // i-th item wt
                if(weight<=j){ //valid

                    int includeProfit = v + dp[i-1][j-weight]; //--include
                    int excludeProfit = dp[i-1][ j]; //exclude

                    dp[i][j] = Math.max(includeProfit,excludeProfit);
                }else{ //invalid
                    dp[i][j] = dp[i-1][j]; //exclude
                }
            }
        }

        printDp(dp);


        return dp[n][w];
    }

    public static int knapSackMemoization(int [] val,int[] wt, int w, int n, int total, int[][] dp){
        if(n == 0 || w==0) return 0;
        if(dp[n][w]!=-1) return dp[n-1][w-1];
        if(total<w){
            //include
            int ans1 = val[n-1] + knapSack(val,wt,w,n-1,total+wt[n-1]);

            //exclude
            int  ans2 = knapSack(val,wt,w,n-1,total);
            return dp[n][w] = Math.max(ans1,ans2);
        }else{
            return dp[n][w] = knapSack(val,wt,w,n-1,total);
        }
    }
    public static int knapSack(int [] val,int[] wt, int w, int n, int total){
        if(n == 0 || w==0) return 0;

        if(total<w){
            //include
            int ans1 = val[n-1] + knapSack(val,wt,w,n-1,total+wt[n-1]);

            //exclude
            int  ans2 = knapSack(val,wt,w,n-1,total);
            return Math.max(ans1,ans2);
        }else{
            return knapSack(val,wt,w,n-1,total);
        }
    }
}
