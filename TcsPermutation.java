import java.util.ArrayList;
import java.util.Scanner;

public class TcsPermutation {
    public static boolean isValid(String str)
    {
        char ch[]=str.toCharArray();
            for(int i=1;i<ch.length;i++)
            {
                if(ch[i-1]==ch[i])
                {
                   return false;
                }
            }
         return true;
    }
    public static void swap(char ch[],int id,int i)
    {
        char temp=ch[id];
        ch[id]=ch[i];
        ch[i]=temp;
        
    }
    public static void permute(char ch[],int id,int len,ArrayList<String> list)
    {
        if(id==len)
        {
            list.add(new String(ch));
        }

        for(int i=id;i<ch.length;i++)
        {
           swap(ch,id,i);
            permute(ch, id+1,len, list);
            swap(ch,id,i);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int g=sc.nextInt();
        int b=sc.nextInt();
        sc.close();
        StringBuilder sb=new StringBuilder();
        while(r>0)
        {
            sb.append("r");
            r--;
        }
        while (g>0) {
            sb.append("g");
            g--;
        }
        while (b>0) {
            sb.append("b");
            b--;
            
        }
        char str []=sb.toString().toCharArray();
        int c=0;
       ArrayList<String> list =new ArrayList<>();
       permute(str,0,str.length-1,list);
       System.err.println(list);
        for(String s:list)
        {
            if(isValid(s))
            {
                c++;
            }
        }
       System.err.println(c);
    }
}
