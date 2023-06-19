import java.util.*;
class prime{
    public static void main(String arg[])
    {
        int a,i,j,c=0;
        Scanner s=new Scanner(System.in);
        System.out.println("enter the integer value");
        a=s.nextInt();
        if(a<=0)
        System.out.println("Invalid Range");
        else
        for(i=1;i<=a;i++)
        {
            for(j=1;j<=i;j++)
            {
                if(i%j==0)
                c++;
            }
            if(c==2)
            System.out.print(i+" ");
            c=0;
        }
    }
}
