import java.util.Scanner;

public class ArrayEx {
    public static void main(String[] args) {

        // // Arry types:- integer-ex=1,2,3,4,5,..
        // // float 2.333333333,
        // // {"prince","nitish"......}
        // // arr={'p','r','i','n','c'};

        // // two types decelration/..
        // // t1 method

        // // int arr[] = { 1, 2, 3, 3, 4, 4, 5, 6 };
        // // int size = arr.length;

        // // System.out.println(size);
        // // // System.out.print(arr[size - 1]); // 0 to size-1;
        // // int i, j;
        // // for (i = 0; i < size; i++) {// i=0,1,2,3,45,6,7;//size=8;
        // // System.out.print(arr[i] + " ");
        // // }
        // // System.out.println();
        // // double a[] = { 1.3, 3.8, 4.9875, 5.6788 };
        // // System.out.println("Array size " + a.length);
        // int n, i;

        // System.out.println("Enter array size");
        // n = sc.nextInt(); // no of element in array, n=6,arr={0-34 ,1-24, 2-36, 3-48,
        // 4-59, 5-60}
        // int a[] = new int[n];/// a[0],a[1]....a[n-1];//0 to 6
        // // System.out.println("Enter n element: ");
        // for (i = 0; i <= n - 1; i++) {
        // a[i] = sc.nextInt();

        // }
        // System.out.println("Array's elements are ");// arr[]={34,,36,48,59,60},odd=59
        // for (i = 0; i <= n - 1; i++) {

        // System.out.print(a[i] + " ");//
        // }
        // System.out.println();
        // System.out.println("Array's odd elements are:");//
        // ,odd=1,3,5,7,updated_odd=1,9,25,49
        // for (i = 0; i <= n - 1; i++) {
        // if (a[i] % 2 != 0) {
        // {

        // a[i] = a[i] * a[i];

        // }
        // }
        // }
        // int sum = 0;
        // System.out.println("square of odd lement of array element");
        // for (i = 0; i <= n - 1; i++) {
        // System.out.print(a[i] + " ");
        // sum = sum + a[i];
        // }
        // System.out.println("\nsum of updated array is" + sum);
        // // arr[]={1,2,3,4,5,6,7} ,arr[]={1,2,9,4,25,6,49}

        try (// n=6;
                // // index [0,n-1]=[0,7]={0,1,2,3,4,5,6,7};
                // s=0;
                // i=0,i=i+2;
                // s=s+a[0];
                // for(int i=0;i<n;i=i+2)
                // {
                // s=s+a[i];
                // }
                // int arr[] = { 17, 25, 33, 40, 50, 67 };
                // int countOdd = 0, countEven = 0;
                // for (int i = 0; i < arr.length; i++) {
                // if (arr[i] % 2 == 0) {
                // countEven += 1;
                // } else {
                // countOdd += 1;
                // }
                // }
                // System.out.println("Number of even elements in array: " + countEven);
                // System.out.println("Number of odd elements in array: " + countOdd);
                // int arr[] = { 17, 25, 33, 40, 50, 67 };// n=6; index of 67=n-1;
                // // output= 67 50 40 33 25 17;
                // System.out.println("Reversed array: ");
                // for (int i = arr.length - 1; i >= 0; i--) {
                // System.out.print(arr[i] + " ");
                // }
                // int min = a[0];// a[0]=17;
                // int arr[] = { 17, 25, 33, 6, 50, 67 };
                // if (a[i] < min) {
                // min = a[i];
                // }
                // Armstrong Number
                // ex:- 1,2,3,4,5,6,7,8,9,153;-all are armstrong number
                // 153=1^3+5^3+3^3=153;it is armstrong number.
                // ex:-n= 1234, sum=1^4+2^4+3^4+4^4,check sum==n:print("yes") else "no"
        Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter number:");
            int n = sc.nextInt();// ex n=1234; n=n/10=123 n2=?
            int len = 0, temp = n;// temp=1234;
            while (n > 0) {
                len++;
                n = n / 10;
            }
            // n = 0;
            n = temp;// temp=1234;
            System.out.println("Length is :" + len);
            int res = 0, rem;
            while (n > 0) {
                rem = n % 10;// rem=4;
                // rem = 4;
                res = res + (int) Math.pow(rem, len);
                n = n / 10;// n=123
            }
            if (temp == res)
                System.out.println("number is Armstrong:" + temp);
            else
                System.out.println("not armstrong: " + temp);
        }

    }
}
