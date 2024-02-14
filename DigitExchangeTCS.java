import java.util.*;
public class DigitExchangeTCS {
    static int min=Integer.MAX_VALUE;
    static int count=0;
    static int findpermution(char str[],int i,int n,int b)
    {
        if(i==n){
            int q=Integer.parseInt(String.valueOf(str));
            if(q>b && q<min)
            {
                min=q;
                count=1;
            }

        }
        else{
            for(int j=i;j<=n;j++)
            {
                char ch=str[i];
                str[i]=str[j];
                str[j]=ch;
                findpermution(str, i+1, n, b);
                ch=str[i];
                str[i]=str[j];
                str[j]=ch;
            }
        }
        return min;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.err.println("Enter two integer with sopaces");
        int a=sc.nextInt();
        int b=sc.nextInt();
        char str []= String.valueOf(a).toCharArray();
        int ans=findpermution(str,0,str.length-1,b);
        if(count==1)
        {
            System.err.println(ans);
        }
        else
        {
            System.err.println("-1");
        }

    }
    
}
/*Testcase for above problem
 
 * Example:
    Example 1:

    Sample Input:

    459 500


    Sample Output:

    549


    Example 2:

    Sample Input:

    645757 457765


    Sample Output:

    465577
 */
