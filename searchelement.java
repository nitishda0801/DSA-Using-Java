import java.util.*;
class searchelement {
    public static void main(String args[] ) {
       try (Scanner s = new Scanner(System.in)) {
        int c=0;
           System.out.println("Enter size oo array");
           int n=s.nextInt();
           int a[]=new int [n];
           System.out.println("Enter array element");
           for(int i=0;i<n;i++)
           {
               a[i]=s.nextInt();
           }
           System.out.println("Enter element to search");
           int b=s.nextInt();
           for(int i=0;i<n;i++)
           {
               if(a[i]==b)
               c++;
           }
              if(c>0)
                System.out.println("Yes");
               else
                System.out.println("No");
    }
            

      
      // System.out.println(b);

    }
}
