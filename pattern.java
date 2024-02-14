import java.util.*;
class pattern{
    public static void main(String [] args)
    {
        
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int i,j;
        for(i=1;i<=a;i++)
        {
            for(j=1;j<=i;j++)
            {
                if((i+j)%2==0)
                System.out.print(1);
                else
                System.out.print(0);
            }
            System.out.println();
        }
    }
}