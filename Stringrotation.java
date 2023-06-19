import java.util.*;
public class Stringrotation {
    
    public static void main(String[] args) 
    {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Enter string and no of rotation");
            String str=new String(s.next());
            int k=s.nextInt();
            char [] ch=str.toCharArray();
            int l=ch.length;
            char last=ch[l-1];
            for(int i=0;i<k;i++)
            {
                last=ch[l-1];
                for(int j=l-1;j>0;j--)
                {
                    ch[j]=ch[j-1];
                }
                ch[0]=last;
            }
            for(int j=0;j<l;j++)
            {
            System.out.printf("%c",ch[j]);
            }
        }
    }
}
