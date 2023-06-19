public class Array {
    public static void main(String args[]){
        int a[]={10,11,12,13,14,15};
        for(int i=0;i<a.length;i++)
        System.out.print(a[i]+" ");
        System.out.println( );
    //average calculation
    float avg,sum=0;
    for(int i=0;i<a.length;i++)
    sum+=a[i];
    avg=sum/a.length;
    System.out.println("Average is:"+avg);
    }

}
