package src.generalCoding;

import java.util.*;
import java.util.Scanner;
import java.util.Set;

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
    public static void permute(char ch[],int id,int len,Set<String> list)
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
        String r1="r".repeat(r);
        String g1="g".repeat(g);
        String b1="b".repeat(b);
        sb.append(r1);
        sb.append(g1);
        sb.append(b1);

        // while(r>0)
        // {
        //     sb.append("r");
        //     r--;
        // }
        // while (g>0) {
        //     sb.append("g");
        //     g--;
        // }
        // while (b>0) {
        //     sb.append("b");
        //     b--;
            
        // }

        char str []=sb.toString().toCharArray();
        int c=0;
       Set<String> list =new HashSet<>();
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
