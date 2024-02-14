import java.util.*;
class Maximumvalue
{
    public static void main(String [] args)
    {
        System.out.println("Enter three integer");
        Scanner p=new Scanner(System.in);
        int a=p.nextInt();
        int b=p.nextInt();
        int c=p.nextInt();
        if(a>b)
            {
                if(a>c)
                System.out.println("Max is:"+a);
                else
                System.out.println("Max is:"+c);
            }else if(b>c)
                {
                    if(b>a)
                    System.out.println("Max is:"+b);
                    else
                    System.out.println("Max is:"+a);
                }else if(c>a)
                {
                    if(c>b)
                    System.out.println("Max is:"+c);
                    else
                    System.out.println("Max is:"+b);
                }
            p.close();}
            }
    
