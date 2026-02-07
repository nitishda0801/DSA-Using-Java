package src.generalCoding;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class MaxSubarrayWithSwaps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int n= sc.nextInt();
        int[] arr;
        arr = new int[n];
        System.out.println("Enter the k"); // atmost k swap we can do
        int k= sc.nextInt();
        System.out.println("Enter the n elements"); // may contain negative elemet in an array.
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int maxSum = maxSubarrayWithatMostKSwap(arr,n, k);
        System.out.println("Max Subarray Sum: "+maxSum);
    }

    private static int maxSubarrayWithatMostKSwap(int[] arr, int n, int k) {

        int globeSum = Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                PriorityQueue<Integer> inside = new PriorityQueue<>();
                PriorityQueue<Integer> outside = new PriorityQueue<>(Collections.reverseOrder());
                int curSum =0;
                for(int idx =0;idx<n;idx++){
                    if(idx>=i && idx<=j){
                        curSum+=arr[idx];
                        inside.offer(arr[idx]);
                    }else{
                        outside.offer(arr[idx]);
                    }
                }
                for(int s=0;s<k && !inside.isEmpty() && !outside.isEmpty();s++){
                    int in = inside.poll();
                    int out = outside.poll();
                    if(out>in){
                        curSum+=(out-in);
                    }else{
                        break;
                    }

                }
                globeSum = Math.max(globeSum,curSum);

            }
        }


        return globeSum;
    }

}
/*
testcase:
Enter the size
5
Enter the k
1
Enter the n elements
3
2
-1
4
6
Max Subarray Sum: 15 // here -1 will swap with 3, so subarray will be (-1,3,2,4,6)->maxSum: 15

 */