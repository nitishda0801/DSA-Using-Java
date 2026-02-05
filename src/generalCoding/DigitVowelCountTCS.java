package src.generalCoding;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DigitVowelCountTCS {
    static Map<Integer,String>map=new HashMap<>();
    static int CountVowels(String str)
    {
        int c=0;
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            c++;
        }

        return c;
    }
    static String findString(int a)
    {
        
        if(map.containsKey(a))
        {
            return map.get(a);
        }
        else
        if(a<20 && a>15)
        {
            map.put(a,map.get(a%10)+"teen");
            return map.get(a);
        }
        else
        if(a%10==0)
        {
            map.put(a,map.get(a/10)+"ty");
            return map.get(a);
        }
        else
        if(a>10)
        {
            return "greater tha 100";
        }
       
        map.put(a,map.get((a/10)*10)+"-"+map.get(a%10));
        return map.get(a);

    }
    

    public static void main(String[] args) {
        map.put(1,"one");
        map.put(2,"two");
        map.put(3, "three");
        map.put(3,"four");
        map.put(5,"five");
        map.put(6,"six");
        map.put(7,"seven");
        map.put(8,"eight");
        map.put(9,"nine");
        map.put(10, "ten");
        map.put(11, "eleven");
        map.put(12, "twelve");
        map.put(13, "thirteen");
        map.put(14,"fourteen");
        map.put(20, "twenty");
        map.put(30,"thirty");
        map.put(40, "fourty");
        map.put(50, "fifty");
        map.put(60, "sixty");
        map.put(80, "eighty");
       
        map.put(100, "hundred");

        Scanner sc=new Scanner(System.in);
        System.err.println("Enter size of array:");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.err.println("Enter the array elements:");
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();

        int vsum=0;
        for(int i=0;i<n;i++)
        {
            vsum+=CountVowels(findString(a[i]));
        }
        int paircount=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(a[i]+a[j] ==vsum)
                {
                    paircount++;
                }
            }
        }
        System.err.println(paircount);






    }
}

/*
 *
 * Example:
Example 1


Input

5

1 2 3 4 5


Output

one

 

Example 2


Input

3

7 4 2


Output

zero
 */
