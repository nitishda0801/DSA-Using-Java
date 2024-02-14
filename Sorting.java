public class Sorting {
public static void mergeSort(int a[],int s,int e)
{
    if(s>=e) return;
    int mid=s+(e-s)/2; // mid=(s+e)/2;
    mergeSort(a, s, mid);
    mergeSort(a, mid+1, e);
    merge(a,s,mid,e);
}
public static void merge(int a[],int s,int mid,int e)
{
    int i=s;
    int j=mid+1;
    int k=0;
    int temp[]=new int[e-s+1];

    while(i<=mid && j<=e)
    {
        if(a[i]>a[j])
        {
            temp[k]=a[j];
            j++;
        }
        else{
            temp[k]=a[i];
            i++;
        }
        k++;
    }
    while (i<=mid) {
        temp[k++]=a[i++];
        
    }
    while (j<=e) {
        temp[k++]=a[j++];
    }
    for(k=0,i=s;k<temp.length;k++,i++)
    {
        a[i]=temp[k];
    }


}

public static void quickSort(int a[],int s,int e)
{
    if(s>=e) return;
    int pid=partion(a,s,e);
    quickSort(a, s, pid-1);
    quickSort(a, pid+1, e);
}
public static int partion(int a[],int s,int e)
{
    int pivot=a[e];
    int i=s-1;
    for(int j=s;j<=e;j++)
    {
        if(a[j]<pivot)
        {
            i++;
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
        }
    }
    i++;
    int temp=pivot;
    a[e]=a[i];//don't use here as pivt=a[i] , it won't swap
    a[i]=temp;
    return i;
}
public static void insertionSort(int a[])
{
    int n=a.length;
    // for(int i=1;i<n;i++)// method 1
    // {
    //     int curr=a[i];
    //     int prev=i-1;
    //     while(prev>=0 && a[prev]>curr)
    //     {
    //         a[prev+1]=a[prev];
    //         prev--;
    //     }
    //     a[prev+1]=curr;
    // }
    for(int i=0;i<n;i++)//method 2
    {
        int j=i;
        while(j>0 && a[j-1]>a[j])
        {
            int temp=a[j];
            a[j]=a[j-1];
            a[j-1]=temp;
            j--;
        }
    }
}
public static void countingSort(int a[])
{
    int max=Integer.MIN_VALUE;
    for(int num:a)
    {
        max=Math.max(max,num);
    }
    int freq[]=new int[max+1];
    for(int num:a)
    {
        freq[num]++;
    }
    int k=0;
    for(int i=0;i<freq.length;i++)
    {
        while(freq[i]>0)
        {
            a[k++]=i;
            freq[i]--;
        }
    }
}
public static void bubbleSort(int a[])
{
    for(int i=0;i<a.length-1;i++)
    {
        for(int j=0;j<a.length-1-i;j++)
        {
            if(a[j]>a[j+1])
            {
                int temp=a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
            }
        }
    }
}
public static void selectionSort(int a[])
{
    for(int i=0;i<a.length-1;i++)
    {
        int min=i;
        for(int j=i;j<a.length-1-i;j++)
        {
            if(a[i]<a[j])
            {
                min=j;
            }
        }
        int temp=a[min];
        a[min]=a[i];
        a[i]=temp;
    }
}




    public static void main(String[] args) {
        int a[]=new int[]{10,10,3,3,4,2,2,4,1,5,6,8,3,6,5,7,1,9,8};
        int n=a.length;
        // mergeSort(a,0,n-1);
        // quickSort(a,0,n-1);
        // insertionSort(a);
        // countingSort(a);
        bubbleSort(a);
        for(int i=0;i<n;i++)
        System.err.print(a[i]+" ");
    }
}
