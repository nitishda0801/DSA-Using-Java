public class MaximumSubarraySum {

public static void maximumSumSubArray(int a[])
{
     int maxsum=Integer.MIN_VALUE,sum=0;
    // for(int i=0;i<a.length;i++)//Brute Force  time: O(N^3);
    // {
    //     for(int j=i;j<a.length;j++)
    //     {
    //         sum=0;
    //         for(int k=i;k<=j;k++)
    //         {
    //             sum+=a[k];
    //         }
    //         maxsum=Math.max(maxsum,sum);
    //     }
    // }


    //method-2 time: O(N^2) and Space: O(N);
    int prefix[]=new int[a.length];
    prefix[0]=a[0];
    for(int i=1;i<a.length;i++)
    {
        prefix[i]=prefix[i-1]+a[i];
    }
    for(int i=0;i<a.length;i++)
    {
        for(int j=i;j<a.length;j++)
        {
            int prefixSum=i==0?prefix[j]:prefix[j]-prefix[i-1];
            maxsum=Math.max(maxsum, prefixSum);
        }
    }

    System.err.println(maxsum);
}
public static void kadanes(int a[])
{
    int maxsum=Integer.MIN_VALUE;
    int sum=0;
    for(int i=0;i<a.length;i++)
    {
        sum+=a[i];
        if(sum>maxsum)
        {
            maxsum=sum;
        }
        if(sum<0)
        {
            sum=0;
        }
    }
    System.err.println(maxsum);
}

    public static void main(String[] args) {
        int arr[]={-2,-3,4,-1,-2,1,5,-3};
        maximumSumSubArray(arr);
        kadanes(arr);


    }
}
