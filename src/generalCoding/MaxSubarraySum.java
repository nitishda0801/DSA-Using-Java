package src.generalCoding;

import java.util.*;

public class MaxSubarraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int n= sc.nextInt();
        int[] arr;
        arr = new int[n];
        System.out.println("Enter the k");
        int k= sc.nextInt();
        System.out.println("Enter the n elements"); // may contains duplicatees elemet in array.
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Max Subarray Sum: "+findMaxSubArraySum(arr,k));
    }

    private static long findMaxSubArraySum(int[] arr, int k) {
        int n= arr.length;
        long maxSum = 0,sum = 0;
        Map<Integer,Integer> map = new HashMap();
        int left =0;
        for(int right=0;right<n;right++){

            sum+=arr[right];
            map.put(arr[right],map.getOrDefault(arr[right],0)+1);

            while(map.size()>k){
                sum-=arr[left];
                if(map.get(arr[left])>1){
                    map.put(arr[left],map.get(arr[left])-1);
                }else{
                    map.remove(arr[left]);
                }
                left++;
            }
            maxSum = Math.max(maxSum,sum);
            if(sum<0) {
                sum=0;
                map.clear();
                left = right+1;
            }

        }
        return maxSum;
    }
}
