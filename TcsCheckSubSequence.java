import java.util.Scanner;

public class TcsCheckSubSequence {
    public static boolean isValid(String s1,String s2,String s3)
    {
        if(s1.length()>5 || s2.length()>5) return false;
        if(s3.length()>10) return false;
        if((s1.length()+s2.length())!=s3.length()) return false;

        for(int i=0;i<s1.length();i++)
        {
            char ch=s1.charAt(i);
            if(ch<'A' || ch>'Z')
            {
                return false;
            }
        }
        for(int i=0;i<s2.length();i++)
        {
            char ch=s2.charAt(i);
            if(ch<'A' || ch>'Z')
            {
                return false;
            }
        }
        for(int i=0;i<s3.length();i++)
        {
            char ch=s3.charAt(i);
            if(ch<'A' || ch>'Z')
            {
                return false;
            }
        }

        return true;
    }
    public static boolean checkSubSequence(String s1,String s2)
    {
        int i=0,j=0;
        while (i<s1.length() && j<s2.length()) {
            char c1=s1.charAt(i);
            char c2=s2.charAt(j);
            if(c1==c2){
                i++;j++;
            }
            else{
                j++;
            }
            
        }
        if(i>=s1.length()) return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        String s3=sc.next();
        sc.close();
        boolean b=isValid(s1,s2,s3);
        if(!b)
        {
            System.err.println("Error");
        }
        else{
            boolean b1=checkSubSequence(s1, s3);
            boolean b2=checkSubSequence(s2, s3);
            if(b1&&b2)
            {
                System.err.println("True");
            }
            else{
                System.err.println("False");
            }
        }

    }
}
